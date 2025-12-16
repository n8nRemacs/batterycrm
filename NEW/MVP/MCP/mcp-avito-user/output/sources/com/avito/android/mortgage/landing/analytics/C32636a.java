package com.avito.android.mortgage.landing.analytics;

import kotlin.Metadata;

/* compiled from: LandingAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/analytics/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.landing.analytics.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* data */ class C32636a {

    /* renamed from: a, reason: collision with root package name */
    public final int f199518a;

    /* renamed from: b, reason: collision with root package name */
    public final int f199519b;

    public C32636a(int i12, int i13) {
        this.f199518a = i12;
        this.f199519b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32636a)) {
            return false;
        }
        C32636a c32636a = (C32636a) obj;
        return this.f199518a == c32636a.f199518a && this.f199519b == c32636a.f199519b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f199519b) + (Integer.hashCode(this.f199518a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FieldClickedParams(eventId=");
        sb2.append(this.f199518a);
        sb2.append(", version=");
        return androidx.appcompat.app.r.t(sb2, this.f199519b, ')');
    }
}
