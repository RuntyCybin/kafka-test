package com.kafka.rest.mappers;

import com.kafka.domain.User;
import com.kafka.rest.UserUpdateRequestDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T15:46:22+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserToUserUpdateRequestDtoMapperImpl implements UserToUserUpdateRequestDtoMapper {

    @Override
    public User toUserRequest(UserUpdateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        if ( dto.name() != null ) {
            user.setName( dto.name() );
        }

        user.setEmail( dto.name().concat("@rambler.com") );

        trimName( user );

        return user;
    }
}
