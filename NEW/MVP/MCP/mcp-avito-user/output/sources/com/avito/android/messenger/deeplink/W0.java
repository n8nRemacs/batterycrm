package com.avito.android.messenger.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UnpinChannelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;

/* compiled from: UnpinChannelDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/W0;", "Lev/a;", "Lcom/avito/android/deep_linking/links/UnpinChannelLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class W0 extends AbstractC40161a<UnpinChannelLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f195437f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195438g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f195439h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f195440i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195441j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public W0(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k a.i iVar) {
        this.f195437f = interfaceC47842z;
        this.f195438g = interfaceC35745a5;
        this.f195439h = interfaceC35741a1;
        this.f195440i = iVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> iUnpinChannel = this.f195437f.unpinChannel(((UnpinChannelLink) deepLink).f133768b);
        InterfaceC35745a5 interfaceC35745a5 = this.f195438g;
        this.f195441j.b(iUnpinChannel.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new U0(this), new V0(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195441j.e();
    }
}
