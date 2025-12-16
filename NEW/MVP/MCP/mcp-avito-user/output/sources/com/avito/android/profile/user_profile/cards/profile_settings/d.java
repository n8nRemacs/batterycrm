package com.avito.android.profile.user_profile.cards.profile_settings;

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

/* compiled from: ProfileManagementCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/profile_settings/d;", "Lcom/avito/android/profile/user_profile/cards/profile_settings/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f225235b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225236c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C40723b f225237d;

    public d(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f225235b = (TextView) view.findViewById(R.id.card_title);
        this.f225236c = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_button);
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.description);
        this.f225237d = c40723bB;
        com.avito.android.profile.user_profile.cards.d.c(c40723bB, C35835l0.l(C35835l0.h(R.attr.ic_edit24, context), C35835l0.d(R.attr.gray28, context)));
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_settings.c
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f225236c;
        cVar.b(str);
        cVar.c(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_settings.c
    public final void f(@l String str) {
        this.f225237d.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_settings.c
    public final void setTitle(@k String str) {
        this.f225235b.setText(str);
    }
}
