package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class kuc {
    public final Context a;
    public final hbd b;
    public yt0 c;
    public final t5g d;
    public final Drawable e;
    public wsc f = null;
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
    public final float q;
    public final Path r;
    public final Path s;
    public final Path t;
    public final Path u;
    public final Path v;
    public final Path w;

    public kuc(Context context, hbd hbdVar, yt0 yt0Var, t5g t5gVar, Drawable drawable, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f) {
        this.a = context;
        this.b = hbdVar;
        this.c = yt0Var;
        this.d = t5gVar;
        this.e = drawable;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = i9;
        this.p = i10;
        this.q = f;
        this.v = a(this, f, f, 0.0f, f, 0.0f, 0.0f, 52);
        this.w = a(this, f, f, 0.0f, 0.0f, f, 0.0f, 44);
        float f2 = i5;
        if (f2 >= f) {
            this.r = a(this, f, f, f, 0.0f, 0.0f, 0.0f, 56);
            this.s = null;
            this.t = a(this, f, f, 0.0f, 0.0f, 0.0f, f, 28);
            this.u = null;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.acos(1.0d - (f2 / f)));
        float f3 = 90.0f - degrees;
        Path path = new Path();
        float f4 = 2 * f;
        path.arcTo(0.0f, 0.0f, f4, f4, 180.0f, degrees, true);
        path.lineTo(f2, f);
        path.close();
        this.r = path;
        Path path2 = new Path();
        path2.arcTo(0.0f, 0.0f, f4, f4, 270.0f - f3, f3, true);
        path2.lineTo(f, f);
        path2.lineTo(f2, f);
        path2.close();
        this.s = path2;
        Path path3 = new Path();
        float f5 = -f;
        path3.arcTo(0.0f, f5, f4, f, 180.0f, -degrees, true);
        path3.lineTo(f2, 0.0f);
        path3.close();
        this.t = path3;
        Path path4 = new Path();
        path4.arcTo(0.0f, f5, f4, f, 180.0f - degrees, -f3, true);
        path4.lineTo(f, 0.0f);
        path4.lineTo(f2, 0.0f);
        path4.close();
        this.u = path4;
    }

    public static Path a(kuc kucVar, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        Path path = new Path();
        path.addRoundRect(0.0f, 0.0f, f, f2, new float[]{f3, f3, f4, f4, f5, f5, f6, f6}, Path.Direction.CW);
        return path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuc)) {
            return false;
        }
        kuc kucVar = (kuc) obj;
        return fni.a(this.a, kucVar.a) && this.b.equals(kucVar.b) && fni.a(this.c, kucVar.c) && fni.a(this.d, kucVar.d) && this.e.equals(kucVar.e) && fni.a(this.f, kucVar.f) && this.g == kucVar.g && this.h == kucVar.h && this.i == kucVar.i && this.j == kucVar.j && this.k == kucVar.k && this.l == kucVar.l && this.m == kucVar.m && this.n == kucVar.n && this.o == kucVar.o && this.p == kucVar.p && Float.compare(this.q, kucVar.q) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        wsc wscVar = this.f;
        return Float.hashCode(this.q) + xrf.k(this.p, xrf.k(this.o, xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, (iHashCode + (wscVar == null ? 0 : wscVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        yt0 yt0Var = this.c;
        wsc wscVar = this.f;
        StringBuilder sb = new StringBuilder("Params(context=");
        sb.append(this.a);
        sb.append(", dynamicFont=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(yt0Var);
        sb.append(", textStyle=");
        sb.append(this.d);
        sb.append(", iconDrawable=");
        sb.append(this.e);
        sb.append(", fixedWidthProvider=");
        sb.append(wscVar);
        sb.append(", iconWidth=");
        hf3.g(sb, this.g, ", iconHeight=", this.h, ", iconPaddingTop=");
        hf3.g(sb, this.i, ", iconPaddingRight=", this.j, ", leadingBarWidth=");
        hf3.g(sb, this.k, ", textLeftMargin=", this.l, ", textRightMargin=");
        hf3.g(sb, this.m, ", bubbleTopPadding=", this.n, ", bubbleBottomPadding=");
        hf3.g(sb, this.o, ", bubbleBottomMargin=", this.p, ", cornerRadius=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }
}
