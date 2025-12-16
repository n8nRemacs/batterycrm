package com.avito.android.tariff.cpx.info.items.features_header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoFeaturesHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/features_header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f296475b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f296476c;

    public a(@k String str, @k AttributedText attributedText) {
        this.f296475b = str;
        this.f296476c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f296475b, aVar.f296475b) && L.f(this.f296476c, aVar.f296476c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF294899b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294899b() {
        return this.f296475b;
    }

    public final int hashCode() {
        return this.f296476c.hashCode() + (this.f296475b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoFeaturesHeaderItem(stringId=");
        sb2.append(this.f296475b);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f296476c, ')');
    }
}
