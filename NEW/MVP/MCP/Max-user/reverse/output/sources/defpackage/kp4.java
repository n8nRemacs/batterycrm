package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class kp4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp4 b;
    public final /* synthetic */ v7f c;

    public /* synthetic */ kp4(tp4 tp4Var, v7f v7fVar, int i) {
        this.a = i;
        this.b = tp4Var;
        this.c = v7fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                tp4 tp4Var = this.b;
                ArrayList arrayList = tp4Var.b;
                v7f v7fVar = this.c;
                if (arrayList.contains(v7fVar)) {
                    ctd.a(v7fVar.a, v7fVar.c.S0, tp4Var.a);
                    break;
                }
                break;
            default:
                tp4 tp4Var2 = this.b;
                ArrayList arrayList2 = tp4Var2.b;
                v7f v7fVar2 = this.c;
                arrayList2.remove(v7fVar2);
                tp4Var2.c.remove(v7fVar2);
                break;
        }
    }
}
