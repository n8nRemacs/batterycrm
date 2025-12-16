package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class bb3 extends LinkMovementMethod {
    public static final String m = vid.a(bb3.class).b();
    public final ab3 a;
    public final RectF b = new RectF();
    public String c;
    public i5i d;
    public Spannable e;
    public ClickableSpan f;
    public boolean g;
    public cm6 h;
    public boolean i;
    public Runnable j;
    public final kx0 k;
    public final GestureDetector l;

    public bb3(Context context, ab3 ab3Var) {
        this.a = ab3Var;
        kx0 kx0Var = new kx0(4, this);
        this.k = kx0Var;
        this.l = new GestureDetector(context, kx0Var);
    }

    public static final ClickableSpan a(bb3 bb3Var, i5i i5iVar, Spannable spannable, MotionEvent motionEvent) {
        View view;
        Layout layout;
        Object ipdVar;
        RectF rectF = bb3Var.b;
        if (i5iVar == null || (view = (View) ((WeakReference) i5iVar.a).get()) == null || (layout = (Layout) i5iVar.b) == null) {
            return null;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int paddingLeft = x - view.getPaddingLeft();
        int paddingTop = y - view.getPaddingTop();
        int scrollX = view.getScrollX() + paddingLeft;
        int scrollY = view.getScrollY() + paddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineMax(lineForVertical) + rectF.left;
            rectF.bottom = layout.getLineBottom(lineForVertical);
            ipdVar = rectF.contains(f, (float) scrollY) ? (ClickableSpan) ys.w(spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) : null;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(m, "findClickableSpanUnderTouch failed:", thA);
        }
        return (ClickableSpan) (ipdVar instanceof ipd ? null : ipdVar);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d = new i5i(new WeakReference(textView), textView.getLayout());
            this.e = spannable;
        }
        return this.l.onTouchEvent(motionEvent);
    }
}
