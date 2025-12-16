package com.yandex.mobile.ads.instream;

import android.text.TextUtils;
import j.N;
import j.P;
import java.util.Map;

/* loaded from: classes8.dex */
public final class InstreamAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f392473a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final String f392474b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final Map<String, String> f392475c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @N
        private String f392476a = "0";

        /* renamed from: b, reason: collision with root package name */
        @N
        private final String f392477b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private Map<String, String> f392478c;

        public Builder(@N String str) {
            this.f392477b = str;
        }

        public InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this, 0);
        }

        public Builder setCategoryId(@N String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f392476a = str;
            return this;
        }

        @N
        public Builder setParameters(@N Map<String, String> map) {
            this.f392478c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(Builder builder, int i12) {
        this(builder);
    }

    @N
    public String getCategoryId() {
        return this.f392473a;
    }

    @N
    public String getPageId() {
        return this.f392474b;
    }

    @P
    public Map<String, String> getParameters() {
        return this.f392475c;
    }

    private InstreamAdRequestConfiguration(@N Builder builder) {
        this.f392473a = builder.f392476a;
        this.f392474b = builder.f392477b;
        this.f392475c = builder.f392478c;
    }
}
