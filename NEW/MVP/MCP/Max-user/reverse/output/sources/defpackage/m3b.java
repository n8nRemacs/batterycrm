package defpackage;

/* loaded from: classes.dex */
public final class m3b implements h25 {
    public final /* synthetic */ String a;
    public final /* synthetic */ sac b;

    public m3b(String str, sac sacVar) {
        this.a = str;
        this.b = sacVar;
    }

    @Override // defpackage.h25
    public final void e(xz4 xz4Var, Exception exc) {
        if (fni.a(xz4Var.a.a, this.a)) {
            String str = xz4Var.a.a;
            int i = xz4Var.b;
            float f = xz4Var.h.b;
            StringBuilder sbM = utb.m(i, "onDownloadChanged, ", str, ", ", ", ");
            sbM.append(f);
            sbM.append("%");
            wqi.c("OneMeDownloadController", sbM.toString(), new Object[0]);
            if (exc != null) {
                ((pac) this.b).D(exc);
                return;
            }
            pac pacVar = (pac) this.b;
            pacVar.getClass();
            pacVar.g(xz4Var);
            int i2 = xz4Var.b;
            if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5) {
                pac pacVar2 = (pac) this.b;
                pacVar2.getClass();
                if (pacVar2.a.w()) {
                    return;
                }
                pac pacVar3 = (pac) this.b;
                pacVar3.getClass();
                pacVar3.D(null);
            }
        }
    }

    @Override // defpackage.h25
    public final void f(j25 j25Var, xz4 xz4Var) {
        if (fni.a(xz4Var.a.a, this.a)) {
            j25Var.e.remove(this);
            pac pacVar = (pac) this.b;
            pacVar.getClass();
            if (pacVar.a.w()) {
                return;
            }
            pacVar.getClass();
            pacVar.D(null);
        }
    }
}
