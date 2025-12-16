package com.avito.android.gig_shift_start.mvi;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftStartState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_start/mvi/o;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class o extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f160815b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f160816c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f160817d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f160818e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f160819f;

    public /* synthetic */ o(String str, String str2, String str3, String str4, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, (i12 & 16) != 0 ? false : z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f160815b, oVar.f160815b) && L.f(this.f160816c, oVar.f160816c) && L.f(this.f160817d, oVar.f160817d) && L.f(this.f160818e, oVar.f160818e) && this.f160819f == oVar.f160819f;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f160815b.hashCode() * 31, 31, this.f160816c), 31, this.f160817d);
        String str = this.f160818e;
        return Boolean.hashCode(this.f160819f) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftStartState(title=");
        sb2.append(this.f160815b);
        sb2.append(", description=");
        sb2.append(this.f160816c);
        sb2.append(", primaryButtonText=");
        sb2.append(this.f160817d);
        sb2.append(", secondaryButtonText=");
        sb2.append(this.f160818e);
        sb2.append(", secondaryButtonAlreadyClicked=");
        return r.x(sb2, this.f160819f, ')');
    }

    public o(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12) {
        this.f160815b = str;
        this.f160816c = str2;
        this.f160817d = str3;
        this.f160818e = str4;
        this.f160819f = z12;
    }
}
