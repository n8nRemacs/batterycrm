package com.avito.android.tariff.cpx.info.items.card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/card/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f296430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f296431c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f296432d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final wZ.k f296433e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f296434f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f296435g;

    public a(@k String str, int i12, @l DeepLink deepLink, @l wZ.k kVar, @l Integer num, @l ArrayList arrayList) {
        this.f296430b = str;
        this.f296431c = i12;
        this.f296432d = deepLink;
        this.f296433e = kVar;
        this.f296434f = num;
        this.f296435g = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f296430b, aVar.f296430b) && this.f296431c == aVar.f296431c && L.f(this.f296432d, aVar.f296432d) && L.f(this.f296433e, aVar.f296433e) && L.f(this.f296434f, aVar.f296434f) && L.f(this.f296435g, aVar.f296435g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF221050b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF221050b() {
        return this.f296430b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f296431c, this.f296430b.hashCode() * 31, 31);
        DeepLink deepLink = this.f296432d;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        wZ.k kVar = this.f296433e;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Integer num = this.f296434f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList arrayList = this.f296435g;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoCardItem(stringId=");
        sb2.append(this.f296430b);
        sb2.append(", spanCount=");
        sb2.append(this.f296431c);
        sb2.append(", deepLink=");
        sb2.append(this.f296432d);
        sb2.append(", color=");
        sb2.append(this.f296433e);
        sb2.append(", bottomSpacer=");
        sb2.append(this.f296434f);
        sb2.append(", content=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f296435g, ')');
    }
}
