package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dd8 implements k8g {
    public final Executor a;
    public final py0 b;
    public final ContentResolver c;

    public dd8(Executor executor, py0 py0Var, ContentResolver contentResolver) {
        this.a = executor;
        this.b = py0Var;
        this.c = contentResolver;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        mk0 mk0Var = (mk0) oacVar;
        rac racVar = mk0Var.c;
        rf7 rf7Var = mk0Var.a;
        mk0Var.h("local", "exif");
        cd8 cd8Var = new cd8(this, hj0Var, racVar, oacVar, rf7Var);
        mk0Var.a(new hh4(2, cd8Var));
        this.a.execute(cd8Var);
    }

    @Override // defpackage.k8g
    public final boolean b(ynd yndVar) {
        return tei.a(512, 512, yndVar);
    }
}
