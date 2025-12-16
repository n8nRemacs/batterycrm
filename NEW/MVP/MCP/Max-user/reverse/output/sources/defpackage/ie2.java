package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class ie2 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf2 b;

    public /* synthetic */ ie2(bf2 bf2Var, int i) {
        this.a = i;
        this.b = bf2Var;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((af2) obj).a(this.b);
                break;
            default:
                af2 af2Var = (af2) obj;
                ArrayList arrayList = new ArrayList(af2Var.b());
                arrayList.remove(this.b);
                ArrayList arrayList2 = af2Var.B;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                if (af2Var.B == null) {
                    af2Var.B = new ArrayList();
                }
                af2Var.B.addAll(arrayList);
                break;
        }
    }
}
