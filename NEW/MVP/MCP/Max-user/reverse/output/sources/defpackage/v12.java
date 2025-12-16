package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v12 implements ju3 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ s32 b;
    public final /* synthetic */ w12 c;

    public v12(o38 o38Var, Executor executor, s32 s32Var) {
        this.c = o38Var;
        this.a = executor;
        this.b = s32Var;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        ach achVar = (ach) obj;
        if (achVar instanceof vbh) {
            if (jei.c()) {
                w12 w12Var = this.c;
                dhd dhdVar = (dhd) w12Var.k.remove(this);
                if (dhdVar != null && w12Var.j == dhdVar) {
                    w12Var.j = null;
                }
            } else {
                this.a.execute(new vy1(5, this));
            }
        }
        this.b.accept(achVar);
    }
}
