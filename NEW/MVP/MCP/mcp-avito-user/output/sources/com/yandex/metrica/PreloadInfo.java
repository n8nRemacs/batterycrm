package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f377510a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f377511b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f377512a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f377513b = new HashMap();

        public Builder(String str, a aVar) {
            this.f377512a = str;
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, null);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f377513b.put(str, str2);
            }
            return this;
        }
    }

    public PreloadInfo(Builder builder, a aVar) {
        this.f377510a = builder.f377512a;
        this.f377511b = A2.d(builder.f377513b);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, null);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f377511b;
    }

    public String getTrackingId() {
        return this.f377510a;
    }
}
