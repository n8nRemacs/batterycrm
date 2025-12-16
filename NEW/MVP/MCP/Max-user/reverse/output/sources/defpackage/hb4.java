package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hb4 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new hb4("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = zxg.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(17, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(18, 36);
        y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public hb4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            hsi.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hb4 b(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb4.b(android.os.Bundle):hb4");
    }

    public final fb4 a() {
        fb4 fb4Var = new fb4();
        fb4Var.a = this.a;
        fb4Var.b = this.d;
        fb4Var.c = this.b;
        fb4Var.d = this.c;
        fb4Var.e = this.e;
        fb4Var.f = this.f;
        fb4Var.g = this.g;
        fb4Var.h = this.h;
        fb4Var.i = this.i;
        fb4Var.j = this.n;
        fb4Var.k = this.o;
        fb4Var.l = this.j;
        fb4Var.m = this.k;
        fb4Var.n = this.l;
        fb4Var.o = this.m;
        fb4Var.p = this.p;
        fb4Var.q = this.q;
        fb4Var.r = this.r;
        return fb4Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = zb4.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (qvd qvdVar : (qvd[]) spanned.getSpans(0, spanned.length(), qvd.class)) {
                    qvdVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(qvd.c, qvdVar.a);
                    bundle2.putInt(qvd.d, qvdVar.b);
                    arrayList.add(zb4.a(spanned, qvdVar, 1, bundle2));
                }
                for (e4g e4gVar : (e4g[]) spanned.getSpans(0, spanned.length(), e4g.class)) {
                    e4gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(e4g.d, e4gVar.a);
                    bundle3.putInt(e4g.e, e4gVar.b);
                    bundle3.putInt(e4g.f, e4gVar.c);
                    arrayList.add(zb4.a(spanned, e4gVar, 2, bundle3));
                }
                for (t67 t67Var : (t67[]) spanned.getSpans(0, spanned.length(), t67.class)) {
                    arrayList.add(zb4.a(spanned, t67Var, 3, null));
                }
                for (ajh ajhVar : (ajh[]) spanned.getSpans(0, spanned.length(), ajh.class)) {
                    ajhVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(ajh.b, ajhVar.a);
                    arrayList.add(zb4.a(spanned, ajhVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && hb4.class == obj.getClass()) {
            hb4 hb4Var = (hb4) obj;
            Bitmap bitmap2 = hb4Var.d;
            if (TextUtils.equals(this.a, hb4Var.a) && this.b == hb4Var.b && this.c == hb4Var.c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == hb4Var.e && this.f == hb4Var.f && this.g == hb4Var.g && this.h == hb4Var.h && this.i == hb4Var.i && this.j == hb4Var.j && this.k == hb4Var.k && this.l == hb4Var.l && this.m == hb4Var.m && this.n == hb4Var.n && this.o == hb4Var.o && this.p == hb4Var.p && this.q == hb4Var.q && this.r == hb4Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
