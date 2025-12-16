package defpackage;

/* loaded from: classes2.dex */
public final class sf3 {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final Integer L;
    public final Integer M;
    public final Integer N;
    public final Integer O;
    public final Integer P;
    public final int Q;
    public final int R;
    public final int S;
    public final Object T;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
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
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public /* synthetic */ sf3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, (i38 & 32) != 0 ? null : -16777216, (i38 & 64) != 0 ? null : -16777216, (i38 & 128) != 0 ? null : -16777216, (i38 & 256) != 0 ? null : -16777216, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf3)) {
            return false;
        }
        sf3 sf3Var = (sf3) obj;
        return this.a == sf3Var.a && this.b == sf3Var.b && this.c == sf3Var.c && this.d == sf3Var.d && this.e == sf3Var.e && this.f == sf3Var.f && this.g == sf3Var.g && this.h == sf3Var.h && this.i == sf3Var.i && this.j == sf3Var.j && this.k == sf3Var.k && this.l == sf3Var.l && this.m == sf3Var.m && this.n == sf3Var.n && this.o == sf3Var.o && this.p == sf3Var.p && this.q == sf3Var.q && this.r == sf3Var.r && this.s == sf3Var.s && this.t == sf3Var.t && this.u == sf3Var.u && this.v == sf3Var.v && this.w == sf3Var.w && this.x == sf3Var.x && this.y == sf3Var.y && this.z == sf3Var.z && this.A == sf3Var.A && this.B == sf3Var.B && this.C == sf3Var.C && this.D == sf3Var.D && this.E == sf3Var.E && this.F == sf3Var.F && this.G == sf3Var.G && this.H == sf3Var.H && this.I == sf3Var.I && this.J == sf3Var.J && this.K == sf3Var.K && fni.a(this.L, sf3Var.L) && fni.a(this.M, sf3Var.M) && fni.a(this.N, sf3Var.N) && fni.a(this.O, sf3Var.O) && fni.a(this.P, sf3Var.P);
    }

    public final int hashCode() {
        int iK = xrf.k(this.K, xrf.k(this.J, xrf.k(this.I, xrf.k(this.H, xrf.k(this.G, xrf.k(this.F, xrf.k(this.E, xrf.k(this.D, xrf.k(this.C, xrf.k(this.B, xrf.k(this.A, xrf.k(this.z, xrf.k(this.y, xrf.k(this.x, xrf.k(this.w, xrf.k(this.v, xrf.k(this.u, xrf.k(this.t, xrf.k(this.s, xrf.k(this.r, xrf.k(this.q, xrf.k(this.p, xrf.k(this.o, xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.L;
        int iHashCode = (iK + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.M;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.N;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.O;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.P;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        String strE = wy1.e(this.d, "BubbleBorderColor(_color=", ")");
        String strE2 = wy1.e(this.g, "BubbleControlBackgroundColor(_color=", ")");
        String strE3 = wy1.e(this.i, "BubbleDecoratorBackgroundColor(_color=", ")");
        StringBuilder sbK = wy1.k("Colors(accent=", this.a, ", accentText=", this.b, ", background=");
        sbK.append(this.c);
        sbK.append(", bubbleBorderColor=");
        sbK.append(strE);
        sbK.append(", bubbleBorderHighLight=");
        hf3.g(sbK, this.e, ", bubbleClickableBackground=", this.f, ", bubbleControlBackgroundColor=");
        sbK.append(strE2);
        sbK.append(", bubbleControlsText=");
        sbK.append(this.h);
        sbK.append(", bubbleDecoratorBackgroundColor=");
        sbK.append(strE3);
        sbK.append(", bubbleDecoratorText=");
        sbK.append(this.j);
        sbK.append(", bubbleOuterBorder=");
        hf3.g(sbK, this.k, ", bubbleSecondaryText=", this.l, ", buttonTint=");
        hf3.g(sbK, this.m, ", chatBackground=", this.n, ", destructive=");
        hf3.g(sbK, this.o, ", lightBadgeBackground=", this.p, ", highlightBackground=");
        hf3.g(sbK, this.q, ", incomingBubbleBackground=", this.r, ", incomingBubbleBackgroundHighlighted=");
        hf3.g(sbK, this.s, ", outgoingBubbleBackground=", this.t, ", outgoingBubbleBackgroundHighlighted=");
        hf3.g(sbK, this.u, ", primaryText=", this.v, ", profileBackground=");
        hf3.g(sbK, this.w, ", secondaryBackground=", this.x, ", secondaryButton=");
        hf3.g(sbK, this.y, ", secondaryText=", this.z, ", separatorBackground=");
        hf3.g(sbK, this.A, ", statusBarBackground=", this.B, ", tertiaryText=");
        hf3.g(sbK, this.C, ", toolbarBackground=", this.D, ", unreadBackground=");
        hf3.g(sbK, this.E, ", unreadBackgroundMuted=", this.F, ", unreadText=");
        hf3.g(sbK, this.G, ", callAccent=", this.H, ", callBackground=");
        hf3.g(sbK, this.I, ", callControl=", this.J, ", groupCallBackground=");
        sbK.append(this.K);
        sbK.append(", switchThumb=");
        sbK.append(this.L);
        sbK.append(", switchThumbChecked=");
        sbK.append(this.M);
        sbK.append(", switchTrack=");
        sbK.append(this.N);
        sbK.append(", switchTrackChecked=");
        sbK.append(this.O);
        sbK.append(", switchTint=");
        sbK.append(this.P);
        sbK.append(")");
        return sbK.toString();
    }

    public sf3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
        this.p = i16;
        this.q = i17;
        this.r = i18;
        this.s = i19;
        this.t = i20;
        this.u = i21;
        this.v = i22;
        this.w = i23;
        this.x = i24;
        this.y = i25;
        this.z = i26;
        this.A = i27;
        this.B = i28;
        this.C = i29;
        this.D = i30;
        this.E = i31;
        this.F = i32;
        this.G = i33;
        this.H = i34;
        this.I = i35;
        this.J = i36;
        this.K = i37;
        this.L = num;
        this.M = num2;
        this.N = num3;
        this.O = num4;
        this.P = num5;
        this.Q = zob.b(i4, 0.1f);
        this.R = zob.b(i7, 0.5f);
        this.S = zob.b(i9, 0.45f);
        this.T = ipi.b(2, new hk1(17, this));
    }
}
