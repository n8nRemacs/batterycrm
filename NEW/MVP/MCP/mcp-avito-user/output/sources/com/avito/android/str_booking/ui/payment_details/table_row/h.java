package com.avito.android.str_booking.ui.payment_details.table_row;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingPaymentView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/table_row/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/payment_details/table_row/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {
    @Override // com.avito.android.str_booking.ui.payment_details.table_row.g
    public final void pD(@k List<AttributedText> list) {
        View view = this.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        for (AttributedText attributedText : list) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.str_booking_table_column, viewGroup, false);
            kotlin.c.b(textView, attributedText);
            viewGroup.addView(textView);
        }
    }
}
