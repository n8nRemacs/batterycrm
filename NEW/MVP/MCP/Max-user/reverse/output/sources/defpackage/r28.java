package defpackage;

import java.net.Socket;

/* loaded from: classes2.dex */
public final class r28 implements cb3 {
    public final k18 a;

    public r28(k18 k18Var) {
        this.a = k18Var;
    }

    @Override // defpackage.cb3
    public final void a() {
        l().a();
    }

    @Override // defpackage.cb3
    public final qs3 b() {
        return l().b();
    }

    @Override // defpackage.cb3
    public final void c(Socket socket) {
        l().c(socket);
    }

    @Override // defpackage.cb3
    public final void close() {
        l().close();
    }

    @Override // defpackage.cb3
    public final Socket connect() {
        return l().connect();
    }

    @Override // defpackage.cb3
    public final int d() {
        return l().d();
    }

    @Override // defpackage.cb3
    public final boolean e() {
        return l().e();
    }

    @Override // defpackage.cb3
    public final void f() {
        l().f();
    }

    @Override // defpackage.cb3
    public final void g(boolean z) {
        l().g(z);
    }

    @Override // defpackage.cb3
    public final long h(int i) {
        return l().h(i);
    }

    @Override // defpackage.cb3
    public final String i() {
        return l().i();
    }

    @Override // defpackage.cb3
    public final yq3 k() {
        return l().k();
    }

    public final cb3 l() {
        return (cb3) this.a.getValue();
    }
}
