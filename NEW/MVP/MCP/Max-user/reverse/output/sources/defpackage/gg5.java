package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class gg5 extends Service {
    public final ExecutorService a;
    public k4i b;
    public final Object c;
    public int d;
    public int o;

    public gg5() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pc4("Firebase-Messaging-Intent-Handle", 2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.o = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            vjh.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.o - 1;
                this.o = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.b == null) {
                this.b = new k4i(new usd(17, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.o++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) gge.d().o).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        n2g n2gVar = new n2g();
        this.a.execute(new se5(this, intent2, n2gVar, 4));
        ybj ybjVar = n2gVar.a;
        if (ybjVar.g()) {
            a(intent);
            return 2;
        }
        ybjVar.b(new es(2), new dq4(this, 3, intent));
        return 3;
    }
}
