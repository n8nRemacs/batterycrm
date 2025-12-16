package com.yandex.mobile.ads.common;

import android.location.Location;
import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382664a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f382665b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final String f382666c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final String f382667d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final List<String> f382668e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private final Location f382669f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final Map<String, String> f382670g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final String f382671h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private final AdTheme f382672i;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final String f382673a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private String f382674b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private String f382675c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private Location f382676d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private String f382677e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private List<String> f382678f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private Map<String, String> f382679g;

        /* renamed from: h, reason: collision with root package name */
        @P
        private String f382680h;

        /* renamed from: i, reason: collision with root package name */
        @P
        private AdTheme f382681i;

        public Builder(@N String str) {
            this.f382673a = str;
        }

        @N
        public AdRequestConfiguration build() {
            return new AdRequestConfiguration(this, 0);
        }

        @N
        public Builder setAge(@N String str) {
            this.f382674b = str;
            return this;
        }

        @N
        public Builder setBiddingData(@N String str) {
            this.f382680h = str;
            return this;
        }

        @N
        public Builder setContextQuery(@N String str) {
            this.f382677e = str;
            return this;
        }

        @N
        public Builder setContextTags(@N List<String> list) {
            this.f382678f = list;
            return this;
        }

        @N
        public Builder setGender(@N String str) {
            this.f382675c = str;
            return this;
        }

        @N
        public Builder setLocation(@N Location location) {
            this.f382676d = location;
            return this;
        }

        @N
        public Builder setParameters(@N Map<String, String> map) {
            this.f382679g = map;
            return this;
        }

        @N
        public Builder setPreferredTheme(@P AdTheme adTheme) {
            this.f382681i = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(Builder builder, int i12) {
        this(builder);
    }

    @N
    public final String a() {
        return this.f382664a;
    }

    @P
    public final String b() {
        return this.f382665b;
    }

    @P
    public final String c() {
        return this.f382671h;
    }

    @P
    public final String d() {
        return this.f382667d;
    }

    @P
    public final List<String> e() {
        return this.f382668e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestConfiguration.class != obj.getClass()) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (!this.f382664a.equals(adRequestConfiguration.f382664a)) {
            return false;
        }
        String str = this.f382665b;
        if (str == null ? adRequestConfiguration.f382665b != null : !str.equals(adRequestConfiguration.f382665b)) {
            return false;
        }
        String str2 = this.f382666c;
        if (str2 == null ? adRequestConfiguration.f382666c != null : !str2.equals(adRequestConfiguration.f382666c)) {
            return false;
        }
        String str3 = this.f382667d;
        if (str3 == null ? adRequestConfiguration.f382667d != null : !str3.equals(adRequestConfiguration.f382667d)) {
            return false;
        }
        List<String> list = this.f382668e;
        if (list == null ? adRequestConfiguration.f382668e != null : !list.equals(adRequestConfiguration.f382668e)) {
            return false;
        }
        Location location = this.f382669f;
        if (location == null ? adRequestConfiguration.f382669f != null : !location.equals(adRequestConfiguration.f382669f)) {
            return false;
        }
        Map<String, String> map = this.f382670g;
        if (map == null ? adRequestConfiguration.f382670g != null : !map.equals(adRequestConfiguration.f382670g)) {
            return false;
        }
        String str4 = this.f382671h;
        if (str4 == null ? adRequestConfiguration.f382671h == null : str4.equals(adRequestConfiguration.f382671h)) {
            return this.f382672i == adRequestConfiguration.f382672i;
        }
        return false;
    }

    @P
    public final String f() {
        return this.f382666c;
    }

    @P
    public final Location g() {
        return this.f382669f;
    }

    @P
    public final Map<String, String> h() {
        return this.f382670g;
    }

    public int hashCode() {
        int iHashCode = this.f382664a.hashCode() * 31;
        String str = this.f382665b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f382666c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f382667d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f382668e;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f382669f;
        int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f382670g;
        int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f382671h;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f382672i;
        return iHashCode8 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    @P
    public final AdTheme i() {
        return this.f382672i;
    }

    private AdRequestConfiguration(@N Builder builder) {
        this.f382664a = builder.f382673a;
        this.f382665b = builder.f382674b;
        this.f382666c = builder.f382675c;
        this.f382667d = builder.f382677e;
        this.f382668e = builder.f382678f;
        this.f382669f = builder.f382676d;
        this.f382670g = builder.f382679g;
        this.f382671h = builder.f382680h;
        this.f382672i = builder.f382681i;
    }
}
