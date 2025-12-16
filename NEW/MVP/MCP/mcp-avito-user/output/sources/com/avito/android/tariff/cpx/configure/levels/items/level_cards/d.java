package com.avito.android.tariff.cpx.configure.levels.items.level_cards;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LevelCardsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/d;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f296143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d> f296144c;

    public d(@Y61.k String str, @Y61.k List<com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d> list) {
        this.f296143b = str;
        this.f296144c = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f296143b, dVar.f296143b) && L.f(this.f296144c, dVar.f296144c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF283255b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283255b() {
        return this.f296143b;
    }

    public final int hashCode() {
        return this.f296144c.hashCode() + (this.f296143b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LevelCardsItem(stringId=");
        sb2.append(this.f296143b);
        sb2.append(", list=");
        return H.p(sb2, this.f296144c, ')');
    }
}
