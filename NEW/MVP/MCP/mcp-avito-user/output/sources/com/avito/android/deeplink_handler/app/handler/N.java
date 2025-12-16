package com.avito.android.deeplink_handler.app.handler;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.StoreDeeplink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StoreDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/N;", "Lev/a;", "Lcom/avito/android/deep_linking/links/StoreDeeplink;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class N extends AbstractC40161a<StoreDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f134392f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f134393g;

    @Inject
    public N(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        this.f134392f = interfaceC4053a;
        this.f134393g = interfaceC35845m2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f134392f.R(this.f134393g.b(((StoreDeeplink) deepLink).f133685b), com.avito.android.deeplink_handler.view.b.f134588l);
        j(StoreDeeplink.b.C4016b.f133686b);
    }
}
