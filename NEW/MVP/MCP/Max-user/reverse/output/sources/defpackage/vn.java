package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class vn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ vn(ho hoVar, int i) {
        this.a = i;
        this.b = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ho hoVar = this.b;
                if ((hoVar.j1 & 1) != 0) {
                    hoVar.v(0);
                }
                if ((hoVar.j1 & 4096) != 0) {
                    hoVar.v(108);
                }
                hoVar.i1 = false;
                hoVar.j1 = 0;
                break;
            default:
                ho hoVar2 = this.b;
                hoVar2.G0.showAtLocation(hoVar2.F0, 55, 0, 0);
                dhh dhhVar = hoVar2.I0;
                if (dhhVar != null) {
                    dhhVar.b();
                }
                if (!hoVar2.J0 || (viewGroup = hoVar2.K0) == null || !viewGroup.isLaidOut()) {
                    hoVar2.F0.setAlpha(1.0f);
                    hoVar2.F0.setVisibility(0);
                    break;
                } else {
                    hoVar2.F0.setAlpha(0.0f);
                    dhh dhhVarA = hfh.a(hoVar2.F0);
                    dhhVarA.a(1.0f);
                    hoVar2.I0 = dhhVarA;
                    dhhVarA.d(new wn(0, this));
                    break;
                }
                break;
        }
    }
}
