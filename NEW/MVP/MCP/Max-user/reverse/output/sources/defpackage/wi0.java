package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class wi0 implements j50 {
    public h50 b;
    public h50 c;
    public h50 d;
    public h50 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public wi0() {
        ByteBuffer byteBuffer = j50.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        h50 h50Var = h50.e;
        this.d = h50Var;
        this.e = h50Var;
        this.b = h50Var;
        this.c = h50Var;
    }

    @Override // defpackage.j50
    public boolean a() {
        return this.h && this.g == j50.a;
    }

    @Override // defpackage.j50
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = j50.a;
        return byteBuffer;
    }

    @Override // defpackage.j50
    public final void d() {
        this.h = true;
        h();
    }

    @Override // defpackage.j50
    public final h50 e(h50 h50Var) {
        this.d = h50Var;
        this.e = f(h50Var);
        return isActive() ? this.e : h50.e;
    }

    public abstract h50 f(h50 h50Var);

    @Override // defpackage.j50
    public final void flush() {
        this.g = j50.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // defpackage.j50
    public boolean isActive() {
        return this.e != h50.e;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.j50
    public final void reset() {
        flush();
        this.f = j50.a;
        h50 h50Var = h50.e;
        this.d = h50Var;
        this.e = h50Var;
        this.b = h50Var;
        this.c = h50Var;
        i();
    }
}
