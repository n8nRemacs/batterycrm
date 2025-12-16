package com.avito.android.tariff.cpx.configure.advance.items.chips;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/b;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f295701b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<a> f295702c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k String str, @Y61.k List<? extends a> list) {
        this.f295701b = str;
        this.f295702c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f295701b, bVar.f295701b) && L.f(this.f295702c, bVar.f295702c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF295701b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF295701b() {
        return this.f295701b;
    }

    public final int hashCode() {
        return this.f295702c.hashCode() + (this.f295701b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureAdvanceChipsItem(stringId=");
        sb2.append(this.f295701b);
        sb2.append(", advances=");
        return H.p(sb2, this.f295702c, ')');
    }
}
