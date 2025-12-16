package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.widget.TextView;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class t5g {
    public final boolean a;
    public final EnumMap b;
    public final EnumMap c;
    public final boolean d;
    public final long e;
    public final String f;
    public final int g;

    public t5g(boolean z, EnumMap enumMap, EnumMap enumMap2, boolean z2, long j, String str, int i) {
        this.a = z;
        this.b = enumMap;
        this.c = enumMap2;
        this.d = z2;
        this.e = j;
        this.f = str;
        this.g = i;
    }

    public static /* synthetic */ void c(t5g t5gVar, Context context, TextPaint textPaint, DisplayMetrics displayMetrics, t75 t75Var, int i) {
        if ((i & 4) != 0) {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        if ((i & 8) != 0) {
            t75Var = t75.b;
        }
        t5gVar.a(context, textPaint, displayMetrics, t75Var);
    }

    public final void a(Context context, TextPaint textPaint, DisplayMetrics displayMetrics, t75 t75Var) {
        textPaint.setTypeface(vog.a(context, Typeface.create(this.f, 0), u45.b(this.g)));
        textPaint.setLetterSpacing(sw4.c(this.e, displayMetrics));
        EnumMap enumMap = this.b;
        sw4 sw4Var = (sw4) enumMap.get(t75Var);
        if (sw4Var == null) {
            sw4Var = (sw4) ue3.F(enumMap.values());
        }
        textPaint.setTextSize(sw4.c(sw4Var.a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
    }

    public final void b(TextView textView, t75 t75Var) {
        textView.setTag(z9b.a, this);
        EnumMap enumMap = this.b;
        sw4 sw4Var = (sw4) enumMap.get(t75Var);
        if (sw4Var == null) {
            sw4Var = (sw4) ue3.F(enumMap.values());
        }
        textView.setAllCaps(this.a);
        long j = sw4Var.a;
        textView.setTextSize((int) (j >> 32), sw4.d(j));
        EnumMap enumMap2 = this.c;
        sw4 sw4Var2 = (sw4) enumMap2.get(t75Var);
        if (sw4Var2 == null) {
            sw4Var2 = (sw4) ue3.F(enumMap2.values());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight((int) sw4.c(sw4Var2.a, textView.getResources().getDisplayMetrics()));
        }
        textView.setIncludeFontPadding(this.d);
        textView.setLetterSpacing(sw4.c(this.e, textView.getResources().getDisplayMetrics()));
        textView.setTypeface(vog.a(textView.getContext(), Typeface.create(this.f, 0), u45.b(this.g)));
    }

    public final long e(t75 t75Var) {
        EnumMap enumMap = this.b;
        sw4 sw4Var = (sw4) enumMap.get(t75Var);
        return sw4Var != null ? sw4Var.a : ((sw4) ue3.F(enumMap.values())).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5g)) {
            return false;
        }
        t5g t5gVar = (t5g) obj;
        return this.a == t5gVar.a && fni.a(this.b, t5gVar.b) && fni.a(this.c, t5gVar.c) && this.d == t5gVar.d && this.e == t5gVar.e && fni.a(this.f, t5gVar.f) && this.g == t5gVar.g;
    }

    public final int hashCode() {
        return az1.v(this.g) + u45.e(a9h.a(a9h.b((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strD = a9h.d(this.e, "Dimension(encodedValue=", ")");
        StringBuilder sb = new StringBuilder("TextStyle(textAllCaps=");
        sb.append(this.a);
        sb.append(", textSizes=");
        sb.append(this.b);
        sb.append(", lineHeights=");
        sb.append(this.c);
        sb.append(", includeFontPadding=");
        sb.append(this.d);
        sb.append(", letterSpacing=");
        ho7.r(sb, strD, ", fontFamily=", this.f, ", fontWeight=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "Bold" : "Semibold" : "Medium" : "Regular");
        sb.append(")");
        return sb.toString();
    }

    public t5g(boolean z, long j, long j2, boolean z2, long j3, String str, int i) {
        EnumMap enumMap = new EnumMap(t75.class);
        t75 t75Var = t75.b;
        EnumMap enumMapS = xrf.s(j, enumMap, t75Var, t75.class);
        xrf.t(j2, enumMapS, t75Var);
        this(z, enumMap, enumMapS, z2, j3, str, i);
    }
}
