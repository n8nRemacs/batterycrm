package com.avito.android.sbc.autodispatcheslist.adapter;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/f;", "LTV0/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f259043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DispatchViewStatus f259044c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<a> f259045d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f259046e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f259047f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f259048g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f259049h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f259050i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f259051j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f259052k;

    /* renamed from: l, reason: collision with root package name */
    public final long f259053l;

    public f(long j12, @Y61.k DispatchViewStatus dispatchViewStatus, @Y61.k List<a> list, boolean z12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, long j13) {
        this.f259043b = j12;
        this.f259044c = dispatchViewStatus;
        this.f259045d = list;
        this.f259046e = z12;
        this.f259047f = str;
        this.f259048g = str2;
        this.f259049h = str3;
        this.f259050i = str4;
        this.f259051j = str5;
        this.f259052k = str6;
        this.f259053l = j13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f259043b == fVar.f259043b && this.f259044c == fVar.f259044c && L.f(this.f259045d, fVar.f259045d) && this.f259046e == fVar.f259046e && L.f(this.f259047f, fVar.f259047f) && L.f(this.f259048g, fVar.f259048g) && L.f(this.f259049h, fVar.f259049h) && L.f(this.f259050i, fVar.f259050i) && L.f(this.f259051j, fVar.f259051j) && L.f(this.f259052k, fVar.f259052k) && this.f259053l == fVar.f259053l;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF259043b() {
        return this.f259043b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f259053l) + H.d(H.d(H.d(H.d(H.d(H.d(androidx.appcompat.app.r.i(H.e((this.f259044c.hashCode() + (Long.hashCode(this.f259043b) * 31)) * 31, 31, this.f259045d), 31, this.f259046e), 31, this.f259047f), 31, this.f259048g), 31, this.f259049h), 31, this.f259050i), 31, this.f259051j), 31, this.f259052k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbcAutoDispatchItem(id=");
        sb2.append(this.f259043b);
        sb2.append(", status=");
        sb2.append(this.f259044c);
        sb2.append(", items=");
        sb2.append(this.f259045d);
        sb2.append(", isExpanded=");
        sb2.append(this.f259046e);
        sb2.append(", autoDispatchDuration=");
        sb2.append(this.f259047f);
        sb2.append(", title=");
        sb2.append(this.f259048g);
        sb2.append(", recipients=");
        sb2.append(this.f259049h);
        sb2.append(", createdChats=");
        sb2.append(this.f259050i);
        sb2.append(", budget=");
        sb2.append(this.f259051j);
        sb2.append(", expenses=");
        sb2.append(this.f259052k);
        sb2.append(", createdAt=");
        return androidx.appcompat.app.r.u(sb2, this.f259053l, ')');
    }
}
