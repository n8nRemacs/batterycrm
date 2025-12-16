package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class mh6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh6 b;
    public final /* synthetic */ vgb c;
    public final /* synthetic */ adh d;

    public /* synthetic */ mh6(oh6 oh6Var, vgb vgbVar, adh adhVar, int i) {
        this.a = i;
        this.b = oh6Var;
        this.c = vgbVar;
        this.d = adhVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Iterator it = this.b.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).k(this.c, this.d);
                }
                break;
            default:
                Iterator it2 = this.b.b.iterator();
                while (it2.hasNext()) {
                    ((dhb) it2.next()).h(this.c, this.d);
                }
                break;
        }
        return qqg.a;
    }
}
