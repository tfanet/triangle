package com.florin.tatar.triangle.type;

import static com.florin.tatar.triangle.type.TriangleTypeUtils.*;
import java.util.Arrays;

public class TriangleTypeResolver {
	public static TriangleTypeEnum getTriangleType(double[] sides) {
		if(isSidesInputInvalid(sides)
				|| hasAnySideNegativeValue(sides)
				|| doesThirdSideRuleFail(sides)) {
			throw new RuntimeException("Invalid triangle input: " + Arrays.toString(sides));
		}
	    TriangleTypeEnum result;
	    if(areAllSidesEqual(sides)) {
	        result = TriangleTypeEnum.EQUILATERAL;
	    } else if(areTwoSidesEqual(sides)) {
	        result = TriangleTypeEnum.ISOSCELES;
	    } else {
	        result = TriangleTypeEnum.SCALENE;
	    }
	    return result;
	}
}
