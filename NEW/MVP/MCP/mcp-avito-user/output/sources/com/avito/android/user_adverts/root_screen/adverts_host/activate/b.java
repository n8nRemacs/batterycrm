package com.avito.android.user_adverts.root_screen.adverts_host.activate;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ProfileUserItemsActivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/activate/b;", "Lev/a;", "Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<ProfileUserItemsActivateLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.user_adverts.tab_actions.host.domain.a f312369f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f312370g;

    @Inject
    public b(@k com.avito.android.user_adverts.tab_actions.host.domain.a aVar, @k R0 r02) {
        this.f312369f = aVar;
        this.f312370g = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f312370g, null, null, new a(this, (ProfileUserItemsActivateLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f312370g, null);
    }
}
