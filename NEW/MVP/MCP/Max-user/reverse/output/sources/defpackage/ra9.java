package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class ra9 {
    public final pa9 a;
    public final String b = getClass().getName();
    public final /* synthetic */ int c;
    public final /* synthetic */ sa9 d;
    public final /* synthetic */ Object e;

    public ra9(pa9 pa9Var, sa9 sa9Var, Object obj, int i) {
        this.c = i;
        this.d = sa9Var;
        this.e = obj;
        this.a = pa9Var;
    }

    public final void a() {
        switch (this.c) {
            case 0:
                String str = (String) this.d.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "executeWithDetachableLooper.done, quit loop ...", null);
                    }
                }
                ((mu4) this.e).b.quitSafely();
                break;
            default:
                String str2 = (String) this.d.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.d;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, str2, "executeWithMainLooper.done", null);
                    }
                }
                ((CountDownLatch) this.e).countDown();
                break;
        }
    }
}
