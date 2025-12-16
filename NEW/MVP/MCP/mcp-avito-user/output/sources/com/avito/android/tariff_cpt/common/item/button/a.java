package com.avito.android.tariff_cpt.common.item.button;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/common/item/button/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f297518c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f297519d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f297520e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f297521f;

    public a(@k String str, @k String str2, @l DeepLink deepLink, @l AttributedText attributedText, boolean z12) {
        this.f297517b = str;
        this.f297518c = str2;
        this.f297519d = deepLink;
        this.f297520e = attributedText;
        this.f297521f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f297517b, aVar.f297517b) && L.f(this.f297518c, aVar.f297518c) && L.f(this.f297519d, aVar.f297519d) && L.f(this.f297520e, aVar.f297520e) && this.f297521f == aVar.f297521f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return getF268897b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268897b() {
        return this.f297517b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f297517b.hashCode() * 31, 31, this.f297518c);
        DeepLink deepLink = this.f297519d;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText = this.f297520e;
        return Boolean.hashCode(this.f297521f) + ((iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptButtonItem(stringId=");
        sb2.append(this.f297517b);
        sb2.append(", title=");
        sb2.append(this.f297518c);
        sb2.append(", deeplink=");
        sb2.append(this.f297519d);
        sb2.append(", agreementText=");
        sb2.append(this.f297520e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f297521f, ')');
    }

    public /* synthetic */ a(String str, String str2, DeepLink deepLink, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? false : z12);
    }
}
