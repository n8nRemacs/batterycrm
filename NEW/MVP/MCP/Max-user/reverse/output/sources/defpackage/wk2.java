package defpackage;

import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class wk2 implements btf {
    public final /* synthetic */ yk2 a;

    public wk2(yk2 yk2Var) {
        this.a = yk2Var;
    }

    @Override // defpackage.btf
    public final String a() {
        jk2 jk2Var = (jk2) this.a.z0.get();
        if (jk2Var == null) {
            return "empty";
        }
        long j = jk2Var.a;
        long j2 = jk2Var.b;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }

    @Override // defpackage.btf
    public final Object b(float f, long j, long j2, q44 q44Var) {
        Object value;
        tcf tcfVar = this.a.w0;
        do {
            value = tcfVar.getValue();
            ((Number) value).floatValue();
        } while (!tcfVar.c(value, new Float(f)));
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object d(q44 q44Var) {
        this.a.x(false);
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object f(File file, q44 q44Var) {
        yk2 yk2Var = this.a;
        jk2 jk2Var = (jk2) yk2Var.z0.getAndUpdate(new lk2(1));
        qqg qqgVar = qqg.a;
        if (file != null && jk2Var != null) {
            ((u6b) yk2Var.s0.getValue()).c(file);
            jve jveVar = yk2Var.u0;
            Uri uriFromFile = Uri.fromFile(file);
            if (!uriFromFile.toString().startsWith("content://")) {
                uriFromFile = ((iz5) ((qx5) yk2Var.Z.getValue())).f(yk2Var.b, ioi.c(uriFromFile));
            }
            jveVar.h(new t05(uriFromFile, jk2Var.d));
        }
        return qqgVar;
    }

    @Override // defpackage.btf
    public final Object g(boolean z, boolean z2, q44 q44Var) {
        this.a.x(z2);
        return qqg.a;
    }
}
