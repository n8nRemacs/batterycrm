package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class el0 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw az1.g(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw az1.g(message.obj);
    }
}
