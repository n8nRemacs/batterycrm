package com.avito.android.profile.user_profile.cards.sessions;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.c;
import kotlin.Metadata;

/* compiled from: ProfileSessionsItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/sessions/h;", "Lcom/avito/android/profile/user_profile/cards/sessions/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PU.b f225516b;

    public h(@k View view) {
        super(view);
        this.f225516b = c.a.a(view, R.id.user_profile_common_card_container);
    }

    @Override // com.avito.android.profile.user_profile.cards.sessions.g
    public final void z(@k Y41.a aVar, @k String str, @k String str2) {
        PU.b bVar = this.f225516b;
        bVar.g0(str);
        bVar.b(str2);
        bVar.a(aVar);
    }
}
