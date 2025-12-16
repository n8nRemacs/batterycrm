package defpackage;

/* loaded from: classes2.dex */
public final class f8e implements h8e {
    public final boolean X;
    public final long Y;
    public final int Z;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;

    public f8e(long j, String str, String str2, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = str4;
        this.X = z;
        this.Y = j >= 0 ? -j : j;
        this.Z = udb.r;
    }

    @Override // defpackage.h8e
    public final int f() {
        return 0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.Y;
    }

    @Override // defpackage.t98
    public final int m() {
        return this.Z;
    }
}
