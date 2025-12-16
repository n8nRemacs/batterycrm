package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class n97 extends vqa {
    public static final /* synthetic */ int d = 0;
    public final bwf a;
    public final File b;
    public final j0e c;

    public n97(bwf bwfVar, File file, j0e j0eVar) {
        this.a = bwfVar;
        this.b = file;
        this.c = j0eVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        m97 m97Var = new m97(vtaVar, this.a, this.b, this.c.a());
        vtaVar.c(m97Var);
        if (m97Var.X.get()) {
            return;
        }
        ((s97) m97Var.a.getValue()).b(m97Var.b, m97Var.c, m97Var, null);
    }
}
