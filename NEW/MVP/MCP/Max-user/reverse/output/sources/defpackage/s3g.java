package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class s3g {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public s3g(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, z5d.TextAppearance);
        this.k = typedArrayObtainStyledAttributes.getDimension(z5d.TextAppearance_android_textSize, 0.0f);
        this.j = gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_textColor);
        gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_textColorHint);
        gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_textColorLink);
        this.c = typedArrayObtainStyledAttributes.getInt(z5d.TextAppearance_android_textStyle, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(z5d.TextAppearance_android_typeface, 1);
        int i2 = z5d.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : z5d.TextAppearance_android_fontFamily;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(z5d.TextAppearance_textAllCaps, false);
        this.a = gti.c(context, typedArrayObtainStyledAttributes, z5d.TextAppearance_android_shadowColor);
        this.e = typedArrayObtainStyledAttributes.getFloat(z5d.TextAppearance_android_shadowDx, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(z5d.TextAppearance_android_shadowDy, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(z5d.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, z5d.MaterialTextAppearance);
        this.h = typedArrayObtainStyledAttributes2.hasValue(z5d.MaterialTextAppearance_android_letterSpacing);
        this.i = typedArrayObtainStyledAttributes2.getFloat(z5d.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = lod.a(context, this.l);
                this.n = typefaceA;
                if (typefaceA != null) {
                    this.n = Typeface.create(typefaceA, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.b, e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, h2f h2fVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            h2fVar.d(this.n, true);
            return;
        }
        try {
            q3g q3gVar = new q3g(this, h2fVar);
            ThreadLocal threadLocal = lod.a;
            if (context.isRestricted()) {
                q3gVar.a(-4);
            } else {
                lod.b(context, i, new TypedValue(), 0, q3gVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            h2fVar.c(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.m = true;
            h2fVar.c(-3);
        }
    }

    public final boolean d(Context context) throws InterruptedException, Resources.NotFoundException {
        Typeface typefaceB = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal threadLocal = lod.a;
            if (!context.isRestricted()) {
                typefaceB = lod.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, h2f h2fVar) {
        f(context, textPaint, h2fVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, h2f h2fVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new r3g(this, context, textPaint, h2fVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceG = jni.g(context.getResources().getConfiguration(), typeface);
        if (typefaceG != null) {
            typeface = typefaceG;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
