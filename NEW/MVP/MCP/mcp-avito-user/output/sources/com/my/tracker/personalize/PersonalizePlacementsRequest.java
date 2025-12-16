package com.my.tracker.personalize;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f365890a = d();
    public final Map<String, String> customParams;
    public final List<String> placements;
    public final boolean reset;
    public final String userId;

    public static abstract class Builder<T extends PersonalizePlacementsRequest> {

        /* renamed from: a, reason: collision with root package name */
        final String f365891a;

        /* renamed from: b, reason: collision with root package name */
        List<String> f365892b;

        /* renamed from: c, reason: collision with root package name */
        Map<String, String> f365893c;

        /* renamed from: d, reason: collision with root package name */
        boolean f365894d = true;

        public Builder(String str) {
            this.f365891a = str;
        }

        public abstract T build();

        public Builder<T> withCustomParams(Map<String, String> map) {
            if (map != null) {
                this.f365893c = new HashMap(map);
            } else {
                this.f365893c = null;
            }
            return this;
        }

        public Builder<T> withPlacements(List<String> list) {
            if (list != null) {
                this.f365892b = new ArrayList(list);
            } else {
                this.f365892b = null;
            }
            return this;
        }

        public Builder<T> withReset(boolean z12) {
            this.f365894d = z12;
            return this;
        }
    }

    public PersonalizePlacementsRequest(List<String> list, String str, boolean z12, Map<String, String> map) {
        this.placements = list;
        this.userId = str;
        this.reset = z12;
        this.customParams = map;
    }

    private Map<String, List<String>> d() {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.customParams;
        if (map2 != null && !map2.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove("reset");
            this.customParams.remove("flat");
            for (Map.Entry<String, String> entry : this.customParams.entrySet()) {
                map.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            map.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            map.put("custom_user_id", Collections.singletonList(this.userId));
        }
        map.put("reset", Collections.singletonList(this.reset ? "1" : "0"));
        map.put("flat", Collections.singletonList("1"));
        return map;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    public final Map<String, List<String>> b() {
        return this.f365890a;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    public final b<List<PersonalizePlacement>> c() {
        return new d();
    }
}
