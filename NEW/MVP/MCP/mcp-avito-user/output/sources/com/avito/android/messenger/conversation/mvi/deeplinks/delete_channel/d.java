package com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeleteChannelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.F0;
import ru.avito.messenger.G0;

/* compiled from: DeleteChannelDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/delete_channel/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC40161a<DeleteChannelLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final F0 f190522f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ChannelSyncAgent f190523g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f190524h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f190525i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f190526j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f190527k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public d(@k F0 f02, @k ChannelSyncAgent channelSyncAgent, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC35741a1 interfaceC35741a1, @k a.i iVar) {
        this.f190522f = f02;
        this.f190523g = channelSyncAgent;
        this.f190524h = interfaceC35745a5;
        this.f190525i = interfaceC35741a1;
        this.f190526j = iVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f190527k.b(G0.a(this.f190522f).n(new a(this, (DeleteChannelLink) deepLink)).s(this.f190524h.e()).x(new b(this), new c(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f190527k.e();
    }
}
