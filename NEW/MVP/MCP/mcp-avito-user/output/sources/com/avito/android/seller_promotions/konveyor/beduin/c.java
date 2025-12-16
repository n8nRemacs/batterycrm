package com.avito.android.seller_promotions.konveyor.beduin;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.seller_promotions.konveyor.g;
import com.avito.conveyor_item.a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/beduin/c;", "Lcom/avito/android/seller_promotions/konveyor/c;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c implements com.avito.android.seller_promotions.konveyor.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.seller_promotions.konveyor.g f267783c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f267784d;

    public c() {
        throw null;
    }

    public c(String str, com.avito.android.seller_promotions.konveyor.g gVar, List list, int i12, C42822w c42822w) {
        gVar = (i12 & 2) != 0 ? g.a.f267804a : gVar;
        this.f267782b = str;
        this.f267783c = gVar;
        this.f267784d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f267782b, cVar.f267782b) && L.f(this.f267783c, cVar.f267783c) && L.f(this.f267784d, cVar.f267784d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266318b() {
        return this.f267782b;
    }

    public final int hashCode() {
        return this.f267784d.hashCode() + ((this.f267783c.hashCode() + (this.f267782b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.seller_promotions.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final com.avito.android.seller_promotions.konveyor.g getF267835c() {
        return this.f267783c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItem(stringId=");
        sb2.append(this.f267782b);
        sb2.append(", spanType=");
        sb2.append(this.f267783c);
        sb2.append(", children=");
        return H.p(sb2, this.f267784d, ')');
    }
}
