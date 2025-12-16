package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import j.N;
import j.P;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class AdRevenue {

    @P
    public final String adNetwork;

    @P
    public final String adPlacementId;

    @P
    public final String adPlacementName;

    @N
    public final BigDecimal adRevenue;

    @P
    public final AdType adType;

    @P
    public final String adUnitId;

    @P
    public final String adUnitName;

    @N
    public final Currency currency;

    @P
    public final Map<String, String> payload;

    @P
    public final String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final BigDecimal f377481a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final Currency f377482b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public AdType f377483c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public String f377484d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public String f377485e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public String f377486f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public String f377487g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public String f377488h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public String f377489i;

        /* renamed from: j, reason: collision with root package name */
        @P
        public HashMap f377490j;

        public Builder(BigDecimal bigDecimal, Currency currency, a aVar) {
            this.f377481a = bigDecimal;
            this.f377482b = currency;
        }

        public AdRevenue build() {
            return new AdRevenue(this.f377481a, this.f377482b, this.f377483c, this.f377484d, this.f377485e, this.f377486f, this.f377487g, this.f377488h, this.f377489i, this.f377490j, null);
        }

        public Builder withAdNetwork(@P String str) {
            this.f377484d = str;
            return this;
        }

        public Builder withAdPlacementId(@P String str) {
            this.f377487g = str;
            return this;
        }

        public Builder withAdPlacementName(@P String str) {
            this.f377488h = str;
            return this;
        }

        public Builder withAdType(@P AdType adType) {
            this.f377483c = adType;
            return this;
        }

        public Builder withAdUnitId(@P String str) {
            this.f377485e = str;
            return this;
        }

        public Builder withAdUnitName(@P String str) {
            this.f377486f = str;
            return this;
        }

        public Builder withPayload(@P Map<String, String> map) {
            this.f377490j = (map == null || A2.b(map)) ? null : new HashMap(map);
            return this;
        }

        public Builder withPrecision(@P String str) {
            this.f377489i = str;
            return this;
        }
    }

    public AdRevenue() {
        throw null;
    }

    public AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, a aVar) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : A2.d(map);
    }

    public static Builder newBuilder(@N BigDecimal bigDecimal, @N Currency currency) {
        return new Builder(bigDecimal, currency, null);
    }

    public static Builder newBuilder(long j12, @N Currency currency) {
        return new Builder(A2.a(j12), currency, null);
    }

    public static Builder newBuilder(double d12, @N Currency currency) {
        return new Builder(new BigDecimal(A2.a(d12, 0.0d)), currency, null);
    }
}
