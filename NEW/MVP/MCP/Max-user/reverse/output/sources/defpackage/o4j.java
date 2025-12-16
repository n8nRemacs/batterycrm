package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o4j implements ServiceConnection {
    public final /* synthetic */ uaj X;
    public int a = 0;
    public final Messenger b;
    public ssb c;
    public final ArrayDeque d;
    public final SparseArray o;

    public o4j(uaj uajVar) {
        this.X = uajVar;
        y1a y1aVar = new y1a(Looper.getMainLooper(), new z5f(1, this), 5);
        Looper.getMainLooper();
        this.b = new Messenger(y1aVar);
        this.d = new ArrayDeque();
        this.o = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            ms3.a().b((Context) this.X.c, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((m6j) it.next()).b(zztVar);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                ((m6j) this.o.valueAt(i2)).b(zztVar);
            }
            this.o.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.o.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                ms3.a().b((Context) this.X.c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(m6j m6jVar) throws Throwable {
        Throwable th;
        int i;
        ms3 ms3VarA;
        Context context;
        try {
            try {
                i = this.a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i != 0) {
                    if (i == 1) {
                        this.d.add(m6jVar);
                        return true;
                    }
                    if (i != 2) {
                        return false;
                    }
                    this.d.add(m6jVar);
                    ((ScheduledExecutorService) this.X.d).execute(new vti(this, 0));
                    return true;
                }
                this.d.add(m6jVar);
                if (this.a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    ms3VarA = ms3.a();
                    context = (Context) this.X.c;
                } catch (SecurityException e) {
                    e = e;
                }
                try {
                    if (ms3VarA.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.X.d).schedule(new vti(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.X.d).execute(new owf(this, iBinder, false, 9));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.X.d).execute(new vti(this, 2));
    }
}
