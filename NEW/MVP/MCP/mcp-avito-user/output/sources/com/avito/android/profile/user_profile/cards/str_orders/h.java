package com.avito.android.profile.user_profile.cards.str_orders;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrOrdersCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/str_orders/h;", "Lcom/avito/android/profile/user_profile/cards/str_orders/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f225589b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225590c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C40723b f225591d;

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f225589b = (TextView) view.findViewById(R.id.str_orders_card_title);
        this.f225590c = com.avito.android.profile.user_profile.cards.d.a(view, R.id.str_orders_card_action_button);
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.str_orders_card_info_block);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB, C35835l0.l(androidx.core.content.d.getDrawable(context, R.drawable.ic_file_with_corner_outlined_24), C35835l0.d(R.attr.gray28, context)));
        this.f225591d = c40723bB;
    }

    @Override // com.avito.android.profile.user_profile.cards.str_orders.g
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f225590c;
        cVar.b(str);
        cVar.c(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.str_orders.g
    public final void f(@l String str) {
        this.f225591d.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.str_orders.g
    public final void sc(boolean z12) {
        this.f225591d.b(z12);
    }

    @Override // com.avito.android.profile.user_profile.cards.str_orders.g
    public final void setTitle(@k String str) {
        this.f225589b.setText(str);
    }
}
