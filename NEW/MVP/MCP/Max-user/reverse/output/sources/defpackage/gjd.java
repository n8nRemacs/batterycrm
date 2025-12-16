package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class gjd extends a69 implements djd {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public cjd f;
    public int g;
    public final /* synthetic */ hjd h;

    public gjd(hjd hjdVar, String str, String str2) {
        this.h = hjdVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.djd
    public final int a() {
        return this.g;
    }

    @Override // defpackage.djd
    public final void b(cjd cjdVar) {
        this.f = cjdVar;
        int i = cjdVar.e;
        cjdVar.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = cjdVar.d;
        cjdVar.d = i2 + 1;
        cjdVar.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            cjdVar.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                cjdVar.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                cjdVar.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override // defpackage.djd
    public final void c() {
        cjd cjdVar = this.f;
        if (cjdVar != null) {
            int i = this.g;
            int i2 = cjdVar.d;
            cjdVar.d = i2 + 1;
            cjdVar.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.a69
    public final void d() {
        hjd hjdVar = this.h;
        hjdVar.u0.remove(this);
        c();
        hjdVar.o();
    }

    @Override // defpackage.a69
    public final void e() {
        this.c = true;
        cjd cjdVar = this.f;
        if (cjdVar != null) {
            cjdVar.a(this.g);
        }
    }

    @Override // defpackage.a69
    public final void f(int i) {
        cjd cjdVar = this.f;
        if (cjdVar != null) {
            cjdVar.c(this.g, i);
        } else {
            this.d = i;
            this.e = 0;
        }
    }

    @Override // defpackage.a69
    public final void g() {
        h(0);
    }

    @Override // defpackage.a69
    public final void h(int i) {
        this.c = false;
        cjd cjdVar = this.f;
        if (cjdVar != null) {
            int i2 = this.g;
            Bundle bundleE = ho7.e(i, "unselectReason");
            int i3 = cjdVar.d;
            cjdVar.d = i3 + 1;
            cjdVar.b(6, i3, i2, null, bundleE);
        }
    }

    @Override // defpackage.a69
    public final void i(int i) {
        cjd cjdVar = this.f;
        if (cjdVar != null) {
            cjdVar.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
