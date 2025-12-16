package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m4i implements ServiceConnection {
    public boolean X;
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public k4i o;

    public m4i(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new pc4("Firebase-FirebaseInstanceIdServiceConnection", 2));
        this.d = new ArrayDeque();
        this.X = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                k4i k4iVar = this.o;
                if (k4iVar == null || !k4iVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.o.a((l4i) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ybj b(Intent intent) {
        l4i l4iVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            l4iVar = new l4i(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            l4iVar.b.a.b(scheduledThreadPoolExecutor, new ehg(21, scheduledThreadPoolExecutor.schedule(new m1h(8, l4iVar), 20L, TimeUnit.SECONDS)));
            this.d.add(l4iVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return l4iVar.b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[LOOP:0: B:22:0x0053->B:24:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r10 = this;
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "binder is dead. start connection? "
            r0.<init>(r3)
            boolean r3 = r10.X
            r3 = r3 ^ r2
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1e:
            boolean r0 = r10.X
            if (r0 == 0) goto L24
            r7 = r10
            goto L68
        L24:
            r10.X = r2
            ms3 r3 = defpackage.ms3.a()     // Catch: java.lang.SecurityException -> L49
            android.content.Context r4 = r10.a     // Catch: java.lang.SecurityException -> L49
            android.content.Intent r6 = r10.b     // Catch: java.lang.SecurityException -> L49
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.SecurityException -> L49
            java.lang.String r5 = r0.getName()     // Catch: java.lang.SecurityException -> L49
            r9 = 0
            r8 = 65
            r7 = r10
            boolean r0 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L41
            goto L68
        L41:
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r1, r0)     // Catch: java.lang.SecurityException -> L47
            goto L50
        L47:
            r0 = move-exception
            goto L4b
        L49:
            r0 = move-exception
            r7 = r10
        L4b:
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)
        L50:
            r0 = 0
            r7.X = r0
        L53:
            java.util.ArrayDeque r0 = r7.d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L68
            java.lang.Object r0 = r0.poll()
            l4i r0 = (defpackage.l4i) r0
            n2g r0 = r0.b
            r1 = 0
            r0.d(r1)
            goto L53
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4i.c():void");
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.X = false;
            if (iBinder instanceof k4i) {
                this.o = (k4i) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((l4i) arrayDeque.poll()).b.d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
