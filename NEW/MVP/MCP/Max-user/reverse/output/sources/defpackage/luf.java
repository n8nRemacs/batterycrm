package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class luf extends q44 {
    public File X;
    public Closeable Y;
    public InputStream Z;
    public k2h d;
    public String o;
    public Closeable s0;
    public OutputStream t0;
    public byte[] u0;
    public long v0;
    public /* synthetic */ Object w0;
    public final /* synthetic */ quf x0;
    public int y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luf(quf qufVar, q44 q44Var) {
        super(q44Var);
        this.x0 = qufVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.w0 = obj;
        this.y0 |= Integer.MIN_VALUE;
        return this.x0.c(null, null, this);
    }
}
