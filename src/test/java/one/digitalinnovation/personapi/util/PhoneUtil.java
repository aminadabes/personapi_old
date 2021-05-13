package one.digitalinnovation.personapi.util;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PhoneUtil {

    private static final String NUMBER = "(51) 996727653";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
