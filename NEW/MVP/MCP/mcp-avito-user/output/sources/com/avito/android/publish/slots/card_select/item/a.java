package com.avito.android.publish.slots.card_select.item;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CardSelectSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243135b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<CardSelect> f243136c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalColor f243137d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalColor f243138e;

    public a(@Y61.k String str, @Y61.k List<CardSelect> list, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.f243135b = str;
        this.f243136c = list;
        this.f243137d = universalColor;
        this.f243138e = universalColor2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f243135b, aVar.f243135b) && L.f(this.f243136c, aVar.f243136c) && L.f(this.f243137d, aVar.f243137d) && L.f(this.f243138e, aVar.f243138e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74281b() {
        return getF74282c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74282c() {
        return this.f243135b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f243135b.hashCode() * 31, 31, this.f243136c);
        UniversalColor universalColor = this.f243137d;
        int iHashCode = (iE2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.f243138e;
        return iHashCode + (universalColor2 != null ? universalColor2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardSelectSlotItem(stringId=");
        sb2.append(this.f243135b);
        sb2.append(", cards=");
        sb2.append(this.f243136c);
        sb2.append(", checkedBackgroundColor=");
        sb2.append(this.f243137d);
        sb2.append(", defaultBackgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f243138e, ')');
    }
}
