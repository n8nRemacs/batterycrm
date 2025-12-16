package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class fn5 extends View implements u6g {
    public static final /* synthetic */ yy7[] B0;
    public vq0 A0;
    public final h18 a;
    public final CharSequence b;
    public final nk c;
    public final TextPaint d;
    public SpannableString o;
    public int s0;
    public Layout t0;
    public Layout u0;
    public Layout v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public Integer z0;

    static {
        z8a z8aVar = new z8a(fn5.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;");
        vid.a.getClass();
        B0 = new yy7[]{z8aVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn5(Context context) {
        super(context);
        h18 h18Var = (h18) fdc.a.getAccessor().c(114);
        this.a = h18Var;
        String strD = new n5g(x8b.m).d(this);
        this.b = strD == null ? "" : strD;
        this.c = new nk(dpg.I, 8, this);
        TextPaint textPaint = new TextPaint(1);
        wsf.j(this, textPaint, getTypography());
        v1a v1aVar = a93.s0;
        textPaint.setColor(v1aVar.y(this).getText().e);
        this.d = textPaint;
        this.s0 = Integer.MAX_VALUE;
        onThemeChanged(v1aVar.y(this));
    }

    public final Layout a(int i, CharSequence charSequence) {
        int i2 = m7f.a;
        return h18.a(this.a, uha.z(charSequence), this.d, i, Integer.MAX_VALUE, false, null, 0.0f, false, 496);
    }

    public final void b(int i) {
        Layout layoutA;
        CharSequence charSequenceSubSequence;
        CharSequence charSequence = this.o;
        if (charSequence == null) {
            return;
        }
        Layout layoutA2 = a(i, charSequence);
        this.v0 = layoutA2;
        if (layoutA2.getLineCount() <= this.s0) {
            layoutA = this.v0;
        } else {
            StringBuilder sb = new StringBuilder("… ");
            CharSequence charSequence2 = this.b;
            sb.append((Object) charSequence2);
            String string = sb.toString();
            TextPaint textPaint = this.d;
            float fMeasureText = textPaint.measureText(string);
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) string);
            Layout layoutA3 = a(i, spannableStringBuilderAppend);
            int lineCount = layoutA3.getLineCount();
            int i2 = this.s0;
            if (lineCount > i2) {
                int lineStart = layoutA3.getLineStart(i2 - 1);
                CharSequence charSequenceSubSequence2 = spannableStringBuilderAppend.subSequence(0, layoutA3.getLineEnd(this.s0 - 1));
                while (layoutA3.getWidth() <= textPaint.measureText(charSequenceSubSequence2, lineStart, charSequenceSubSequence2.length()) + fMeasureText) {
                    int length = charSequenceSubSequence2.length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    charSequenceSubSequence2 = vmf.Y(length, charSequenceSubSequence2);
                }
                int length2 = charSequenceSubSequence2.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i3 = length2 - 1;
                        if (charSequenceSubSequence2.charAt(length2) != '\n') {
                            charSequenceSubSequence = charSequenceSubSequence2.subSequence(0, length2 + 1);
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            length2 = i3;
                        }
                    }
                    charSequenceSubSequence = "";
                    spannableStringBuilderAppend = new SpannableStringBuilder(charSequenceSubSequence);
                } else {
                    charSequenceSubSequence = "";
                    spannableStringBuilderAppend = new SpannableStringBuilder(charSequenceSubSequence);
                }
            }
            layoutA = a(i, new SpannableStringBuilder(ssi.p(spannableStringBuilderAppend)).append((CharSequence) "… ").append(charSequence2, new in7(2, this), 33));
        }
        this.u0 = layoutA;
        if (this.y0) {
            layoutA = this.v0;
        }
        this.t0 = layoutA;
    }

    public final void c() {
        if (isAttachedToWindow() && getMeasuredWidth() > 0) {
            b(getMeasuredWidth());
            this.w0 = true;
            requestLayout();
        } else {
            if (this.A0 != null) {
                return;
            }
            this.A0 = new vq0(1, this);
            getViewTreeObserver().addOnPreDrawListener(this.A0);
        }
    }

    public final SpannableString getText() {
        return this.o;
    }

    public final Layout getTextLayout() {
        return this.t0;
    }

    public final t5g getTypography() {
        yy7 yy7Var = B0[0];
        return (t5g) this.c.b;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        vq0 vq0Var = this.A0;
        if (vq0Var != null) {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnPreDrawListener(vq0Var);
            }
            this.A0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int iSave = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            Layout layout = this.t0;
            if (layout != null) {
                layout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r2
  0x0008: PHI (r2v9 java.lang.Integer) = (r2v1 java.lang.Integer), (r2v4 java.lang.Integer) binds: [B:3:0x0006, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r1, int r2) {
        /*
            r0 = this;
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            java.lang.Integer r2 = r0.z0
            if (r2 == 0) goto Ld
        L8:
            int r2 = r2.intValue()
            goto L1f
        Ld:
            android.text.Layout r2 = r0.t0
            if (r2 == 0) goto L1a
            int r2 = r2.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L1e
            goto L8
        L1e:
            r2 = 0
        L1f:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i3 == i) {
            return;
        }
        post(new qj4(28, this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Object[] spans;
        this.d.setColor(yebVar.getText().e);
        SpannableString spannableString = this.o;
        if (spannableString != null) {
            try {
                spans = spannableString.getSpans(0, spannableString.length(), d88.class);
            } catch (Throwable unused) {
                spans = null;
            }
            d88[] d88VarArr = (d88[]) spans;
            if (d88VarArr != null) {
                for (d88 d88Var : d88VarArr) {
                    d88Var.b = a93.s0.y(this).getText().j;
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout = this.t0;
        if (layout == null || (text = layout.getText()) == null) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout2 = this.t0;
        if (layout2 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical((int) (motionEvent.getY() - getPaddingTop())), motionEvent.getX() - getPaddingLeft());
        float f = 2;
        int iQ = u45.q(f, vw4.d().getDisplayMetrics().density, offsetForHorizontal);
        if (iQ < 0) {
            iQ = 0;
        }
        int iC = u45.c(f, vw4.d().getDisplayMetrics().density, offsetForHorizontal);
        int length = text.length();
        if (iC > length) {
            iC = length;
        }
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(iQ, iC, ClickableSpan.class);
            }
        } catch (Throwable unused) {
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
        if (clickableSpanArr == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (clickableSpanArr.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        clickableSpanArr[0].onClick(this);
        return true;
    }

    public final void setCollapsedLines(int i) {
        this.s0 = i;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.x0 = z;
    }

    public final void setText(SpannableString spannableString) {
        this.o = spannableString;
    }

    public final void setTextColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public final void setTypography(t5g t5gVar) {
        this.c.O(this, B0[0], t5gVar);
    }

    public final void setText(CharSequence charSequence) {
        m7f m7fVarZ;
        Spannable spannableH = mni.H(charSequence, a93.s0.y(this).getText().j, (24 & 4) != 0, null);
        if (spannableH != null) {
            int i = m7f.a;
            m7fVarZ = uha.z(spannableH);
        } else {
            m7fVarZ = null;
        }
        this.o = m7fVarZ;
        this.y0 = false;
        this.w0 = false;
        c();
    }
}
