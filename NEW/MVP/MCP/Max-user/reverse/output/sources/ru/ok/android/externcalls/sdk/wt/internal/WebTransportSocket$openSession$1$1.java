package ru.ok.android.externcalls.sdk.wt.internal;

import defpackage.hn6;
import defpackage.qqg;
import defpackage.r0i;
import defpackage.sm6;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class WebTransportSocket$openSession$1$1 extends hn6 implements sm6 {
    public WebTransportSocket$openSession$1$1(Object obj) {
        super(2, 0, WebTransportSocket.class, obj, "sendStreamData", "sendStreamData(Ltech/kwik/flupke/webtransport/WebTransportStream;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V");
    }

    @Override // defpackage.sm6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
        invoke((r0i) obj, (WebTransportSocket.Listener) obj2);
        return qqg.a;
    }

    public final void invoke(r0i r0iVar, WebTransportSocket.Listener listener) throws IOException {
        ((WebTransportSocket) this.receiver).sendStreamData(r0iVar, listener);
    }
}
