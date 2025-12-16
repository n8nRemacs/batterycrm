package com.avito.android.gig_apply.ui.common;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SlotWidgetPaymentInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/h;", "", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f159940a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f159941b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f159942c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f159943d;

    public h() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f159940a, hVar.f159940a) && L.f(this.f159941b, hVar.f159941b) && L.f(this.f159942c, hVar.f159942c) && L.f(this.f159943d, hVar.f159943d);
    }

    public final int hashCode() {
        int iHashCode = this.f159940a.hashCode() * 31;
        AttributedText attributedText = this.f159941b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f159942c;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f159943d;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Requisites(title=");
        sb2.append(this.f159940a);
        sb2.append(", subtitle=");
        sb2.append(this.f159941b);
        sb2.append(", image=");
        sb2.append(this.f159942c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f159943d, ')');
    }

    public h(@Y61.l DeepLink deepLink, @Y61.l UniversalImage universalImage, @Y61.l AttributedText attributedText, @Y61.k String str) {
        this.f159940a = str;
        this.f159941b = attributedText;
        this.f159942c = universalImage;
        this.f159943d = deepLink;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(String str, AttributedText attributedText, UniversalImage universalImage, DeepLink deepLink, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "" : str;
        attributedText = (i12 & 2) != 0 ? null : attributedText;
        this((i12 & 8) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : universalImage, attributedText, str);
    }
}
