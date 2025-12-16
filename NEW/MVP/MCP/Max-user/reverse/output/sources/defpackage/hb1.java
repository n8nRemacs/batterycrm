package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class hb1 implements jb1 {
    public static final hb1 h = new hb1(new d51((Long) null, (CharSequence) null, (wd0) null, false, 15), false, null, "", gb1.Z, gb1.o, null);
    public final d51 a;
    public final boolean b;
    public final CharSequence c;
    public final CharSequence d;
    public final gb1 e;
    public final gb1 f;
    public final gb1 g;

    public hb1(d51 d51Var, boolean z, CharSequence charSequence, CharSequence charSequence2, gb1 gb1Var, gb1 gb1Var2, gb1 gb1Var3) {
        this.a = d51Var;
        this.b = z;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = gb1Var;
        this.f = gb1Var2;
        this.g = gb1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.CharSequence] */
    public static hb1 a(hb1 hb1Var, d51 d51Var, boolean z, SpannableStringBuilder spannableStringBuilder, gb1 gb1Var, int i) {
        if ((i & 1) != 0) {
            d51Var = hb1Var.a;
        }
        d51 d51Var2 = d51Var;
        if ((i & 2) != 0) {
            z = hb1Var.b;
        }
        boolean z2 = z;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if ((i & 4) != 0) {
            spannableStringBuilder2 = hb1Var.c;
        }
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
        CharSequence charSequence = hb1Var.d;
        gb1 gb1Var2 = hb1Var.e;
        if ((i & 32) != 0) {
            gb1Var = hb1Var.f;
        }
        gb1 gb1Var3 = hb1Var.g;
        hb1Var.getClass();
        return new hb1(d51Var2, z2, spannableStringBuilder3, charSequence, gb1Var2, gb1Var, gb1Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb1)) {
            return false;
        }
        hb1 hb1Var = (hb1) obj;
        return fni.a(this.a, hb1Var.a) && this.b == hb1Var.b && fni.a(this.c, hb1Var.c) && fni.a(this.d, hb1Var.d) && this.e == hb1Var.e && this.f == hb1Var.f && this.g == hb1Var.g;
    }

    public final int hashCode() {
        int iB = a9h.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + u45.g(this.d, (iB + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31)) * 31;
        gb1 gb1Var = this.g;
        return iHashCode + (gb1Var != null ? gb1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Calling(chatState=" + this.a + ", canShowVideoPreview=" + this.b + ", enableCameraButtonText=" + ((Object) this.c) + ", callTypeDescription=" + ((Object) this.d) + ", negativeActionButton=" + this.e + ", firstActionButton=" + this.f + ", secondActionButton=" + this.g + ")";
    }
}
