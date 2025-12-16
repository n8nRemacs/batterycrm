package com.avito.android.profile.user_profile.cards.loyalty_preferences;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LoyaltyPreferencesCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/loyalty_preferences/d;", "Lcom/avito/android/profile/user_profile/cards/loyalty_preferences/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f225053b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225054c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Badge f225055d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225056e;

    public d(@k View view) {
        super(view);
        this.f225053b = (TextView) view.findViewById(R.id.card_title);
        this.f225054c = (TextView) view.findViewById(R.id.card_subtitle);
        this.f225055d = (Badge) view.findViewById(R.id.card_title_badge);
        this.f225056e = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_button);
    }

    @Override // com.avito.android.profile.user_profile.cards.loyalty_preferences.c
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f225056e;
        cVar.b(str);
        cVar.c(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.loyalty_preferences.c
    public final void f(@l String str) {
        I5.a(this.f225054c, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.loyalty_preferences.c
    public final void s(@l String str) {
        Badge badge = this.f225055d;
        if (str == null || str.length() == 0) {
            D6.w(badge);
        } else {
            D6.H(badge);
            badge.setTitleText(str);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.loyalty_preferences.c
    public final void setTitle(@k String str) {
        this.f225053b.setText(str);
    }
}
