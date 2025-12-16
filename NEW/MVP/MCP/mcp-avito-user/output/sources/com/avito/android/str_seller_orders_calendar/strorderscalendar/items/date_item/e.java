package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DateItemView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/e;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f290911c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final TextView f290912b;

    /* compiled from: DateItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/e$a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final void a(a aVar, TextView textView, int i12) {
            aVar.getClass();
            textView.setTextColor(C35835l0.d(i12, textView.getContext()));
        }

        public a() {
        }
    }

    public e(@k View view) {
        super(view);
        this.f290912b = (TextView) view.findViewById(R.id.date_tv);
    }
}
