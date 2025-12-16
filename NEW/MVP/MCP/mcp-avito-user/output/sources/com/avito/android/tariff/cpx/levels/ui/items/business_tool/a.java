package com.avito.android.tariff.cpx.levels.ui.items.business_tool;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxBusinessToolItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/ui/items/business_tool/a;", "LJB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements JB0.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297154b;

    /* renamed from: c, reason: collision with root package name */
    public final int f297155c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f297156d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f297157e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f297158f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f297159g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f297160h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f297161i;

    public a(@k String str, int i12, @k String str2, @k UniversalImage universalImage, @l UniversalImage universalImage2, @l DeepLink deepLink, boolean z12, @l AttributedText attributedText) {
        this.f297154b = str;
        this.f297155c = i12;
        this.f297156d = str2;
        this.f297157e = universalImage;
        this.f297158f = universalImage2;
        this.f297159g = deepLink;
        this.f297160h = z12;
        this.f297161i = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f297154b, aVar.f297154b) && this.f297155c == aVar.f297155c && L.f(this.f297156d, aVar.f297156d) && L.f(this.f297157e, aVar.f297157e) && L.f(this.f297158f, aVar.f297158f) && L.f(this.f297159g, aVar.f297159g) && this.f297160h == aVar.f297160h && L.f(this.f297161i, aVar.f297161i);
    }

    @Override // JB0.a
    /* renamed from: g, reason: from getter */
    public final int getF297155c() {
        return this.f297155c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84107b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84108c() {
        return this.f297154b;
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(H.d(r.e(this.f297155c, this.f297154b.hashCode() * 31, 31), 31, this.f297156d), 31, this.f297157e);
        UniversalImage universalImage = this.f297158f;
        int iHashCode = (iA2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f297159g;
        int i12 = r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f297160h);
        AttributedText attributedText = this.f297161i;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxBusinessToolItem(stringId=");
        sb2.append(this.f297154b);
        sb2.append(", levelId=");
        sb2.append(this.f297155c);
        sb2.append(", title=");
        sb2.append(this.f297156d);
        sb2.append(", icon=");
        sb2.append(this.f297157e);
        sb2.append(", iconDisabled=");
        sb2.append(this.f297158f);
        sb2.append(", deeplink=");
        sb2.append(this.f297159g);
        sb2.append(", isEnabled=");
        sb2.append(this.f297160h);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f297161i, ')');
    }
}
