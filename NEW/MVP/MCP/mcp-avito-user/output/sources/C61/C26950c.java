package c61;

/* compiled from: SignatureWriter.java */
/* renamed from: c61.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C26950c extends AbstractC26949b {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f57665a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public boolean f57666b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f57667c;

    /* renamed from: d, reason: collision with root package name */
    public int f57668d;

    @Override // c61.AbstractC26949b
    public final AbstractC26949b b() {
        this.f57665a.append('[');
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void c(char c12) {
        this.f57665a.append(c12);
    }

    @Override // c61.AbstractC26949b
    public final void e(String str) {
        StringBuilder sb2 = this.f57665a;
        sb2.append('L');
        sb2.append(str);
        this.f57668d *= 2;
    }

    @Override // c61.AbstractC26949b
    public final void f() {
        int i12 = this.f57668d % 2;
        StringBuilder sb2 = this.f57665a;
        if (i12 == 1) {
            sb2.append('>');
        }
        this.f57668d /= 2;
        sb2.append(';');
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b g() {
        this.f57665a.append('^');
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void h(String str) {
        boolean z12 = this.f57666b;
        StringBuilder sb2 = this.f57665a;
        if (!z12) {
            this.f57666b = true;
            sb2.append('<');
        }
        sb2.append(str);
        sb2.append(':');
    }

    @Override // c61.AbstractC26949b
    public final void i(String str) {
        int i12 = this.f57668d % 2;
        StringBuilder sb2 = this.f57665a;
        if (i12 == 1) {
            sb2.append('>');
        }
        this.f57668d /= 2;
        sb2.append('.');
        sb2.append(str);
        this.f57668d *= 2;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b k() {
        this.f57665a.append(':');
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b l() {
        r();
        if (!this.f57667c) {
            this.f57667c = true;
            this.f57665a.append('(');
        }
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b m() {
        r();
        boolean z12 = this.f57667c;
        StringBuilder sb2 = this.f57665a;
        if (!z12) {
            sb2.append('(');
        }
        sb2.append(')');
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b n() {
        r();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b o(char c12) {
        int i12 = this.f57668d;
        int i13 = i12 % 2;
        StringBuilder sb2 = this.f57665a;
        if (i13 == 0) {
            this.f57668d = i12 | 1;
            sb2.append('<');
        }
        if (c12 != '=') {
            sb2.append(c12);
        }
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void p() {
        int i12 = this.f57668d;
        int i13 = i12 % 2;
        StringBuilder sb2 = this.f57665a;
        if (i13 == 0) {
            this.f57668d = i12 | 1;
            sb2.append('<');
        }
        sb2.append('*');
    }

    @Override // c61.AbstractC26949b
    public final void q(String str) {
        StringBuilder sb2 = this.f57665a;
        sb2.append('T');
        sb2.append(str);
        sb2.append(';');
    }

    public final void r() {
        if (this.f57666b) {
            this.f57666b = false;
            this.f57665a.append('>');
        }
    }

    public final String toString() {
        return this.f57665a.toString();
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b d() {
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b j() {
        return this;
    }
}
