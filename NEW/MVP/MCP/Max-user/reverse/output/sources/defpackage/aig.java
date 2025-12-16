package defpackage;

/* loaded from: classes.dex */
public final class aig extends whg {
    public final /* synthetic */ int a;
    public shg b;

    public /* synthetic */ aig() {
        this.a = 1;
    }

    @Override // defpackage.whg, defpackage.rhg
    public void a(shg shgVar) {
        switch (this.a) {
            case 1:
                big bigVar = (big) this.b;
                if (!bigVar.T0) {
                    bigVar.O();
                    bigVar.T0 = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.whg, defpackage.rhg
    public void c(shg shgVar) {
        switch (this.a) {
            case 1:
                big bigVar = (big) this.b;
                int i = bigVar.S0 - 1;
                bigVar.S0 = i;
                if (i == 0) {
                    bigVar.T0 = false;
                    bigVar.n();
                }
                shgVar.D(this);
                break;
            case 2:
                this.b.G();
                shgVar.D(this);
                break;
        }
    }

    @Override // defpackage.whg, defpackage.rhg
    public void h(shg shgVar) {
        switch (this.a) {
            case 0:
                big bigVar = (big) this.b;
                bigVar.Q0.remove(shgVar);
                if (!bigVar.w()) {
                    bigVar.A(bigVar, o9g.d, false);
                    bigVar.D0 = true;
                    bigVar.A(bigVar, o9g.c, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ aig(shg shgVar, int i) {
        this.a = i;
        this.b = shgVar;
    }
}
