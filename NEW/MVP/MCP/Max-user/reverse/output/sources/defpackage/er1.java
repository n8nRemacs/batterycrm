package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;

/* loaded from: classes.dex */
public interface er1 extends ConversationEventsListener, ar1, MediaConnectionListener {
    @Override // defpackage.ar1
    default void b(String str) {
    }

    default void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
    }

    default void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}
