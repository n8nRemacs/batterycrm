package defpackage;

/* loaded from: classes.dex */
public final class w9e {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public w9e f;
    public w9e g;

    public w9e() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final w9e a() {
        w9e w9eVar = this.f;
        w9e w9eVar2 = w9eVar != this ? w9eVar : null;
        w9e w9eVar3 = this.g;
        w9eVar3.f = w9eVar;
        this.f.g = w9eVar3;
        this.f = null;
        this.g = null;
        return w9eVar2;
    }

    public final void b(w9e w9eVar) {
        w9eVar.g = this;
        w9eVar.f = this.f;
        this.f.g = w9eVar;
        this.f = w9eVar;
    }

    public final w9e c() {
        this.d = true;
        return new w9e(this.a, this.b, this.c, true, false);
    }

    public final void d(w9e w9eVar, int i) {
        boolean z = w9eVar.e;
        byte[] bArr = w9eVar.a;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = w9eVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (w9eVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = w9eVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ys.n(bArr, i4, bArr, i2);
            w9eVar.c -= w9eVar.b;
            w9eVar.b = 0;
        }
        int i5 = w9eVar.c;
        int i6 = this.b;
        System.arraycopy(this.a, i6, bArr, i5, (i6 + i) - i6);
        w9eVar.c += i;
        this.b += i;
    }

    public w9e(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
