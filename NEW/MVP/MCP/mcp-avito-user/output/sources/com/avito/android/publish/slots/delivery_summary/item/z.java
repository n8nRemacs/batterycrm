package com.avito.android.publish.slots.delivery_summary.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummarySlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/z;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f243654a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final a f243655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f243656c;

    /* renamed from: d, reason: collision with root package name */
    public final long f243657d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f243658e;

    public z(@Y61.l UniversalImage universalImage, @Y61.l a aVar, @Y61.k AttributedText attributedText, long j12, boolean z12) {
        this.f243654a = universalImage;
        this.f243655b = aVar;
        this.f243656c = attributedText;
        this.f243657d = j12;
        this.f243658e = z12;
    }

    public static z a(z zVar, boolean z12) {
        UniversalImage universalImage = zVar.f243654a;
        a aVar = zVar.f243655b;
        AttributedText attributedText = zVar.f243656c;
        long j12 = zVar.f243657d;
        zVar.getClass();
        return new z(universalImage, aVar, attributedText, j12, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f243654a, zVar.f243654a) && L.f(this.f243655b, zVar.f243655b) && L.f(this.f243656c, zVar.f243656c) && this.f243657d == zVar.f243657d && this.f243658e == zVar.f243658e;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f243654a;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        a aVar = this.f243655b;
        return Boolean.hashCode(this.f243658e) + androidx.appcompat.app.r.g(com.avito.android.actions_sheet.a.b((iHashCode + (aVar != null ? aVar.f243572a.hashCode() : 0)) * 31, 31, this.f243656c), 31, this.f243657d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncludingFeeDataItem(image=");
        sb2.append(this.f243654a);
        sb2.append(", badge=");
        sb2.append(this.f243655b);
        sb2.append(", description=");
        sb2.append(this.f243656c);
        sb2.append(", itemPriceWithFee=");
        sb2.append(this.f243657d);
        sb2.append(", isEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f243658e, ')');
    }

    public /* synthetic */ z(UniversalImage universalImage, a aVar, AttributedText attributedText, long j12, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : universalImage, (i12 & 2) != 0 ? null : aVar, attributedText, j12, (i12 & 16) != 0 ? false : z12);
    }
}
