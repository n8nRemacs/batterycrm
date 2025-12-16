package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class vti implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4j b;

    public /* synthetic */ vti(o4j o4jVar, int i) {
        this.a = i;
        this.b = o4jVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.a) {
            case 0:
                break;
            case 1:
                o4j o4jVar = this.b;
                synchronized (o4jVar) {
                    if (o4jVar.a == 1) {
                        o4jVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            o4j o4jVar2 = this.b;
            synchronized (o4jVar2) {
                try {
                    if (o4jVar2.a != 2) {
                        return;
                    }
                    if (o4jVar2.d.isEmpty()) {
                        o4jVar2.c();
                        return;
                    }
                    m6j m6jVar = (m6j) o4jVar2.d.poll();
                    o4jVar2.o.put(m6jVar.a, m6jVar);
                    ((ScheduledExecutorService) o4jVar2.X.d).schedule(new c5e(o4jVar2, 15, m6jVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(m6jVar)));
                    }
                    uaj uajVar = o4jVar2.X;
                    Messenger messenger = o4jVar2.b;
                    int i = m6jVar.c;
                    Context context = (Context) uajVar.c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = m6jVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", m6jVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", m6jVar.d);
                    messageObtain.setData(bundle);
                    try {
                        ssb ssbVar = o4jVar2.c;
                        Messenger messenger2 = (Messenger) ssbVar.b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            mii miiVar = (mii) ssbVar.c;
                            if (miiVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = miiVar.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        o4jVar2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
