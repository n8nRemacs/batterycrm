package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class gh6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh6 b;
    public final /* synthetic */ ghb c;
    public final /* synthetic */ int d;

    public /* synthetic */ gh6(oh6 oh6Var, ghb ghbVar, int i, int i2) {
        this.a = i2;
        this.b = oh6Var;
        this.c = ghbVar;
        this.d = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Iterator it = this.b.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).x(this.c, this.d);
                }
                break;
            default:
                Iterator it2 = this.b.b.iterator();
                while (it2.hasNext()) {
                    ((dhb) it2.next()).m(this.c, this.d);
                }
                break;
        }
        return qqg.a;
    }
}
