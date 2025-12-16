package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fjd extends z59 implements djd {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public cjd l;
    public final /* synthetic */ hjd n;
    public int j = -1;
    public int m = -1;

    public fjd(hjd hjdVar, String str) {
        this.n = hjdVar;
        this.f = str;
    }

    @Override // defpackage.djd
    public final int a() {
        return this.m;
    }

    @Override // defpackage.djd
    public final void b(cjd cjdVar) {
        ejd ejdVar = new ejd(this);
        this.l = cjdVar;
        int i = cjdVar.e;
        cjdVar.e = i + 1;
        int i2 = cjdVar.d;
        cjdVar.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        cjdVar.b(11, i2, i, null, bundle);
        cjdVar.h.put(i2, ejdVar);
        this.m = i;
        if (this.i) {
            cjdVar.a(i);
            int i3 = this.j;
            if (i3 >= 0) {
                cjdVar.c(this.m, i3);
                this.j = -1;
            }
            int i4 = this.k;
            if (i4 != 0) {
                cjdVar.d(this.m, i4);
                this.k = 0;
            }
        }
    }

    @Override // defpackage.djd
    public final void c() {
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            int i = this.m;
            int i2 = cjdVar.d;
            cjdVar.d = i2 + 1;
            cjdVar.b(4, i2, i, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // defpackage.a69
    public final void d() {
        hjd hjdVar = this.n;
        hjdVar.u0.remove(this);
        c();
        hjdVar.o();
    }

    @Override // defpackage.a69
    public final void e() {
        this.i = true;
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            cjdVar.a(this.m);
        }
    }

    @Override // defpackage.a69
    public final void f(int i) {
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            cjdVar.c(this.m, i);
        } else {
            this.j = i;
            this.k = 0;
        }
    }

    @Override // defpackage.a69
    public final void g() {
        h(0);
    }

    @Override // defpackage.a69
    public final void h(int i) {
        this.i = false;
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            int i2 = this.m;
            Bundle bundleE = ho7.e(i, "unselectReason");
            int i3 = cjdVar.d;
            cjdVar.d = i3 + 1;
            cjdVar.b(6, i3, i2, null, bundleE);
        }
    }

    @Override // defpackage.a69
    public final void i(int i) {
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            cjdVar.d(this.m, i);
        } else {
            this.k += i;
        }
    }

    @Override // defpackage.z59
    public final String j() {
        return this.g;
    }

    @Override // defpackage.z59
    public final String k() {
        return this.h;
    }

    @Override // defpackage.z59
    public final void m(String str) {
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = cjdVar.d;
            cjdVar.d = i2 + 1;
            cjdVar.b(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.z59
    public final void n(String str) {
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = cjdVar.d;
            cjdVar.d = i2 + 1;
            cjdVar.b(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.z59
    public final void o(List list) {
        cjd cjdVar = this.l;
        if (cjdVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = cjdVar.d;
            cjdVar.d = i2 + 1;
            cjdVar.b(14, i2, i, null, bundle);
        }
    }
}
