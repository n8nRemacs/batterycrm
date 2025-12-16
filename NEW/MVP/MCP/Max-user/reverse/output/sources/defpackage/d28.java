package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class d28 implements ur3 {
    public final bs3 a;
    public final /* synthetic */ w5 b;

    public d28(w5 w5Var, Context context, ExecutorService executorService, y6i y6iVar, bwf bwfVar) {
        this.b = w5Var;
        this.a = new bs3(context, executorService, y6iVar, bwfVar);
    }

    @Override // defpackage.ur3
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.ur3
    public final os3 b() {
        return this.a.b();
    }

    @Override // defpackage.ur3
    public final void c(tr3 tr3Var) {
        this.a.c(tr3Var);
    }

    @Override // defpackage.ur3
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.ur3
    public final void e(tr3 tr3Var) {
        this.a.e(tr3Var);
    }

    @Override // defpackage.ur3
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.ur3
    public final boolean g() {
        if (this.a.g()) {
            return true;
        }
        ((lv4) this.b.c(35)).e();
        return false;
    }

    @Override // defpackage.ur3
    public final void invalidate() {
        this.a.invalidate();
    }
}
