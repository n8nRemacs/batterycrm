package com.avito.android.cart_similar_items.konveyor.beduin;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_similar_items.konveyor.g;
import com.avito.conveyor_item.a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/beduin/c;", "Lcom/avito/android/cart_similar_items/konveyor/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.android.cart_similar_items.konveyor.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f115821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.cart_similar_items.konveyor.g f115822c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f115823d;

    public c() {
        throw null;
    }

    public c(String str, com.avito.android.cart_similar_items.konveyor.g gVar, List list, int i12, C42822w c42822w) {
        gVar = (i12 & 2) != 0 ? g.a.f115843a : gVar;
        this.f115821b = str;
        this.f115822c = gVar;
        this.f115823d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f115821b, cVar.f115821b) && L.f(this.f115822c, cVar.f115822c) && L.f(this.f115823d, cVar.f115823d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106084b() {
        return this.f115821b;
    }

    public final int hashCode() {
        return this.f115823d.hashCode() + ((this.f115822c.hashCode() + (this.f115821b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.cart_similar_items.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final com.avito.android.cart_similar_items.konveyor.g getF115874c() {
        return this.f115822c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItem(stringId=");
        sb2.append(this.f115821b);
        sb2.append(", spanType=");
        sb2.append(this.f115822c);
        sb2.append(", children=");
        return H.p(sb2, this.f115823d, ')');
    }
}
