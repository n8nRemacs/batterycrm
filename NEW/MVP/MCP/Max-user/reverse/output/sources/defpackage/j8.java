package defpackage;

import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j8 {
    public final /* synthetic */ int a;

    public /* synthetic */ j8(int i) {
        this.a = i;
    }

    public static final void a(yfh yfhVar, pn pnVar, l48 l48Var) {
        boolean z;
        fyd fydVar = (fyd) yfhVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (fydVar == null || (z = fydVar.c)) {
            return;
        }
        if (z) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        fydVar.c = true;
        l48Var.a(fydVar);
        pnVar.f(fydVar.a, fydVar.b.e);
        l38 l38Var = l48Var.d;
        if (l38Var == l38.b || l38Var.a(l38.d)) {
            pnVar.g();
        } else {
            l48Var.a(new xn4(l48Var, 3, pnVar));
        }
    }

    public static final k2h b(n2h n2hVar) {
        l2h l2hVar;
        dl6 dl6Var = new dl6();
        m2h m2hVar = n2hVar.a;
        if (m2hVar == null) {
            l2hVar = null;
        } else {
            u10 u10Var = new u10(2);
            u10Var.c = m2hVar.b;
            u10Var.a = m2hVar.c;
            u10Var.b = m2hVar.d;
            u10Var.d = m2hVar.e;
            p2h p2hVar = new p2h(u10Var);
            xpb xpbVar = new xpb(15, false);
            xpbVar.b = m2hVar.a;
            xpbVar.c = p2hVar;
            l2hVar = new l2h(xpbVar);
        }
        dl6Var.b = l2hVar;
        dl6Var.c = n2hVar.c;
        dl6Var.d = n2hVar.d;
        dl6Var.a = n2hVar.b;
        return new k2h(dl6Var);
    }

    public static final n2h c(k2h k2hVar) {
        n2h n2hVar = new n2h();
        l2h l2hVar = k2hVar.a;
        m2h m2hVar = new m2h();
        m2hVar.a = l2hVar.a;
        p2h p2hVar = l2hVar.b;
        m2hVar.b = p2hVar.a;
        m2hVar.c = p2hVar.b;
        m2hVar.d = p2hVar.c;
        m2hVar.e = p2hVar.d;
        n2hVar.a = m2hVar;
        n2hVar.c = k2hVar.c;
        n2hVar.d = k2hVar.d;
        n2hVar.b = k2hVar.b;
        return n2hVar;
    }

    public final Object d(Intent intent, int i) {
        switch (this.a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        break;
                    }
                }
                break;
        }
        return new g8(intent, i);
    }
}
