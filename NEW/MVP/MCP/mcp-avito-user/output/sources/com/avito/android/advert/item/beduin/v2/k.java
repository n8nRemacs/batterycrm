package com.avito.android.advert.item.beduin.v2;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemCardNativeCellWrapperState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/k;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f73360a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73361b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ET0.b f73362c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, G0> f73363d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k String str, boolean z12, @Y61.l ET0.b bVar, @Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f73360a = str;
        this.f73361b = z12;
        this.f73362c = bVar;
        this.f73363d = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f73360a, kVar.f73360a) && this.f73361b == kVar.f73361b && L.f(this.f73362c, kVar.f73362c) && L.f(this.f73363d, kVar.f73363d);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.f73360a.hashCode() * 31, 31, this.f73361b);
        ET0.b bVar = this.f73362c;
        int iHashCode = (i12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Y41.l<Integer, G0> lVar = this.f73363d;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemCardNativeCellWrapperState(identifier=");
        sb2.append(this.f73360a);
        sb2.append(", visible=");
        sb2.append(this.f73361b);
        sb2.append(", padding=");
        sb2.append(this.f73362c);
        sb2.append(", onVisibleChildrenCountChange=");
        return H.l(sb2, this.f73363d, ')');
    }
}
