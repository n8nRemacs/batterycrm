package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class w2b extends View implements u6g, be6 {
    public static final /* synthetic */ yy7[] O0 = {new z8a(w2b.class, "textFont", "getTextFont()Lone/me/sdk/design/dynamicfont/DynamicFont;"), u45.h(vid.a, w2b.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;"), new z8a(w2b.class, "appearance", "getAppearance()Lone/me/common/counter/OneMeCounter$Appearance;"), new z8a(w2b.class, "hasBackgroundStroke", "getHasBackgroundStroke()Z"), new z8a(w2b.class, "hasBackground", "getHasBackground()Z")};
    public final int A0;
    public final GradientDrawable B0;
    public boolean C0;
    public final v2b D0;
    public final v2b E0;
    public final TextPaint F0;
    public final v2b G0;
    public final v2b H0;
    public final v2b I0;
    public long J0;
    public Interpolator K0;
    public int L0;
    public int M0;
    public int N0;
    public boolean a;
    public int b;
    public String c;
    public ValueAnimator d;
    public float o;
    public StaticLayout s0;
    public StaticLayout t0;
    public StaticLayout u0;
    public StaticLayout v0;
    public int w0;
    public int x0;
    public final int y0;
    public final int z0;

    public w2b(Context context) {
        super(context, null);
        this.b = -1;
        this.c = "";
        this.M0 = 4;
        this.o = 1.0f;
        float f = 20;
        this.y0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.z0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        this.A0 = kti.d(6 * vw4.d().getDisplayMetrics().density);
        float f2 = vw4.d().getDisplayMetrics().density * 20.0f;
        GradientDrawable gradientDrawableF = uga.f(null, null, null, new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        this.B0 = gradientDrawableF;
        this.D0 = new v2b(this, 0);
        this.E0 = new v2b(dpg.k, this);
        TextPaint textPaint = new TextPaint(1);
        wsf.j(this, textPaint, getTypography());
        this.F0 = textPaint;
        this.G0 = new v2b(this, 2);
        this.H0 = new v2b(this, 3);
        this.I0 = new v2b(this, 4);
        this.J0 = 400L;
        this.L0 = 255;
        this.N0 = 2;
        setBackground(gradientDrawableF);
        f(a93.s0.y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t75 getTextFont() {
        yy7 yy7Var = O0[0];
        return (t75) this.D0.b;
    }

    private final t5g getTypography() {
        yy7 yy7Var = O0[1];
        return (t5g) this.E0.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCounter$lambda$16(w2b w2bVar) {
        ValueAnimator valueAnimator = w2bVar.d;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private final void setCounterWithoutAnimation(int i) {
        this.b = i;
        this.x0 = this.w0;
        String strA = pmf.a(i);
        int iMeasureText = (int) this.F0.measureText(strA);
        this.w0 = iMeasureText;
        this.s0 = i(iMeasureText, strA);
        if (this.w0 != this.x0) {
            requestLayout();
        }
        invalidate();
    }

    private final void setTextFont(t75 t75Var) {
        this.D0.O(this, O0[0], t75Var);
    }

    private final void setTypographyInternal(t5g t5gVar) {
        this.E0.O(this, O0[1], t5gVar);
    }

    @Override // defpackage.be6
    public final void a(t75 t75Var) {
        this.C0 = true;
        setTextFont(t75Var);
        getTypography().a(getContext(), this.F0, getResources().getDisplayMetrics(), t75Var);
        int iV = az1.v(this.N0);
        if (iV == 0) {
            int i = this.b;
            this.b = -1;
            ValueAnimator valueAnimator = this.d;
            g(i, valueAnimator != null && valueAnimator.isStarted());
        } else if (iV == 1) {
            this.N0 = 2;
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            this.b = 0;
            this.s0 = null;
            requestLayout();
        } else if (iV == 2) {
            h();
        } else {
            if (iV != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setText(this.c);
        }
        this.C0 = false;
        requestLayout();
        invalidate();
    }

    public final int d(String str) {
        if (str.length() == 0) {
            throw new NoSuchElementException();
        }
        String strValueOf = String.valueOf(str.charAt(0));
        TextPaint textPaint = this.F0;
        float fMeasureText = textPaint.measureText(strValueOf);
        int iY = vmf.y(str);
        int i = 1;
        if (1 <= iY) {
            while (true) {
                fMeasureText = Math.max(fMeasureText, textPaint.measureText(String.valueOf(str.charAt(i))));
                if (i == iY) {
                    break;
                }
                i++;
            }
        }
        return (int) fMeasureText;
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.s0;
        if (staticLayout != null) {
            int iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.w0) / 2.0f, (getHeight() - staticLayout.getHeight()) / 2.0f);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.yeb r11) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2b.f(yeb):void");
    }

    public final void g(int i, boolean z) {
        int i2;
        int i3;
        int i4 = this.b;
        if ((i4 == -1 && i <= 0) || i == i4 || fni.a(pmf.a(i), pmf.a(this.b))) {
            return;
        }
        this.N0 = 1;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z || this.N0 == 2 || ((i2 = this.b) == 0 && i > 0)) {
            setCounterWithoutAnimation(i);
            return;
        }
        int i5 = 3;
        if (i2 < 0) {
            this.F0.setAlpha(0);
            this.B0.setAlpha(0);
            i3 = 1;
        } else {
            i3 = 3;
        }
        this.M0 = i3;
        this.o = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        int i6 = this.M0;
        int[] iArr = u2b.$EnumSwitchMapping$0;
        valueAnimatorOfFloat.setInterpolator(iArr[az1.v(i6)] == 1 ? this.K0 : null);
        valueAnimatorOfFloat.setDuration(iArr[az1.v(this.M0)] == 1 ? this.J0 : 150L);
        valueAnimatorOfFloat.addUpdateListener(new q00(18, this));
        valueAnimatorOfFloat.addListener(new kh(valueAnimatorOfFloat, 0, new fr7(24, this)));
        this.d = valueAnimatorOfFloat;
        String strA = pmf.a(i);
        String strA2 = pmf.a(this.b);
        if (this.s0 != null) {
            if (strA2.length() == strA.length()) {
                int iD = d(strA2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA2);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strA);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strA);
                int length = strA2.length();
                for (int i7 = 0; i7 < length; i7++) {
                    if (strA2.charAt(i7) == strA.charAt(i7)) {
                        int i8 = i7 + 1;
                        spannableStringBuilder.setSpan(new s2b(), i7, i8, 0);
                        spannableStringBuilder2.setSpan(new s2b(), i7, i8, 0);
                        spannableStringBuilder3.setSpan(new t2b(iD), i7, i8, 0);
                    } else {
                        int i9 = i7 + 1;
                        spannableStringBuilder.setSpan(new t2b(iD), i7, i9, 0);
                        spannableStringBuilder2.setSpan(new t2b(iD), i7, i9, 0);
                        spannableStringBuilder3.setSpan(new s2b(), i7, i9, 0);
                    }
                }
                int length2 = strA2.length() * iD;
                this.t0 = i(length2, spannableStringBuilder);
                this.v0 = i(length2, spannableStringBuilder3);
                this.u0 = i(length2, spannableStringBuilder2);
            } else {
                this.t0 = this.s0;
            }
        }
        this.x0 = this.w0;
        this.a = i > this.b;
        if (i >= 0) {
            int iD2 = d(strA);
            this.w0 = strA.length() * iD2;
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(strA);
            int length3 = strA.length();
            for (int i10 = 0; i10 < length3; i10++) {
                if (strA.charAt(i10) != pmf.a.getDecimalFormatSymbols().getDecimalSeparator()) {
                    spannableStringBuilder4.setSpan(new t2b(iD2), i10, i10 + 1, 0);
                }
            }
            this.s0 = i(this.w0, spannableStringBuilder4);
        }
        this.b = i;
        if (this.w0 != this.x0) {
            requestLayout();
        }
        post(new awa(i5, this));
    }

    public final r2b getAppearance() {
        yy7 yy7Var = O0[2];
        return (r2b) this.G0.b;
    }

    public final boolean getHasBackground() {
        yy7 yy7Var = O0[4];
        return ((Boolean) this.I0.b).booleanValue();
    }

    public final boolean getHasBackgroundStroke() {
        yy7 yy7Var = O0[3];
        return ((Boolean) this.H0.b).booleanValue();
    }

    public final long getReplaceDuration() {
        return this.J0;
    }

    public final Interpolator getReplaceInterpolator() {
        return this.K0;
    }

    public final void h() {
        this.N0 = 3;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.b = 0;
        int iMeasureText = (int) this.F0.measureText("!");
        this.w0 = iMeasureText;
        this.s0 = i(iMeasureText, "!");
        if (this.w0 != this.x0) {
            requestLayout();
        }
        invalidate();
    }

    public final StaticLayout i(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.F0, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setMaxLines(1).build();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        int i;
        super.onDraw(canvas);
        float f = this.o;
        boolean z = f == 1.0f;
        TextPaint textPaint = this.F0;
        if (!z && ((i = this.M0) == 1 || i == 2)) {
            e(canvas);
            this.B0.setAlpha((int) (this.o * 255));
            textPaint.setAlpha((int) (this.o * this.L0));
            return;
        }
        if ((f == 1.0f) || this.M0 != 3) {
            if (f == 1.0f) {
                e(canvas);
                return;
            }
            return;
        }
        float f2 = f * 2;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        canvas.save();
        StaticLayout staticLayout = this.u0;
        if (staticLayout != null) {
            float height = ((getHeight() - staticLayout.getHeight()) / 2.0f) + ((1.0f - f2) * kti.d((this.a ? 13 : -13) * vw4.d().getDisplayMetrics().density));
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.w0) / 2.0f, height);
            try {
                textPaint.setAlpha((int) (this.L0 * f2));
                staticLayout.draw(canvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            StaticLayout staticLayout2 = this.s0;
            if (staticLayout2 != null) {
                float height2 = ((getHeight() - staticLayout2.getHeight()) / 2.0f) + ((1.0f - f2) * kti.d((this.a ? 13 : -13) * vw4.d().getDisplayMetrics().density));
                iSave = canvas.save();
                canvas.translate((canvas.getWidth() - this.w0) / 2.0f, height2);
                try {
                    textPaint.setAlpha((int) (this.L0 * f2));
                    staticLayout2.draw(canvas);
                    canvas.restoreToCount(iSave);
                } finally {
                }
            }
        }
        StaticLayout staticLayout3 = this.t0;
        if (staticLayout3 != null) {
            float height3 = ((getHeight() - staticLayout3.getHeight()) / 2.0f) + (kti.d((this.a ? -13 : 13) * vw4.d().getDisplayMetrics().density) * f2);
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.w0) / 2.0f, height3);
            try {
                textPaint.setAlpha((int) ((1.0f - f2) * this.L0));
                staticLayout3.draw(canvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
        StaticLayout staticLayout4 = this.v0;
        if (staticLayout4 != null) {
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.w0) / 2.0f, (getHeight() - this.v0.getHeight()) / 2.0f);
            try {
                textPaint.setAlpha(this.L0);
                staticLayout4.draw(canvas);
            } finally {
            }
        }
        textPaint.setAlpha(this.L0);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMeasureText;
        super.onMeasure(i, i2);
        int i3 = this.N0;
        TextPaint textPaint = this.F0;
        if (i3 != 4) {
            String strA = pmf.a(this.b);
            iMeasureText = d(strA) * strA.length();
        } else {
            iMeasureText = ((int) textPaint.measureText(this.c)) + 8;
            this.w0 = iMeasureText;
        }
        if (getHasBackground()) {
            int i4 = this.y0;
            iMeasureText = iMeasureText > i4 / 2 ? iMeasureText + (this.A0 * 2) : i4;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        setMeasuredDimension(iMeasureText, Math.max((int) Math.ceil(fontMetrics.descent - fontMetrics.ascent), this.z0));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        f(yebVar);
    }

    public final void setAppearance(r2b r2bVar) {
        this.G0.O(this, O0[2], r2bVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        f(a93.s0.y(this));
    }

    public final void setHasBackground(boolean z) {
        this.I0.O(this, O0[4], Boolean.valueOf(z));
    }

    public final void setHasBackgroundStroke(boolean z) {
        this.H0.O(this, O0[3], Boolean.valueOf(z));
    }

    public final void setReplaceDuration(long j) {
        this.J0 = j;
    }

    public final void setReplaceInterpolator(Interpolator interpolator) {
        this.K0 = interpolator;
    }

    public final void setText(String str) {
        if (vmf.F(str)) {
            this.c = "";
            this.N0 = 2;
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.b = 0;
            this.s0 = null;
            requestLayout();
            return;
        }
        this.N0 = 4;
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.b = 0;
        this.c = str;
        int iMeasureText = ((int) this.F0.measureText(str)) + 8;
        this.w0 = iMeasureText;
        this.s0 = i(iMeasureText, str);
        if (this.w0 != this.x0) {
            requestLayout();
        }
        invalidate();
    }

    public final void setTextColor(int i) {
        int iB = zob.b(i, 1.0f);
        TextPaint textPaint = this.F0;
        textPaint.setColor(iB);
        this.L0 = textPaint.getAlpha();
        invalidate();
    }

    public final void setTypography(t5g t5gVar) {
        setTypographyInternal(t5gVar);
    }
}
