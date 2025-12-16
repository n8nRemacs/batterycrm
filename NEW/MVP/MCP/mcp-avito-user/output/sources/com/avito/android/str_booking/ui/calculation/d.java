package com.avito.android.str_booking.ui.calculation;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.sections.CalculationContentItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/calculation/d;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f285960b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final SuggestAnalyticsEvent f285961c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<CalculationContentItem> f285962d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final n f285963e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final a f285964f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f285965g;

    public d(@Y61.l String str, @Y61.l SuggestAnalyticsEvent suggestAnalyticsEvent, @Y61.l List<CalculationContentItem> list, @Y61.l n nVar, @Y61.l a aVar, @Y61.k String str2) {
        this.f285960b = str;
        this.f285961c = suggestAnalyticsEvent;
        this.f285962d = list;
        this.f285963e = nVar;
        this.f285964f = aVar;
        this.f285965g = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f285960b, dVar.f285960b) && L.f(this.f285961c, dVar.f285961c) && L.f(this.f285962d, dVar.f285962d) && L.f(this.f285963e, dVar.f285963e) && L.f(this.f285964f, dVar.f285964f) && L.f(this.f285965g, dVar.f285965g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF285965g().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF285965g() {
        return this.f285965g;
    }

    public final int hashCode() {
        String str = this.f285960b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SuggestAnalyticsEvent suggestAnalyticsEvent = this.f285961c;
        int iHashCode2 = (iHashCode + (suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode())) * 31;
        List<CalculationContentItem> list = this.f285962d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        n nVar = this.f285963e;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        a aVar = this.f285964f;
        return this.f285965g.hashCode() + ((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingCalculationItem(header=");
        sb2.append(this.f285960b);
        sb2.append(", onTapEvent=");
        sb2.append(this.f285961c);
        sb2.append(", items=");
        sb2.append(this.f285962d);
        sb2.append(", termsContent=");
        sb2.append(this.f285963e);
        sb2.append(", paymentDetailsContent=");
        sb2.append(this.f285964f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f285965g, ')');
    }
}
