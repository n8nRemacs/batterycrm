package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lp {
    public final TextView a;
    public i21 b;
    public i21 c;
    public i21 d;
    public i21 e;
    public i21 f;
    public i21 g;
    public i21 h;
    public final tp i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public lp(TextView textView) {
        this.a = textView;
        this.i = new tp(textView);
    }

    public static i21 c(Context context, ko koVar, int i) {
        ColorStateList colorStateListF;
        synchronized (koVar) {
            colorStateListF = koVar.a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        i21 i21Var = new i21(3);
        i21Var.c = true;
        i21Var.d = colorStateListF;
        return i21Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            n44.c(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            n44.c(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            caj.a(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            caj.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            caj.a(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        caj.a(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, i21 i21Var) {
        if (drawable == null || i21Var == null) {
            return;
        }
        ko.e(drawable, i21Var, this.a.getDrawableState());
    }

    public final void b() {
        i21 i21Var = this.b;
        TextView textView = this.a;
        if (i21Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        i21 i21Var = this.h;
        if (i21Var != null) {
            return (ColorStateList) i21Var.d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        i21 i21Var = this.h;
        if (i21Var != null) {
            return (PorterDuff.Mode) i21Var.e;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, o6d.TextAppearance);
        jdc jdcVar = new jdc(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(o6d.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(o6d.TextAppearance_textAllCaps, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(o6d.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, jdcVar);
        if (typedArrayObtainStyledAttributes.hasValue(o6d.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(o6d.TextAppearance_fontVariationSettings)) != null) {
            jp.d(textView, string);
        }
        jdcVar.B();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        tp tpVar = this.i;
        if (tpVar.j()) {
            DisplayMetrics displayMetrics = tpVar.j.getResources().getDisplayMetrics();
            tpVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (tpVar.h()) {
                tpVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        tp tpVar = this.i;
        if (tpVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = tpVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                tpVar.f = tp.b(iArrCopyOf);
                if (!tpVar.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                tpVar.g = false;
            }
            if (tpVar.h()) {
                tpVar.a();
            }
        }
    }

    public final void k(int i) {
        tp tpVar = this.i;
        if (tpVar.j()) {
            if (i == 0) {
                tpVar.a = 0;
                tpVar.d = -1.0f;
                tpVar.e = -1.0f;
                tpVar.c = -1.0f;
                tpVar.f = new int[0];
                tpVar.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(ho7.f(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = tpVar.j.getResources().getDisplayMetrics();
            tpVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (tpVar.h()) {
                tpVar.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new i21(3);
        }
        i21 i21Var = this.h;
        i21Var.d = colorStateList;
        i21Var.c = colorStateList != null;
        this.b = i21Var;
        this.c = i21Var;
        this.d = i21Var;
        this.e = i21Var;
        this.f = i21Var;
        this.g = i21Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new i21(3);
        }
        i21 i21Var = this.h;
        i21Var.e = mode;
        i21Var.b = mode != null;
        this.b = i21Var;
        this.c = i21Var;
        this.d = i21Var;
        this.e = i21Var;
        this.f = i21Var;
        this.g = i21Var;
    }

    public final void n(Context context, jdc jdcVar) {
        String string;
        int i = o6d.TextAppearance_android_textStyle;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) jdcVar.c;
        this.j = typedArray.getInt(i, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(o6d.TextAppearance_android_textFontWeight, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(o6d.TextAppearance_android_fontFamily) && !typedArray.hasValue(o6d.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(o6d.TextAppearance_android_typeface)) {
                this.m = false;
                int i5 = typedArray.getInt(o6d.TextAppearance_android_typeface, 1);
                if (i5 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i6 = typedArray.hasValue(o6d.TextAppearance_fontFamily) ? o6d.TextAppearance_fontFamily : o6d.TextAppearance_android_fontFamily;
        int i7 = this.k;
        int i8 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceV = jdcVar.v(i6, this.j, new gp(this, i7, i8, new WeakReference(this.a)));
                if (typefaceV != null) {
                    if (i3 < 28 || this.k == -1) {
                        this.l = typefaceV;
                    } else {
                        this.l = kp.a(Typeface.create(typefaceV, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = kp.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
