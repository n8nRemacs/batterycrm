package com.avito.android.profile.user_profile.cards.autoteka_purchase_data;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutotekaPurchaseDataCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/autoteka_purchase_data/h;", "Lcom/avito/android/profile/user_profile/cards/autoteka_purchase_data/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f224802b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224803c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f224804d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C40723b f224805e;

    public h(@k View view) {
        super(view);
        this.f224802b = view.getContext();
        this.f224803c = (TextView) view.findViewById(R.id.autoteka_purchase_data_card_title);
        this.f224804d = com.avito.android.profile.user_profile.cards.d.a(view, R.id.autoteka_purchase_data_card_action_button);
        this.f224805e = com.avito.android.profile.user_profile.cards.d.b(view, R.id.autoteka_purchase_data_card_info_block);
    }

    @Override // com.avito.android.profile.user_profile.cards.autoteka_purchase_data.g
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f224804d;
        cVar.b(str);
        cVar.c(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.autoteka_purchase_data.g
    public final void f(@k String str) {
        this.f224805e.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.autoteka_purchase_data.g
    public final void setIcon(int i12) {
        Context context = this.f224802b;
        com.avito.android.profile.user_profile.cards.d.c(this.f224805e, C35835l0.l(C35835l0.h(i12, context), C35835l0.d(R.attr.gray28, context)));
    }

    @Override // com.avito.android.profile.user_profile.cards.autoteka_purchase_data.g
    public final void setTitle(@k String str) {
        this.f224803c.setText(str);
    }
}
