package com.avito.android.tariff_select.ui.items.tariff;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffSelectTariffItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/ui/items/tariff/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f301266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f301267c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f301268d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f301269e;

    public a(@k DeepLink deepLink, @l UniversalImage universalImage, @k AttributedText attributedText, @k String str) {
        this.f301266b = str;
        this.f301267c = attributedText;
        this.f301268d = deepLink;
        this.f301269e = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f301266b, aVar.f301266b) && L.f(this.f301267c, aVar.f301267c) && L.f(this.f301268d, aVar.f301268d) && L.f(this.f301269e, aVar.f301269e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF295013b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF295013b() {
        return this.f301266b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f301268d, com.avito.android.actions_sheet.a.b(this.f301266b.hashCode() * 31, 31, this.f301267c), 31);
        UniversalImage universalImage = this.f301269e;
        return iE2 + (universalImage == null ? 0 : universalImage.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffSelectTariffItem(stringId=");
        sb2.append(this.f301266b);
        sb2.append(", text=");
        sb2.append(this.f301267c);
        sb2.append(", deeplink=");
        sb2.append(this.f301268d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f301269e, ')');
    }
}
