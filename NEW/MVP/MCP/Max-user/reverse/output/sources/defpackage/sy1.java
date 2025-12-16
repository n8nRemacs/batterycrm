package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class sy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sy1(ez1 ez1Var, ArrayList arrayList, int i) {
        this.a = i;
        this.b = ez1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        te8 te8Var;
        switch (this.a) {
            case 0:
                ez1 ez1Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    l90 l90Var = (l90) it.next();
                    if (ez1Var.a.r(l90Var.a)) {
                        ((LinkedHashMap) ez1Var.a.c).remove(l90Var.a);
                        arrayList2.add(l90Var.a);
                        if (l90Var.b == r8c.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                ez1Var.t("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
                if (z) {
                    ez1Var.Y.h.e = null;
                }
                ez1Var.p();
                if (ez1Var.a.p().isEmpty()) {
                    ez1Var.Y.l.c = false;
                } else {
                    ez1Var.L();
                }
                if (!ez1Var.a.o().isEmpty()) {
                    ez1Var.K();
                    ez1Var.D();
                    if (ez1Var.R0 == 9) {
                        ez1Var.B();
                        return;
                    }
                    return;
                }
                ez1Var.Y.q();
                ez1Var.D();
                ez1Var.Y.y(false);
                ez1Var.v0 = ez1Var.z();
                ez1Var.t("Closing camera.", null);
                switch (az1.v(ez1Var.R0)) {
                    case 3:
                        z5j.f(null, ez1Var.t0 == null);
                        ez1Var.F(3);
                        return;
                    case 4:
                    default:
                        ez1Var.t("close() ignored due to being in state: ".concat(wy1.u(ez1Var.R0)), null);
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (ez1Var.Z.a() || ((te8Var = (te8) ez1Var.Q0.b) != null && !((AtomicBoolean) te8Var.b).get())) {
                            z = true;
                        }
                        ez1Var.Q0.v();
                        ez1Var.F(5);
                        if (z) {
                            z5j.f(null, ez1Var.w0.isEmpty());
                            ez1Var.r();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        ez1Var.F(5);
                        ez1Var.q();
                        return;
                }
            default:
                ez1 ez1Var2 = this.b;
                ArrayList arrayList3 = this.c;
                ry1 ry1Var = ez1Var2.Y;
                try {
                    ez1Var2.H(arrayList3);
                    return;
                } finally {
                    ry1Var.q();
                }
        }
    }
}
