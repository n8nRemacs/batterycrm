package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class geb extends q44 {
    public OutputStream A0;
    public byte[] B0;
    public Iterator C0;
    public boolean D0;
    public long E0;
    public long F0;
    public int G0;
    public /* synthetic */ Object H0;
    public final /* synthetic */ ieb I0;
    public int J0;
    public beb X;
    public File Y;
    public Serializable Z;
    public ieb d;
    public ood o;
    public Object s0;
    public Object t0;
    public tid u0;
    public tid v0;
    public File w0;
    public Closeable x0;
    public InputStream y0;
    public Closeable z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geb(ieb iebVar, q44 q44Var) {
        super(q44Var);
        this.I0 = iebVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.H0 = obj;
        this.J0 |= Integer.MIN_VALUE;
        return this.I0.i(null, null, null, null, false, null, this);
    }
}
