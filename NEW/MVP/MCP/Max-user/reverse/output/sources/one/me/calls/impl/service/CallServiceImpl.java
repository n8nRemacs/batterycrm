package one.me.calls.impl.service;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.a0h;
import defpackage.ap1;
import defpackage.b71;
import defpackage.bd5;
import defpackage.bp1;
import defpackage.bwf;
import defpackage.c51;
import defpackage.co5;
import defpackage.dge;
import defpackage.ege;
import defpackage.fge;
import defpackage.fni;
import defpackage.fx1;
import defpackage.g1e;
import defpackage.gke;
import defpackage.gx1;
import defpackage.gxi;
import defpackage.hw1;
import defpackage.hx1;
import defpackage.ix1;
import defpackage.jl1;
import defpackage.k18;
import defpackage.l30;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.lk4;
import defpackage.mb4;
import defpackage.n41;
import defpackage.nla;
import defpackage.qsb;
import defpackage.s41;
import defpackage.s65;
import defpackage.sla;
import defpackage.svi;
import defpackage.tih;
import defpackage.tv1;
import defpackage.v9j;
import defpackage.vn5;
import defpackage.wn5;
import defpackage.wqi;
import defpackage.x65;
import defpackage.xn5;
import defpackage.y65;
import defpackage.yo1;
import defpackage.zg5;
import defpackage.zo1;
import java.util.Set;
import kotlin.Metadata;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/calls/impl/service/CallServiceImpl;", "Landroid/app/Service;", "<init>", "()V", "yo1", "zo1", "calls-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallServiceImpl extends Service {
    public static Handler v0;
    public final k18 X;
    public final k18 Y;
    public MediaSession Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public PowerManager.WakeLock s0;
    public final bwf t0;
    public static final zo1 u0 = new zo1();
    public static final Set w0 = gke.h(Integer.valueOf(fge.f), Integer.valueOf(fge.b), Integer.valueOf(fge.c), Integer.valueOf(fge.e), Integer.valueOf(fge.d));

    public CallServiceImpl() {
        b71 b71Var = b71.a;
        this.a = b71Var.getAccessor().d(23);
        this.b = b71Var.getAccessor().d(15);
        this.c = b71Var.getAccessor().d(22);
        this.d = b71Var.getAccessor().d(28);
        this.o = b71Var.getAccessor().d(10);
        this.X = b71Var.getAccessor().d(29);
        this.Y = b71Var.getAccessor().d(75);
        this.t0 = new bwf(new jl1(8));
    }

    public final void a(int i, Notification notification, boolean z) {
        ix1 ix1VarD = d();
        ix1VarD.getClass();
        wqi.c("CallsNotification", "cancel all call notifications, except id=" + i, new Object[0]);
        if (i == 239) {
            ix1VarD.e(240);
        } else if (i == 240) {
            ix1VarD.e(239);
        }
        if (Build.VERSION.SDK_INT < 29 || !z) {
            return;
        }
        int foregroundServiceType = getForegroundServiceType();
        int i2 = fge.a;
        if (foregroundServiceType == 0) {
            wqi.c("CallServiceTag", "CallService start with none flag, show push around service.", new Object[0]);
            ix1 ix1VarD2 = d();
            ix1VarD2.getClass();
            wqi.c("CallsNotification", "showNotification id=" + i + " notification", new Object[0]);
            ix1VarD2.j().a(null, i, notification);
        }
    }

    public final int b(boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT < 34) {
            wqi.c("CallServiceTag", "Low API version, start with simple flag.", new Object[0]);
            return fge.f;
        }
        int i = fge.b;
        if (!z2 && !((tih) this.Y.getValue()).d()) {
            wqi.c("CallServiceTag", "App in background, start with simple flag.", new Object[0]);
            return i;
        }
        k18 k18Var = this.o;
        if (((qsb) k18Var.getValue()).c(qsb.h)) {
            i |= fge.e;
        }
        if (((qsb) k18Var.getValue()).c(qsb.m)) {
            i |= fge.d;
        }
        return (((g1e) this.d.getValue()).c() || z) ? fge.c | i : i;
    }

    public final tv1 c() {
        return (tv1) this.b.getValue();
    }

    public final ix1 d() {
        return (ix1) this.a.getValue();
    }

    public final void e(int i, Notification notification, boolean z, boolean z2, boolean z3) {
        l6b l6bVar;
        try {
            int iB = b(z2, z3);
            wqi.c("CallServiceTag", "CallService start foreground with particular types: " + zo1.a(iB), new Object[0]);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                ege.a(this, i, notification, iB);
            } else if (i2 >= 29) {
                dge.a(this, i, notification, iB);
            } else {
                startForeground(i, notification);
            }
            if (i2 >= 29 && (l6bVar = wqi.a) != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "CallServiceTag", "CallService crosscheck types: " + zo1.a(getForegroundServiceType()), null);
                }
            }
            a(i, notification, z);
        } catch (Throwable th) {
            wqi.e("CallServiceTag", "CallService can't start foreground service due to " + th.getMessage() + ". Try to start with simple permissions.", th);
            try {
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i3 < 34 ? fge.f : fge.b;
                if (i3 >= 34) {
                    ege.a(this, i, notification, i4);
                } else if (i3 >= 29) {
                    dge.a(this, i, notification, i4);
                } else {
                    startForeground(i, notification);
                }
                if (i3 >= 29) {
                    wqi.c("CallServiceTag", "CallService started with types: " + zo1.a(getForegroundServiceType()), new Object[0]);
                }
                a(i, notification, z);
            } catch (Exception unused) {
                wqi.e("CallServiceTag", "CallService can't start foreground service. Try show usual notification isIncoming=" + z + ".", th);
                a(i, notification, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k18] */
    public final void f(mb4 mb4Var, n41 n41Var, boolean z, boolean z2) {
        ?? r12;
        PendingIntent broadcast;
        PendingIntent broadcast2;
        PendingIntent broadcast3;
        bd5 bd5Var = bd5.a;
        if (fni.a(n41Var, n41.h)) {
            wqi.c("CallServiceTag", "CallService show default push due to chat info is empty.", new Object[0]);
            ix1 ix1VarD = d();
            gxi gxiVar = mb4Var.a;
            boolean zA = gxiVar != null ? gxiVar.a() : false;
            boolean z3 = mb4Var.h;
            ix1VarD.getClass();
            wqi.c("CallsNotification", "createTempNotification", new Object[0]);
            CharSequence charSequence = n41Var.c;
            if (charSequence == null) {
                charSequence = (String) ix1VarD.f.getValue();
            }
            String str = !z3 ? (String) ix1VarD.i.getValue() : zA ? (String) ix1VarD.h.getValue() : (String) ix1VarD.g.getValue();
            int iIntValue = zA ? ((Number) ix1VarD.k.getValue()).intValue() : ((Number) ix1VarD.j.getValue()).intValue();
            ((lk4) ix1VarD.c.getValue()).getClass();
            nla nlaVarH = ix1.h(this, "ru.oneme.app.new.incomingCalls.");
            nlaVarH.F.icon = iIntValue;
            nlaVarH.e = nla.c(charSequence);
            nlaVarH.f = nla.c(str);
            e(239, nlaVarH.a(), true, z, z2);
            return;
        }
        if (mb4Var.h && !mb4Var.g) {
            wqi.c("CallServiceTag", "CallService show incoming notification.", new Object[0]);
            ix1 ix1VarD2 = d();
            gxi gxiVar2 = mb4Var.a;
            boolean zA2 = gxiVar2 != null ? gxiVar2.a() : false;
            ix1VarD2.getClass();
            wqi.c("CallsNotification", "showIncomingCallNotification", new Object[0]);
            CharSequence charSequence2 = n41Var.c;
            if (charSequence2 == null) {
                charSequence2 = (String) ix1VarD2.f.getValue();
            }
            Bitmap bitmap = (Bitmap) svi.g(bd5Var, new hx1(ix1VarD2, n41Var, null));
            CharSequence charSequence3 = charSequence2;
            nla nlaVarF = ix1VarD2.f(this, charSequence3, n41Var, zA2);
            ix1VarD2.b(nlaVarF, charSequence3, bitmap, zA2, n41Var);
            e(240, nlaVarF.a(), true, z, z2);
            return;
        }
        Long l = (Long) ((x65) this.t0.getValue()).f.getValue();
        long jLongValue = l != null ? l.longValue() : 0L;
        int i = s65.d;
        long jK = s65.k(v9j.i(System.currentTimeMillis(), y65.MILLISECONDS), v9j.i(jLongValue, y65.SECONDS));
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallServiceTag", "CallService show active notification, startedAt=".concat(s65.n(jK)), null);
            }
        }
        ix1 ix1VarD3 = d();
        CharSequence charSequence4 = n41Var.c;
        String string = charSequence4 != null ? charSequence4.toString() : null;
        String str2 = n41Var.d;
        long jG = s65.g(jK);
        ix1VarD3.getClass();
        wqi.c("CallsNotification", "showActiveCallNotification", new Object[0]);
        if (string == null) {
            string = (String) ix1VarD3.f.getValue();
        }
        Bitmap bitmap2 = (Bitmap) svi.g(bd5Var, new fx1(ix1VarD3, str2, null));
        ((lk4) ix1VarD3.c.getValue()).getClass();
        nla nlaVarH2 = ix1.h(this, "ru.oneme.app.new.activeCalls");
        int iIntValue2 = ((Number) ix1VarD3.j.getValue()).intValue();
        Notification notification = nlaVarH2.F;
        notification.icon = iIntValue2;
        nlaVarH2.f = nla.c((String) ix1VarD3.i.getValue());
        nlaVarH2.e = nla.c(string);
        Application applicationB = ix1VarD3.i().b();
        int i2 = a0h.a;
        if (i2 >= 31) {
            Intent intent = new Intent(applicationB, (Class<?>) CallNotifierFixActivity.class);
            intent.setAction("action-open-call");
            intent.setFlags(268435456);
            r12 = 0;
            broadcast = PendingIntent.getActivity(applicationB, 0, intent, 201326592);
        } else {
            r12 = 0;
            Intent intent2 = new Intent(applicationB, (Class<?>) CallNotifierBroadcastReceiver.class);
            intent2.setAction("action-open-call");
            intent2.setFlags(268435456);
            broadcast = PendingIntent.getBroadcast(applicationB, 0, intent2, 201326592);
        }
        nlaVarH2.g = broadcast;
        nlaVarH2.f(2, true);
        nlaVarH2.l = r12;
        notification.when = jG;
        Application applicationB2 = ix1VarD3.i().b();
        if (i2 >= 31) {
            Intent intent3 = new Intent(applicationB2, (Class<?>) CallNotifierFixActivity.class);
            intent3.setAction("action-open-call");
            intent3.setFlags(268435456);
            broadcast2 = PendingIntent.getActivity(applicationB2, r12, intent3, 201326592);
        } else {
            Intent intent4 = new Intent(applicationB2, (Class<?>) CallNotifierBroadcastReceiver.class);
            intent4.setAction("action-open-call");
            intent4.setFlags(268435456);
            broadcast2 = PendingIntent.getBroadcast(applicationB2, r12, intent4, 201326592);
        }
        nlaVarH2.h = broadcast2;
        nlaVarH2.f(128, r12);
        Application applicationB3 = ix1VarD3.i().b();
        if (a0h.a >= 31) {
            Intent intent5 = new Intent(applicationB3, (Class<?>) CallNotifierFixActivity.class);
            intent5.setAction("action-finished-call");
            broadcast3 = PendingIntent.getActivity(applicationB3, r12, intent5, 201326592);
        } else {
            Intent intent6 = new Intent(applicationB3, (Class<?>) CallNotifierBroadcastReceiver.class);
            intent6.setAction("action-finished-call");
            broadcast3 = PendingIntent.getBroadcast(applicationB3, r12, intent6, 201326592);
        }
        PendingIntent pendingIntent = broadcast3;
        if (pendingIntent != null) {
            nlaVarH2.i(new sla(2, ix1.g(string, (String) ix1VarD3.i.getValue(), bitmap2), pendingIntent, null, null));
        }
        e(239, nlaVarH2.a(), false, z, z2);
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        wqi.c("CallServiceTag", "CallService onCreate", new Object[0]);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "max:calls_prx");
        wakeLockNewWakeLock.acquire();
        this.s0 = wakeLockNewWakeLock;
        f((mb4) ((hw1) c()).b1.getValue(), (n41) ((c51) ((s41) this.c.getValue())).j.getValue(), false, false);
        if (((hw1) c()).t()) {
            return;
        }
        wqi.c("CallServiceTag", "CallService don't have active call. Stop service.", new Object[0]);
        zo1.c().postDelayed(new l30(this, -1, 3), 500L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        wqi.c("CallServiceTag", "service call onDestroy", new Object[0]);
        d().d();
        PowerManager.WakeLock wakeLock = this.s0;
        if (wakeLock != null && wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.s0;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            wqi.c("CallServiceTag", "cpu wake lock stop", new Object[0]);
        }
        this.s0 = null;
        MediaSession mediaSession = this.Z;
        if (mediaSession != null) {
            mediaSession.release();
            wqi.c("CallServiceTag", "media session stop", new Object[0]);
        }
        this.Z = null;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, k18] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        wqi.c("CallServiceTag", "CallService onStartCommand", new Object[0]);
        mb4 mb4Var = (mb4) ((hw1) c()).b1.getValue();
        n41 n41Var = (n41) ((c51) ((s41) this.c.getValue())).j.getValue();
        if (!mb4Var.h || ((hw1) c()).u()) {
            MediaSession mediaSession = this.Z;
            if (mediaSession != null) {
                mediaSession.release();
                wqi.c("CallServiceTag", "media session stop", new Object[0]);
            }
            this.Z = null;
        } else if (this.Z == null) {
            bp1 bp1Var = new bp1(this);
            MediaSession mediaSession2 = new MediaSession(this, "CallServiceTag");
            mediaSession2.setFlags(3);
            mediaSession2.setPlaybackState(new PlaybackState.Builder().setState(3, 0L, 0.0f).build());
            mediaSession2.setPlaybackToRemote(bp1Var);
            mediaSession2.setCallback(new ap1());
            mediaSession2.setActive(true);
            this.Z = mediaSession2;
            wqi.c("CallServiceTag", "media session started", new Object[0]);
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra("ACTION", 0);
            zg5 zg5Var = yo1.Y;
            if (zg5Var.get(intExtra) != yo1.b) {
                if (zg5Var.get(intent.getIntExtra("ACTION", 0)) == yo1.a) {
                    wqi.c("CallServiceTag", "CallService start.", new Object[0]);
                    return 2;
                }
                co5 co5Var = mb4Var.l;
                if ((co5Var instanceof wn5) || (co5Var instanceof vn5) || (co5Var instanceof xn5)) {
                    wqi.c("CallServiceTag", "CallService finished due to call is failed or finished.", new Object[0]);
                    zo1.c().postDelayed(new l30(this, i2, 3), 500L);
                    return 2;
                }
                if (zg5Var.get(intent.getIntExtra("ACTION", 0)) == yo1.c) {
                    wqi.c("CallServiceTag", "CallService restart.", new Object[0]);
                    f(mb4Var, n41Var, false, ((mb4) ((hw1) c()).b1.getValue()).g);
                    return 2;
                }
                if (zg5Var.get(intent.getIntExtra("ACTION", 0)) == yo1.d) {
                    wqi.c("CallServiceTag", "CallService restart for screen sharing.", new Object[0]);
                    f(mb4Var, n41Var, true, true);
                    return 2;
                }
                if (zg5Var.get(intent.getIntExtra("ACTION", 0)) != yo1.o) {
                    wqi.c("CallServiceTag", "CallService simple start, no action.", new Object[0]);
                    return 2;
                }
                wqi.c("CallServiceTag", "CallService hide incoming notification.", new Object[0]);
                if (mb4Var.h && !mb4Var.g) {
                    wqi.c("CallServiceTag", "CallService show hidden incoming notification.", new Object[0]);
                    ix1 ix1VarD = d();
                    gxi gxiVar = mb4Var.a;
                    boolean zA = gxiVar != null ? gxiVar.a() : false;
                    ix1VarD.getClass();
                    wqi.c("CallsNotification", "showHiddenIncomingCallNotification", new Object[0]);
                    CharSequence charSequence = n41Var.c;
                    if (charSequence == null) {
                        charSequence = (String) ix1VarD.f.getValue();
                    }
                    CharSequence charSequence2 = charSequence;
                    Bitmap bitmap = (Bitmap) svi.g(bd5.a, new gx1(ix1VarD, n41Var, null));
                    nla nlaVarF = ix1VarD.f(this, charSequence2, n41Var, zA);
                    ix1VarD.b(nlaVarF, charSequence2, bitmap, zA, n41Var);
                    nlaVarF.f(2, false);
                    nlaVarF.G = true;
                    e(240, nlaVarF.a(), true, false, false);
                }
                return 2;
            }
        }
        wqi.c("CallServiceTag", "CallService finished.", new Object[0]);
        zo1.c().postDelayed(new l30(this, -1, 3), 500L);
        return 2;
    }
}
