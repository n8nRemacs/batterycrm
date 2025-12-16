package com.avito.android.gig_shift_action.mvi;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftActionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/w;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class w extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160522b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160523c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f160524d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f160525e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f160526f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f160527g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final z f160528h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f160529i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f160530j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f160531k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f160532l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f160533m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f160534n;

    public w() {
        this(false, false, false, null, null, false, null, false, null, null, null, null, 4095, null);
    }

    public static w a(w wVar, boolean z12, boolean z13, String str, boolean z14, z zVar, String str2, String str3, String str4, String str5, int i12) {
        boolean z15 = (i12 & 1) != 0 ? wVar.f160522b : z12;
        boolean z16 = (i12 & 2) != 0 ? wVar.f160523c : false;
        boolean z17 = (i12 & 4) != 0 ? wVar.f160524d : z13;
        String str6 = (i12 & 8) != 0 ? wVar.f160525e : str;
        String str7 = wVar.f160526f;
        boolean z18 = (i12 & 32) != 0 ? wVar.f160527g : z14;
        z zVar2 = (i12 & 64) != 0 ? wVar.f160528h : zVar;
        boolean z19 = (i12 & 128) != 0 ? wVar.f160529i : true;
        String str8 = (i12 & 256) != 0 ? wVar.f160530j : str2;
        String str9 = (i12 & 512) != 0 ? wVar.f160531k : str3;
        String str10 = (i12 & 1024) != 0 ? wVar.f160532l : str4;
        String str11 = (i12 & 2048) != 0 ? wVar.f160533m : str5;
        wVar.getClass();
        return new w(z15, z16, z17, str6, str7, z18, zVar2, z19, str8, str9, str10, str11);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f160522b == wVar.f160522b && this.f160523c == wVar.f160523c && this.f160524d == wVar.f160524d && L.f(this.f160525e, wVar.f160525e) && L.f(this.f160526f, wVar.f160526f) && this.f160527g == wVar.f160527g && L.f(this.f160528h, wVar.f160528h) && this.f160529i == wVar.f160529i && L.f(this.f160530j, wVar.f160530j) && L.f(this.f160531k, wVar.f160531k) && L.f(this.f160532l, wVar.f160532l) && L.f(this.f160533m, wVar.f160533m);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Boolean.hashCode(this.f160522b) * 31, 31, this.f160523c), 31, this.f160524d);
        String str = this.f160525e;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f160526f;
        int i13 = androidx.appcompat.app.r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f160527g);
        z zVar = this.f160528h;
        int i14 = androidx.appcompat.app.r.i((i13 + (zVar == null ? 0 : zVar.hashCode())) * 31, 31, this.f160529i);
        String str3 = this.f160530j;
        int iHashCode2 = (i14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f160531k;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f160532l;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f160533m;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftActionState(isLoading=");
        sb2.append(this.f160522b);
        sb2.append(", initialErrorVisible=");
        sb2.append(this.f160523c);
        sb2.append(", errorVisible=");
        sb2.append(this.f160524d);
        sb2.append(", errorText=");
        sb2.append(this.f160525e);
        sb2.append(", errorDescription=");
        sb2.append(this.f160526f);
        sb2.append(", notFoundVisible=");
        sb2.append(this.f160527g);
        sb2.append(", itemState=");
        sb2.append(this.f160528h);
        sb2.append(", isReasonsVisible=");
        sb2.append(this.f160529i);
        sb2.append(", title=");
        sb2.append(this.f160530j);
        sb2.append(", description=");
        sb2.append(this.f160531k);
        sb2.append(", buttonText=");
        sb2.append(this.f160532l);
        sb2.append(", secondaryButtonText=");
        return C22026a.c(sb2, this.f160533m, ')');
    }

    public /* synthetic */ w(boolean z12, boolean z13, boolean z14, String str, String str2, boolean z15, z zVar, boolean z16, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? null : zVar, (i12 & 128) == 0 ? z16 : false, (i12 & 256) != 0 ? null : str3, (i12 & 512) != 0 ? null : str4, (i12 & 1024) != 0 ? null : str5, (i12 & 2048) == 0 ? str6 : null);
    }

    public w(boolean z12, boolean z13, boolean z14, @Y61.l String str, @Y61.l String str2, boolean z15, @Y61.l z zVar, boolean z16, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6) {
        this.f160522b = z12;
        this.f160523c = z13;
        this.f160524d = z14;
        this.f160525e = str;
        this.f160526f = str2;
        this.f160527g = z15;
        this.f160528h = zVar;
        this.f160529i = z16;
        this.f160530j = str3;
        this.f160531k = str4;
        this.f160532l = str5;
        this.f160533m = str6;
        this.f160534n = (zVar != null ? zVar.f160545j : null) != null;
    }
}
