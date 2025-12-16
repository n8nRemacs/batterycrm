package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uvf implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object o;

    public /* synthetic */ uvf(fcj fcjVar, ani aniVar, long j, nud nudVar) {
        this.a = 1;
        v6j v6jVar = v6j.UNKNOWN_EVENT;
        this.c = fcjVar;
        this.d = aniVar;
        this.b = j;
        this.o = nudVar;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                gge ggeVarD = gge.d();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (ggeVarD.f(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.h.h()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!gge.d().f(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!gge.d().e(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.i(this.b);
                            }
                            if (!gge.d().f(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            eo eoVar = new eo();
                            eoVar.b = this;
                            eoVar.a();
                            if (!gge.d().f(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!gge.d().f(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (gge.d().f(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                fcj fcjVar = (fcj) this.c;
                v6j v6jVar = v6j.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                ani aniVar = (ani) this.d;
                long j = this.b;
                nud nudVar = (nud) this.o;
                HashMap map = fcjVar.j;
                if (!map.containsKey(v6jVar)) {
                    map.put(v6jVar, new hgi());
                }
                hgi hgiVar = (hgi) map.get(v6jVar);
                Long lValueOf = Long.valueOf(j);
                wi3 wi3Var = hgiVar.c;
                Collection collection = (Collection) wi3Var.get(aniVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    wi3Var.put(aniVar, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (fcjVar.d(v6jVar, jElapsedRealtime)) {
                    fcjVar.i.put(v6jVar, Long.valueOf(jElapsedRealtime));
                    spi.a.execute(new owf(fcjVar, nudVar));
                    return;
                }
                return;
        }
    }

    public uvf(FirebaseMessaging firebaseMessaging, long j) {
        this.a = 0;
        this.o = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pc4("firebase-iid-executor", 2));
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
