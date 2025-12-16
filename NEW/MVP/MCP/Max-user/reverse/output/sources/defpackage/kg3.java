package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class kg3 {
    public final jg3 a;
    public final lg3 b;
    public final og3 c;
    public final tg3 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public kg3(jg3 jg3Var, lg3 lg3Var, og3 og3Var, tg3 tg3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = jg3Var;
        this.b = lg3Var;
        this.c = og3Var;
        this.d = tg3Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = i11;
        this.p = i12;
        this.q = i13;
        this.r = i14;
        this.s = i15;
        this.t = i16;
        this.u = i17;
        this.v = iArr;
        this.w = iArr2;
        this.x = iArr3;
        this.y = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg3)) {
            return false;
        }
        kg3 kg3Var = (kg3) obj;
        return this.a.equals(kg3Var.a) && this.b.equals(kg3Var.b) && this.c.equals(kg3Var.c) && this.d.equals(kg3Var.d) && this.e == kg3Var.e && this.f == kg3Var.f && this.g == kg3Var.g && this.h == kg3Var.h && this.i == kg3Var.i && this.j == kg3Var.j && this.k == kg3Var.k && this.l == kg3Var.l && this.m == kg3Var.m && this.n == kg3Var.n && this.o == kg3Var.o && this.p == kg3Var.p && this.q == kg3Var.q && this.r == kg3Var.r && this.s == kg3Var.s && this.t == kg3Var.t && this.u == kg3Var.u && this.v.equals(kg3Var.v) && this.w.equals(kg3Var.w) && this.x.equals(kg3Var.x) && this.y.equals(kg3Var.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + ((Arrays.hashCode(this.x) + ((Arrays.hashCode(this.w) + ((Arrays.hashCode(this.v) + xrf.k(1392508927, xrf.k(-1191182337, xrf.k(this.u, xrf.k(this.t, xrf.k(this.s, xrf.k(this.r, xrf.k(this.q, xrf.k(this.p, xrf.k(this.o, xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(1543503872, xrf.k(this.k, xrf.k(-1, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.v);
        String string2 = Arrays.toString(this.w);
        String string3 = Arrays.toString(this.x);
        String string4 = Arrays.toString(this.y);
        StringBuilder sb = new StringBuilder("CommonBackgroundColors(chatBackground=");
        sb.append(this.a);
        sb.append(", fileType=");
        sb.append(this.b);
        sb.append(", skeleton=");
        sb.append(this.c);
        sb.append(", systemBubbleGradient=");
        sb.append(this.d);
        sb.append(", accent=");
        hf3.g(sb, this.e, ", capsule=", this.f, ", capsuleOutside=");
        hf3.g(sb, this.g, ", capsuleSecondary=", this.h, ", chatFAB=");
        hf3.g(sb, this.i, ", contrastFloatingSecondary=", this.j, ", contrastStatic=-1, neutral=");
        hf3.g(sb, this.k, ", neutralFade=1543503872, neutralFadeSecondary=", this.l, ", neutralFadeTertiary=");
        hf3.g(sb, this.m, ", neutralThemed=", this.n, ", overlay=");
        hf3.g(sb, this.o, ", overlayHard=", this.p, ", overlaySecondary=");
        hf3.g(sb, this.q, ", pattern=", this.r, ", searchHighlight=");
        hf3.g(sb, this.s, ", stickerBlank=", this.t, ", surfaceGround=");
        sb.append(this.u);
        sb.append(", timelineActive=-1191182337, timelinePassive=1392508927, capsuleGradient=");
        sb.append(string);
        sb.append(", capsuleSecondaryGradient=");
        ho7.r(sb, string2, ", glassLightGradient=", string3, ", spaceThemeGradient=");
        return ho7.l(sb, string4, ")");
    }
}
