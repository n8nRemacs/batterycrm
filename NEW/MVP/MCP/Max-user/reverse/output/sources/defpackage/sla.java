package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class sla extends bma {
    public final int e;
    public final ltb f;
    public final PendingIntent g;
    public final PendingIntent h;
    public final PendingIntent i;

    public sla(int i, ltb ltbVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (TextUtils.isEmpty(ltbVar.a)) {
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
        this.e = i;
        this.f = ltbVar;
        this.g = pendingIntent3;
        this.h = pendingIntent2;
        this.i = pendingIntent;
    }

    @Override // defpackage.bma
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", false);
        ltb ltbVar = this.f;
        if (ltbVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", qla.b(ktb.b(ltbVar)));
            } else {
                bundle.putParcelable("android.callPersonCompat", ltbVar.b());
            }
        }
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
    }

    @Override // defpackage.bma
    public final void b(ggg gggVar) throws Resources.NotFoundException {
        Notification.CallStyle callStyleA;
        Notification.Builder builder = (Notification.Builder) gggVar.o;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.e;
        String string = null;
        ltb ltbVar = this.f;
        if (i < 31) {
            builder.setContentTitle(ltbVar != null ? ltbVar.a : null);
            Bundle bundle = ((nla) this.b).w;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : ((nla) this.b).w.getCharSequence("android.text");
            if (charSequence == null) {
                if (i2 == 1) {
                    string = ((nla) this.b).a.getResources().getString(n3d.call_notification_incoming_text);
                } else if (i2 == 2) {
                    string = ((nla) this.b).a.getResources().getString(n3d.call_notification_ongoing_text);
                } else if (i2 == 3) {
                    string = ((nla) this.b).a.getResources().getString(n3d.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            if (ltbVar != null) {
                IconCompat iconCompat = ltbVar.b;
                if (iconCompat != null) {
                    pla.c(builder, ob7.g(iconCompat, ((nla) this.b).a));
                }
                if (i >= 28) {
                    qla.a(builder, ktb.b(ltbVar));
                } else {
                    ola.a(builder, ltbVar.c);
                }
            }
            ola.b(builder, "call");
            return;
        }
        PendingIntent pendingIntent = this.g;
        if (i2 != 1) {
            PendingIntent pendingIntent2 = this.i;
            if (i2 == 2) {
                ltbVar.getClass();
                callStyleA = rla.b(ktb.b(ltbVar), pendingIntent2);
            } else if (i2 != 3) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(i2));
                }
                callStyleA = null;
            } else {
                ltbVar.getClass();
                callStyleA = rla.c(ktb.b(ltbVar), pendingIntent2, pendingIntent);
            }
        } else {
            ltbVar.getClass();
            callStyleA = rla.a(ktb.b(ltbVar), this.h, pendingIntent);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            rla.i(callStyleA, null);
            rla.g(callStyleA, false);
        }
    }

    @Override // defpackage.bma
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final zka k(int i, int i2, int i3, PendingIntent pendingIntent) {
        Integer numValueOf = Integer.valueOf(s34.a(((nla) this.b).a, i3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((nla) this.b).a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(numValueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        zka zkaVarE = new w30(IconCompat.c(((nla) this.b).a, i), spannableStringBuilder, pendingIntent, new Bundle()).e();
        zkaVarE.a.putBoolean("key_action_priority", true);
        return zkaVarE;
    }
}
