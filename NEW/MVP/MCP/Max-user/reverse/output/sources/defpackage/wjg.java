package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class wjg {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public c4g r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(wjg wjgVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (wjgVar != null) {
            if (!this.c && wjgVar.c) {
                this.b = wjgVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = wjgVar.h;
            }
            if (this.i == -1) {
                this.i = wjgVar.i;
            }
            if (this.a == null && (str = wjgVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = wjgVar.f;
            }
            if (this.g == -1) {
                this.g = wjgVar.g;
            }
            if (this.n == -1) {
                this.n = wjgVar.n;
            }
            if (this.o == null && (alignment2 = wjgVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = wjgVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = wjgVar.q;
            }
            if (this.j == -1) {
                this.j = wjgVar.j;
                this.k = wjgVar.k;
            }
            if (this.r == null) {
                this.r = wjgVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = wjgVar.s;
            }
            if (this.t == null) {
                this.t = wjgVar.t;
            }
            if (this.u == null) {
                this.u = wjgVar.u;
            }
            if (!this.e && wjgVar.e) {
                this.d = wjgVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = wjgVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
