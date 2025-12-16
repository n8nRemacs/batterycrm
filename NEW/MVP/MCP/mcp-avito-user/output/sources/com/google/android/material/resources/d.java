package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.i;
import com.google.android.material.R;
import j.InterfaceC42168y;
import j.N;
import j.P;
import j.f0;
import j.k0;

/* compiled from: TextAppearance.java */
@RestrictTo
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final ColorStateList f356987a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f356988b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356989c;

    /* renamed from: d, reason: collision with root package name */
    public final int f356990d;

    /* renamed from: e, reason: collision with root package name */
    public final float f356991e;

    /* renamed from: f, reason: collision with root package name */
    public final float f356992f;

    /* renamed from: g, reason: collision with root package name */
    public final float f356993g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f356994h;

    /* renamed from: i, reason: collision with root package name */
    public final float f356995i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public ColorStateList f356996j;

    /* renamed from: k, reason: collision with root package name */
    public float f356997k;

    /* renamed from: l, reason: collision with root package name */
    @InterfaceC42168y
    public final int f356998l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356999m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f357000n;

    /* compiled from: TextAppearance.java */
    public class a extends i.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f357001a;

        public a(g gVar) {
            this.f357001a = gVar;
        }

        @Override // androidx.core.content.res.i.f
        public final void b(int i12) {
            d.this.f356999m = true;
            this.f357001a.a(i12);
        }

        @Override // androidx.core.content.res.i.f
        public final void c(@N Typeface typeface) {
            d dVar = d.this;
            dVar.f357000n = Typeface.create(typeface, dVar.f356989c);
            dVar.f356999m = true;
            this.f357001a.b(dVar.f357000n, false);
        }
    }

    public d(@N Context context, @f0 int i12) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, R.styleable.TextAppearance);
        this.f356997k = typedArrayObtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.f356996j = c.b(typedArrayObtainStyledAttributes, context, R.styleable.TextAppearance_android_textColor);
        c.b(typedArrayObtainStyledAttributes, context, R.styleable.TextAppearance_android_textColorHint);
        c.b(typedArrayObtainStyledAttributes, context, R.styleable.TextAppearance_android_textColorLink);
        this.f356989c = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.f356990d = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int i13 = R.styleable.TextAppearance_fontFamily;
        i13 = typedArrayObtainStyledAttributes.hasValue(i13) ? i13 : R.styleable.TextAppearance_android_fontFamily;
        this.f356998l = typedArrayObtainStyledAttributes.getResourceId(i13, 0);
        this.f356988b = typedArrayObtainStyledAttributes.getString(i13);
        typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f356987a = c.b(typedArrayObtainStyledAttributes, context, R.styleable.TextAppearance_android_shadowColor);
        this.f356991e = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f356992f = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f356993g = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i12, R.styleable.MaterialTextAppearance);
        this.f356994h = typedArrayObtainStyledAttributes2.hasValue(R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.f356995i = typedArrayObtainStyledAttributes2.getFloat(R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f357000n;
        int i12 = this.f356989c;
        if (typeface == null && (str = this.f356988b) != null) {
            this.f357000n = Typeface.create(str, i12);
        }
        if (this.f357000n == null) {
            int i13 = this.f356990d;
            if (i13 == 1) {
                this.f357000n = Typeface.SANS_SERIF;
            } else if (i13 == 2) {
                this.f357000n = Typeface.SERIF;
            } else if (i13 != 3) {
                this.f357000n = Typeface.DEFAULT;
            } else {
                this.f357000n = Typeface.MONOSPACE;
            }
            this.f357000n = Typeface.create(this.f357000n, i12);
        }
    }

    @N
    @k0
    public final Typeface b(@N Context context) {
        if (this.f356999m) {
            return this.f357000n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceC = i.c(this.f356998l, context);
                this.f357000n = typefaceC;
                if (typefaceC != null) {
                    this.f357000n = Typeface.create(typefaceC, this.f356989c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f356999m = true;
        return this.f357000n;
    }

    public final void c(@N Context context, @N g gVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i12 = this.f356998l;
        if (i12 == 0) {
            this.f356999m = true;
        }
        if (this.f356999m) {
            gVar.b(this.f357000n, true);
            return;
        }
        try {
            a aVar = new a(gVar);
            ThreadLocal<TypedValue> threadLocal = i.f44673a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                i.d(context, i12, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f356999m = true;
            gVar.a(1);
        } catch (Exception unused2) {
            this.f356999m = true;
            gVar.a(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceD = null;
        int i12 = this.f356998l;
        if (i12 != 0) {
            ThreadLocal<TypedValue> threadLocal = i.f44673a;
            if (!context.isRestricted()) {
                typefaceD = i.d(context, i12, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceD != null;
    }

    public final void e(@N Context context, @N TextPaint textPaint, @N g gVar) {
        f(context, textPaint, gVar);
        ColorStateList colorStateList = this.f356996j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f356987a;
        textPaint.setShadowLayer(this.f356993g, this.f356991e, this.f356992f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(@N Context context, @N TextPaint textPaint, @N g gVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f357000n);
        c(context, new e(this, context, textPaint, gVar));
    }

    public final void g(@N Context context, @N TextPaint textPaint, @N Typeface typeface) {
        Typeface typefaceA = h.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i12 = (~typeface.getStyle()) & this.f356989c;
        textPaint.setFakeBoldText((i12 & 1) != 0);
        textPaint.setTextSkewX((i12 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f356997k);
        if (this.f356994h) {
            textPaint.setLetterSpacing(this.f356995i);
        }
    }
}
