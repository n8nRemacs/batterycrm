package com.avito.android.vas_union.ui.items.vas_performance_click;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2PerformanceClickItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_click/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323316c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f323317d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f323318e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f323319f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f323320g;

    /* renamed from: h, reason: collision with root package name */
    public final int f323321h;

    public a(@k String str, @k String str2, @k AttributedText attributedText, @k AttributedText attributedText2, @l UniversalImage universalImage, @l DeepLink deepLink, int i12) {
        this.f323315b = str;
        this.f323316c = str2;
        this.f323317d = attributedText;
        this.f323318e = attributedText2;
        this.f323319f = universalImage;
        this.f323320g = deepLink;
        this.f323321h = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f323315b, aVar.f323315b) && L.f(this.f323316c, aVar.f323316c) && L.f(this.f323317d, aVar.f323317d) && L.f(this.f323318e, aVar.f323318e) && L.f(this.f323319f, aVar.f323319f) && L.f(this.f323320g, aVar.f323320g) && this.f323321h == aVar.f323321h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF321621b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF321621b() {
        return this.f323315b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(H.d(this.f323315b.hashCode() * 31, 31, this.f323316c), 31, this.f323317d), 31, this.f323318e);
        UniversalImage universalImage = this.f323319f;
        int iHashCode = (iB2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f323320g;
        return Integer.hashCode(this.f323321h) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionV2PerformanceClickItem(stringId=");
        sb2.append(this.f323315b);
        sb2.append(", itemId=");
        sb2.append(this.f323316c);
        sb2.append(", price=");
        sb2.append(this.f323317d);
        sb2.append(", title=");
        sb2.append(this.f323318e);
        sb2.append(", image=");
        sb2.append(this.f323319f);
        sb2.append(", deeplink=");
        sb2.append(this.f323320g);
        sb2.append(", chipsId=");
        return r.t(sb2, this.f323321h, ')');
    }
}
