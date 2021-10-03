package org.zerock.mreview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
  private Long mno;
  private String title;
  @Builder.Default
  private List<MovieImageDTO> imageDTOList = new ArrayList<>();

  private double avg;
  private int reviewCnt;

  //그저 실어나르기 위해 존재
  private LocalDateTime regDate;
  private LocalDateTime modDate;
}
