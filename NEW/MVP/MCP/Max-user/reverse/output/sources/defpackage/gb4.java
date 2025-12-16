package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gb4 implements lw0 {
    public static final gb4 B0 = new gb4("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final df3 C0 = new df3(15);
    public final float A0;
    public final int X;
    public final int Y;
    public final float Z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float o;
    public final int s0;
    public final float t0;
    public final float u0;
    public final boolean v0;
    public final int w0;
    public final int x0;
    public final float y0;
    public final int z0;

    public gb4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            fsi.b(bitmap == null);
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
        this.o = f;
        this.X = i;
        this.Y = i2;
        this.Z = f2;
        this.s0 = i3;
        this.t0 = f4;
        this.u0 = f5;
        this.v0 = z;
        this.w0 = i5;
        this.x0 = i4;
        this.y0 = f3;
        this.z0 = i6;
        this.A0 = f6;
    }

    public final eb4 a() {
        eb4 eb4Var = new eb4();
        eb4Var.a = this.a;
        eb4Var.b = this.d;
        eb4Var.c = this.b;
        eb4Var.d = this.c;
        eb4Var.e = this.o;
        eb4Var.f = this.X;
        eb4Var.g = this.Y;
        eb4Var.h = this.Z;
        eb4Var.i = this.s0;
        eb4Var.j = this.x0;
        eb4Var.k = this.y0;
        eb4Var.l = this.t0;
        eb4Var.m = this.u0;
        eb4Var.n = this.v0;
        eb4Var.o = this.w0;
        eb4Var.p = this.z0;
        eb4Var.q = this.A0;
        return eb4Var;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && gb4.class == obj.getClass()) {
            gb4 gb4Var = (gb4) obj;
            Bitmap bitmap2 = gb4Var.d;
            if (TextUtils.equals(this.a, gb4Var.a) && this.b == gb4Var.b && this.c == gb4Var.c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.o == gb4Var.o && this.X == gb4Var.X && this.Y == gb4Var.Y && this.Z == gb4Var.Z && this.s0 == gb4Var.s0 && this.t0 == gb4Var.t0 && this.u0 == gb4Var.u0 && this.v0 == gb4Var.v0 && this.w0 == gb4Var.w0 && this.x0 == gb4Var.x0 && this.y0 == gb4Var.y0 && this.z0 == gb4Var.z0 && this.A0 == gb4Var.A0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.o), Integer.valueOf(this.X), Integer.valueOf(this.Y), Float.valueOf(this.Z), Integer.valueOf(this.s0), Float.valueOf(this.t0), Float.valueOf(this.u0), Boolean.valueOf(this.v0), Integer.valueOf(this.w0), Integer.valueOf(this.x0), Float.valueOf(this.y0), Integer.valueOf(this.z0), Float.valueOf(this.A0)});
    }
}
