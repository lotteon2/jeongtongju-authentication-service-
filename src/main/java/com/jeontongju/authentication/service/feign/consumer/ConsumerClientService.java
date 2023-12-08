package com.jeontongju.authentication.service.feign.consumer;

import com.jeontongju.authentication.dto.request.ConsumerInfoForCreateByKakaoRequestDto;
import com.jeontongju.authentication.dto.request.ConsumerInfoForCreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ConsumerClientService {

  private final ConsumerServiceClient consumerServiceClient;

  @Transactional
  public void createConsumerForSignup(ConsumerInfoForCreateRequestDto createRequestDto) {
    consumerServiceClient.createConsumerForSignup(createRequestDto);
  }

  @Transactional
  public void createConsumerForSignupBySns(
      ConsumerInfoForCreateByKakaoRequestDto createByKakaoRequestDto) {
    consumerServiceClient.createConsumerForSignupBySns(createByKakaoRequestDto);
  }
}
