package com.avito.android.profile.user_profile.cards.item_with_button;

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
import kotlin.jvm.internal.s0;

/* compiled from: WithButtonCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/item_with_button/h;", "Lcom/avito/android/profile/user_profile/cards/item_with_button/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f225011b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225012c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225013d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C40723b f225014e;

    public h(@k View view) {
        super(view);
        this.f225011b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225012c = (TextView) viewFindViewById;
        this.f225013d = com.avito.android.profile.user_profile.cards.d.a(view, R.id.card_action_button);
        this.f225014e = com.avito.android.profile.user_profile.cards.d.b(view, R.id.card_info_block);
    }

    @Override // com.avito.android.profile.user_profile.cards.item_with_button.g
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f225013d;
        cVar.b(str);
        cVar.c(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.item_with_button.g
    public final void Yf(int i12, @l String str, boolean z12) {
        C40723b c40723b = this.f225014e;
        c40723b.m6(str);
        c40723b.b(z12);
        Context context = this.f225011b;
        com.avito.android.profile.user_profile.cards.d.c(c40723b, C35835l0.l(C35835l0.h(i12, context), C35835l0.d(R.attr.gray28, context)));
    }

    @Override // com.avito.android.profile.user_profile.cards.item_with_button.g
    public final void setTitle(@k String str) {
        this.f225012c.setText(str);
    }
}
