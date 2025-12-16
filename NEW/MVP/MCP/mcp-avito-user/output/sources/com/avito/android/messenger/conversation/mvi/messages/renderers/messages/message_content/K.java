package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.messenger.deeplink.ChannelIacCallLink;
import com.avito.android.remote.model.messenger.message.LocalMessage;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class K implements com.avito.android.deep_linking.links.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f193255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T1.d f193256d;

    public /* synthetic */ K(Y41.l lVar, T1.d dVar, int i12) {
        this.f193254b = i12;
        this.f193255c = lVar;
        this.f193256d = dVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        Y41.l lVar = this.f193255c;
        T1.d dVar = this.f193256d;
        switch (this.f193254b) {
            case 0:
                P p12 = P.f193271a;
                boolean z12 = deepLink instanceof MessengerReallContactMethodLink;
                LocalMessage localMessage = dVar.f189180o;
                if (!z12) {
                    if (!(deepLink instanceof ChannelIacCallLink)) {
                        lVar.invoke(new h0.e(deepLink, localMessage));
                        break;
                    } else {
                        lVar.invoke(new h0.r((ChannelIacCallLink) deepLink));
                        break;
                    }
                } else {
                    lVar.invoke(new h0.g((MessengerReallContactMethodLink) deepLink, localMessage));
                    break;
                }
            default:
                T t12 = T.f193282a;
                lVar.invoke(new h0.e(deepLink, dVar.f189180o));
                break;
        }
    }
}
