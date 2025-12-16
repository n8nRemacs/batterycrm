package com.avito.android.publish.slots.delivery_summary_edit.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummaryEditSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/item/m;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Q<AttributedText, AttributedText> f243809a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f243810b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final hf0.e f243811c;

    public m(@Y61.l Q<AttributedText, AttributedText> q12, @Y61.l DeepLink deepLink, @Y61.l hf0.e eVar) {
        this.f243809a = q12;
        this.f243810b = deepLink;
        this.f243811c = eVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f243809a, mVar.f243809a) && L.f(this.f243810b, mVar.f243810b) && L.f(this.f243811c, mVar.f243811c);
    }

    public final int hashCode() {
        Q<AttributedText, AttributedText> q12 = this.f243809a;
        int iHashCode = (q12 == null ? 0 : q12.hashCode()) * 31;
        DeepLink deepLink = this.f243810b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        hf0.e eVar = this.f243811c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "DeliverySummaryEditPriceBlock(priceTexts=" + this.f243809a + ", deeplink=" + this.f243810b + ", helpContent=" + this.f243811c + ')';
    }

    public /* synthetic */ m(Q q12, DeepLink deepLink, hf0.e eVar, int i12, C42822w c42822w) {
        this(q12, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : eVar);
    }
}
