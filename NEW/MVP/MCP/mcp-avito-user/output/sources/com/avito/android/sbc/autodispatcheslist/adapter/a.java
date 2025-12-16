package com.avito.android.sbc.autodispatcheslist.adapter;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f259028a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f259029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f259030c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259031d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f259032e;

    public a(String str, String str2, String str3, boolean z12, String str4, int i12, C42822w c42822w) {
        str4 = (i12 & 16) != 0 ? null : str4;
        this.f259028a = str;
        this.f259029b = str2;
        this.f259030c = str3;
        this.f259031d = z12;
        this.f259032e = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f259028a, aVar.f259028a) && L.f(this.f259029b, aVar.f259029b) && L.f(this.f259030c, aVar.f259030c) && this.f259031d == aVar.f259031d && L.f(this.f259032e, aVar.f259032e);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(H.d(H.d(this.f259028a.hashCode() * 31, 31, this.f259029b), 31, this.f259030c), 31, this.f259031d);
        String str = this.f259032e;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemInfo(image=");
        sb2.append(this.f259028a);
        sb2.append(", title=");
        sb2.append(this.f259029b);
        sb2.append(", price=");
        sb2.append(this.f259030c);
        sb2.append(", isActive=");
        sb2.append(this.f259031d);
        sb2.append(", statusReason=");
        return C22026a.c(sb2, this.f259032e, ')');
    }
}
