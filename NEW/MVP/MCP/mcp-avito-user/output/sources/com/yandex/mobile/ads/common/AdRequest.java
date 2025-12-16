package com.yandex.mobile.ads.common;

import android.location.Location;
import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AdRequest {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final String f382648a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f382649b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final String f382650c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final List<String> f382651d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final Location f382652e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private final Map<String, String> f382653f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final String f382654g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final AdTheme f382655h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @P
        private String f382656a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private String f382657b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private Location f382658c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private String f382659d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private List<String> f382660e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private Map<String, String> f382661f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private String f382662g;

        /* renamed from: h, reason: collision with root package name */
        @P
        private AdTheme f382663h;

        @N
        public AdRequest build() {
            return new AdRequest(this, 0);
        }

        @N
        public Builder setAge(@N String str) {
            this.f382656a = str;
            return this;
        }

        @N
        public Builder setBiddingData(@N String str) {
            this.f382662g = str;
            return this;
        }

        @N
        public Builder setContextQuery(@N String str) {
            this.f382659d = str;
            return this;
        }

        @N
        public Builder setContextTags(@N List<String> list) {
            this.f382660e = list;
            return this;
        }

        @N
        public Builder setGender(@N String str) {
            this.f382657b = str;
            return this;
        }

        @N
        public Builder setLocation(@N Location location) {
            this.f382658c = location;
            return this;
        }

        @N
        public Builder setParameters(@N Map<String, String> map) {
            this.f382661f = map;
            return this;
        }

        @N
        public Builder setPreferredTheme(@P AdTheme adTheme) {
            this.f382663h = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequest(Builder builder, int i12) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        String str = this.f382648a;
        if (str == null ? adRequest.f382648a != null : !str.equals(adRequest.f382648a)) {
            return false;
        }
        String str2 = this.f382649b;
        if (str2 == null ? adRequest.f382649b != null : !str2.equals(adRequest.f382649b)) {
            return false;
        }
        String str3 = this.f382650c;
        if (str3 == null ? adRequest.f382650c != null : !str3.equals(adRequest.f382650c)) {
            return false;
        }
        List<String> list = this.f382651d;
        if (list == null ? adRequest.f382651d != null : !list.equals(adRequest.f382651d)) {
            return false;
        }
        Location location = this.f382652e;
        if (location == null ? adRequest.f382652e != null : !location.equals(adRequest.f382652e)) {
            return false;
        }
        Map<String, String> map = this.f382653f;
        if (map == null ? adRequest.f382653f != null : !map.equals(adRequest.f382653f)) {
            return false;
        }
        String str4 = this.f382654g;
        if (str4 == null ? adRequest.f382654g == null : str4.equals(adRequest.f382654g)) {
            return this.f382655h == adRequest.f382655h;
        }
        return false;
    }

    @P
    public String getAge() {
        return this.f382648a;
    }

    @P
    public String getBiddingData() {
        return this.f382654g;
    }

    @P
    public String getContextQuery() {
        return this.f382650c;
    }

    @P
    public List<String> getContextTags() {
        return this.f382651d;
    }

    @P
    public String getGender() {
        return this.f382649b;
    }

    @P
    public Location getLocation() {
        return this.f382652e;
    }

    @P
    public Map<String, String> getParameters() {
        return this.f382653f;
    }

    @P
    public AdTheme getPreferredTheme() {
        return this.f382655h;
    }

    public int hashCode() {
        String str = this.f382648a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f382649b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f382650c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f382651d;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f382652e;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f382653f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f382654g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f382655h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(@N Builder builder) {
        this.f382648a = builder.f382656a;
        this.f382649b = builder.f382657b;
        this.f382650c = builder.f382659d;
        this.f382651d = builder.f382660e;
        this.f382652e = builder.f382658c;
        this.f382653f = builder.f382661f;
        this.f382654g = builder.f382662g;
        this.f382655h = builder.f382663h;
    }
}
