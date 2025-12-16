package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v10 {
    public static final v10 s = new v10(new t10());
    public final long a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final byte[] k;
    public final long l;
    public final u10 m;
    public final String n;
    public final ry o;
    public final boolean p;
    public final int q;
    public final int r;

    public v10(t10 t10Var) {
        this.a = t10Var.a;
        this.b = t10Var.r;
        this.c = t10Var.b;
        this.d = t10Var.c;
        this.e = t10Var.d;
        this.f = t10Var.e;
        this.g = t10Var.f;
        this.h = t10Var.g;
        this.i = t10Var.h;
        this.j = t10Var.i;
        this.k = t10Var.j;
        this.l = t10Var.k;
        this.m = t10Var.l;
        this.n = t10Var.m;
        this.o = t10Var.n;
        this.p = t10Var.o;
        this.q = t10Var.p;
        this.r = t10Var.q;
    }

    public final t10 a() {
        t10 t10Var = new t10();
        t10Var.a = this.a;
        t10Var.r = this.b;
        t10Var.b = this.c;
        t10Var.c = this.d;
        t10Var.d = this.e;
        t10Var.e = this.f;
        t10Var.f = this.g;
        t10Var.g = this.h;
        t10Var.h = this.i;
        t10Var.i = this.j;
        t10Var.j = this.k;
        t10Var.k = this.l;
        t10Var.l = this.m;
        t10Var.m = this.n;
        t10Var.n = this.o;
        t10Var.o = this.p;
        t10Var.p = this.q;
        t10Var.q = this.r;
        return t10Var;
    }

    public final String toString() {
        String string = Arrays.toString(this.k);
        StringBuilder sbL = az1.l(this.a, "Video{videoId=", ", videoType=");
        int i = this.b;
        sbL.append(i != 1 ? i != 2 ? "null" : "VIDEO_MESSAGE" : "VIDEO");
        sbL.append(", duration=");
        sbL.append(this.c);
        sbL.append(", thumbnail='");
        sbL.append(this.d);
        sbL.append("', width=");
        sbL.append(this.e);
        sbL.append(", height=");
        sbL.append(this.f);
        sbL.append(", live=");
        sbL.append(this.g);
        ho7.r(sbL, ", externalUrl='", this.h, "', embedUrl='", this.i);
        ho7.r(sbL, "', externalSiteName='", this.j, "', previewData=", string);
        az1.r(this.l, ", startTime=", ", convertOptions=", sbL);
        sbL.append(this.m);
        sbL.append(", token='");
        sbL.append(this.n);
        sbL.append("', videoCollage=");
        sbL.append(this.o);
        sbL.append(", ignoreAutoplay=");
        sbL.append(this.p);
        sbL.append(", audioTrackIndex=");
        return xc0.i(sbL, this.q, ", audioGroupIndex=", this.r, "}");
    }
}
