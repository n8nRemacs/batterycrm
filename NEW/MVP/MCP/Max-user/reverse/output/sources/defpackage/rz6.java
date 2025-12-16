package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class rz6 {
    public final rfg a;
    public final boolean b;
    public final boolean c;
    public final u62 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public qz6 m = new qz6();
    public qz6 n = new qz6();
    public boolean k = false;
    public boolean o = false;

    public rz6(rfg rfgVar, boolean z, boolean z2) {
        this.a = rfgVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new u62(0, 0, 4, bArr);
        qz6 qz6Var = this.n;
        qz6Var.b = false;
        qz6Var.a = false;
    }
}
