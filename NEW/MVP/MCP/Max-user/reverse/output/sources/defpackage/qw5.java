package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class qw5 {
    public final Context a;
    public final x7b b;
    public final q7b c;
    public final lk4 d;
    public final int e = c5d.tt_notification_file_downloading_title;
    public final int f = c5d.tt_worker_draft_sync;
    public final int g = c5d.tt_worker_gif_upload;
    public final int h = c5d.tt_worker_attach_upload;

    public qw5(Context context, x7b x7bVar, q7b q7bVar, lk4 lk4Var) {
        this.a = context;
        this.b = x7bVar;
        this.c = q7bVar;
        this.d = lk4Var;
    }

    public final Notification a(CharSequence charSequence, String str, Long l, boolean z, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        x7b x7bVar = this.b;
        x7bVar.c();
        this.d.getClass();
        nla nlaVarH = x7bVar.h("ru.oneme.app.fileUpload", true, true);
        Notification notification = nlaVarH.F;
        nlaVarH.e = nla.c(charSequence);
        nlaVarH.f = nla.c(str);
        notification.when = l != null ? l.longValue() : 0L;
        this.c.getClass();
        notification.icon = z ? ivd.R0 : ivd.P0;
        if (i == -1) {
            nlaVarH.o = 100;
            nlaVarH.p = 0;
            nlaVarH.q = true;
        } else if (1 > i || i >= 101) {
            nlaVarH.o = 0;
            nlaVarH.p = 0;
            nlaVarH.q = false;
        } else {
            nlaVarH.o = 100;
            nlaVarH.p = i;
            nlaVarH.q = false;
        }
        nlaVarH.k = 0;
        nlaVarH.e(0);
        nlaVarH.h(null);
        nlaVarH.f(2, true);
        nlaVarH.f(16, false);
        nlaVarH.b.add(new zka(0, this.a.getString(c5d.tt_worker_cancel), pendingIntent2));
        nlaVarH.v = "progress";
        nlaVarH.g = pendingIntent;
        return nlaVarH.a();
    }

    public final Notification b(long j, Long l, Long l2, CharSequence charSequence, String str, int i, boolean z, PendingIntent pendingIntent) {
        Intent intentJ;
        int iHashCode = Long.hashCode(j);
        x7b x7bVar = this.b;
        if (j == 0) {
            intentJ = x7bVar.f(false);
        } else {
            long jLongValue = l != null ? l.longValue() : 0L;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            x7bVar.getClass();
            ul8 ul8Var = ul8.c;
            Long lValueOf = Long.valueOf(jLongValue);
            Long lValueOf2 = Long.valueOf(jLongValue2);
            ul8Var.getClass();
            intentJ = x7bVar.j(ul8.L0(j, lValueOf, lValueOf2));
        }
        return a(charSequence, str, l, z, i, v4j.b(this.a, iHashCode, intentJ), pendingIntent);
    }
}
