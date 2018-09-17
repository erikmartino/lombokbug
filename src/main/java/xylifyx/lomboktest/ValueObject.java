package xylifyx.lomboktest;

import lombok.Builder;
import lombok.Value;

/**
 * Demo of Lombok in Netbeans
 */
@Value
@Builder
public class ValueObject {

    private final int value;
}
