package com.kafka.rest.mappers;

import com.kafka.domain.User;
import com.kafka.rest.UserUpdateResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T15:46:22+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserToUserUpdateResponseDtoMapperImpl implements UserToUserUpdateResponseDtoMapper {

    @Override
    public UserUpdateResponseDto toUserResponseDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        String email = null;

        if ( entity.getEmail() != null ) {
            email = entity.getEmail();
        }

        String name = entity.getName() + "prueba";

        UserUpdateResponseDto userUpdateResponseDto = new UserUpdateResponseDto( name, email );

        return userUpdateResponseDto;
    }
}
