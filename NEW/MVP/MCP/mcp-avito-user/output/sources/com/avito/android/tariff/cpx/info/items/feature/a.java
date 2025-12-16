package com.avito.android.tariff.cpx.info.items.feature;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoFeatureItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/feature/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f296455b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f296456c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f296457d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final wZ.l f296458e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f296459f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f296460g;

    public a(@k String str, @k String str2, @k AttributedText attributedText, @l wZ.l lVar, @l DeepLink deepLink, boolean z12) {
        this.f296455b = str;
        this.f296456c = str2;
        this.f296457d = attributedText;
        this.f296458e = lVar;
        this.f296459f = deepLink;
        this.f296460g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f296455b, aVar.f296455b) && L.f(this.f296456c, aVar.f296456c) && L.f(this.f296457d, aVar.f296457d) && L.f(this.f296458e, aVar.f296458e) && L.f(this.f296459f, aVar.f296459f) && this.f296460g == aVar.f296460g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186822h() {
        return getF273281b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273281b() {
        return this.f296455b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.f296455b.hashCode() * 31, 31, this.f296456c), 31, this.f296457d);
        wZ.l lVar = this.f296458e;
        int iHashCode = (iB2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        DeepLink deepLink = this.f296459f;
        return Boolean.hashCode(this.f296460g) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoFeatureItem(stringId=");
        sb2.append(this.f296455b);
        sb2.append(", title=");
        sb2.append(this.f296456c);
        sb2.append(", description=");
        sb2.append(this.f296457d);
        sb2.append(", icon=");
        sb2.append(this.f296458e);
        sb2.append(", deeplink=");
        sb2.append(this.f296459f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f296460g, ')');
    }
}
