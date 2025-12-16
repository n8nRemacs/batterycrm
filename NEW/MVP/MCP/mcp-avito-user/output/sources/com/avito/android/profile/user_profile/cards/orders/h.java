package com.avito.android.profile.user_profile.cards.orders;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import gr.C40723b;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrdersCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/orders/h;", "Lcom/avito/android/profile/user_profile/cards/orders/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f225107b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225108c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225109d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C40723b f225110e;

    public h(@k View view) {
        super(view);
        this.f225107b = view.getContext();
        this.f225108c = (TextView) view.findViewById(R.id.orders_card_title);
        this.f225109d = com.avito.android.profile.user_profile.cards.d.a(view, R.id.orders_card_action_button);
        this.f225110e = com.avito.android.profile.user_profile.cards.d.b(view, R.id.orders_card_info_block);
    }

    @Override // com.avito.android.profile.user_profile.cards.orders.g
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f225109d;
        cVar.b(str);
        cVar.c(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.orders.g
    public final void a3(@InterfaceC42150f @l Integer num, @InterfaceC42165v @l Integer num2) {
        Drawable drawable;
        Context context = this.f225107b;
        if (num == null || (drawable = C35835l0.h(num.intValue(), context)) == null) {
            drawable = num2 != null ? androidx.core.content.d.getDrawable(context, num2.intValue()) : null;
        }
        com.avito.android.profile.user_profile.cards.d.c(this.f225110e, C35835l0.l(drawable, C35835l0.d(R.attr.gray28, context)));
    }

    @Override // com.avito.android.profile.user_profile.cards.orders.g
    public final void f(@k String str) {
        this.f225110e.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.orders.g
    public final void sc(boolean z12) {
        this.f225110e.b(z12);
    }

    @Override // com.avito.android.profile.user_profile.cards.orders.g
    public final void setTitle(@k String str) {
        this.f225108c.setText(str);
    }
}
