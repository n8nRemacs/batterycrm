package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class uh9 extends ViewGroup {
    public boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;
    public final int s0;
    public ViewGroup t0;
    public View u0;
    public final k18 v0;
    public long w0;
    public final RectF x0;
    public em6 y0;

    public uh9(Context context) {
        super(context);
        this.b = kti.d(32 * vw4.d().getDisplayMetrics().density);
        float f = 6;
        this.c = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.d = kti.d(f * vw4.d().getDisplayMetrics().density);
        this.o = kti.d(38 * vw4.d().getDisplayMetrics().density);
        this.s0 = kti.d(2 * vw4.d().getDisplayMetrics().density);
        k18 k18Var = fq9.a;
        this.v0 = gq9.a.getAccessor().d(530);
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.x0 = new RectF();
    }

    private final eu0 getBubbleUiOptions() {
        return (eu0) this.v0.getValue();
    }

    public final int a(int i, th9 th9Var) {
        if (this.a) {
            i -= this.o;
        }
        return i - (th9Var.getMarginEnd() + (getPaddingEnd() + (getPaddingStart() + th9Var.getMarginStart())));
    }

    public final long getAvatarId() {
        return this.w0;
    }

    public final View getContentView$message_list_release() {
        return this.t0;
    }

    public final int getContentViewTopMargin() {
        ViewGroup viewGroup = this.t0;
        if (viewGroup == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final int getMaxAvailableWidth$message_list_release() {
        View view = this.u0;
        ViewGroup viewGroup = this.t0;
        if (view != null && view.getVisibility() == 0) {
            return a(getMeasuredWidth(), (th9) view.getLayoutParams());
        }
        if (viewGroup == null) {
            return getMeasuredWidth();
        }
        return a(getMeasuredWidth(), (th9) viewGroup.getLayoutParams());
    }

    public final boolean getOffsetBubbleByAvatar() {
        return this.a;
    }

    public final em6 getOnAvatarClickListener$message_list_release() {
        return this.y0;
    }

    public final View getOutsideBubbleView$message_list_release() {
        return this.u0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        ViewGroup viewGroup = this.t0;
        if (viewGroup != null) {
            int paddingStart = getPaddingStart();
            th9 th9Var = (th9) viewGroup.getLayoutParams();
            if (th9Var.a) {
                if (this.a) {
                    paddingStart += this.b + this.d;
                }
                marginEnd = th9Var.getMarginStart() + paddingStart;
            } else {
                int measuredWidth = i3 - viewGroup.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                marginEnd = (measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0)) - getPaddingEnd();
            }
            int i5 = ((ViewGroup.MarginLayoutParams) th9Var).topMargin;
            cri.c(viewGroup, marginEnd, i5, 0, 12);
            View view = this.u0;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            cri.c(view, marginEnd, viewGroup.getMeasuredHeight() + i5 + this.s0, 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        if (this.a) {
            int i4 = this.b;
            i3 = this.c;
            iMax = i4 + i3;
        } else {
            i3 = 0;
            iMax = 0;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        ViewGroup viewGroup = this.t0;
        if (viewGroup != null) {
            View view = this.u0;
            int i5 = (view == null || view.getVisibility() != 0) ? Integer.MIN_VALUE : 1073741824;
            th9 th9Var = (th9) viewGroup.getLayoutParams();
            int iA = a(defaultSize, th9Var);
            int iIntValue = ((Number) ((dza) getBubbleUiOptions()).d.getValue()).intValue();
            if (iIntValue <= iA) {
                iA = iIntValue;
            }
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(iA, i5), i2);
            iMax = Math.max(iMax + i3, viewGroup.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) th9Var).topMargin + ((ViewGroup.MarginLayoutParams) th9Var).bottomMargin);
            if (view != null && view.getVisibility() == 0) {
                th9 th9Var2 = (th9) view.getLayoutParams();
                int iA2 = a(defaultSize, th9Var2);
                int iIntValue2 = ((Number) ((dza) getBubbleUiOptions()).d.getValue()).intValue();
                if (iIntValue2 <= iA2) {
                    iA2 = iIntValue2;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(iA2, 1073741824), i2);
                iMax = view.getMeasuredHeight() + this.s0 + ((ViewGroup.MarginLayoutParams) th9Var2).topMargin + ((ViewGroup.MarginLayoutParams) th9Var2).bottomMargin + iMax;
            }
        }
        setMeasuredDimension(defaultSize, iMax);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        em6 em6Var;
        RectF rectF = this.x0;
        if (rectF.isEmpty() || this.w0 <= 0 || !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (em6Var = this.y0) != null) {
            em6Var.invoke(Long.valueOf(this.w0));
        }
        return true;
    }

    public final void setAvatarId(long j) {
        this.w0 = j;
    }

    public final void setListener(sh9 sh9Var) {
    }

    public final void setOffsetBubbleByAvatar(boolean z) {
        this.a = z;
    }

    public final void setOnAvatarClickListener$message_list_release(em6 em6Var) {
        this.y0 = em6Var;
    }
}
