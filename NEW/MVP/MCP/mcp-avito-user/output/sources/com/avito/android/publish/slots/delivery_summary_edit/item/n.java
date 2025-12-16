package com.avito.android.publish.slots.delivery_summary_edit.item;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummaryEditSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/item/n;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class n implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243812b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final m f243813c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final m f243814d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final m f243815e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final m f243816f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AttributedText f243817g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f243818h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final o f243819i;

    public n(@Y61.k String str, @Y61.l m mVar, @Y61.l m mVar2, @Y61.l m mVar3, @Y61.l m mVar4, @Y61.l AttributedText attributedText, boolean z12, @Y61.l o oVar) {
        this.f243812b = str;
        this.f243813c = mVar;
        this.f243814d = mVar2;
        this.f243815e = mVar3;
        this.f243816f = mVar4;
        this.f243817g = attributedText;
        this.f243818h = z12;
        this.f243819i = oVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f243812b, nVar.f243812b) && L.f(this.f243813c, nVar.f243813c) && L.f(this.f243814d, nVar.f243814d) && L.f(this.f243815e, nVar.f243815e) && L.f(this.f243816f, nVar.f243816f) && L.f(this.f243817g, nVar.f243817g) && this.f243818h == nVar.f243818h && L.f(this.f243819i, nVar.f243819i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78710b() {
        return getF202703b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202703b() {
        return this.f243812b;
    }

    public final int hashCode() {
        int iHashCode = this.f243812b.hashCode() * 31;
        m mVar = this.f243813c;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        m mVar2 = this.f243814d;
        int iHashCode3 = (iHashCode2 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31;
        m mVar3 = this.f243815e;
        int iHashCode4 = (iHashCode3 + (mVar3 == null ? 0 : mVar3.hashCode())) * 31;
        m mVar4 = this.f243816f;
        int iHashCode5 = (iHashCode4 + (mVar4 == null ? 0 : mVar4.hashCode())) * 31;
        AttributedText attributedText = this.f243817g;
        int i12 = r.i((iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f243818h);
        o oVar = this.f243819i;
        return i12 + (oVar != null ? oVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "DeliverySummaryEditSlotItem(stringId=" + this.f243812b + ", feePriceBlock=" + this.f243813c + ", fbsFeePriceBlock=" + this.f243814d + ", discountPriceBlock=" + this.f243815e + ", totalPriceBlock=" + this.f243816f + ", agreementText=" + this.f243817g + ", isLoading=" + this.f243818h + ", error=" + this.f243819i + ')';
    }

    public /* synthetic */ n(String str, m mVar, m mVar2, m mVar3, m mVar4, AttributedText attributedText, boolean z12, o oVar, int i12, C42822w c42822w) {
        this(str, mVar, (i12 & 4) != 0 ? null : mVar2, mVar3, mVar4, attributedText, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? null : oVar);
    }
}
