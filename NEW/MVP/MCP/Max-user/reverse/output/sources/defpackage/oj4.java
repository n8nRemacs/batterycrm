package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class oj4 {
    public long a;
    public final i50 b;
    public final ka2 c;
    public final /* synthetic */ pj4 d;

    public oj4(pj4 pj4Var, i50 i50Var, ka2 ka2Var, long j) {
        this.d = pj4Var;
        this.b = i50Var;
        this.a = j;
        this.c = ka2Var;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        hsi.b(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
