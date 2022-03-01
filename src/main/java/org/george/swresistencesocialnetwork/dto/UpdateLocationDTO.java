package org.george.swresistencesocialnetwork.dto;

import lombok.*;
import org.george.swresistencesocialnetwork.enums.BaseEnum;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLocationDTO {
    Double latitude;
    Double longitude;
    BaseEnum base;
}
