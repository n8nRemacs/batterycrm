package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item;

import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.DateItem;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DateItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/c;", "LTV0/d;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/e;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/DateItem;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.d<e, DateItem> {

    /* compiled from: DateItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DateItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DateItem.Type type = DateItem.Type.f290900b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DateItem.Type type2 = DateItem.Type.f290900b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DateItem.Type type3 = DateItem.Type.f290900b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        DateItem dateItem = (DateItem) aVar;
        TextView textView = eVar2.f290912b;
        textView.setText(dateItem.f290897b);
        int iOrdinal = dateItem.f290898c.ordinal();
        if (iOrdinal == 0) {
            textView.setBackground(null);
            e.a.a(e.f290911c, textView, R.attr.gray20);
            textView.setPadding(0, 0, 0, 0);
            return;
        }
        if (iOrdinal == 1) {
            textView.setBackground(androidx.core.content.d.getDrawable(eVar2.itemView.getContext(), R.drawable.date_item_today_background));
            e.a.a(e.f290911c, textView, R.attr.white);
            int dimension = (int) textView.getContext().getResources().getDimension(R.dimen.str_calendar_dates_today_padding);
            textView.setPadding(dimension, dimension, dimension, dimension);
            return;
        }
        if (iOrdinal == 2) {
            textView.setBackground(null);
            e.a.a(e.f290911c, textView, R.attr.black);
            textView.setPadding(0, 0, 0, 0);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            textView.setBackground(null);
            e.a.a(e.f290911c, textView, R.attr.red600);
            textView.setPadding(0, 0, 0, 0);
        }
    }
}
