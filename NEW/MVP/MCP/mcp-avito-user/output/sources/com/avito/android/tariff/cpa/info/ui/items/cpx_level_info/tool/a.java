package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevelInfoToolItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tool/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294859b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f294860c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f294861d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f294862e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f294863f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f294864g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f294865h;

    public a(@k String str, @k String str2, @l AttributedText attributedText, @k UniversalImage universalImage, @l DeepLink deepLink, boolean z12, boolean z13) {
        this.f294859b = str;
        this.f294860c = str2;
        this.f294861d = attributedText;
        this.f294862e = universalImage;
        this.f294863f = deepLink;
        this.f294864g = z12;
        this.f294865h = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f294859b, aVar.f294859b) && L.f(this.f294860c, aVar.f294860c) && L.f(this.f294861d, aVar.f294861d) && L.f(this.f294862e, aVar.f294862e) && L.f(this.f294863f, aVar.f294863f) && this.f294864g == aVar.f294864g && this.f294865h == aVar.f294865h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return getF324032b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324032b() {
        return this.f294859b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f294859b.hashCode() * 31, 31, this.f294860c);
        AttributedText attributedText = this.f294861d;
        int iA2 = com.avito.android.actions_sheet.a.a((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f294862e);
        DeepLink deepLink = this.f294863f;
        return Boolean.hashCode(this.f294865h) + r.i((iA2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f294864g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelInfoToolItem(stringId=");
        sb2.append(this.f294859b);
        sb2.append(", title=");
        sb2.append(this.f294860c);
        sb2.append(", description=");
        sb2.append(this.f294861d);
        sb2.append(", icon=");
        sb2.append(this.f294862e);
        sb2.append(", deeplink=");
        sb2.append(this.f294863f);
        sb2.append(", isEnabled=");
        sb2.append(this.f294864g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f294865h, ')');
    }

    public /* synthetic */ a(String str, String str2, AttributedText attributedText, UniversalImage universalImage, DeepLink deepLink, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, attributedText, universalImage, deepLink, z12, (i12 & 64) != 0 ? false : z13);
    }
}
