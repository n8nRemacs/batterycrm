package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l4j implements ServiceConnection {
    public ComponentName X;
    public final /* synthetic */ p7j Y;
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final h3j o;

    public l4j(p7j p7jVar, h3j h3jVar) {
        this.Y = p7jVar;
        this.o = h3jVar;
    }

    public final void a(String str, Executor executor) throws Throwable {
        ms3 ms3Var;
        Context context;
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            p7j p7jVar = this.Y;
            ms3Var = p7jVar.d;
            context = p7jVar.b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zC = ms3Var.c(context, str, this.o.a(context), this, 4225, executor);
            this.c = zC;
            if (zC) {
                this.Y.c.sendMessageDelayed(this.Y.c.obtainMessage(1, this.o), this.Y.f);
            } else {
                this.b = 2;
                try {
                    p7j p7jVar2 = this.Y;
                    p7jVar2.d.b(p7jVar2.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.Y.a) {
            try {
                this.Y.c.removeMessages(1, this.o);
                this.d = iBinder;
                this.X = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.Y.a) {
            try {
                this.Y.c.removeMessages(1, this.o);
                this.d = null;
                this.X = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
