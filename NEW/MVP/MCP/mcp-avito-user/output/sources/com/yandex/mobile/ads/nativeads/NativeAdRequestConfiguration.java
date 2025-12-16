package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class NativeAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f392555a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f392556b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final String f392557c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final String f392558d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final List<String> f392559e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private final Location f392560f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final Map<String, String> f392561g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final String f392562h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private final AdTheme f392563i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f392564j;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final String f392565a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private String f392566b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private String f392567c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private Location f392568d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private String f392569e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private List<String> f392570f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private Map<String, String> f392571g;

        /* renamed from: h, reason: collision with root package name */
        @P
        private String f392572h;

        /* renamed from: i, reason: collision with root package name */
        @P
        private AdTheme f392573i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f392574j = true;

        public Builder(@N String str) {
            this.f392565a = str;
        }

        @N
        public NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this, 0);
        }

        @N
        public Builder setAge(@N String str) {
            this.f392566b = str;
            return this;
        }

        @N
        public Builder setBiddingData(@N String str) {
            this.f392572h = str;
            return this;
        }

        @N
        public Builder setContextQuery(@N String str) {
            this.f392569e = str;
            return this;
        }

        @N
        public Builder setContextTags(@N List<String> list) {
            this.f392570f = list;
            return this;
        }

        @N
        public Builder setGender(@N String str) {
            this.f392567c = str;
            return this;
        }

        @N
        public Builder setLocation(@N Location location) {
            this.f392568d = location;
            return this;
        }

        @N
        public Builder setParameters(@N Map<String, String> map) {
            this.f392571g = map;
            return this;
        }

        @N
        public Builder setPreferredTheme(@N AdTheme adTheme) {
            this.f392573i = adTheme;
            return this;
        }

        @N
        public Builder setShouldLoadImagesAutomatically(boolean z12) {
            this.f392574j = z12;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(Builder builder, int i12) {
        this(builder);
    }

    @N
    public final String a() {
        return this.f392555a;
    }

    @P
    public final String b() {
        return this.f392556b;
    }

    @P
    public final String c() {
        return this.f392562h;
    }

    @P
    public final String d() {
        return this.f392558d;
    }

    @P
    public final List<String> e() {
        return this.f392559e;
    }

    @P
    public final String f() {
        return this.f392557c;
    }

    @P
    public final Location g() {
        return this.f392560f;
    }

    @P
    public final Map<String, String> h() {
        return this.f392561g;
    }

    @P
    public final AdTheme i() {
        return this.f392563i;
    }

    public final boolean j() {
        return this.f392564j;
    }

    private NativeAdRequestConfiguration(@N Builder builder) {
        this.f392555a = builder.f392565a;
        this.f392556b = builder.f392566b;
        this.f392557c = builder.f392567c;
        this.f392558d = builder.f392569e;
        this.f392559e = builder.f392570f;
        this.f392560f = builder.f392568d;
        this.f392561g = builder.f392571g;
        this.f392562h = builder.f392572h;
        this.f392563i = builder.f392573i;
        this.f392564j = builder.f392574j;
    }
}
