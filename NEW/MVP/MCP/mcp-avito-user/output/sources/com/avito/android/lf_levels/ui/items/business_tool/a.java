package com.avito.android.lf_levels.ui.items.business_tool;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LfBusinessToolItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/ui/items/business_tool/a;", "LBR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements BR.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f175399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175400c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f175401d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f175402e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f175403f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f175404g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f175405h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f175406i;

    public a(@k String str, int i12, @k String str2, @k UniversalImage universalImage, @l UniversalImage universalImage2, @l DeepLink deepLink, boolean z12, @l AttributedText attributedText) {
        this.f175399b = str;
        this.f175400c = i12;
        this.f175401d = str2;
        this.f175402e = universalImage;
        this.f175403f = universalImage2;
        this.f175404g = deepLink;
        this.f175405h = z12;
        this.f175406i = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f175399b, aVar.f175399b) && this.f175400c == aVar.f175400c && L.f(this.f175401d, aVar.f175401d) && L.f(this.f175402e, aVar.f175402e) && L.f(this.f175403f, aVar.f175403f) && L.f(this.f175404g, aVar.f175404g) && this.f175405h == aVar.f175405h && L.f(this.f175406i, aVar.f175406i);
    }

    @Override // BR.a
    /* renamed from: g, reason: from getter */
    public final int getF175400c() {
        return this.f175400c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170227b() {
        return this.f175399b;
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(H.d(r.e(this.f175400c, this.f175399b.hashCode() * 31, 31), 31, this.f175401d), 31, this.f175402e);
        UniversalImage universalImage = this.f175403f;
        int iHashCode = (iA2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f175404g;
        int i12 = r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f175405h);
        AttributedText attributedText = this.f175406i;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LfBusinessToolItem(stringId=");
        sb2.append(this.f175399b);
        sb2.append(", levelId=");
        sb2.append(this.f175400c);
        sb2.append(", title=");
        sb2.append(this.f175401d);
        sb2.append(", icon=");
        sb2.append(this.f175402e);
        sb2.append(", iconDisabled=");
        sb2.append(this.f175403f);
        sb2.append(", deeplink=");
        sb2.append(this.f175404g);
        sb2.append(", isEnabled=");
        sb2.append(this.f175405h);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f175406i, ')');
    }
}
