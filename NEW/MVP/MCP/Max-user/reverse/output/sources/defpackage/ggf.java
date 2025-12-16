package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ggf implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kgf b;

    public /* synthetic */ ggf(kgf kgfVar, int i) {
        this.a = i;
        this.b = kgfVar;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        List list = (List) obj;
        switch (this.a) {
            case 0:
                kgf kgfVar = this.b;
                kgfVar.getClass();
                return new ik3(new ora(vqa.i(list), new vef(13), 5).s(), 2, new ggf(kgfVar, 1));
            default:
                return new ik3(this.b.a.w().h(new vef(12)), 2, new oh2(25, list));
        }
    }
}
