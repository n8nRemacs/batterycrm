package ru.ok.tamtam.markdown.ui.preview;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import defpackage.ah;
import defpackage.ap8;
import defpackage.cp8;
import defpackage.f8j;
import defpackage.fs4;
import defpackage.kg6;
import defpackage.kti;
import defpackage.m7g;
import defpackage.qm3;
import defpackage.t1b;
import defpackage.ug;
import defpackage.uvc;
import defpackage.ve3;
import defpackage.vw4;
import defpackage.we3;
import defpackage.zg;
import defpackage.zm;
import defpackage.zo8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/tamtam/markdown/ui/preview/MarkdownMenuView;", "Landroid/widget/LinearLayout;", "Lm7g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lqqg;", "setEnabled", "(Z)V", "Lcp8;", "listener", "setListener", "(Lcp8;)V", "markdown-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MarkdownMenuView extends LinearLayout implements m7g {
    public static final /* synthetic */ int t0 = 0;
    public final ArrayList a;
    public final RectF b;
    public int c;
    public final Paint d;
    public AnimatorSet o;
    public final float s0;

    public MarkdownMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAlpha(25);
        this.d = paint;
        setOrientation(1);
        setWillNotDraw(false);
        zo8.c.getClass();
        LinkedHashSet linkedHashSet = zo8.d;
        ArrayList arrayList = new ArrayList(we3.q(linkedHashSet, 10));
        int i = 0;
        for (Object obj : linkedHashSet) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            zo8 zo8Var = (zo8) obj;
            ap8 ap8Var = new ap8(context);
            ap8Var.setTag(zo8Var);
            ap8Var.setTitle(zo8Var.b);
            f8j.d(ap8Var, 300L, new kg6(this, 12, zo8Var));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getContext().getResources().getDimensionPixelSize(uvc.markdown_button_size));
            layoutParams.gravity = 8388613;
            layoutParams.bottomMargin = i == zo8.values().length - 1 ? 0 : kti.d(4 * vw4.d().getDisplayMetrics().density);
            addView(ap8Var, layoutParams);
            ap8Var.a(i == this.c, false);
            arrayList.add(ap8Var);
            i = i2;
        }
        this.a = arrayList;
        b();
        this.s0 = vw4.d().getDisplayMetrics().density * 100.0f;
    }

    public final void a(int i, boolean z) {
        AnimatorSet animatorSet;
        ap8 ap8Var = (ap8) this.a.get(i);
        boolean zIsInEditMode = isInEditMode();
        RectF rectF = this.b;
        if (zIsInEditMode || !z || !((t1b) ((qm3) ((zm) ((ah) getContext().getApplicationContext())).c.getValue())).b().a()) {
            rectF.left = ap8Var.getLeft();
            rectF.top = ap8Var.getTop();
            rectF.right = ap8Var.getRight();
            rectF.bottom = ap8Var.getBottom();
            invalidate();
            return;
        }
        zg zgVarB = ((t1b) ((qm3) ((zm) ((ah) getContext().getApplicationContext())).c.getValue())).b();
        AnimatorSet animatorSet2 = this.o;
        final int i2 = 1;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.o) != null) {
            animatorSet.cancel();
        }
        final int i3 = 2;
        final int i4 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(rectF.top, ap8Var.getTop());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bp8
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                MarkdownMenuView markdownMenuView = this.b;
                switch (i5) {
                    case 0:
                        int i6 = MarkdownMenuView.t0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.t0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.t0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.t0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(rectF.left, ap8Var.getLeft());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bp8
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i2;
                MarkdownMenuView markdownMenuView = this.b;
                switch (i5) {
                    case 0:
                        int i6 = MarkdownMenuView.t0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.t0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.t0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.t0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(rectF.right, ap8Var.getRight());
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bp8
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                MarkdownMenuView markdownMenuView = this.b;
                switch (i5) {
                    case 0:
                        int i6 = MarkdownMenuView.t0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.t0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.t0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.t0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(rectF.bottom, ap8Var.getBottom());
        final int i5 = 3;
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bp8
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i52 = i5;
                MarkdownMenuView markdownMenuView = this.b;
                switch (i52) {
                    case 0:
                        int i6 = MarkdownMenuView.t0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.t0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.t0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.t0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        fs4 fs4Var = zgVarB.a;
        animatorSet3.setDuration(200L);
        fs4 fs4Var2 = zgVarB.a;
        if (((LinearInterpolator) fs4Var2.a) == null) {
            fs4Var2.a = new LinearInterpolator();
        }
        animatorSet3.setInterpolator((LinearInterpolator) fs4Var2.a);
        animatorSet3.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        animatorSet3.addListener(new ug(this, i, 2));
        animatorSet3.start();
    }

    @Override // defpackage.m7g
    public final void b() {
        if (isInEditMode()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ap8) it.next()).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = this.s0;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.d);
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b.isEmpty()) {
            a(0, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            return;
        }
        removeAllViews();
    }

    public final void setListener(cp8 listener) {
    }
}
