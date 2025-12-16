package defpackage;

import android.os.Vibrator;

/* loaded from: classes.dex */
public final class s91 {
    public final k18 a;
    public final k18 b;

    public s91(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a() {
        wqi.c("HandleSilenceMode", "try mute ringtones", new Object[0]);
        el1 el1VarA = ((oqd) this.b.getValue()).a();
        lg8 lg8Var = lg8.d;
        if (el1VarA.j == null && ((Vibrator) el1VarA.h.getValue()) == null) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "RingtoneManagerTag", " mute already set", null);
                return;
            }
            return;
        }
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "RingtoneManagerTag", " set mute", null);
        }
        el1VarA.e();
    }
}
