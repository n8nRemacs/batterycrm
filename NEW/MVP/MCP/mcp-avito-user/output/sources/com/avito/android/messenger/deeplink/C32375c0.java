package com.avito.android.messenger.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarkChannelUnreadDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/c0;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MarkChannelUnreadLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32375c0 extends AbstractC40161a<MarkChannelUnreadLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.F0 f195498f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.sync.E0 f195499g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195500h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195501i = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C32375c0(@Y61.k ru.avito.messenger.F0 f02, @Y61.k com.avito.android.messenger.channels.mvi.sync.E0 e02, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f195498f = f02;
        this.f195499g = e02;
        this.f195500h = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f195501i.b(ru.avito.messenger.G0.a(this.f195498f).n(new Z(this, (MarkChannelUnreadLink) deepLink)).s(this.f195500h.e()).x(new C32371a0(this), new C32373b0(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195501i.e();
    }
}
