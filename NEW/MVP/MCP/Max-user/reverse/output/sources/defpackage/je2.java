package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class je2 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ je2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        af2 af2Var = (af2) obj;
        switch (this.a) {
            case 0:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    af2Var.c().put((Long) it.next(), 0L);
                }
                break;
            case 1:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    af2Var.c().remove((Long) it2.next());
                }
                break;
            default:
                af2Var.getClass();
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    af2Var.R.remove((Long) it3.next());
                }
                break;
        }
    }
}
