package defpackage;

/* loaded from: classes.dex */
public final class is8 extends gs4 implements bs8, v2f {
    public final /* synthetic */ int c;
    public py4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is8(vta vtaVar, int i) {
        super(vtaVar);
        this.c = i;
    }

    @Override // defpackage.bs8
    public void b() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.a.b();
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.c) {
            case 0:
                if (ty4.i(this.d, py4Var)) {
                    this.d = py4Var;
                    this.a.c(this);
                    break;
                }
                break;
            default:
                if (ty4.i(this.d, py4Var)) {
                    this.d = py4Var;
                    this.a.c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gs4, defpackage.py4
    public final void dispose() {
        switch (this.c) {
            case 0:
                super.dispose();
                this.d.dispose();
                break;
            default:
                super.dispose();
                this.d.dispose();
                break;
        }
    }

    @Override // defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.a.onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            default:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.a.onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
        }
    }
}
