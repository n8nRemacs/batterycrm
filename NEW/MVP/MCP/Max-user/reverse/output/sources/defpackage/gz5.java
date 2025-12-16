package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class gz5 extends q44 {
    public Closeable X;
    public OutputStream Y;
    public byte[] Z;
    public Closeable d;
    public InputStream o;
    public long s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ b6a u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz5(b6a b6aVar, q44 q44Var) {
        super(q44Var);
        this.u0 = b6aVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.T(null, null, this);
    }
}
