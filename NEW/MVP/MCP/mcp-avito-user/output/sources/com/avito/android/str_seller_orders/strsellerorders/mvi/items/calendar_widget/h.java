package com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CalendarWidgetItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/calendar_widget/h;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/calendar_widget/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f289955e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f289956b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f289957c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f289958d;

    public h(@k View view) {
        super(view);
        this.f289956b = view;
        this.f289957c = (TextView) view.findViewById(R.id.widget_title_tv);
        this.f289958d = (TextView) view.findViewById(R.id.widget_subtitle_tv);
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget.g
    public final void D(@k PrintableText printableText) {
        com.avito.android.printable_text.a.c(this.f289957c, printableText);
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f289956b.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(17, aVar));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget.g
    public final void k(@l AttributedText attributedText) {
        j.a(this.f289958d, attributedText, null);
    }
}
