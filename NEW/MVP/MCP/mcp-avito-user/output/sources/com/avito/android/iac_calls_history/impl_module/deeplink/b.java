package com.avito.android.iac_calls_history.impl_module.deeplink;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CallsHistoryLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/deeplink/b;", "Lev/a;", "Lcom/avito/android/iac_calls_history/impl_module/deeplink/CallsHistoryLink;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40161a<CallsHistoryLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f164701f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f164702g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f164703h;

    @Inject
    public b(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f164701f = context;
        this.f164702g = interfaceC4053a;
        this.f164703h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthSource authSource = AuthSource.f92682Q;
        a aVar = new a(this);
        this.f164703h.a((CallsHistoryLink) deepLink, this, authSource, aVar);
    }
}
