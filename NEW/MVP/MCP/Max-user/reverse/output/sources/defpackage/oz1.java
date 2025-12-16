package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class oz1 implements q02 {
    public final Executor a;
    public final sz1 b;
    public final int c;

    public oz1(sz1 sz1Var, qee qeeVar, int i) {
        this.b = sz1Var;
        this.a = qeeVar;
        this.c = i;
    }

    @Override // defpackage.q02
    public final ha8 a() {
        gri.a("Camera2CapturePipeline", "invokePreCapture");
        sn6 sn6VarA = sn6.a(this.b.a(this.c));
        lz1 lz1Var = new lz1(1);
        sn6VarA.getClass();
        return wsf.l(sn6VarA, new usd(19, lz1Var), this.a);
    }

    @Override // defpackage.q02
    public final ha8 b() {
        return ixi.a(new xtd(24, this));
    }
}
