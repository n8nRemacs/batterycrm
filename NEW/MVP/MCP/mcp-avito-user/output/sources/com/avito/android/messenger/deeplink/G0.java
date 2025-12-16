package com.avito.android.messenger.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;

/* compiled from: PinChannelDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/G0;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PinChannelLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G0 extends AbstractC40161a<PinChannelLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f195332f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195333g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f195334h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f195335i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.d f195336j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195337k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public G0(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k a.i iVar, @Y61.k a.d dVar) {
        this.f195332f = interfaceC47842z;
        this.f195333g = interfaceC35745a5;
        this.f195334h = interfaceC35741a1;
        this.f195335i = iVar;
        this.f195336j = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> iPinChannel = this.f195332f.pinChannel(((PinChannelLink) deepLink).f133577b);
        InterfaceC35745a5 interfaceC35745a5 = this.f195333g;
        this.f195337k.b(iPinChannel.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new E0(this), new F0(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195337k.e();
    }
}
