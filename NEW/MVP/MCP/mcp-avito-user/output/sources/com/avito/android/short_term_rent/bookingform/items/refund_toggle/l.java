package com.avito.android.short_term_rent.bookingform.items.refund_toggle;

import Y41.p;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RefundToggleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/j;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f281615e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f281616b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f281617c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f281618d;

    /* compiled from: RefundToggleView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/short_term_rent/bookingform/items/refund_toggle/l$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f281619b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f281620c;

        public a(TextView textView, TextView textView2) {
            this.f281619b = textView;
            this.f281620c = textView2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            TextView textView = this.f281619b;
            textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TextView textView2 = this.f281620c;
            textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int iMax = Math.max(textView.getLineCount(), textView2.getLineCount());
            textView.setLines(iMax);
            textView2.setLines(iMax);
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f281616b = view;
        View viewFindViewById = view.findViewById(R.id.first_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f281617c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.second_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f281618d = viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new a(textView, (TextView) viewFindViewById4));
    }

    public static void B80(View view, RefundToggleItem.RefundToggleButton refundToggleButton) {
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.discount);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price_with_discount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.total_price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        textView.setText(refundToggleButton.getF281584c());
        ((TextView) viewFindViewById4).setText(refundToggleButton.getF281586e());
        view.setBackgroundResource(refundToggleButton.getF281588g());
        if (refundToggleButton instanceof RefundToggleItem.RefundToggleButton.Regular) {
            textView2.setVisibility(4);
            textView3.setVisibility(4);
        } else if (refundToggleButton instanceof RefundToggleItem.RefundToggleButton.WithDiscount) {
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            RefundToggleItem.RefundToggleButton.WithDiscount withDiscount = (RefundToggleItem.RefundToggleButton.WithDiscount) refundToggleButton;
            textView3.setText(withDiscount.f281601n);
            textView2.setText(withDiscount.f281602o);
        }
    }

    public static void C80(View view, DeepLink deepLink, Y41.l lVar) {
        View viewFindViewById = view.findViewById(R.id.tooltip);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        if (deepLink != null) {
            frameLayout.setOnClickListener(new k(lVar, deepLink, 1));
        } else {
            frameLayout.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.j
    public final void gg(@Y61.k p<? super String, ? super Boolean, G0> pVar, @Y61.k RefundToggleItem.RefundToggleButton refundToggleButton, @Y61.k RefundToggleItem.RefundToggleButton refundToggleButton2) {
        View view = this.f281617c;
        if (refundToggleButton != null) {
            view.setOnClickListener(new k(pVar, refundToggleButton, 0));
        } else {
            view.setOnClickListener(null);
        }
        View view2 = this.f281618d;
        if (refundToggleButton2 != null) {
            view2.setOnClickListener(new k(pVar, refundToggleButton2, 0));
        } else {
            view2.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.j
    public final void rn(@Y61.k RefundToggleItem.RefundToggleButton refundToggleButton, @Y61.k RefundToggleItem.RefundToggleButton refundToggleButton2) {
        B80(this.f281617c, refundToggleButton);
        B80(this.f281618d, refundToggleButton2);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.j
    public final void xr(@Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k RefundToggleItem.RefundToggleButton refundToggleButton, @Y61.k RefundToggleItem.RefundToggleButton refundToggleButton2) {
        C80(this.f281617c, refundToggleButton.getF281585d(), lVar);
        C80(this.f281618d, refundToggleButton2.getF281585d(), lVar);
    }
}
