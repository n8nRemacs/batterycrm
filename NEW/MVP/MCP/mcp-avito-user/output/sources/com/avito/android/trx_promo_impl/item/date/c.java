package com.avito.android.trx_promo_impl.item.date;

import com.avito.android.remote.model.text.AttributedText;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDatesItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/date/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f304248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LocalDate f304249c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LocalDate f304250d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final LocalDate f304251e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f304252f;

    public c(@Y61.k AttributedText attributedText, @Y61.k LocalDate localDate, @Y61.k LocalDate localDate2, @Y61.l LocalDate localDate3, @Y61.k ArrayList arrayList) {
        this.f304248b = attributedText;
        this.f304249c = localDate;
        this.f304250d = localDate2;
        this.f304251e = localDate3;
        this.f304252f = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f304248b, cVar.f304248b) && this.f304249c.equals(cVar.f304249c) && this.f304250d.equals(cVar.f304250d) && L.f(this.f304251e, cVar.f304251e) && this.f304252f.equals(cVar.f304252f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return -42646448;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF272735b() {
        return "trx_promo_dates";
    }

    public final int hashCode() {
        int iHashCode = (this.f304250d.hashCode() + ((this.f304249c.hashCode() + com.avito.android.actions_sheet.a.b(-1322039888, 31, this.f304248b)) * 31)) * 31;
        LocalDate localDate = this.f304251e;
        return this.f304252f.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoDatesItem(stringId=trx_promo_dates, title=");
        sb2.append(this.f304248b);
        sb2.append(", valueFrom=");
        sb2.append(this.f304249c);
        sb2.append(", valueTo=");
        sb2.append(this.f304250d);
        sb2.append(", startDate=");
        sb2.append(this.f304251e);
        sb2.append(", dateOptions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f304252f, ')');
    }
}
