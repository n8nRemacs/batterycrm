package com.avito.android.publish.slots.delivery_summary.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummarySlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AttributedText f243576a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final x f243577b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final x f243578c;

    public c() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243576a, cVar.f243576a) && L.f(this.f243577b, cVar.f243577b) && L.f(this.f243578c, cVar.f243578c);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f243576a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        x xVar = this.f243577b;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f243578c;
        return iHashCode2 + (xVar2 != null ? xVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "DeliverySummaryCncData(title=" + this.f243576a + ", feeBlock=" + this.f243577b + ", totalBlock=" + this.f243578c + ')';
    }

    public c(@Y61.l AttributedText attributedText, @Y61.l x xVar, @Y61.l x xVar2) {
        this.f243576a = attributedText;
        this.f243577b = xVar;
        this.f243578c = xVar2;
    }

    public /* synthetic */ c(AttributedText attributedText, x xVar, x xVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? null : xVar, (i12 & 4) != 0 ? null : xVar2);
    }
}
