package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.nio.file.Path;

/* loaded from: classes2.dex */
public final class w4b extends q44 {
    public Closeable X;
    public BufferedWriter Y;
    public kv0 Z;
    public x4b d;
    public Path o;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ x4b u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4b(x4b x4bVar, q44 q44Var) {
        super(q44Var);
        this.u0 = x4bVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return x4b.b(this.u0, null, this);
    }
}
