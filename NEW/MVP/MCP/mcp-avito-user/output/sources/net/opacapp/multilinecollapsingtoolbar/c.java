package net.opacapp.multilinecollapsingtoolbar;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;
import l.C43521a;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes7.dex */
final class c {

    /* renamed from: A, reason: collision with root package name */
    public float f419039A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f419040B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f419041C;

    /* renamed from: E, reason: collision with root package name */
    public DecelerateInterpolator f419043E;

    /* renamed from: F, reason: collision with root package name */
    public float f419044F;

    /* renamed from: G, reason: collision with root package name */
    public float f419045G;

    /* renamed from: H, reason: collision with root package name */
    public float f419046H;

    /* renamed from: I, reason: collision with root package name */
    public int f419047I;

    /* renamed from: J, reason: collision with root package name */
    public float f419048J;

    /* renamed from: K, reason: collision with root package name */
    public float f419049K;

    /* renamed from: L, reason: collision with root package name */
    public float f419050L;

    /* renamed from: M, reason: collision with root package name */
    public int f419051M;

    /* renamed from: N, reason: collision with root package name */
    public CharSequence f419052N;

    /* renamed from: O, reason: collision with root package name */
    public Bitmap f419053O;

    /* renamed from: P, reason: collision with root package name */
    public Bitmap f419054P;

    /* renamed from: Q, reason: collision with root package name */
    public StaticLayout f419055Q;

    /* renamed from: R, reason: collision with root package name */
    public float f419056R;

    /* renamed from: S, reason: collision with root package name */
    public float f419057S;

    /* renamed from: T, reason: collision with root package name */
    public float f419058T;

    /* renamed from: a, reason: collision with root package name */
    public final CollapsingToolbarLayout f419060a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f419061b;

    /* renamed from: c, reason: collision with root package name */
    public float f419062c;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f419070k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f419071l;

    /* renamed from: m, reason: collision with root package name */
    public float f419072m;

    /* renamed from: n, reason: collision with root package name */
    public float f419073n;

    /* renamed from: o, reason: collision with root package name */
    public float f419074o;

    /* renamed from: p, reason: collision with root package name */
    public float f419075p;

    /* renamed from: q, reason: collision with root package name */
    public float f419076q;

    /* renamed from: r, reason: collision with root package name */
    public float f419077r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f419078s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f419079t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f419080u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f419081v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f419082w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f419083x;

    /* renamed from: y, reason: collision with root package name */
    public Bitmap f419084y;

    /* renamed from: z, reason: collision with root package name */
    public float f419085z;

    /* renamed from: g, reason: collision with root package name */
    public int f419066g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f419067h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f419068i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f419069j = 15.0f;

    /* renamed from: U, reason: collision with root package name */
    public int f419059U = 3;

    /* renamed from: D, reason: collision with root package name */
    public final TextPaint f419042D = new TextPaint(129);

    /* renamed from: e, reason: collision with root package name */
    public final Rect f419064e = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f419063d = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f419065f = new RectF();

    public c(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f419060a = collapsingToolbarLayout;
    }

    public static int a(float f12, int i12, int i13) {
        float f13 = 1.0f - f12;
        return Color.argb((int) ((Color.alpha(i13) * f12) + (Color.alpha(i12) * f13)), (int) ((Color.red(i13) * f12) + (Color.red(i12) * f13)), (int) ((Color.green(i13) * f12) + (Color.green(i12) * f13)), (int) ((Color.blue(i13) * f12) + (Color.blue(i12) * f13)));
    }

    public static float d(float f12, float f13, float f14, Interpolator interpolator) {
        if (interpolator != null) {
            f14 = interpolator.getInterpolation(f14);
        }
        androidx.interpolator.view.animation.b bVar = a.f419035a;
        return androidx.appcompat.app.r.c(f13, f12, f14, f12);
    }

    public final void b(float f12) {
        boolean z12;
        int i12;
        float f13;
        CharSequence charSequenceConcat;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        boolean z13;
        if (this.f419081v == null) {
            return;
        }
        float fWidth = this.f419064e.width();
        float fWidth2 = this.f419063d.width();
        if (Math.abs(f12 - this.f419069j) < 0.001f) {
            f13 = this.f419069j;
            this.f419085z = 1.0f;
            Typeface typeface = this.f419080u;
            Typeface typeface2 = this.f419078s;
            if (typeface != typeface2) {
                this.f419080u = typeface2;
                z13 = true;
            } else {
                z13 = false;
            }
            z12 = z13;
            i12 = 1;
        } else {
            float f14 = this.f419068i;
            Typeface typeface3 = this.f419080u;
            Typeface typeface4 = this.f419079t;
            if (typeface3 != typeface4) {
                this.f419080u = typeface4;
                z12 = true;
            } else {
                z12 = false;
            }
            if (Math.abs(f12 - f14) < 0.001f) {
                this.f419085z = 1.0f;
            } else {
                this.f419085z = f12 / this.f419068i;
            }
            float f15 = this.f419069j / this.f419068i;
            fWidth = fWidth2 * f15 > fWidth ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            i12 = this.f419059U;
            f13 = f14;
        }
        if (fWidth > 0.0f) {
            z12 = this.f419039A != f13 || this.f419041C || z12;
            this.f419039A = f13;
            this.f419041C = false;
        }
        if (this.f419082w == null || z12) {
            TextPaint textPaint = this.f419042D;
            textPaint.setTextSize(this.f419039A);
            textPaint.setTypeface(this.f419080u);
            CharSequence charSequence = this.f419081v;
            int i13 = (int) fWidth;
            Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment3, 1.0f, 0.0f, false);
            if (staticLayout.getLineCount() > i12) {
                int i14 = i12 - 1;
                CharSequence charSequenceSubSequence = "";
                String strSubSequence = i14 > 0 ? this.f419081v.subSequence(0, staticLayout.getLineEnd(i12 - 2)) : "";
                CharSequence charSequenceSubSequence2 = this.f419081v.subSequence(staticLayout.getLineStart(i14), staticLayout.getLineEnd(i14));
                if (charSequenceSubSequence2.charAt(charSequenceSubSequence2.length() - 1) == ' ') {
                    charSequenceSubSequence = charSequenceSubSequence2.subSequence(charSequenceSubSequence2.length() - 1, charSequenceSubSequence2.length());
                    charSequenceSubSequence2 = charSequenceSubSequence2.subSequence(0, charSequenceSubSequence2.length() - 1);
                }
                charSequenceConcat = TextUtils.concat(strSubSequence, TextUtils.ellipsize(TextUtils.concat(charSequenceSubSequence2, "…", charSequenceSubSequence), textPaint, fWidth, TextUtils.TruncateAt.END));
            } else {
                charSequenceConcat = this.f419081v;
            }
            if (!TextUtils.equals(charSequenceConcat, this.f419082w)) {
                this.f419082w = charSequenceConcat;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                this.f419083x = (this.f419060a.getLayoutDirection() == 1 ? androidx.core.text.m.f44882d : androidx.core.text.m.f44881c).a(charSequenceConcat.length(), charSequenceConcat);
            }
            int i15 = this.f419066g & 8388615;
            if (i15 == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                if (i15 != 5 && i15 != 8388613) {
                    alignment2 = alignment3;
                    this.f419055Q = new StaticLayout(this.f419082w, textPaint, i13, alignment2, 1.0f, 0.0f, false);
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            alignment2 = alignment;
            this.f419055Q = new StaticLayout(this.f419082w, textPaint, i13, alignment2, 1.0f, 0.0f, false);
        }
    }

    public final void c() {
        Bitmap bitmap = this.f419084y;
        if (bitmap != null) {
            bitmap.recycle();
            this.f419084y = null;
        }
        Bitmap bitmap2 = this.f419053O;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f419053O = null;
        }
        Bitmap bitmap3 = this.f419054P;
        if (bitmap3 != null) {
            bitmap3.recycle();
            this.f419054P = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r2 = this;
            android.graphics.Rect r0 = r2.f419064e
            int r1 = r0.width()
            if (r1 <= 0) goto L1e
            int r0 = r0.height()
            if (r0 <= 0) goto L1e
            android.graphics.Rect r0 = r2.f419063d
            int r1 = r0.width()
            if (r1 <= 0) goto L1e
            int r0 = r0.height()
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r2.f419061b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.opacapp.multilinecollapsingtoolbar.c.e():void");
    }

    public final Typeface f(int i12) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = this.f419060a.getContext().obtainStyledAttributes(i12, new int[]{R.attr.fontFamily});
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            return null;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void g() {
        int i12;
        int defaultColor;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f419060a;
        if (collapsingToolbarLayout.getHeight() <= 0 || collapsingToolbarLayout.getWidth() <= 0) {
            return;
        }
        float f12 = this.f419039A;
        b(this.f419069j);
        CharSequence charSequence = this.f419082w;
        this.f419052N = charSequence;
        TextPaint textPaint = this.f419042D;
        float fMeasureText = charSequence != null ? textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f419067h, this.f419083x ? 1 : 0);
        float height = this.f419055Q != null ? r8.getHeight() : 0.0f;
        int i13 = absoluteGravity & 112;
        Rect rect = this.f419064e;
        if (i13 == 48) {
            this.f419073n = rect.top;
        } else if (i13 != 80) {
            this.f419073n = rect.centerY() - (height / 2.0f);
        } else {
            this.f419073n = rect.bottom - height;
        }
        int i14 = absoluteGravity & 8388615;
        if (i14 == 1) {
            this.f419075p = rect.centerX() - (fMeasureText / 2.0f);
        } else if (i14 != 5) {
            this.f419075p = rect.left;
        } else {
            this.f419075p = rect.right - fMeasureText;
        }
        b(this.f419068i);
        StaticLayout staticLayout = this.f419055Q;
        float lineWidth = staticLayout != null ? staticLayout.getLineWidth(0) : 0.0f;
        StaticLayout staticLayout2 = this.f419055Q;
        this.f419058T = staticLayout2 != null ? staticLayout2.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f419066g, this.f419083x ? 1 : 0);
        float height2 = this.f419055Q != null ? r15.getHeight() : 0.0f;
        int i15 = absoluteGravity2 & 112;
        Rect rect2 = this.f419063d;
        if (i15 == 48) {
            this.f419072m = rect2.top;
        } else if (i15 != 80) {
            this.f419072m = rect2.centerY() - (height2 / 2.0f);
        } else {
            this.f419072m = rect2.bottom - height2;
        }
        int i16 = absoluteGravity2 & 8388615;
        if (i16 == 1) {
            this.f419074o = rect2.centerX() - (lineWidth / 2.0f);
        } else if (i16 != 5) {
            this.f419074o = rect2.left;
        } else {
            this.f419074o = rect2.right - lineWidth;
        }
        c();
        j(f12);
        float f13 = this.f419062c;
        RectF rectF = this.f419065f;
        rectF.left = d(rect2.left, rect.left, f13, null);
        rectF.top = d(this.f419072m, this.f419073n, f13, null);
        rectF.right = d(rect2.right, rect.right, f13, null);
        rectF.bottom = d(rect2.bottom, rect.bottom, f13, null);
        this.f419076q = d(this.f419074o, this.f419075p, f13, null);
        this.f419077r = d(this.f419072m, this.f419073n, f13, null);
        j(d(this.f419068i, this.f419069j, f13, this.f419043E));
        androidx.interpolator.view.animation.b bVar = a.f419035a;
        this.f419056R = 1.0f - d(0.0f, 1.0f, 1.0f - f13, bVar);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        collapsingToolbarLayout.postInvalidateOnAnimation();
        this.f419057S = d(1.0f, 0.0f, f13, bVar);
        collapsingToolbarLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f419071l;
        ColorStateList colorStateList2 = this.f419070k;
        if (colorStateList != colorStateList2) {
            int[] iArr = this.f419040B;
            if (iArr != null) {
                i12 = 0;
                defaultColor = colorStateList2.getColorForState(iArr, 0);
            } else {
                i12 = 0;
                defaultColor = colorStateList2.getDefaultColor();
            }
            int[] iArr2 = this.f419040B;
            textPaint.setColor(a(f13, defaultColor, iArr2 != null ? this.f419071l.getColorForState(iArr2, i12) : this.f419071l.getDefaultColor()));
        } else {
            int[] iArr3 = this.f419040B;
            textPaint.setColor(iArr3 != null ? colorStateList.getColorForState(iArr3, 0) : colorStateList.getDefaultColor());
        }
        textPaint.setShadowLayer(d(this.f419048J, this.f419044F, f13, null), d(this.f419049K, this.f419045G, f13, null), d(this.f419050L, this.f419046H, f13, null), a(f13, this.f419051M, this.f419047I));
        collapsingToolbarLayout.postInvalidateOnAnimation();
    }

    public final void h(int i12) {
        TypedArray typedArrayObtainStyledAttributes = this.f419060a.getContext().obtainStyledAttributes(i12, C43521a.m.f413375x);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f419071l = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f419069j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) this.f419069j);
        }
        this.f419047I = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f419045G = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f419046H = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f419044F = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f419078s = f(i12);
        g();
    }

    public final void i(int i12) {
        TypedArray typedArrayObtainStyledAttributes = this.f419060a.getContext().obtainStyledAttributes(i12, C43521a.m.f413375x);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f419070k = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f419068i = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) this.f419068i);
        }
        this.f419051M = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f419049K = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f419050L = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f419048J = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f419079t = f(i12);
        g();
    }

    public final void j(float f12) {
        b(f12);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        this.f419060a.postInvalidateOnAnimation();
    }
}
