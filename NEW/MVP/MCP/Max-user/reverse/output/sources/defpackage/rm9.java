package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class rm9 extends View implements om9, View.OnLongClickListener, e88, GestureDetector.OnDoubleTapListener, hb5 {
    public static final /* synthetic */ yy7[] G0;
    public pm9 A0;
    public Drawable B0;
    public int C0;
    public int D0;
    public final Rect E0;
    public final qi F0;
    public final bb3 a;
    public final Object b;
    public View.OnLongClickListener c;
    public ab3 d;
    public final h88 o;
    public e88 s0;
    public final nk t0;
    public bb3 u0;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public boolean z0;

    static {
        z8a z8aVar = new z8a(rm9.class, "onDoubleClickListener", "getOnDoubleClickListener()Lkotlin/jvm/functions/Function1;");
        vid.a.getClass();
        G0 = new yy7[]{z8aVar};
    }

    public rm9(Context context) {
        super(context, null, 0);
        bb3 bb3Var = new bb3(context, new co2(5, this));
        this.a = bb3Var;
        this.b = ipi.b(3, new c38(29));
        this.o = new h88(null, new fr7(15, this), 7);
        this.t0 = new nk(15, this);
        this.u0 = bb3Var;
        this.v0 = 1;
        this.z0 = true;
        Display defaultDisplay = e6j.b(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.D0 = new Size(point.x, point.y).getHeight();
        this.E0 = new Rect();
        this.F0 = new qi(3, this);
        super.setOnLongClickListener(this);
    }

    public static void f(rm9 rm9Var) {
        ArrayList arrayList = rm9Var.getHighlightTextHelper().a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        CharSequence text = rm9Var.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), a7e.class)) {
                a7e a7eVar = (a7e) obj;
                ForegroundColorSpan foregroundColorSpan = a7eVar.a;
                if (foregroundColorSpan != null) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = a7eVar.b;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                spannable.removeSpan(a7eVar);
            }
        }
        rm9Var.invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final w27 getHighlightTextHelper() {
        return (w27) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStartDrawable$lambda$5(Drawable drawable) {
        ((AnimationDrawable) drawable).start();
    }

    @Override // defpackage.e88
    public final void a(cj9 cj9Var) {
        e88 e88Var = this.s0;
        if (e88Var != null) {
            e88Var.a(cj9Var);
        }
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        e88 e88Var = this.s0;
        if (e88Var != null) {
            e88Var.b(str, i88Var, clickableSpan);
        }
    }

    @Override // defpackage.hb5
    public final void c() {
        invalidate();
    }

    public final int e(int i) {
        Layout layout = getLayout();
        return layout == null ? i : layout.getLineCount() == 1 ? getMeasuredWidth() : layout.getLineCount() > 1 ? (int) layout.getLineRight(layout.getLineCount() - 1) : i;
    }

    public final void g(List list) {
        w27 highlightTextHelper = getHighlightTextHelper();
        CharSequence text = getText();
        Layout layout = getLayout();
        ArrayList arrayList = highlightTextHelper.a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        if (list != null && !list.isEmpty() && text != null && !vmf.F(text) && layout != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n7e n7eVar = (n7e) it.next();
                float height = layout.getHeight() / layout.getLineCount();
                int i = n7eVar.a;
                int i2 = n7eVar.b;
                while (true) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int lineEnd = layout.getLineEnd(lineForOffset);
                    boolean z = i2 <= lineEnd;
                    String string = text.subSequence(i, z ? i2 : lineEnd).toString();
                    highlightTextHelper.a.add(new v27(lineForOffset, string, layout.getPrimaryHorizontal(i), layout.getLineTop(lineForOffset), layout.getLineBaseline(lineForOffset), layout.getPaint().measureText(string), height));
                    if (z) {
                        break;
                    } else {
                        i = lineEnd;
                    }
                }
            }
        }
        invalidate();
    }

    public final bb3 getDefaultMovementMethod() {
        return this.a;
    }

    public final Layout getLayout() {
        pm9 pm9Var = this.A0;
        if (pm9Var != null) {
            return pm9Var.a();
        }
        return null;
    }

    public final int getLineCount() {
        Layout layoutA;
        pm9 pm9Var = this.A0;
        if (pm9Var == null || (layoutA = pm9Var.a()) == null) {
            return 0;
        }
        return layoutA.getLineCount();
    }

    public final boolean getLinksClickable() {
        return this.z0;
    }

    public final int getMaxHeightForClip() {
        return this.D0;
    }

    public final bb3 getMovementMethod() {
        return this.u0;
    }

    public final em6 getOnDoubleClickListener() {
        yy7 yy7Var = G0[0];
        return (em6) this.t0.b;
    }

    public final CharSequence getText() {
        Layout layoutA;
        pm9 pm9Var = this.A0;
        if (pm9Var == null || (layoutA = pm9Var.a()) == null) {
            return null;
        }
        return layoutA.getText();
    }

    public final boolean h() {
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        return spanned != null && spanned.nextSpanTransition(spanned.length() - 1, spanned.length() + 1, luc.class) == spanned.length();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        luc[] lucVarArr;
        int iMax;
        int i;
        int i2;
        pm9 pm9Var = this.A0;
        Layout layoutA = pm9Var != null ? pm9Var.a() : null;
        Drawable drawable = this.B0;
        int i3 = 0;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.C0 : 0;
        this.x0 = intrinsicWidth;
        int paddingLeft = getPaddingLeft();
        if (layoutA == null) {
            iMax = 0;
        } else {
            pm9 pm9Var2 = this.A0;
            if (pm9Var2 == null || (lucVarArr = (luc[]) pm9Var2.d.getValue()) == null) {
                lucVarArr = new luc[0];
            }
            CharSequence text = layoutA.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            int lineCount = layoutA.getLineCount();
            int i4 = 0;
            iMax = 0;
            while (i4 < lineCount) {
                int lineStart = layoutA.getLineStart(i4);
                int lineEnd = layoutA.getLineEnd(i4);
                if (spanned == null) {
                    i = i3;
                } else {
                    int length = lucVarArr.length;
                    int i5 = i3;
                    i = i5;
                    while (i5 < length) {
                        luc lucVar = lucVarArr[i5];
                        int spanStart = spanned.getSpanStart(lucVar);
                        Spanned spanned2 = spanned;
                        int spanEnd = spanned.getSpanEnd(lucVar) + 1;
                        if (spanStart == lineStart && lineEnd <= spanEnd) {
                            kuc kucVar = lucVar.a;
                            i = i + kucVar.m + kucVar.g;
                            i2 = kucVar.j;
                        } else if (spanStart > lineStart || lineEnd > spanEnd) {
                            i5++;
                            spanned = spanned2;
                        } else {
                            i2 = lucVar.a.m;
                        }
                        i += i2;
                        i5++;
                        spanned = spanned2;
                    }
                }
                Spanned spanned3 = spanned;
                iMax = Math.max(iMax, kti.d(layoutA.getLineMax(i4)) + i);
                i4++;
                spanned = spanned3;
                i3 = 0;
            }
        }
        setMeasuredDimension(getPaddingRight() + paddingLeft + iMax + intrinsicWidth, layoutA != null ? layoutA.getHeight() : 0);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pm9 pm9Var = this.A0;
        if (pm9Var != null) {
            pm9Var.e.add(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.o.c(spannable);
        }
        pm9 pm9Var2 = this.A0;
        if (pm9Var2 != null) {
            pqi.c(this, pm9Var2.a(), this.F0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pm9 pm9Var = this.A0;
        if (pm9Var != null) {
            pm9Var.e.remove(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.o.getClass();
            h88.a(spannable);
        }
        pm9 pm9Var2 = this.A0;
        if (pm9Var2 != null) {
            pqi.e(pm9Var2.a(), this.F0);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        em6 onDoubleClickListener = getOnDoubleClickListener();
        return onDoubleClickListener != null && ((Boolean) onDoubleClickListener.invoke(this)).booleanValue();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return onDoubleTap(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        if (wh.b) {
            Log.d("MessageTextView/Animoji", "");
            Log.d("MessageTextView/Animoji", "------>");
            Log.d("MessageTextView/Animoji", "onDraw start");
        }
        Rect rect = this.E0;
        if (!rect.isEmpty()) {
            canvas.clipRect(rect);
        }
        Drawable drawable = this.B0;
        int iSave = canvas.save();
        if (drawable != null) {
            canvas.translate(this.w0, this.y0);
            drawable.draw(canvas);
        }
        canvas.translate(this.w0 + this.x0, 0.0f);
        layout.draw(canvas);
        w27 highlightTextHelper = getHighlightTextHelper();
        yeb yebVarY = a93.s0.y(this);
        ?? r6 = highlightTextHelper.c;
        ?? r7 = highlightTextHelper.b;
        TextPaint textPaint = (TextPaint) r6.getValue();
        textPaint.set(layout.getPaint());
        textPaint.setColor(yebVarY.getText().a);
        ((Paint) r7.getValue()).setColor(yebVarY.e().c);
        Iterator it = highlightTextHelper.a.iterator();
        while (it.hasNext()) {
            v27 v27Var = (v27) it.next();
            float f = v27Var.c;
            float f2 = v27Var.d;
            Canvas canvas2 = canvas;
            canvas2.drawRect(f, f2, f + v27Var.f, f2 + v27Var.g, (Paint) r7.getValue());
            canvas2.drawText(v27Var.b, v27Var.c, v27Var.e, textPaint);
            canvas = canvas2;
        }
        canvas.restoreToCount(iSave);
        if (wh.b) {
            Log.d("MessageTextView/Animoji", "onDraw finish");
            Log.d("MessageTextView/Animoji", "<------");
            Log.d("MessageTextView/Animoji", "");
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.c;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClick(view);
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        i();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return performClick();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.w0 = this.v0 == -1 ? getPaddingRight() : getPaddingLeft();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bb3 bb3Var = this.u0;
        if ((getText() instanceof Spannable) && this.z0 && bb3Var != null) {
            Layout layout = getLayout();
            SpannableString spannableString = new SpannableString(getText());
            if (motionEvent.getAction() == 0) {
                bb3Var.d = new i5i(new WeakReference(this), layout);
                bb3Var.e = spannableString;
            }
            if (bb3Var.l.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    public final void setLayout(pm9 pm9Var) {
        pm9 pm9Var2 = this.A0;
        if (pm9Var2 != null) {
            pm9Var2.e.remove(this);
        }
        this.A0 = pm9Var;
        pm9Var.e.add(this);
        this.v0 = pm9Var.a().getParagraphDirection(0);
        pm9Var.a().getLineRight(0);
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.o.c(spannable);
        }
        pqi.c(this, pm9Var.a(), this.F0);
        this.y0 = pm9Var.a().getTopPadding();
        requestLayout();
        invalidate();
        setContentDescription(getText());
    }

    public final void setLinkListener(e88 e88Var) {
        Layout layoutA;
        this.s0 = e88Var;
        h88 h88Var = this.o;
        h88Var.a = e88Var;
        pm9 pm9Var = this.A0;
        if (pm9Var == null || (layoutA = pm9Var.a()) == null) {
            return;
        }
        h88Var.c(layoutA.getText());
    }

    public final void setLinkLongClickListener(ab3 ab3Var) {
        this.d = ab3Var;
    }

    public final void setLinksClickable(boolean z) {
        this.z0 = z;
    }

    public final void setMaxHeightForClip(int i) {
        this.D0 = i;
    }

    public final void setMovementMethod(bb3 bb3Var) {
        this.u0 = bb3Var;
    }

    public final void setOnDoubleClickListener(em6 em6Var) {
        this.t0.O(this, G0[0], em6Var);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c = onLongClickListener;
    }

    public final void setSingleClickAction(Runnable runnable) {
        if (runnable == null) {
            bb3 bb3Var = this.u0;
            if (bb3Var != null) {
                bb3Var.h = null;
                return;
            }
            return;
        }
        bb3 bb3Var2 = this.u0;
        if (bb3Var2 != null) {
            bb3Var2.h = new vj5(runnable, 1);
        }
    }

    public final void setStartDrawable(Drawable drawable) {
        this.B0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable instanceof AnimationDrawable) {
            post(new qm9((AnimationDrawable) drawable, 0));
        }
        requestLayout();
    }

    public final void setStartDrawablePadding(int i) {
        if (this.C0 == i) {
            return;
        }
        this.C0 = i;
        requestLayout();
    }

    public final void setTextColors(yt0 yt0Var) {
        TextPaint paint;
        bu0 bu0Var = yt0Var.d;
        int i = bu0Var.b;
        Layout layout = getLayout();
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(bu0Var.e);
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof z07) {
                        ((z07) obj).c = i;
                    } else if (obj instanceof fj9) {
                        ((fj9) obj).b = i;
                    } else if (obj instanceof b88) {
                        ((b88) obj).a = i;
                    } else if (obj instanceof d88) {
                        ((d88) obj).b = i;
                    } else if (obj instanceof luc) {
                        ((luc) obj).d(yt0Var);
                    }
                }
            }
        }
        invalidate();
    }

    public final void setTryToSingleClickAction(Runnable runnable) {
        bb3 bb3Var = this.u0;
        if (bb3Var != null) {
            bb3Var.j = runnable;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
