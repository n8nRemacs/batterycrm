package com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingsDetailedInfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/detailed_info/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/detailed_info/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f225439f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225440b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f225441c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225442d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f225443e;

    public i(@k View view) {
        super(view);
        this.f225440b = view;
        this.f225441c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.sb_all_order_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225442d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sb_all_orders_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f225443e = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.h
    public final void a(@l Y41.a<G0> aVar) {
        this.f225440b.setOnClickListener(new C(23, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.h
    public final void a3(@l Integer num, @l Integer num2) {
        Context context = this.f225441c;
        this.f225443e.setImageDrawable((num == null || num2 == null) ? num != null ? C35835l0.h(num.intValue(), context) : null : C35835l0.m(context, num.intValue(), num2.intValue()));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f225440b.setOnClickListener(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.h
    public final void setTitle(@l String str) {
        I5.a(this.f225442d, str, false);
    }
}
