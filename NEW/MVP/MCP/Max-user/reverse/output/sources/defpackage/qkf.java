package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class qkf implements Runnable {
    public static final String d = cei.m("StopWorkRunnable");
    public final c5i a;
    public final acf b;
    public final boolean c;

    public qkf(c5i c5iVar, acf acfVar, boolean z) {
        this.a = c5iVar;
        this.b = acfVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        e6i e6iVar;
        if (this.c) {
            jac jacVar = this.a.f;
            acf acfVar = this.b;
            jacVar.getClass();
            String str = acfVar.a.a;
            synchronized (jacVar.v0) {
                try {
                    cei.g().c(jac.w0, "Processor stopping foreground work " + str);
                    e6iVar = (e6i) jacVar.X.remove(str);
                    if (e6iVar != null) {
                        jacVar.Z.remove(str);
                    }
                } finally {
                }
            }
            zC = jac.c(str, e6iVar);
        } else {
            jac jacVar2 = this.a.f;
            acf acfVar2 = this.b;
            jacVar2.getClass();
            String str2 = acfVar2.a.a;
            synchronized (jacVar2.v0) {
                try {
                    e6i e6iVar2 = (e6i) jacVar2.Y.remove(str2);
                    if (e6iVar2 == null) {
                        cei.g().c(jac.w0, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) jacVar2.Z.get(str2);
                        if (set != null && set.contains(acfVar2)) {
                            cei.g().c(jac.w0, "Processor stopping background work " + str2);
                            jacVar2.Z.remove(str2);
                            zC = jac.c(str2, e6iVar2);
                        }
                    }
                    zC = false;
                } finally {
                }
            }
        }
        cei.g().c(d, "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zC);
    }
}
