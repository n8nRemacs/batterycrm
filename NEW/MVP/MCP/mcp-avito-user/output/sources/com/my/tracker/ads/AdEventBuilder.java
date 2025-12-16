package com.my.tracker.ads;

/* loaded from: classes7.dex */
public final class AdEventBuilder {

    /* renamed from: a, reason: collision with root package name */
    final int f365240a;

    /* renamed from: b, reason: collision with root package name */
    final int f365241b;

    /* renamed from: c, reason: collision with root package name */
    final double f365242c;

    /* renamed from: d, reason: collision with root package name */
    final String f365243d;

    /* renamed from: e, reason: collision with root package name */
    String f365244e;

    /* renamed from: f, reason: collision with root package name */
    String f365245f;

    /* renamed from: g, reason: collision with root package name */
    String f365246g;

    /* renamed from: h, reason: collision with root package name */
    String f365247h;

    private AdEventBuilder(int i12, int i13, double d12, String str) {
        this.f365240a = i12;
        this.f365241b = i13;
        this.f365242c = d12;
        this.f365243d = str;
    }

    public static AdEventBuilder newClickBuilder(int i12) {
        return new AdEventBuilder(18, i12, Double.NaN, null);
    }

    public static AdEventBuilder newImpressionBuilder(int i12) {
        return new AdEventBuilder(17, i12, Double.NaN, null);
    }

    public static AdEventBuilder newRevenueBuilder(int i12, double d12, String str) {
        return new AdEventBuilder(19, i12, d12, str);
    }

    public AdEvent build() {
        return new AdEvent(this.f365240a, this.f365241b, this.f365242c, this.f365243d, this.f365244e, this.f365245f, this.f365246g, this.f365247h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.f365247h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.f365246g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f365245f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.f365244e = str;
        return this;
    }
}
