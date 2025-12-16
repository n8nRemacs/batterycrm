package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class m28 extends yta implements ga5 {
    public static final Rect w0 = new Rect();
    public static final Pattern x0 = Pattern.compile("[\\.,…\\:\\s]*$", 32);
    public boolean b;
    public boolean c;
    public CharSequence d;
    public int o;
    public float s0;
    public float t0;
    public Pattern u0;
    public boolean v0;

    public m28(Context context) {
        super(context, null, 0);
        this.o = Integer.MAX_VALUE;
        this.s0 = 1.0f;
        this.u0 = x0;
    }

    private final int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / e("").getLineBottom(0);
    }

    private final int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    @Override // defpackage.ga5
    public final boolean a() {
        return getVisibility() == 0;
    }

    @Override // defpackage.ga5
    public final Rect b() {
        int lineStart = getLayout().getLineStart(0);
        float lineWidth = getLayout().getLineWidth(0);
        int lineTop = getLayout().getLineTop(0);
        Rect rect = w0;
        rect.top = lineTop;
        rect.bottom = getLayout().getLineTop(1);
        rect.left = lineStart;
        rect.right = kti.d(lineStart + lineWidth);
        return rect;
    }

    @Override // defpackage.ga5
    public final void c(yeb yebVar) {
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, getText().length(), u6g.class) : null;
        if (spans == null) {
            spans = new u6g[0];
        }
        for (Object obj : spans) {
            u6g u6gVar = (u6g) obj;
            u6gVar.onThemeChanged(yebVar);
            b6g.b(this, u6gVar);
        }
    }

    @Override // defpackage.ga5
    public final float d(String str) {
        return getPaint().measureText(str);
    }

    public final StaticLayout e(CharSequence charSequence) {
        int intrinsicWidth;
        int compoundDrawablePadding;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int intrinsicWidth2 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            compoundDrawablePadding = getCompoundDrawablePadding();
        } else {
            intrinsicWidth = 0;
            compoundDrawablePadding = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            intrinsicWidth2 = drawable2.getIntrinsicWidth();
            compoundDrawablePadding += getCompoundDrawablePadding();
        }
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - intrinsicWidth) - intrinsicWidth2) - compoundDrawablePadding, Layout.Alignment.ALIGN_NORMAL, this.s0, this.t0, false);
    }

    public final void f(t5g t5gVar) {
        t5g t5gVar2 = dpg.a;
        t5gVar.b(this, t75.b);
    }

    @Override // defpackage.ga5
    public View getAsView() {
        return this;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.o;
    }

    public int getMaxLinesValue() {
        return this.o;
    }

    @Override // defpackage.ga5
    public CharSequence getSpannableText() {
        return this.d;
    }

    public int getTextColor() {
        return getCurrentTextColor();
    }

    @Override // defpackage.ga5
    public CharSequence getTextValue() {
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        CharSequence charSequenceConcat;
        if (this.b && (charSequenceConcat = this.d) != null) {
            CharSequence charSequenceConcat2 = this.v0 ? TextUtils.concat("…", charSequenceConcat.subSequence(charSequenceConcat.length() - 1, charSequenceConcat.length())) : "…";
            StaticLayout staticLayoutE = e(charSequenceConcat);
            int linesCount = getLinesCount();
            if (linesCount > 0 && staticLayoutE.getLineCount() > linesCount) {
                int lineEnd = staticLayoutE.getLineEnd(linesCount - 1) + 1;
                if (lineEnd >= charSequenceConcat.length()) {
                    lineEnd = charSequenceConcat.length() - 1;
                }
                CharSequence charSequenceSubSequence = charSequenceConcat.subSequence(0, lineEnd);
                while (e(TextUtils.concat(charSequenceSubSequence, charSequenceConcat2)).getLineCount() > linesCount && lineEnd - 1 > 0) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, lineEnd);
                }
                if (charSequenceSubSequence instanceof Spanned) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                    Matcher matcher = this.u0.matcher(charSequenceSubSequence);
                    if (matcher.find()) {
                        spannableStringBuilder.replace(matcher.start(), charSequenceSubSequence.length(), charSequenceConcat2);
                    }
                    charSequenceConcat = spannableStringBuilder;
                } else {
                    charSequenceConcat = TextUtils.concat(this.u0.matcher(charSequenceSubSequence).replaceFirst(""), charSequenceConcat2);
                }
            }
            if (!fni.a(charSequenceConcat, getText())) {
                this.c = true;
                try {
                    setText(charSequenceConcat);
                } finally {
                    this.c = false;
                }
            }
            this.b = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = true;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((this.c || this.d != null) && charSequence != null && charSequence.equals(this.d)) {
            return;
        }
        this.d = charSequence;
        this.b = true;
    }

    public void setEllipsizing(TextUtils.TruncateAt truncateAt) {
        setEllipsize(truncateAt);
    }

    public final void setEndPunctuationPattern(Pattern pattern) {
        if (pattern == null) {
            pattern = x0;
        }
        this.u0 = pattern;
    }

    public void setFallbackLineSpace(boolean z) {
        mfh.k(this, z);
    }

    public void setLayout(u4g u4gVar) {
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        this.t0 = f;
        this.s0 = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.o = i;
        this.b = true;
    }

    public void setMaxLinesValue(int i) {
        setMaxLines(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.b = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        this.b = true;
    }

    public void setSaveLastCharPosition(boolean z) {
        this.v0 = z;
    }

    @Override // defpackage.ga5
    public void setTextValue(CharSequence charSequence) {
        if (fni.a(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.b = true;
        setText(charSequence);
    }
}
