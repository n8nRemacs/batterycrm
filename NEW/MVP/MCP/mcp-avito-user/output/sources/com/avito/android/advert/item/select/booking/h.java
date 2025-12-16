package com.avito.android.advert.item.select.booking;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.auto_select.AutoSelectBooking;
import com.avito.android.remote.model.auto_select.AutoSelectButton;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lf.C43763b;
import lf.InterfaceC43762a;
import mf.C44075a;

/* compiled from: AutoSelectBookingView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/booking/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/select/booking/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f79383b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43762a f79384c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CardView f79385d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f79386e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f79387f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f79388g;

    public h(@k View view, @k InterfaceC43762a interfaceC43762a) {
        super(view);
        this.f79383b = view;
        this.f79384c = interfaceC43762a;
        View viewFindViewById = view.findViewById(R.id.auto_select_booking_card);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.cardview.widget.CardView");
        }
        this.f79385d = (CardView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.auto_select_booking_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79386e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.auto_select_booking_desc);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79387f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.auto_select_booking_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f79388g = (LinearLayout) viewFindViewById4;
    }

    @Override // com.avito.android.advert.item.select.booking.f
    public final void ZZ(@k AutoSelectBooking autoSelectBooking, @k l<? super DeepLink, G0> lVar) throws Resources.NotFoundException {
        View view = this.f79383b;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(view.getContext(), R.attr.gradientLinearMonoHorizontalWarmgray, C35835l0.j(R.attr.gradientLinearMonoHorizontalWarmgray, view.getContext()));
        c5275a.f179264a = com.avito.android.actions_sheet.a.d(view, R.dimen.select_booking_block_card_radius);
        this.f79385d.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
        String title = autoSelectBooking.getTitle();
        this.f79386e.setText(title);
        this.f79387f.setText(autoSelectBooking.getDescription());
        LinearLayout linearLayout = this.f79388g;
        linearLayout.removeViews(2, linearLayout.getChildCount() - 2);
        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.select_booking_block_button_bottom_margin);
        for (AutoSelectButton autoSelectButton : autoSelectBooking.getButtons()) {
            String title2 = autoSelectButton.getTitle();
            linearLayout.addView(C43763b.a(view.getContext(), title2, new g(lVar, autoSelectButton, this, title2), C44075a.a(autoSelectButton.getStyle()), dimensionPixelOffset));
        }
        this.f79384c.R0(title);
    }
}
