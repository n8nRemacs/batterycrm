package com.avito.android.tariff_cpt.info.ui.items.card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/card/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298268b;

    /* renamed from: c, reason: collision with root package name */
    public final int f298269c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f298270d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final iC0.e f298271e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f298272f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f298273g;

    public a(@k String str, int i12, @l DeepLink deepLink, @l iC0.e eVar, @l Integer num, @l ArrayList arrayList) {
        this.f298268b = str;
        this.f298269c = i12;
        this.f298270d = deepLink;
        this.f298271e = eVar;
        this.f298272f = num;
        this.f298273g = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f298268b, aVar.f298268b) && this.f298269c == aVar.f298269c && L.f(this.f298270d, aVar.f298270d) && L.f(this.f298271e, aVar.f298271e) && L.f(this.f298272f, aVar.f298272f) && L.f(this.f298273g, aVar.f298273g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269870b() {
        return getF298268b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298268b() {
        return this.f298268b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f298269c, this.f298268b.hashCode() * 31, 31);
        DeepLink deepLink = this.f298270d;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        iC0.e eVar = this.f298271e;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Integer num = this.f298272f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList arrayList = this.f298273g;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoCardItem(stringId=");
        sb2.append(this.f298268b);
        sb2.append(", spanCount=");
        sb2.append(this.f298269c);
        sb2.append(", deepLink=");
        sb2.append(this.f298270d);
        sb2.append(", color=");
        sb2.append(this.f298271e);
        sb2.append(", bottomSpacer=");
        sb2.append(this.f298272f);
        sb2.append(", content=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f298273g, ')');
    }
}
