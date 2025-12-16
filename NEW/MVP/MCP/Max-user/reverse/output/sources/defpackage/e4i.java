package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class e4i {
    public static final g4i b;
    public final g4i a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 30 ? new x3i() : i >= 29 ? new v3i() : new u3i()).b().a.a().a.b().a.c();
    }

    public e4i(g4i g4iVar) {
        this.a = g4iVar;
    }

    public g4i a() {
        return this.a;
    }

    public g4i b() {
        return this.a;
    }

    public g4i c() {
        return this.a;
    }

    public void d(View view) {
    }

    public jy4 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4i)) {
            return false;
        }
        e4i e4iVar = (e4i) obj;
        return n() == e4iVar.n() && m() == e4iVar.m() && Objects.equals(j(), e4iVar.j()) && Objects.equals(h(), e4iVar.h()) && Objects.equals(e(), e4iVar.e());
    }

    public co7 f(int i) {
        return co7.e;
    }

    public co7 g() {
        return j();
    }

    public co7 h() {
        return co7.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public co7 i() {
        return j();
    }

    public co7 j() {
        return co7.e;
    }

    public co7 k() {
        return j();
    }

    public g4i l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void p(co7[] co7VarArr) {
    }

    public void q(g4i g4iVar) {
    }

    public void r(co7 co7Var) {
    }
}
