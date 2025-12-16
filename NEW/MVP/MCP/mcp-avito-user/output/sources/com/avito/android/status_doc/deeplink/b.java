package com.avito.android.status_doc.deeplink;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.GigStatusDocDeeplink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import zx0.InterfaceC50641a;

/* compiled from: GigStatusDocDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/status_doc/deeplink/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/GigStatusDocDeeplink;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<GigStatusDocDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC50641a f284841f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f284842g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f284843h;

    @Inject
    public b(@k InterfaceC50641a interfaceC50641a, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a) {
        this.f284841f = interfaceC50641a;
        this.f284842g = interfaceC4053a;
        this.f284843h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthSource authSource = AuthSource.f92735y;
        a aVar = new a(this);
        this.f284843h.a((GigStatusDocDeeplink) deepLink, this, authSource, aVar);
    }
}
