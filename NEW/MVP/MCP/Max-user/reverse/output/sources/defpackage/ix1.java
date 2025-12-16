package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.graphics.drawable.IconCompat;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;
import one.me.calls.impl.service.CallServiceImpl;

/* loaded from: classes.dex */
public final class ix1 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bwf e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j = ipi.b(3, new jl1(21));
    public final Object k = ipi.b(3, new jl1(22));

    public ix1(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var4;
        this.b = k18Var5;
        this.c = k18Var3;
        this.d = k18Var2;
        this.e = new bwf(new nz(k18Var2, 7));
        this.f = ipi.b(3, new nz(k18Var, 8));
        this.g = ipi.b(3, new nz(k18Var, 9));
        this.h = ipi.b(3, new nz(k18Var, 10));
        this.i = ipi.b(3, new nz(k18Var, 11));
    }

    public static final Object a(ix1 ix1Var, String str, dtf dtfVar) {
        return svi.i(((q2b) ((lzf) ix1Var.a.getValue())).b(), new ex1(str, null), dtfVar);
    }

    public static ltb g(CharSequence charSequence, String str, Bitmap bitmap) {
        IconCompat iconCompat;
        if (vmf.F(charSequence)) {
            charSequence = !vmf.F(str) ? str : "...";
        }
        if (bitmap != null) {
            iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
        } else {
            iconCompat = null;
        }
        ltb ltbVar = new ltb();
        ltbVar.a = charSequence;
        ltbVar.b = iconCompat;
        ltbVar.c = null;
        ltbVar.d = null;
        ltbVar.e = false;
        ltbVar.f = true;
        return ltbVar;
    }

    public static nla h(CallServiceImpl callServiceImpl, String str) {
        nla nlaVar = new nla(callServiceImpl, str);
        nlaVar.k = -1;
        if (Build.VERSION.SDK_INT >= 31) {
            nlaVar.D = 1;
        }
        return nlaVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, k18] */
    public final void b(nla nlaVar, CharSequence charSequence, Bitmap bitmap, boolean z, n41 n41Var) {
        PendingIntent broadcast;
        PendingIntent broadcast2;
        id1 id1VarI = i();
        Application applicationB = id1VarI.b();
        hd1 hd1Var = new hd1(id1VarI, n41Var, z);
        id1VarI.getClass();
        if (a0h.a >= 31) {
            Intent intent = new Intent(applicationB, (Class<?>) CallNotifierFixActivity.class);
            hd1Var.invoke(intent);
            broadcast = PendingIntent.getActivity(applicationB, 0, intent, 201326592);
        } else {
            Intent intent2 = new Intent(applicationB, (Class<?>) CallNotifierBroadcastReceiver.class);
            hd1Var.invoke(intent2);
            broadcast = PendingIntent.getBroadcast(applicationB, 0, intent2, 201326592);
        }
        PendingIntent pendingIntent = broadcast;
        if (pendingIntent == null) {
            return;
        }
        Application applicationB2 = i().b();
        if (a0h.a >= 31) {
            Intent intent3 = new Intent(applicationB2, (Class<?>) CallNotifierFixActivity.class);
            intent3.setAction("action-decline-call");
            broadcast2 = PendingIntent.getActivity(applicationB2, 0, intent3, 201326592);
        } else {
            Intent intent4 = new Intent(applicationB2, (Class<?>) CallNotifierBroadcastReceiver.class);
            intent4.setAction("action-decline-call");
            broadcast2 = PendingIntent.getBroadcast(applicationB2, 0, intent4, 201326592);
        }
        PendingIntent pendingIntent2 = broadcast2;
        if (pendingIntent2 == null) {
            return;
        }
        nlaVar.i(new sla(1, g(charSequence, z ? (String) this.h.getValue() : (String) this.g.getValue(), bitmap), null, pendingIntent2, pendingIntent));
    }

    public final boolean c() {
        boolean z;
        l16 l16Var;
        int iB = uma.b(j().b);
        boolean z2 = (iB == 0 || iB == 1 || (iB != 2 && iB != 3 && iB != 4)) ? false : true;
        boolean zA = vma.a(j().b);
        try {
            uma.a(j().b);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        StringBuilder sbP = ho7.p("Notification disabled: isDoNotDisturbModeEnabled=", z2, " areNotificationsEnabledCompat=", zA, " hasAccessToNotifications=");
        sbP.append(z);
        wqi.c("CallsNotification", sbP.toString(), new Object[0]);
        if (!zA || !z) {
            return false;
        }
        bna bnaVarJ = j();
        ((lk4) this.c.getValue()).getClass();
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannelI = wma.i(bnaVarJ.b, "ru.oneme.app.new.incomingCalls.");
        if (notificationChannelI != null) {
            String strI = uka.i(notificationChannelI);
            int iJ = uka.j(notificationChannelI);
            l16Var = new l16(10);
            Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            strI.getClass();
            l16Var.b = iJ;
            AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            uka.m(notificationChannelI);
            uka.g(notificationChannelI);
            uka.h(notificationChannelI);
            uka.b(notificationChannelI);
            uka.n(notificationChannelI);
            uka.f(notificationChannelI);
            uka.v(notificationChannelI);
            uka.k(notificationChannelI);
            uka.w(notificationChannelI);
            uka.o(notificationChannelI);
            if (i >= 30) {
                wka.b(notificationChannelI);
                wka.a(notificationChannelI);
            }
            uka.a(notificationChannelI);
            uka.l(notificationChannelI);
            if (i >= 29) {
                vka.a(notificationChannelI);
            }
            if (i >= 30) {
                wka.c(notificationChannelI);
            }
        } else {
            l16Var = null;
        }
        Integer numValueOf = l16Var != null ? Integer.valueOf(l16Var.b) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return true;
        }
        wqi.c("CallsNotification", "Notification disabled due to incomingImportance none", new Object[0]);
        return false;
    }

    public final void d() {
        wqi.c("CallsNotification", "cancel all call notifications", new Object[0]);
        e(239);
        e(240);
    }

    public final void e(int i) {
        wqi.c("CallsNotification", "cancel call notification with id=" + i, new Object[0]);
        j().b.cancel(null, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, k18] */
    public final nla f(CallServiceImpl callServiceImpl, CharSequence charSequence, n41 n41Var, boolean z) {
        PendingIntent broadcast;
        ((lk4) this.c.getValue()).getClass();
        nla nlaVarH = h(callServiceImpl, "ru.oneme.app.new.incomingCalls.");
        nlaVarH.F.icon = z ? ((Number) this.k.getValue()).intValue() : ((Number) this.j.getValue()).intValue();
        nlaVarH.e = nla.c(charSequence);
        nlaVarH.f = nla.c(z ? (String) this.h.getValue() : (String) this.g.getValue());
        nlaVarH.k = 2;
        nlaVarH.f(2, true);
        nlaVarH.f(16, true);
        i().getClass();
        if (a0h.a >= 31) {
            Intent intent = new Intent(callServiceImpl, (Class<?>) CallNotifierFixActivity.class);
            id1.a(intent, n41Var, z);
            broadcast = PendingIntent.getActivity(callServiceImpl, 0, intent, 201326592);
        } else {
            Intent intent2 = new Intent(callServiceImpl, (Class<?>) CallNotifierBroadcastReceiver.class);
            id1.a(intent2, n41Var, z);
            broadcast = PendingIntent.getBroadcast(callServiceImpl, 0, intent2, 201326592);
        }
        nlaVarH.h = broadcast;
        nlaVarH.f(128, true);
        nlaVarH.l = false;
        nlaVarH.v = "call";
        return nlaVarH;
    }

    public final id1 i() {
        return (id1) this.b.getValue();
    }

    public final bna j() {
        return (bna) this.e.getValue();
    }
}
