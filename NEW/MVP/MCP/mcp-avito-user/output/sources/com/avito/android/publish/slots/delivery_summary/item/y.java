package com.avito.android.publish.slots.delivery_summary.item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import hf0.C40930c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DeliverySummarySlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/y;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class y implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243637b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final b f243638c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f243639d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final x f243640e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final x f243641f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final x f243642g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final x f243643h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AttributedText f243644i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final x f243645j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final x f243646k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final AttributedText f243647l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AttributedText f243648m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f243649n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final c f243650o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final z f243651p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.publish.slots.delivery_summary_edit.item.o f243652q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final List<C40930c> f243653r;

    public y(@Y61.k String str, @Y61.l b bVar, @Y61.l AttributedText attributedText, @Y61.l x xVar, @Y61.l x xVar2, @Y61.l x xVar3, @Y61.l x xVar4, @Y61.l AttributedText attributedText2, @Y61.l x xVar5, @Y61.l x xVar6, @Y61.l AttributedText attributedText3, @Y61.l AttributedText attributedText4, boolean z12, @Y61.l c cVar, @Y61.l z zVar, @Y61.l com.avito.android.publish.slots.delivery_summary_edit.item.o oVar, @Y61.l List<C40930c> list) {
        this.f243637b = str;
        this.f243638c = bVar;
        this.f243639d = attributedText;
        this.f243640e = xVar;
        this.f243641f = xVar2;
        this.f243642g = xVar3;
        this.f243643h = xVar4;
        this.f243644i = attributedText2;
        this.f243645j = xVar5;
        this.f243646k = xVar6;
        this.f243647l = attributedText3;
        this.f243648m = attributedText4;
        this.f243649n = z12;
        this.f243650o = cVar;
        this.f243651p = zVar;
        this.f243652q = oVar;
        this.f243653r = list;
    }

    public static y a(y yVar, z zVar) {
        String str = yVar.f243637b;
        b bVar = yVar.f243638c;
        AttributedText attributedText = yVar.f243639d;
        x xVar = yVar.f243640e;
        x xVar2 = yVar.f243641f;
        x xVar3 = yVar.f243642g;
        x xVar4 = yVar.f243643h;
        AttributedText attributedText2 = yVar.f243644i;
        x xVar5 = yVar.f243645j;
        x xVar6 = yVar.f243646k;
        AttributedText attributedText3 = yVar.f243647l;
        AttributedText attributedText4 = yVar.f243648m;
        boolean z12 = yVar.f243649n;
        c cVar = yVar.f243650o;
        com.avito.android.publish.slots.delivery_summary_edit.item.o oVar = yVar.f243652q;
        List<C40930c> list = yVar.f243653r;
        yVar.getClass();
        return new y(str, bVar, attributedText, xVar, xVar2, xVar3, xVar4, attributedText2, xVar5, xVar6, attributedText3, attributedText4, z12, cVar, zVar, oVar, list);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f243637b, yVar.f243637b) && L.f(this.f243638c, yVar.f243638c) && L.f(this.f243639d, yVar.f243639d) && L.f(this.f243640e, yVar.f243640e) && L.f(this.f243641f, yVar.f243641f) && L.f(this.f243642g, yVar.f243642g) && L.f(this.f243643h, yVar.f243643h) && L.f(this.f243644i, yVar.f243644i) && L.f(this.f243645j, yVar.f243645j) && L.f(this.f243646k, yVar.f243646k) && L.f(this.f243647l, yVar.f243647l) && L.f(this.f243648m, yVar.f243648m) && this.f243649n == yVar.f243649n && L.f(this.f243650o, yVar.f243650o) && L.f(this.f243651p, yVar.f243651p) && L.f(this.f243652q, yVar.f243652q) && L.f(this.f243653r, yVar.f243653r);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        return getF183828b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183828b() {
        return this.f243637b;
    }

    public final int hashCode() {
        int iHashCode = this.f243637b.hashCode() * 31;
        b bVar = this.f243638c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AttributedText attributedText = this.f243639d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        x xVar = this.f243640e;
        int iHashCode4 = (iHashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f243641f;
        int iHashCode5 = (iHashCode4 + (xVar2 == null ? 0 : xVar2.hashCode())) * 31;
        x xVar3 = this.f243642g;
        int iHashCode6 = (iHashCode5 + (xVar3 == null ? 0 : xVar3.hashCode())) * 31;
        x xVar4 = this.f243643h;
        int iHashCode7 = (iHashCode6 + (xVar4 == null ? 0 : xVar4.hashCode())) * 31;
        AttributedText attributedText2 = this.f243644i;
        int iHashCode8 = (iHashCode7 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        x xVar5 = this.f243645j;
        int iHashCode9 = (iHashCode8 + (xVar5 == null ? 0 : xVar5.hashCode())) * 31;
        x xVar6 = this.f243646k;
        int iHashCode10 = (iHashCode9 + (xVar6 == null ? 0 : xVar6.hashCode())) * 31;
        AttributedText attributedText3 = this.f243647l;
        int iHashCode11 = (iHashCode10 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        AttributedText attributedText4 = this.f243648m;
        int i12 = androidx.appcompat.app.r.i((iHashCode11 + (attributedText4 == null ? 0 : attributedText4.hashCode())) * 31, 31, this.f243649n);
        c cVar = this.f243650o;
        int iHashCode12 = (i12 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        z zVar = this.f243651p;
        int iHashCode13 = (iHashCode12 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        com.avito.android.publish.slots.delivery_summary_edit.item.o oVar = this.f243652q;
        int iHashCode14 = (iHashCode13 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        List<C40930c> list = this.f243653r;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySummarySlotItem(stringId=");
        sb2.append(this.f243637b);
        sb2.append(", advertInfo=");
        sb2.append(this.f243638c);
        sb2.append(", deliveryTitle=");
        sb2.append(this.f243639d);
        sb2.append(", deliveryFeeBlock=");
        sb2.append(this.f243640e);
        sb2.append(", deliveryFbsFeeBlock=");
        sb2.append(this.f243641f);
        sb2.append(", deliveryDiscountBlock=");
        sb2.append(this.f243642g);
        sb2.append(", deliverTotalBlock=");
        sb2.append(this.f243643h);
        sb2.append(", dbsTitle=");
        sb2.append(this.f243644i);
        sb2.append(", dbsFeeBlock=");
        sb2.append(this.f243645j);
        sb2.append(", dbsTotalBlock=");
        sb2.append(this.f243646k);
        sb2.append(", dbsAdditionalInfo=");
        sb2.append(this.f243647l);
        sb2.append(", agreementText=");
        sb2.append(this.f243648m);
        sb2.append(", isLoading=");
        sb2.append(this.f243649n);
        sb2.append(", cncData=");
        sb2.append(this.f243650o);
        sb2.append(", includingFeeData=");
        sb2.append(this.f243651p);
        sb2.append(", error=");
        sb2.append(this.f243652q);
        sb2.append(", deliveryFeeDetails=");
        return H.p(sb2, this.f243653r, ')');
    }

    public /* synthetic */ y(String str, b bVar, AttributedText attributedText, x xVar, x xVar2, x xVar3, x xVar4, AttributedText attributedText2, x xVar5, x xVar6, AttributedText attributedText3, AttributedText attributedText4, boolean z12, c cVar, z zVar, com.avito.android.publish.slots.delivery_summary_edit.item.o oVar, List list, int i12, C42822w c42822w) {
        this(str, bVar, (i12 & 4) != 0 ? null : attributedText, xVar, xVar2, xVar3, xVar4, (i12 & 128) != 0 ? null : attributedText2, (i12 & 256) != 0 ? null : xVar5, (i12 & 512) != 0 ? null : xVar6, (i12 & 1024) != 0 ? null : attributedText3, attributedText4, (i12 & 4096) != 0 ? false : z12, (i12 & 8192) != 0 ? null : cVar, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : zVar, (32768 & i12) != 0 ? null : oVar, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : list);
    }
}
