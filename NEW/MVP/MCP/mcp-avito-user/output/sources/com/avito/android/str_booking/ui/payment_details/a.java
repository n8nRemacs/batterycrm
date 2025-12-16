package com.avito.android.str_booking.ui.payment_details;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.str_booking.ui.payment_details.table_row.g;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentDetailsItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f286114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f286115c;

    /* renamed from: d, reason: collision with root package name */
    public final int f286116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f286117e;

    /* renamed from: f, reason: collision with root package name */
    public final int f286118f;

    public a(@k Resources resources) {
        this.f286114b = resources.getDimensionPixelSize(R.dimen.str_booking_payment_item_top_margin);
        this.f286115c = resources.getDimensionPixelSize(R.dimen.str_booking_term_item_top_margin);
        this.f286116d = resources.getDimensionPixelSize(R.dimen.str_booking_term_items_vertical_margin);
        this.f286117e = resources.getDimensionPixelSize(R.dimen.str_booking_divider_item_top_margin);
        this.f286118f = resources.getDimensionPixelSize(R.dimen.str_booking_divider_item_bottom_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g) {
            rect.top = this.f286114b;
            return;
        }
        if (!(cW2 instanceof com.avito.android.str_booking.ui.payment_details.terms.g)) {
            if (cW2 instanceof com.avito.android.str_booking.ui.payment_details.divider.g) {
                rect.top = this.f286117e;
                rect.bottom = this.f286118f;
                return;
            }
            return;
        }
        int iU2 = RecyclerView.U(view);
        int i12 = this.f286116d;
        rect.top = iU2 == 0 ? i12 : this.f286115c;
        if (iU2 != recyclerView.getChildCount() - 1) {
            i12 = 0;
        }
        rect.bottom = i12;
    }
}
