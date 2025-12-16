package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class yef extends pj0 {
    public final long X;
    public final String Y;
    public final String Z;
    public final long b;
    public final int c;
    public final int d;
    public final String o;
    public final String s0;
    public final List t0;
    public final int u0;
    public final long v0;
    public final String w0;
    public final boolean x0;
    public final int y0;
    public final String z0;

    public yef(xef xefVar) {
        super(xefVar.a);
        this.b = xefVar.b;
        this.c = xefVar.c;
        this.d = xefVar.d;
        this.o = xefVar.e;
        this.X = xefVar.f;
        this.Y = xefVar.g;
        this.Z = xefVar.h;
        this.s0 = xefVar.i;
        this.t0 = xefVar.j;
        this.u0 = xefVar.k;
        this.v0 = xefVar.l;
        this.w0 = xefVar.m;
        this.x0 = xefVar.n;
        this.y0 = xefVar.o;
        this.z0 = xefVar.p;
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerDb{stickerId=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", url='");
        sb.append(this.o);
        sb.append("', updateTime=");
        sb.append(this.X);
        sb.append(", mp4url='");
        sb.append(this.Y);
        sb.append("', firstUrl='");
        sb.append(this.Z);
        sb.append("', previewUrl='");
        sb.append(this.s0);
        sb.append("', tags='");
        sb.append(this.t0);
        sb.append("', token='null', stickerType=");
        sb.append(ctd.r(this.u0));
        sb.append(", setId=");
        sb.append(this.v0);
        sb.append(", lottieUrl='");
        sb.append(this.w0);
        sb.append("', audio=");
        sb.append(this.x0);
        sb.append(", authorType=");
        sb.append(ctd.p(this.y0));
        sb.append(", videoUrl='");
        return ho7.l(sb, this.z0, "'}");
    }
}
