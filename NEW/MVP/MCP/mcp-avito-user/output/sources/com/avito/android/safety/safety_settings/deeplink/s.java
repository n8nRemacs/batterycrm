package com.avito.android.safety.safety_settings.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.SessionDeleteLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionDeleteAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/deeplink/s;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/SessionDeleteLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends AbstractC40161a<SessionDeleteLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.sessions.a f257591f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f257592g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f257593h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f257594i = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public s(@Y61.k com.avito.android.safety.sessions.a aVar, @Y61.k a.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f257591f = aVar;
        this.f257592g = gVar;
        this.f257593h = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SessionDeleteLink sessionDeleteLink = (SessionDeleteLink) deepLink;
        this.f257592g.g(d(), true);
        this.f257594i.b(this.f257591f.a(sessionDeleteLink.f133960c, sessionDeleteLink.f133959b, sessionDeleteLink.f133961d).j0(this.f257593h.e()).t0(new r(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f257594i.e();
    }
}
