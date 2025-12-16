package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.IBinder;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t25 extends Service {
    public static final HashMap X = new HashMap();
    public s25 a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean o;

    public static void a(t25 t25Var, List list) {
        t25Var.getClass();
    }

    public final void b() {
        s25 s25Var = this.a;
        s25Var.getClass();
        if (s25Var.b.k) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 || !this.d) {
            this.o |= stopSelfResult(this.b);
        } else {
            stopSelf();
            this.o = true;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        Class<?> cls = getClass();
        HashMap map = X;
        s25 s25Var = (s25) map.get(cls);
        if (s25Var == null) {
            j25 j25Var = (j25) kx8.a.getAccessor().c(52);
            j25Var.c(false);
            s25 s25Var2 = new s25(getApplicationContext(), j25Var, false, cls);
            map.put(cls, s25Var2);
            s25Var = s25Var2;
        }
        this.a = s25Var;
        hsi.g(s25Var.e == null);
        s25Var.e = this;
        if (s25Var.b.h) {
            zxg.o(null).postAtFrontOfQueue(new kr4(s25Var, 7, this));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        s25 s25Var = this.a;
        s25Var.getClass();
        hsi.g(s25Var.e == this);
        s25Var.e = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        j25 j25Var;
        g25 g25Var;
        this.b = i2;
        this.d = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.c |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        s25 s25Var = this.a;
        s25Var.getClass();
        j25Var = s25Var.b;
        g25Var = j25Var.c;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    a8i.g("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    j25Var.f++;
                    g25Var.obtainMessage(4, intExtra, 0, stringExtra).sendToTarget();
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    j25Var.f++;
                    g25Var.obtainMessage(8, stringExtra).sendToTarget();
                    break;
                } else {
                    a8i.g("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                j25Var.c(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                j25Var.f++;
                g25Var.obtainMessage(9).sendToTarget();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                r25 r25Var = (r25) intent.getParcelableExtra("download_request");
                if (r25Var != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    j25Var.f++;
                    g25Var.obtainMessage(7, intExtra2, 0, r25Var).sendToTarget();
                    break;
                } else {
                    a8i.g("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                nnd nndVar = (nnd) intent.getParcelableExtra("requirements");
                if (nndVar != null) {
                    if (!nndVar.equals((nnd) j25Var.m.d)) {
                        za0 za0Var = j25Var.m;
                        Context context = (Context) za0Var.b;
                        eo eoVar = (eo) za0Var.f;
                        eoVar.getClass();
                        context.unregisterReceiver(eoVar);
                        za0Var.f = null;
                        if (((pnd) za0Var.g) != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            pnd pndVar = (pnd) za0Var.g;
                            pndVar.getClass();
                            connectivityManager.unregisterNetworkCallback(pndVar);
                            za0Var.g = null;
                        }
                        za0 za0Var2 = new za0(j25Var.a, j25Var.d, nndVar);
                        j25Var.m = za0Var2;
                        j25Var.b(j25Var.m, za0Var2.d());
                        break;
                    }
                } else {
                    a8i.g("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                j25Var.c(true);
                break;
            default:
                a8i.g("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        this.o = false;
        if (j25Var.g == 0 && j25Var.f == 0) {
            b();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.d = true;
    }
}
