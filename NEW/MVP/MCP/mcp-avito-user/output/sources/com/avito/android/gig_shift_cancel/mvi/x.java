package com.avito.android.gig_shift_cancel.mvi;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftCancelState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/x;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class x extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160694b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160695c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f160696d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f160697e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final r f160698f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f160699g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f160700h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f160701i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f160702j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f160703k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f160704l;

    public x() {
        this(false, false, null, false, null, false, null, null, null, null, 1023, null);
    }

    public static x a(x xVar, boolean z12, boolean z13, String str, boolean z14, r rVar, String str2, String str3, String str4, String str5, int i12) {
        boolean z15 = (i12 & 1) != 0 ? xVar.f160694b : z12;
        boolean z16 = (i12 & 2) != 0 ? xVar.f160695c : z13;
        String str6 = (i12 & 4) != 0 ? xVar.f160696d : str;
        boolean z17 = (i12 & 8) != 0 ? xVar.f160697e : z14;
        r rVar2 = (i12 & 16) != 0 ? xVar.f160698f : rVar;
        boolean z18 = (i12 & 32) != 0 ? xVar.f160699g : true;
        String str7 = (i12 & 64) != 0 ? xVar.f160700h : str2;
        String str8 = (i12 & 128) != 0 ? xVar.f160701i : str3;
        String str9 = (i12 & 256) != 0 ? xVar.f160702j : str4;
        String str10 = (i12 & 512) != 0 ? xVar.f160703k : str5;
        xVar.getClass();
        return new x(z15, z16, str6, z17, rVar2, z18, str7, str8, str9, str10);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f160694b == xVar.f160694b && this.f160695c == xVar.f160695c && L.f(this.f160696d, xVar.f160696d) && this.f160697e == xVar.f160697e && L.f(this.f160698f, xVar.f160698f) && this.f160699g == xVar.f160699g && L.f(this.f160700h, xVar.f160700h) && L.f(this.f160701i, xVar.f160701i) && L.f(this.f160702j, xVar.f160702j) && L.f(this.f160703k, xVar.f160703k);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(Boolean.hashCode(this.f160694b) * 31, 31, this.f160695c);
        String str = this.f160696d;
        int i13 = androidx.appcompat.app.r.i((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160697e);
        r rVar = this.f160698f;
        int i14 = androidx.appcompat.app.r.i((i13 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f160699g);
        String str2 = this.f160700h;
        int iHashCode = (i14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f160701i;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f160702j;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f160703k;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftCancelState(isLoading=");
        sb2.append(this.f160694b);
        sb2.append(", errorVisible=");
        sb2.append(this.f160695c);
        sb2.append(", errorText=");
        sb2.append(this.f160696d);
        sb2.append(", notFoundVisible=");
        sb2.append(this.f160697e);
        sb2.append(", itemState=");
        sb2.append(this.f160698f);
        sb2.append(", isReasonsVisible=");
        sb2.append(this.f160699g);
        sb2.append(", title=");
        sb2.append(this.f160700h);
        sb2.append(", description=");
        sb2.append(this.f160701i);
        sb2.append(", buttonText=");
        sb2.append(this.f160702j);
        sb2.append(", secondaryButtonText=");
        return C22026a.c(sb2, this.f160703k, ')');
    }

    public /* synthetic */ x(boolean z12, boolean z13, String str, boolean z14, r rVar, boolean z15, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? null : rVar, (i12 & 32) == 0 ? z15 : false, (i12 & 64) != 0 ? null : str2, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : str4, (i12 & 512) == 0 ? str5 : null);
    }

    public x(boolean z12, boolean z13, @Y61.l String str, boolean z14, @Y61.l r rVar, boolean z15, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f160694b = z12;
        this.f160695c = z13;
        this.f160696d = str;
        this.f160697e = z14;
        this.f160698f = rVar;
        this.f160699g = z15;
        this.f160700h = str2;
        this.f160701i = str3;
        this.f160702j = str4;
        this.f160703k = str5;
        this.f160704l = (rVar != null ? rVar.f160686j : null) != null;
    }
}
