package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class w5g {
    public final float a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final TextUtils.TruncateAt f;
    public final eh9 g;
    public final int h;
    public final int i;
    public final boolean j;

    public /* synthetic */ w5g(float f, CharSequence charSequence, boolean z, int i) {
        this(f, charSequence, z, (i & 8) == 0, Integer.MAX_VALUE, null, null, 0, 0);
    }

    public static w5g a(w5g w5gVar, CharSequence charSequence, int i) {
        float f = w5gVar.a;
        if ((i & 2) != 0) {
            charSequence = w5gVar.b;
        }
        return new w5g(f, charSequence, w5gVar.c, (i & 8) != 0 ? w5gVar.d : false, (i & 16) != 0 ? w5gVar.e : 1, w5gVar.f, w5gVar.g, w5gVar.h, w5gVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5g)) {
            return false;
        }
        w5g w5gVar = (w5g) obj;
        return Float.compare(this.a, w5gVar.a) == 0 && fni.a(this.b, w5gVar.b) && this.c == w5gVar.c && this.d == w5gVar.d && this.e == w5gVar.e && this.f == w5gVar.f && fni.a(this.g, w5gVar.g) && this.h == w5gVar.h && this.i == w5gVar.i;
    }

    public final int hashCode() {
        int iK = xrf.k(this.e, a9h.b(a9h.b(u45.g(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
        TextUtils.TruncateAt truncateAt = this.f;
        int iHashCode = (iK + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        eh9 eh9Var = this.g;
        return Integer.hashCode(this.i) + xrf.k(this.h, (iHashCode + (eh9Var != null ? eh9Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreprocessTextResult(textSize=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", includeFontPadding=");
        az1.t(", postProcessing=", ", maxLines=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", truncateAt=");
        sb.append(this.f);
        sb.append(", replied=");
        sb.append(this.g);
        sb.append(", startPadding=");
        sb.append(this.h);
        sb.append(", endPadding=");
        return ho7.j(sb, this.i, ")");
    }

    public w5g(float f, CharSequence charSequence, boolean z, boolean z2, int i, TextUtils.TruncateAt truncateAt, eh9 eh9Var, int i2, int i3) {
        this.a = f;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = truncateAt;
        this.g = eh9Var;
        this.h = i2;
        this.i = i3;
        this.j = i != Integer.MAX_VALUE;
    }
}
