package com.avito.android.tariff_cpt.info.ui.items.feature;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoFeatureItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/feature/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298293b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f298294c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f298295d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final iC0.f f298296e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f298297f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f298298g;

    public a(@k String str, @k String str2, @l AttributedText attributedText, @k iC0.f fVar, @l DeepLink deepLink, boolean z12) {
        this.f298293b = str;
        this.f298294c = str2;
        this.f298295d = attributedText;
        this.f298296e = fVar;
        this.f298297f = deepLink;
        this.f298298g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f298293b, aVar.f298293b) && L.f(this.f298294c, aVar.f298294c) && L.f(this.f298295d, aVar.f298295d) && L.f(this.f298296e, aVar.f298296e) && L.f(this.f298297f, aVar.f298297f) && this.f298298g == aVar.f298298g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF298341b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298341b() {
        return this.f298293b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f298293b.hashCode() * 31, 31, this.f298294c);
        AttributedText attributedText = this.f298295d;
        int iHashCode = (this.f298296e.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f298297f;
        return Boolean.hashCode(this.f298298g) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoFeatureItem(stringId=");
        sb2.append(this.f298293b);
        sb2.append(", title=");
        sb2.append(this.f298294c);
        sb2.append(", description=");
        sb2.append(this.f298295d);
        sb2.append(", icon=");
        sb2.append(this.f298296e);
        sb2.append(", deeplink=");
        sb2.append(this.f298297f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f298298g, ')');
    }
}
