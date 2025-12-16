package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelBookingInfoFloatingView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/floating_view/i;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f75993a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f75994b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f75995c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f75996d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f75997e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f75998f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.l<? super HotelActionButton, G0> f75999g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f76000h;

    public i(@k View view) {
        this.f75993a = view;
        View viewFindViewById = view.findViewById(R.id.preview);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f75994b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.action);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f75995c = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75996d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75997e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.details_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f75998f = (LinearLayout) viewFindViewById5;
        this.f76000h = true;
        c();
    }

    public final void a(@l HotelActionButton hotelActionButton) {
        int i12 = hotelActionButton != null ? 0 : 8;
        Button button = this.f75995c;
        button.setVisibility(i12);
        if (hotelActionButton == null) {
            return;
        }
        Integer f162611c = hotelActionButton.getF162611c();
        if (f162611c != null) {
            int iIntValue = f162611c.intValue();
            b.a aVar = VU.b.f17147t;
            Context context = button.getContext();
            int iJ2 = C35835l0.j(iIntValue, button.getContext());
            aVar.getClass();
            button.setStyle(b.a.c(iJ2, context));
        }
        button.setText(hotelActionButton.getF162610b().k0(button.getContext()));
        Boolean f162612d = hotelActionButton.getF162612d();
        button.setEnabled(f162612d != null ? f162612d.booleanValue() : true);
        button.setOnClickListener(new com.avito.android.advert.closed.b(25, this, hotelActionButton));
    }

    public final void b(@l Image image) {
        this.f75994b.setVisibility(image != null ? 0 : 8);
        C35949t5.c(this.f75994b, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    public final void c() {
        if (this.f76000h) {
            this.f76000h = false;
            View view = this.f75993a;
            view.setTranslationY(0.0f);
            A0 a0A = C22823h0.a(view);
            a0A.g(view.getHeight());
            a0A.c(100L);
            a0A.d(new LinearInterpolator());
            a0A.h(new h(this, 0));
            a0A.f();
        }
    }

    public final void d() {
        if (this.f76000h) {
            return;
        }
        this.f76000h = true;
        View view = this.f75993a;
        view.setTranslationY(view.getHeight());
        A0 a0A = C22823h0.a(view);
        a0A.g(0.0f);
        a0A.c(100L);
        a0A.d(new LinearInterpolator());
        h hVar = new h(this, 1);
        View view2 = a0A.f44903a.get();
        if (view2 != null) {
            view2.animate().withStartAction(hVar);
        }
        a0A.f();
    }
}
