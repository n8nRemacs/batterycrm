package com.avito.beduin.v2.avito.component.items_controller;

import androidx.compose.foundation.H;
import com.avito.beduin.v2.avito.component.items_controller.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoItemsControllerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/a;", "Lcom/avito/beduin/v2/avito/component/items_controller/h;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f334549a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Map<String, ? extends Object>, G0> f334550b;

    public a(@Y61.k LinkedHashMap linkedHashMap, @Y61.l Y41.l lVar) {
        this.f334549a = linkedHashMap;
        this.f334550b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f334549a.equals(aVar.f334549a) && L.f(this.f334550b, aVar.f334550b);
    }

    @Override // com.avito.beduin.v2.avito.component.items_controller.h
    @Y61.k
    public final Map<String, h.a> getItems() {
        return this.f334549a;
    }

    public final int hashCode() {
        int iHashCode = this.f334549a.hashCode() * 31;
        Y41.l<Map<String, ? extends Object>, G0> lVar = this.f334550b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoItemsControllerState(items=");
        sb2.append(this.f334549a);
        sb2.append(", onDataChanged=");
        return H.l(sb2, this.f334550b, ')');
    }
}
