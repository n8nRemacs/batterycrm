package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CalendarDayRedesignItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/c;", "LTV0/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/f;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/CalendarDayRedesignItem;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.b<f, CalendarDayRedesignItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f290841a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a f290842b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<f> f290843c = new g.a<>(R.layout.str_orders_calendar_day_item_redesign, new a());

    /* compiled from: CalendarDayRedesignItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view, c.this.f290842b);
        }
    }

    @Inject
    public c(@k g gVar, @k com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a aVar) {
        this.f290841a = gVar;
        this.f290842b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f290841a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f290843c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CalendarDayRedesignItem;
    }
}
