package com.my.tracker.personalize;

import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class PersonalizeSetRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> {
        public Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        public PersonalizeSetRequest build() {
            return new PersonalizeSetRequest(this.f365892b, this.f365891a, this.f365894d, this.f365893c);
        }
    }

    public PersonalizeSetRequest(List<String> list, String str, boolean z12, Map<String, String> map) {
        super(list, str, z12, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> newBuilder(String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    public String a() {
        return "/set";
    }
}
