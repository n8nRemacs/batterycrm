package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class sga extends xta implements ga5 {
    public static final Pattern E0 = Pattern.compile("[\\.,…\\:\\s]*$", 32);
    public static final TextPaint F0 = new TextPaint(1);
    public float A0;
    public boolean B0;
    public int C0;
    public final rga D0;
    public final Pattern a;
    public final Rect b;
    public StaticLayout c;
    public CharSequence d;
    public CharSequence o;
    public boolean s0;
    public final float t0;
    public float u0;
    public boolean v0;
    public u4g w0;
    public int x0;
    public Typeface y0;
    public float z0;

    public sga(Context context) {
        super(context, null, 0);
        this.a = E0;
        this.b = new Rect();
        this.t0 = 1.0f;
        this.x0 = -16777216;
        TextPaint textPaint = F0;
        this.y0 = textPaint.getTypeface();
        this.z0 = textPaint.getLetterSpacing();
        this.A0 = textPaint.getTextSize();
        this.B0 = textPaint.isElegantTextHeight();
        this.C0 = 2;
        this.D0 = new rga(this, context);
    }

    public static final void e(sga sgaVar, TextPaint textPaint) {
        textPaint.setTypeface(sgaVar.y0);
        textPaint.setLetterSpacing(sgaVar.z0);
        textPaint.setTextSize(sgaVar.A0);
        textPaint.setColor(sgaVar.x0);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
    }

    private final int getFullyVisibleLinesCount() throws Throwable {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / g((getWidth() - getPaddingLeft()) - getPaddingRight(), "").getLineBottom(0);
    }

    private final int getLinesCount() throws Throwable {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    private final void setContent(CharSequence charSequence) {
        if (fni.a(this.d, charSequence)) {
            return;
        }
        h();
        this.d = charSequence;
        this.w0 = null;
        this.s0 = true;
        if (isAttachedToWindow()) {
            f();
        }
        invalidate();
        requestLayout();
    }

    @Override // defpackage.ga5
    public final boolean a() {
        return getVisibility() == 0;
    }

    @Override // defpackage.ga5
    public final Rect b() {
        StaticLayout staticLayout = this.c;
        Rect rect = this.b;
        if (staticLayout == null) {
            rect.setEmpty();
            return rect;
        }
        if (staticLayout.getLineCount() <= 0) {
            rect.setEmpty();
            return rect;
        }
        int lineStart = staticLayout.getLineStart(0);
        float lineWidth = staticLayout.getLineWidth(0);
        rect.top = staticLayout.getLineTop(0);
        rect.bottom = staticLayout.getLineTop(1);
        rect.left = lineStart;
        rect.right = (int) (lineStart + lineWidth);
        return rect;
    }

    @Override // defpackage.ga5
    public final void c(yeb yebVar) {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            a8i.b(charSequence, yebVar);
        }
        invalidate();
    }

    @Override // defpackage.ga5
    public final float d(String str) {
        TextPaint textPaint = F0;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            e(this, textPaint);
            return textPaint.measureText(str);
        } finally {
            textPaint.setStrokeWidth(strokeWidth);
            textPaint.setColor(color);
            textPaint.setAlpha(alpha);
            textPaint.setStyle(style);
            textPaint.setStrokeCap(strokeCap);
            textPaint.setStrokeJoin(strokeJoin);
            textPaint.setStrokeMiter(strokeMiter);
            textPaint.setTypeface(typeface);
            textPaint.setLetterSpacing(letterSpacing);
            textPaint.setTextSize(textSize);
            textPaint.setLinearText(zIsLinearText);
            textPaint.setSubpixelText(zIsSubpixelText);
            textPaint.setAntiAlias(zIsAntiAlias);
        }
    }

    public final void f() {
        CharSequence charSequence = this.d;
        Object[] spans = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        try {
            spans = spanned.getSpans(0, spanned.length(), igh.class);
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new igh[0];
        }
        for (Object obj : spans) {
            ((igh) obj).attach(this);
        }
    }

    public final StaticLayout g(int i, CharSequence charSequence) throws Throwable {
        float f;
        TextPaint textPaint = F0;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            e(this, textPaint);
            try {
                try {
                    try {
                        try {
                            try {
                                f = strokeMiter;
                            } catch (Throwable th) {
                                th = th;
                                f = strokeMiter;
                                textSize = textSize;
                                zIsLinearText = zIsLinearText;
                                zIsSubpixelText = zIsSubpixelText;
                                zIsAntiAlias = zIsAntiAlias;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            f = strokeMiter;
                            textSize = textSize;
                            zIsLinearText = zIsLinearText;
                            zIsSubpixelText = zIsSubpixelText;
                        }
                        try {
                            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, this.t0, this.u0, this.B0);
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(f);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(zIsLinearText);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(zIsAntiAlias);
                            return staticLayout;
                        } catch (Throwable th3) {
                            th = th3;
                            typeface = typeface;
                            letterSpacing = letterSpacing;
                            textSize = textSize;
                            zIsLinearText = zIsLinearText;
                            zIsSubpixelText = zIsSubpixelText;
                            zIsAntiAlias = zIsAntiAlias;
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(f);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(zIsLinearText);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(zIsAntiAlias);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        f = strokeMiter;
                        textSize = textSize;
                        zIsLinearText = zIsLinearText;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    f = strokeMiter;
                    textSize = textSize;
                }
            } catch (Throwable th6) {
                th = th6;
                f = strokeMiter;
            }
        } catch (Throwable th7) {
            th = th7;
            f = strokeMiter;
        }
    }

    @Override // defpackage.ga5
    public View getAsView() {
        return this;
    }

    @Override // defpackage.ga5
    public int getLineHeight() {
        Paint.FontMetricsInt fontMetricsInt;
        TextPaint paint;
        StaticLayout staticLayout = this.c;
        if (staticLayout == null || (paint = staticLayout.getPaint()) == null || (fontMetricsInt = paint.getFontMetricsInt()) == null) {
            TextPaint textPaint = F0;
            float strokeWidth = textPaint.getStrokeWidth();
            int color = textPaint.getColor();
            int alpha = textPaint.getAlpha();
            Paint.Style style = textPaint.getStyle();
            Paint.Cap strokeCap = textPaint.getStrokeCap();
            Paint.Join strokeJoin = textPaint.getStrokeJoin();
            float strokeMiter = textPaint.getStrokeMiter();
            Typeface typeface = textPaint.getTypeface();
            float letterSpacing = textPaint.getLetterSpacing();
            float textSize = textPaint.getTextSize();
            boolean zIsLinearText = textPaint.isLinearText();
            boolean zIsSubpixelText = textPaint.isSubpixelText();
            boolean zIsAntiAlias = textPaint.isAntiAlias();
            try {
                e(this, textPaint);
                Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
                textPaint.setStrokeWidth(strokeWidth);
                textPaint.setColor(color);
                textPaint.setAlpha(alpha);
                textPaint.setStyle(style);
                textPaint.setStrokeCap(strokeCap);
                textPaint.setStrokeJoin(strokeJoin);
                textPaint.setStrokeMiter(strokeMiter);
                textPaint.setTypeface(typeface);
                textPaint.setLetterSpacing(letterSpacing);
                textPaint.setTextSize(textSize);
                textPaint.setLinearText(zIsLinearText);
                textPaint.setSubpixelText(zIsSubpixelText);
                textPaint.setAntiAlias(zIsAntiAlias);
                fontMetricsInt = fontMetricsInt2;
            } catch (Throwable th) {
                textPaint.setStrokeWidth(strokeWidth);
                textPaint.setColor(color);
                textPaint.setAlpha(alpha);
                textPaint.setStyle(style);
                textPaint.setStrokeCap(strokeCap);
                textPaint.setStrokeJoin(strokeJoin);
                textPaint.setStrokeMiter(strokeMiter);
                textPaint.setTypeface(typeface);
                textPaint.setLetterSpacing(letterSpacing);
                textPaint.setTextSize(textSize);
                textPaint.setLinearText(zIsLinearText);
                textPaint.setSubpixelText(zIsSubpixelText);
                textPaint.setAntiAlias(zIsAntiAlias);
                throw th;
            }
        }
        return (int) (((fontMetricsInt.descent - fontMetricsInt.ascent) * this.t0) + this.u0);
    }

    public int getMaxLinesValue() {
        return this.C0;
    }

    @Override // defpackage.xta, defpackage.ga5
    public CharSequence getSpannableText() {
        return this.d;
    }

    public int getTextColor() {
        return this.x0;
    }

    @Override // defpackage.ga5
    public CharSequence getTextValue() {
        return this.d;
    }

    public final void h() {
        CharSequence charSequence = this.d;
        Object[] spans = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        try {
            spans = spanned.getSpans(0, spanned.length(), igh.class);
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new igh[0];
        }
        for (Object obj : spans) {
            ((igh) obj).detach(this);
        }
    }

    public final void i(t5g t5gVar) throws Throwable {
        this.y0 = vog.a(getContext(), Typeface.create(t5gVar.f, 0), u45.b(t5gVar.g));
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.z0 = sw4.c(t5gVar.e, displayMetrics);
        t75 t75Var = t75.b;
        this.A0 = sw4.c(t5gVar.e(t75Var), displayMetrics);
        EnumMap enumMap = t5gVar.c;
        sw4 sw4Var = (sw4) enumMap.get(t75Var);
        if (sw4Var == null) {
            sw4Var = (sw4) ue3.F(enumMap.values());
        }
        float fC = sw4.c(sw4Var.a, displayMetrics);
        TextPaint textPaint = F0;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            e(this, textPaint);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            try {
                float f = fontMetrics.descent - fontMetrics.ascent;
                textPaint.setStrokeWidth(strokeWidth);
                textPaint.setColor(color);
                textPaint.setAlpha(alpha);
                textPaint.setStyle(style);
                textPaint.setStrokeCap(strokeCap);
                textPaint.setStrokeJoin(strokeJoin);
                textPaint.setStrokeMiter(strokeMiter);
                textPaint.setTypeface(typeface);
                textPaint.setLetterSpacing(letterSpacing);
                textPaint.setTextSize(textSize);
                textPaint.setLinearText(zIsLinearText);
                textPaint.setSubpixelText(zIsSubpixelText);
                textPaint.setAntiAlias(zIsAntiAlias);
                this.u0 = fC - f;
                this.B0 = t5gVar.d;
                this.s0 = true;
                invalidate();
                requestLayout();
            } catch (Throwable th) {
                th = th;
                textPaint.setStrokeWidth(strokeWidth);
                textPaint.setColor(color);
                textPaint.setAlpha(alpha);
                textPaint.setStyle(style);
                textPaint.setStrokeCap(strokeCap);
                textPaint.setStrokeJoin(strokeJoin);
                textPaint.setStrokeMiter(strokeMiter);
                textPaint.setTypeface(typeface);
                textPaint.setLetterSpacing(letterSpacing);
                textPaint.setTextSize(textSize);
                textPaint.setLinearText(zIsLinearText);
                textPaint.setSubpixelText(zIsSubpixelText);
                textPaint.setAntiAlias(zIsAntiAlias);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
        u4g u4gVar = this.w0;
        rga rgaVar = this.D0;
        if (u4gVar != null) {
            u4gVar.a.b.remove(rgaVar);
        }
        u4g u4gVar2 = this.w0;
        if (u4gVar2 != null) {
            u4gVar2.b.b.remove(rgaVar);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        boolean z;
        boolean z2;
        CharSequence charSequence;
        CharSequence charSequenceConcat;
        if (this.s0 && this.w0 == null && (charSequence = this.d) != null) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            StaticLayout staticLayoutG = g(width, charSequence);
            int linesCount = getLinesCount();
            if (linesCount <= 0 || staticLayoutG.getLineCount() <= linesCount) {
                this.o = charSequence;
            } else {
                CharSequence charSequenceConcat2 = this.v0 ? TextUtils.concat("…", charSequence.subSequence(charSequence.length() - 1, charSequence.length())) : "…";
                int iMin = Math.min(staticLayoutG.getLineEnd(linesCount - 1) + 1, charSequence.length() - 1);
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, iMin);
                while (g(width, TextUtils.concat(charSequenceSubSequence, charSequenceConcat2)).getLineCount() > linesCount && iMin - 1 > 0) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, iMin);
                }
                boolean z3 = charSequenceSubSequence instanceof Spanned;
                Pattern pattern = this.a;
                if (z3) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                    Matcher matcher = pattern.matcher(charSequenceSubSequence);
                    charSequenceConcat = spannableStringBuilder;
                    if (matcher.find()) {
                        spannableStringBuilder.replace(matcher.start(), charSequenceSubSequence.length(), charSequenceConcat2);
                        charSequenceConcat = spannableStringBuilder;
                    }
                } else {
                    charSequenceConcat = TextUtils.concat(pattern.matcher(charSequenceSubSequence).replaceFirst(""), charSequenceConcat2);
                }
                this.o = charSequenceConcat;
            }
            CharSequence charSequence2 = this.o;
            this.c = g(width, charSequence2 != null ? charSequence2 : "");
            this.s0 = false;
        }
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        TextPaint textPaint = F0;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            e(this, textPaint);
            int iSave = canvas.save();
            try {
            } catch (Throwable th) {
                th = th;
                z2 = zIsSubpixelText;
                z = zIsAntiAlias;
            }
            try {
                canvas.translate(getPaddingLeft(), getPaddingTop());
                staticLayout.draw(canvas);
                try {
                    canvas.restoreToCount(iSave);
                    textPaint.setStrokeWidth(strokeWidth);
                    textPaint.setColor(color);
                    textPaint.setAlpha(alpha);
                    textPaint.setStyle(style);
                    textPaint.setStrokeCap(strokeCap);
                    textPaint.setStrokeJoin(strokeJoin);
                    textPaint.setStrokeMiter(strokeMiter);
                    textPaint.setTypeface(typeface);
                    textPaint.setLetterSpacing(letterSpacing);
                    textPaint.setTextSize(textSize);
                    textPaint.setLinearText(zIsLinearText);
                    textPaint.setSubpixelText(zIsSubpixelText);
                    textPaint.setAntiAlias(zIsAntiAlias);
                } catch (Throwable th2) {
                    th = th2;
                    z2 = zIsSubpixelText;
                    zIsLinearText = zIsLinearText;
                    z = zIsAntiAlias;
                    textPaint.setStrokeWidth(strokeWidth);
                    textPaint.setColor(color);
                    textPaint.setAlpha(alpha);
                    textPaint.setStyle(style);
                    textPaint.setStrokeCap(strokeCap);
                    textPaint.setStrokeJoin(strokeJoin);
                    textPaint.setStrokeMiter(strokeMiter);
                    textPaint.setTypeface(typeface);
                    textPaint.setLetterSpacing(letterSpacing);
                    textPaint.setTextSize(textSize);
                    textPaint.setLinearText(zIsLinearText);
                    textPaint.setSubpixelText(z2);
                    textPaint.setAntiAlias(z);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = zIsSubpixelText;
                z = zIsAntiAlias;
                zIsLinearText = zIsLinearText;
                try {
                    canvas.restoreToCount(iSave);
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    textPaint.setStrokeWidth(strokeWidth);
                    textPaint.setColor(color);
                    textPaint.setAlpha(alpha);
                    textPaint.setStyle(style);
                    textPaint.setStrokeCap(strokeCap);
                    textPaint.setStrokeJoin(strokeJoin);
                    textPaint.setStrokeMiter(strokeMiter);
                    textPaint.setTypeface(typeface);
                    textPaint.setLetterSpacing(letterSpacing);
                    textPaint.setTextSize(textSize);
                    textPaint.setLinearText(zIsLinearText);
                    textPaint.setSubpixelText(z2);
                    textPaint.setAntiAlias(z);
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z = zIsAntiAlias;
            z2 = zIsSubpixelText;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r4, int r5) throws java.lang.Throwable {
        /*
            r3 = this;
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r5 = r3.getPaddingLeft()
            int r5 = r4 - r5
            int r0 = r3.getPaddingRight()
            int r5 = r5 - r0
            u4g r0 = r3.w0
            r1 = 1
            if (r0 == 0) goto L1e
            boolean r0 = r3.s0
            if (r0 != 0) goto L1e
            android.text.StaticLayout r0 = r3.c
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            android.text.StaticLayout r2 = r3.c
            if (r2 == 0) goto L29
            if (r0 == 0) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 != 0) goto L33
        L29:
            java.lang.CharSequence r0 = r3.d
            if (r0 != 0) goto L2f
            java.lang.String r0 = ""
        L2f:
            android.text.StaticLayout r2 = r3.g(r5, r0)
        L33:
            int r5 = r2.getLineCount()
            int r0 = r3.getMaxLinesValue()
            int r5 = java.lang.Math.min(r5, r0)
            if (r5 <= 0) goto L51
            int r5 = r5 - r1
            int r5 = r2.getLineBottom(r5)
            int r0 = r3.getPaddingTop()
            int r0 = r0 + r5
            int r5 = r3.getPaddingBottom()
            int r5 = r5 + r0
            goto L5a
        L51:
            int r5 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            int r5 = r5 + r0
        L5a:
            r3.setMeasuredDimension(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sga.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.s0 = true;
        invalidate();
    }

    @Override // defpackage.xta, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            f();
        } else if (i == 4 || i == 8) {
            h();
        }
    }

    public void setEllipsizing(TextUtils.TruncateAt truncateAt) {
    }

    public void setFallbackLineSpace(boolean z) {
    }

    public void setLayout(u4g u4gVar) {
        f5g f5gVar = u4gVar.b;
        f5g f5gVar2 = u4gVar.a;
        u4g u4gVar2 = this.w0;
        rga rgaVar = this.D0;
        if (u4gVar2 != null) {
            u4gVar2.a.b.remove(rgaVar);
        }
        u4g u4gVar3 = this.w0;
        if (u4gVar3 != null) {
            u4gVar3.b.b.remove(rgaVar);
        }
        this.w0 = u4gVar;
        f5gVar2.b.add(rgaVar);
        if (f5gVar2 != f5gVar) {
            f5gVar.b.add(rgaVar);
        }
        Layout layoutA = getContext().getResources().getConfiguration().orientation == 1 ? f5gVar2.a() : f5gVar.a();
        h();
        this.d = layoutA.getText();
        this.o = layoutA.getText();
        this.c = layoutA instanceof StaticLayout ? (StaticLayout) layoutA : null;
        this.s0 = false;
        if (isAttachedToWindow()) {
            f();
        }
        invalidate();
        requestLayout();
    }

    public void setMaxLinesValue(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            this.s0 = true;
            invalidate();
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.s0 = true;
        super.setPadding(i, i2, i3, i4);
    }

    public void setSaveLastCharPosition(boolean z) {
        this.v0 = z;
        this.s0 = true;
        invalidate();
    }

    @Override // defpackage.ga5
    public void setTextColor(int i) {
        this.x0 = i;
        invalidate();
    }

    @Override // defpackage.ga5
    public void setTextValue(CharSequence charSequence) {
        setContent(charSequence);
    }
}
