package defpackage;

import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final /* synthetic */ class i79 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o79 b;

    public /* synthetic */ i79(o79 o79Var, int i) {
        this.a = i;
        this.b = o79Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o79 o79Var = this.b;
                m79 m79Var = o79Var.v;
                if (m79Var != null) {
                    a5c a5cVar = o79Var.t;
                    a5cVar.m0();
                    a5cVar.a.i1(new rh6(a5cVar, m79Var));
                    break;
                }
                break;
            case 1:
                o79 o79Var2 = this.b;
                r5j r5jVar = o79Var2.w;
                if (r5jVar != null) {
                    ((OneMeMediaSessionService) r5jVar.b).k(o79Var2.k, false);
                    break;
                }
                break;
            case 2:
                o79.a(this.b);
                break;
            default:
                this.b.u();
                break;
        }
    }
}
