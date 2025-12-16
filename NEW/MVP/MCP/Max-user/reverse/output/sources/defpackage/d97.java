package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class d97 implements ca7 {
    public final ctc a;
    public final owg b;
    public final c97 c;
    public final /* synthetic */ y87 d;

    public d97(y87 y87Var, ctc ctcVar) {
        this.d = y87Var;
        this.a = ctcVar;
        this.b = new owg(ctcVar);
        this.c = new c97(this, ctcVar);
    }

    @Override // defpackage.ca7
    public final OutputStream a() {
        return this.b;
    }

    @Override // defpackage.ca7
    public final InputStream b() {
        return this.c;
    }

    @Override // defpackage.ca7
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.ca7
    public final void d(long j) {
        this.a.e.w(j);
    }

    @Override // defpackage.ca7
    public final void e(long j) {
        this.a.f.w(j);
    }
}
