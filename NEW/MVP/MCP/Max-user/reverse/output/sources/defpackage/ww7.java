package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ww7 implements ree {
    public final bwf a;

    public ww7(cm6 cm6Var) {
        this.a = new bwf(cm6Var);
    }

    @Override // defpackage.ree
    public final String a() {
        return b().a();
    }

    public final ree b() {
        return (ree) this.a.getValue();
    }

    @Override // defpackage.ree
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ree
    public final int d(String str) {
        return b().d(str);
    }

    @Override // defpackage.ree
    public final s9j e() {
        return b().e();
    }

    @Override // defpackage.ree
    public final int f() {
        return b().f();
    }

    @Override // defpackage.ree
    public final String g(int i) {
        return b().g(i);
    }

    @Override // defpackage.ree
    public final List getAnnotations() {
        return hd5.a;
    }

    @Override // defpackage.ree
    public final List h(int i) {
        return b().h(i);
    }

    @Override // defpackage.ree
    public final ree i(int i) {
        return b().i(i);
    }

    @Override // defpackage.ree
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.ree
    public final boolean j(int i) {
        return b().j(i);
    }
}
