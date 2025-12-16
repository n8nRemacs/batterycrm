package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;

/* loaded from: classes.dex */
public final class a81 implements er1 {
    public final /* synthetic */ sac a;

    public a81(sac sacVar) {
        this.a = sacVar;
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            return;
        }
        ((pac) this.a).g(g71.c);
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        ((pac) this.a).g(h71.c);
    }
}
