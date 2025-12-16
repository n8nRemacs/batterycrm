package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.List;

/* loaded from: classes7.dex */
public class Oh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final List<Pair<String, a>> f379106a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f379107a;

        public a(@j.N String str) {
            this.f379107a = str;
        }

        public String toString() {
            return this.f379107a;
        }
    }

    public Oh(@j.N List<Pair<String, a>> list) {
        this.f379106a = list;
    }

    public String toString() {
        return androidx.compose.foundation.H.p(new StringBuilder("AttributionConfig{deeplinkConditions="), this.f379106a, '}');
    }
}
