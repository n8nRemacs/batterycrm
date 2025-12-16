package com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.FormattedDateDisplayingType;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/calendar_widget/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f289944b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f289945c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f289946d;

    public a(@k PrintableText printableText, @l AttributedText attributedText, @k DeepLink deepLink) {
        this.f289944b = printableText;
        this.f289945c = attributedText;
        this.f289946d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f289944b.equals(aVar.f289944b) && L.f(this.f289945c, aVar.f289945c) && this.f289946d.equals(aVar.f289946d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return -178324674;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF289413k() {
        return FormattedDateDisplayingType.TYPE_CALENDAR;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f289944b, -1233097598, 31);
        AttributedText attributedText = this.f289945c;
        return this.f289946d.hashCode() + ((iF2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarWidgetItem(stringId=calendar, title=");
        sb2.append(this.f289944b);
        sb2.append(", subtitle=");
        sb2.append(this.f289945c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f289946d, ')');
    }
}
