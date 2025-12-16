package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class gcb implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        Handler handler = icb.a;
        hcb hcbVar = (hcb) message.obj;
        AtomicBoolean atomicBoolean = icb.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (fni.a(icb.b, hcbVar) || fni.a(icb.c, hcbVar)) {
                icb.a(hcbVar, ecb.a);
            }
            atomicBoolean.set(false);
        }
        return true;
    }
}
