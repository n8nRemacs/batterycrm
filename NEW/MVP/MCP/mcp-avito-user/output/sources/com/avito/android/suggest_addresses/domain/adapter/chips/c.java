package com.avito.android.suggest_addresses.domain.adapter.chips;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mA0.C43940a;

/* compiled from: SelectedAddressesItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/chips/c;", "Lcom/avito/conveyor_item/a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C43940a> f291849b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f291850c;

    public c(@k List<C43940a> list, @k String str) {
        this.f291849b = list;
        this.f291850c = str;
    }

    public static c a(c cVar, ArrayList arrayList) {
        String str = cVar.f291850c;
        cVar.getClass();
        return new c(arrayList, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f291849b, cVar.f291849b) && L.f(this.f291850c, cVar.f291850c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF288792b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288792b() {
        return this.f291850c;
    }

    public final int hashCode() {
        return this.f291850c.hashCode() + (this.f291849b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedAddressesItem(addresses=");
        sb2.append(this.f291849b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f291850c, ')');
    }

    public /* synthetic */ c(List list, String str, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? c.class.getName() : str);
    }
}
