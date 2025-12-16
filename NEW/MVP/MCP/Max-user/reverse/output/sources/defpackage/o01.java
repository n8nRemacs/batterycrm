package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class o01 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public o01(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var2;
        this.b = k18Var3;
        this.c = k18Var;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public final tv1 a() {
        return (tv1) this.c.getValue();
    }

    public final boolean b(Context context, Intent intent, String str) {
        wqi.c("CallActionsProcessor", "handleCallNotificationActionIntent action=" + intent.getAction() + " from=" + str, new Object[0]);
        String action = intent.getAction();
        boolean z = false;
        if (action != null) {
            v21 v21Var = (v21) e51.a.getAccessor().c(19);
            gd1 gd1VarL = wha.l(action);
            if (gd1VarL.equals(bd1.a)) {
                Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
                intent2.setAction("action-open-call");
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                c();
                return true;
            }
            if (gd1VarL.equals(wc1.a)) {
                if (((qsb) this.a.getValue()).c(qsb.h)) {
                    boolean booleanExtra = intent.getBooleanExtra("incoming_param_is_video", false);
                    gu5 gu5Var = (gu5) ((rt5) this.d.getValue());
                    gu5Var.getClass();
                    boolean z2 = gu5Var.k(PmsKey.f12callincomingab, 0L) == 0;
                    if (booleanExtra && !z2) {
                        z = true;
                    }
                    ((hw1) a()).f(z);
                    Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
                    intent3.setAction("action-open-call");
                    intent3.setFlags(268435456);
                    context.startActivity(intent3);
                } else {
                    Bundle extras = intent.getExtras();
                    Intent intent4 = new Intent(context, (Class<?>) MainActivity.class);
                    intent4.setAction("action-open-incoming");
                    if (extras != null) {
                        intent4.putExtras(extras);
                    }
                    intent4.setFlags(268435456);
                    context.startActivity(intent4);
                }
                c();
                return true;
            }
            if (gd1VarL.equals(zc1.a)) {
                ((hw1) a()).y();
                c();
                return true;
            }
            if (gd1VarL.equals(xc1.a)) {
                yx1 yx1Var = (yx1) this.b.getValue();
                String str2 = ((hw1) a()).l().c;
                w21 w21Var = (w21) v21Var;
                long j = w21Var.d() ? 0L : 1L;
                boolean z3 = ((hw1) a()).l().i;
                yx1Var.getClass();
                yx1.d(yx1Var, "AUDIO_ENABLED", str2, null, Long.valueOf(j), null, null, z3, 116);
                w21Var.e(!w21Var.d());
                return true;
            }
            if (gd1VarL.equals(yc1.a)) {
                ((hw1) a()).z(m07.c);
                c();
                return true;
            }
            if (gd1VarL.equals(cd1.a)) {
                Bundle extras2 = intent.getExtras();
                Intent intent5 = new Intent(context, (Class<?>) MainActivity.class);
                intent5.setAction("action-open-incoming");
                if (extras2 != null) {
                    intent5.putExtras(extras2);
                }
                intent5.setFlags(268435456);
                context.startActivity(intent5);
                c();
                return true;
            }
            if (gd1VarL.equals(ad1.a)) {
                Bundle extras3 = intent.getExtras();
                Intent intent6 = new Intent(context, (Class<?>) MainActivity.class);
                intent6.setAction("action-join-link");
                if (extras3 != null) {
                    intent6.putExtras(extras3);
                }
                intent6.setFlags(268435456);
                context.startActivity(intent6);
                return true;
            }
            if (gd1VarL.equals(dd1.a)) {
                Bundle extras4 = intent.getExtras();
                Intent intent7 = new Intent(context, (Class<?>) MainActivity.class);
                intent7.setAction("action-rate-call");
                if (extras4 != null) {
                    intent7.putExtras(extras4);
                }
                intent7.setFlags(268435456);
                context.startActivity(intent7);
                return true;
            }
            if (gd1VarL.equals(ed1.a)) {
                Bundle extras5 = intent.getExtras();
                Intent intent8 = new Intent(context, (Class<?>) MainActivity.class);
                intent8.setAction("action-unknown-call");
                if (extras5 != null) {
                    intent8.putExtras(extras5);
                }
                intent8.setFlags(268435456);
                context.startActivity(intent8);
                return true;
            }
            if (!gd1VarL.equals(fd1.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final void c() {
        if (((hw1) a()).t()) {
            return;
        }
        ((ix1) this.e.getValue()).d();
    }
}
