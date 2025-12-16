package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cz1 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public cz1(l48 l48Var, k38 k38Var) {
        this.a = 1;
        this.c = l48Var;
        this.d = k38Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Executor) this.c).execute(new vy1(2, this));
                break;
            default:
                if (!this.b) {
                    ((l48) this.c).d((k38) this.d);
                    this.b = true;
                    break;
                }
                break;
        }
    }

    public cz1(dz1 dz1Var, qee qeeVar) {
        this.a = 0;
        this.d = dz1Var;
        this.b = false;
        this.c = qeeVar;
    }
}
