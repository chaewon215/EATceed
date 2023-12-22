package com.gaebaljip.exceed.meal.application;

import com.gaebaljip.exceed.dto.response.GetMeal;
import com.gaebaljip.exceed.meal.application.port.in.GetSpecificMealQuery;
import com.gaebaljip.exceed.meal.application.port.out.LoadMealPort;
import com.gaebaljip.exceed.meal.domain.MealType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class GetSpecificMealService implements GetSpecificMealQuery {

    private final LoadMealPort loadMealPort;

    @Override
    public GetMeal execute(Long memberId, LocalDate date) {
        loadMealPort.query(memberId, date);
        return GetMeal.builder()
                .time(LocalTime.now())
                .mealType(MealType.SNACK)
                .build();
    }
}
