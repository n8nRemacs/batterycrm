package com.avito.android.mortgage.landing.mvi.builder;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: LandingDataBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/builder/j;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final double f200098a;

    /* renamed from: b, reason: collision with root package name */
    public final double f200099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f200100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f200101d;

    public j(double d12, double d13, int i12, int i13) {
        this.f200098a = d12;
        this.f200099b = d13;
        this.f200100c = i12;
        this.f200101d = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Double.compare(this.f200098a, jVar.f200098a) == 0 && Double.compare(this.f200099b, jVar.f200099b) == 0 && this.f200100c == jVar.f200100c && this.f200101d == jVar.f200101d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f200101d) + r.e(this.f200100c, androidx.compose.ui.graphics.colorspace.e.d(Double.hashCode(this.f200098a) * 31, 31, this.f200099b), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderInterval(percentStart=");
        sb2.append(this.f200098a);
        sb2.append(", percentEnd=");
        sb2.append(this.f200099b);
        sb2.append(", valueStart=");
        sb2.append(this.f200100c);
        sb2.append(", valueEnd=");
        return r.t(sb2, this.f200101d, ')');
    }
}
