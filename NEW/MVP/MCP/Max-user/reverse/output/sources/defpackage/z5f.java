package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* loaded from: classes.dex */
public final class z5f implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                ai3 ai3Var = (ai3) this.b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (ai3Var.a) {
                    throw null;
                }
            case 1:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    u45.o(i, "Received response to request: ", "MessengerIpcClient");
                }
                o4j o4jVar = (o4j) this.b;
                synchronized (o4jVar) {
                    try {
                        m6j m6jVar = (m6j) o4jVar.o.get(i);
                        if (m6jVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        o4jVar.o.remove(i);
                        o4jVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            m6jVar.b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (m6jVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    m6jVar.c(null);
                                    return true;
                                }
                                m6jVar.b(new zzt("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                m6jVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((p7j) this.b).a) {
                        try {
                            h3j h3jVar = (h3j) message.obj;
                            l4j l4jVar = (l4j) ((p7j) this.b).a.get(h3jVar);
                            if (l4jVar != null && l4jVar.a.isEmpty()) {
                                if (l4jVar.c) {
                                    l4jVar.Y.c.removeMessages(1, l4jVar.o);
                                    p7j p7jVar = l4jVar.Y;
                                    p7jVar.d.b(p7jVar.b, l4jVar);
                                    l4jVar.c = false;
                                    l4jVar.b = 2;
                                }
                                ((p7j) this.b).a.remove(h3jVar);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        return false;
                    }
                    synchronized (((p7j) this.b).a) {
                        try {
                            h3j h3jVar2 = (h3j) message.obj;
                            l4j l4jVar2 = (l4j) ((p7j) this.b).a.get(h3jVar2);
                            if (l4jVar2 != null && l4jVar2.b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h3jVar2)), new Exception());
                                ComponentName componentName = l4jVar2.X;
                                if (componentName == null) {
                                    h3jVar2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = h3jVar2.b;
                                    s5j.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                l4jVar2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
