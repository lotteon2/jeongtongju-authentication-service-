package com.jeontongju.authentication.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ConsumerInfoForCreateRequestDto {

  private Long consumerId;

  private String email;

  private String name;

  public static ConsumerInfoForCreateRequestDto toDto(Long consumerId, String email, String name) {
    return ConsumerInfoForCreateRequestDto.builder()
        .consumerId(consumerId)
        .email(email)
        .name(name)
        .build();
  }
}
