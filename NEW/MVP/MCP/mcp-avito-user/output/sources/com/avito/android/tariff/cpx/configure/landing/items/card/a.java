package com.avito.android.tariff.cpx.configure.landing.items.card;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/card/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295966b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f295967c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f295968d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f295969e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f295970f;

    public a(@k String str, @l ArrayList arrayList, @l ArrayList arrayList2, @l ButtonAction buttonAction, @l UniversalImage universalImage) {
        this.f295966b = str;
        this.f295967c = arrayList;
        this.f295968d = arrayList2;
        this.f295969e = buttonAction;
        this.f295970f = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f295966b, aVar.f295966b) && L.f(this.f295967c, aVar.f295967c) && L.f(this.f295968d, aVar.f295968d) && L.f(this.f295969e, aVar.f295969e) && L.f(this.f295970f, aVar.f295970f);
    }

    @Override // TV0.a
    public final long getId() {
        return getF281447b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281447b() {
        return this.f295966b;
    }

    public final int hashCode() {
        int iHashCode = this.f295966b.hashCode() * 31;
        ArrayList arrayList = this.f295967c;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f295968d;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ButtonAction buttonAction = this.f295969e;
        int iHashCode4 = (iHashCode3 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        UniversalImage universalImage = this.f295970f;
        return iHashCode4 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureLandingCardItem(stringId=");
        sb2.append(this.f295966b);
        sb2.append(", texts=");
        sb2.append(this.f295967c);
        sb2.append(", badges=");
        sb2.append(this.f295968d);
        sb2.append(", button=");
        sb2.append(this.f295969e);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f295970f, ')');
    }
}
