package com.avito.android.gig_apply.ui.common;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SlotWidgetPaymentInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/t;", "", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final h f159974a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f159975b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f159976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f159977d;

    public t() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f159974a, tVar.f159974a) && L.f(this.f159975b, tVar.f159975b) && L.f(this.f159976c, tVar.f159976c) && L.f(this.f159977d, tVar.f159977d);
    }

    public final int hashCode() {
        h hVar = this.f159974a;
        int iD2 = H.d((hVar == null ? 0 : hVar.hashCode()) * 31, 31, this.f159975b);
        DeepLink deepLink = this.f159976c;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText = this.f159977d;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotWidgetPaymentInfoState(requisites=");
        sb2.append(this.f159974a);
        sb2.append(", buttonText=");
        sb2.append(this.f159975b);
        sb2.append(", buttonDeepLink=");
        sb2.append(this.f159976c);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f159977d, ')');
    }

    public t(@Y61.l h hVar, @Y61.k String str, @Y61.l DeepLink deepLink, @Y61.l AttributedText attributedText) {
        this.f159974a = hVar;
        this.f159975b = str;
        this.f159976c = deepLink;
        this.f159977d = attributedText;
    }

    public /* synthetic */ t(h hVar, String str, DeepLink deepLink, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : hVar, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : attributedText);
    }
}
