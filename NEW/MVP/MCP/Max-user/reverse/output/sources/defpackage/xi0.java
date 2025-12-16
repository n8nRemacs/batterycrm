package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class xi0 implements l50 {
    public i50 b;
    public i50 c;
    public i50 d;
    public i50 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public xi0() {
        ByteBuffer byteBuffer = l50.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        i50 i50Var = i50.e;
        this.d = i50Var;
        this.e = i50Var;
        this.b = i50Var;
        this.c = i50Var;
    }

    @Override // defpackage.l50
    public boolean a() {
        return this.h && this.g == l50.a;
    }

    @Override // defpackage.l50
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = l50.a;
        return byteBuffer;
    }

    @Override // defpackage.l50
    public final void d() {
        this.h = true;
        i();
    }

    @Override // defpackage.l50
    public final i50 e(i50 i50Var) {
        this.d = i50Var;
        this.e = g(i50Var);
        return isActive() ? this.e : i50.e;
    }

    @Override // defpackage.l50
    public final void flush() {
        this.g = l50.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    public abstract i50 g(i50 i50Var);

    public void h() {
    }

    public void i() {
    }

    @Override // defpackage.l50
    public boolean isActive() {
        return this.e != i50.e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.l50
    public final void reset() {
        ByteBuffer byteBuffer = l50.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        i50 i50Var = i50.e;
        this.d = i50Var;
        this.e = i50Var;
        this.b = i50Var;
        this.c = i50Var;
        j();
    }
}
