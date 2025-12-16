package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: PreApprovalFormDataBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/o;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    public final double f201866a;

    /* renamed from: b, reason: collision with root package name */
    public final double f201867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f201868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f201869d;

    public o(double d12, double d13, int i12, int i13) {
        this.f201866a = d12;
        this.f201867b = d13;
        this.f201868c = i12;
        this.f201869d = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Double.compare(this.f201866a, oVar.f201866a) == 0 && Double.compare(this.f201867b, oVar.f201867b) == 0 && this.f201868c == oVar.f201868c && this.f201869d == oVar.f201869d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201869d) + r.e(this.f201868c, androidx.compose.ui.graphics.colorspace.e.d(Double.hashCode(this.f201866a) * 31, 31, this.f201867b), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderInterval(percentStart=");
        sb2.append(this.f201866a);
        sb2.append(", percentEnd=");
        sb2.append(this.f201867b);
        sb2.append(", valueStart=");
        sb2.append(this.f201868c);
        sb2.append(", valueEnd=");
        return r.t(sb2, this.f201869d, ')');
    }
}
