package defpackage;

import org.apache.http.entity.ContentLengthStrategy;

/* loaded from: classes2.dex */
public final class zz9 implements jb8 {
    public final ri4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public int g;

    public zz9(ye yeVar) {
        String name = zz9.class.getName();
        this.a = new ri4();
        this.b = yeVar.a * 1000;
        this.c = yeVar.b * 1000;
        this.d = yeVar.c * 1000;
        this.e = yeVar.d * 1000;
        this.f = yeVar.e;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, toString(), null);
        }
    }

    @Override // defpackage.jb8
    public final void a(ib8 ib8Var, bn5[] bn5VarArr) {
        int i;
        this.g = 0;
        for (bn5 bn5Var : bn5VarArr) {
            if (bn5Var != null) {
                hf6 hf6VarJ = bn5Var.j();
                int i2 = this.g;
                int i3 = hf6VarJ.o;
                if (i3 == -1) {
                    int i4 = bn5Var.a().c;
                    switch (i4) {
                        case ContentLengthStrategy.CHUNKED /* -2 */:
                            i = 0;
                            break;
                        case -1:
                        default:
                            throw new IllegalArgumentException(ho7.f(i4, "Unexpected type of the track="));
                        case 0:
                            i = 5373952;
                            break;
                        case 1:
                        case 3:
                            i = 65536;
                            break;
                        case 2:
                            i = 5242880;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i = 131072;
                            break;
                    }
                } else {
                    i = this.f * i3;
                }
                this.g = i2 + i;
            }
        }
        this.a.c(this.g);
    }

    @Override // defpackage.jb8
    public final boolean b() {
        return false;
    }

    @Override // defpackage.jb8
    public final boolean d(long j) {
        char c = j > this.c ? (char) 0 : j < this.b ? (char) 2 : (char) 1;
        return c == 2 || (c == 1 && !(this.a.a() >= this.g));
    }

    @Override // defpackage.jb8
    public final void e(n4c n4cVar) {
        this.g = 0;
        this.a.b();
    }

    @Override // defpackage.jb8
    public final void f(n4c n4cVar) {
        this.g = 0;
        this.a.b();
    }

    @Override // defpackage.jb8
    public final boolean g(long j, boolean z) {
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    @Override // defpackage.jb8
    public final long h() {
        return 0L;
    }

    @Override // defpackage.jb8
    public final void i(n4c n4cVar) {
        this.g = 0;
    }

    @Override // defpackage.jb8
    public final ri4 k() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "MinSizeLoadControl(\n        minBufferUs=", "\n        maxBufferUs=");
        sbL.append(this.c);
        az1.r(this.d, "\n        playbackBufferUs=", "\n        playbackBufferAfterRebufferUs=", sbL);
        utb.n(sbL, this.e, "\n        formatMaxInputSizeScaleUpFactor=", this.f);
        sbL.append("\n        )\n        ");
        return sbL.toString();
    }
}
