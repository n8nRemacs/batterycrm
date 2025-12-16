package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class vjg {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public b4g r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(vjg vjgVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (vjgVar != null) {
            if (!this.c && vjgVar.c) {
                this.b = vjgVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = vjgVar.h;
            }
            if (this.i == -1) {
                this.i = vjgVar.i;
            }
            if (this.a == null && (str = vjgVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = vjgVar.f;
            }
            if (this.g == -1) {
                this.g = vjgVar.g;
            }
            if (this.n == -1) {
                this.n = vjgVar.n;
            }
            if (this.o == null && (alignment2 = vjgVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = vjgVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = vjgVar.q;
            }
            if (this.j == -1) {
                this.j = vjgVar.j;
                this.k = vjgVar.k;
            }
            if (this.r == null) {
                this.r = vjgVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = vjgVar.s;
            }
            if (!this.e && vjgVar.e) {
                this.d = vjgVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = vjgVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
