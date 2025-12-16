package com.avito.android.profile.user_profile.cards.service_booking.items.order;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/order/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/order/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225472g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225473b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225474c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225475d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f225476e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f225477f;

    public i(@k View view) {
        super(view);
        this.f225473b = view;
        View viewFindViewById = view.findViewById(R.id.sb_order_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225474c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sb_order_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225475d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sb_order_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f225476e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.sb_order_additional_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225477f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.h
    public final void a(@l Y41.a<G0> aVar) {
        this.f225473b.setOnClickListener(new C(24, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.h
    public final void f(@l String str) {
        I5.a(this.f225475d, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.h
    @k
    public final Context getContext() {
        return this.f225473b.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f225473b.setOnClickListener(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.h
    public final void kv(@l Image image, @l Drawable drawable) {
        C35949t5.c(this.f225476e, com.avito.android.image_loader.b.b(image), drawable, ImageRequest.ScaleType.f169473d, null, 8);
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.h
    public final void nT(@l AttributedText attributedText) {
        j.a(this.f225477f, attributedText, null);
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.h
    public final void setTitle(@l String str) {
        I5.a(this.f225474c, str, false);
    }
}
