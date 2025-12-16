package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class o6c extends FrameLayout {
    public static final /* synthetic */ int v0 = 0;
    public i6c a;
    public m6c b;
    public boolean c;
    public boolean d;
    public ValueAnimator o;
    public final lfh s0;
    public final Object t0;
    public int u0;

    public o6c(Context context) {
        super(context, null);
        this.b = m6c.a;
        this.c = true;
        this.s0 = new lfh(getContext(), this, new n6c(this));
        this.t0 = ipi.b(3, new g6c(this, 2));
        this.u0 = -1;
        f8j.d(this, 300L, new ye6(29, this));
    }

    public static void a(o6c o6cVar, float f) {
        o6cVar.setBackgroundAlpha(f);
    }

    public static void b(o6c o6cVar, float f) {
        o6cVar.setBackgroundAlpha(f);
    }

    public static void c(o6c o6cVar, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = 1 - f2;
        }
        if (f > f2) {
            o6cVar.setBackgroundAlpha(1 - f);
        }
    }

    public static void d(o6c o6cVar, sm6 sm6Var, float f, ValueAnimator valueAnimator) {
        i6c i6cVar = o6cVar.a;
        if (i6cVar == null) {
            return;
        }
        i6cVar.f().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - i6cVar.f().getTop());
        o6cVar.getHalfExpandedViewHelper().a(i6cVar.f().getTop());
        i6cVar.m(i6cVar.f().getTop());
        sm6Var.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final f6c getHalfExpandedViewHelper() {
        return (f6c) this.t0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollStateOffset() {
        int iOrdinal = this.b.ordinal();
        Integer numValueOf = null;
        if (iOrdinal == 0) {
            i6c i6cVar = this.a;
            if (i6cVar != null) {
                numValueOf = Integer.valueOf(i6cVar.e());
            }
        } else if (iOrdinal == 1) {
            i6c i6cVar2 = this.a;
            if (i6cVar2 != null) {
                numValueOf = Integer.valueOf(i6cVar2.c());
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i6c i6cVar3 = this.a;
            if (i6cVar3 != null) {
                numValueOf = Integer.valueOf(i6cVar3.a());
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getViewDragHeight() {
        View viewF;
        i6c i6cVar = this.a;
        if (i6cVar == null || (viewF = i6cVar.f()) == null) {
            return 0;
        }
        return viewF.getHeight();
    }

    public static /* synthetic */ void i(o6c o6cVar, int i, g6c g6cVar, g6c g6cVar2, sm6 sm6Var, int i2) {
        cm6 zfbVar = g6cVar;
        if ((i2 & 2) != 0) {
            zfbVar = new zfb(22);
        }
        cm6 zfbVar2 = g6cVar2;
        if ((i2 & 4) != 0) {
            zfbVar2 = new zfb(22);
        }
        o6cVar.h(i, zfbVar, zfbVar2, sm6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (n7j.b(f, 0.0f, 1.0f) * 255));
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.s0.f()) {
            WeakHashMap weakHashMap = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public final i6c getCallback() {
        return this.a;
    }

    public final m6c getScrollState() {
        return this.b;
    }

    public final boolean getStackFromBottom() {
        return this.c;
    }

    public final void h(int i, cm6 cm6Var, cm6 cm6Var2, sm6 sm6Var) {
        View viewF;
        ValueAnimator valueAnimator = this.o;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            lqi.a(valueAnimator2);
        }
        i6c i6cVar = this.a;
        if (i6cVar == null || (viewF = i6cVar.f()) == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewF.getTop(), i);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new nf(this, sm6Var, animatedFraction, 1));
        valueAnimatorOfInt.addListener(new xg(cm6Var2, this, cm6Var, 1));
        valueAnimatorOfInt.start();
        this.o = valueAnimatorOfInt;
    }

    public final void j(boolean z) {
        View viewF;
        this.b = m6c.a;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            i6c i6cVar = this.a;
            if (i6cVar != null) {
                i6cVar.i();
            }
            if (z) {
                i(this, scrollStateOffset, new g6c(this, 1), null, new h6c(this, 1), 4);
            } else {
                i6c i6cVar2 = this.a;
                if (i6cVar2 != null && (viewF = i6cVar2.f()) != null) {
                    viewF.offsetTopAndBottom(scrollStateOffset);
                }
                i6c i6cVar3 = this.a;
                if (i6cVar3 != null) {
                    i6cVar3.h();
                }
                setBackgroundAlpha(0.0f);
            }
        }
        invalidate();
    }

    public final void k() {
        this.b = m6c.c;
        if (getViewDragHeight() > 0) {
            i(this, getScrollStateOffset(), null, new g6c(this, 0), new h6c(this, 0), 2);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 2
            if (r0 != r1) goto L1d
            i6c r0 = r4.a
            if (r0 == 0) goto L1d
            m6c r1 = r4.b
            float r2 = r5.getX()
            float r3 = r5.getY()
            boolean r0 = r0.n(r1, r2, r3)
            r1 = 1
            if (r0 != r1) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r4.d = r1
            lfh r0 = r4.s0     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r0.p(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r5 = move-exception
            ipd r0 = new ipd
            r0.<init>(r5)
            r5 = r0
        L32:
            java.lang.Throwable r0 = defpackage.kpd.a(r5)
            if (r0 == 0) goto L3f
            java.lang.String r1 = "PopupLayout"
            java.lang.String r2 = "onInterceptTouchEvent fail, issue ONEME-9645"
            defpackage.wqi.e(r1, r2, r0)
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r5 instanceof defpackage.ipd
            if (r1 == 0) goto L46
            r5 = r0
        L46:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewF;
        i6c i6cVar = this.a;
        if (i6cVar == null || (viewF = i6cVar.f()) == null) {
            return;
        }
        int scrollStateOffset = (this.o == null && this.s0.a == 0) ? getScrollStateOffset() : viewF.getTop();
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup.LayoutParams layoutParams = viewF.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i5 = scrollStateOffset - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        viewF.offsetTopAndBottom(i5);
        f6c halfExpandedViewHelper = getHalfExpandedViewHelper();
        halfExpandedViewHelper.b = 0;
        halfExpandedViewHelper.a(i5);
        if (this.u0 != viewF.getMeasuredHeight()) {
            this.u0 = viewF.getMeasuredHeight();
            if (this.o != null) {
                int iOrdinal = this.b.ordinal();
                if (iOrdinal == 0) {
                    j(true);
                } else if (iOrdinal == 1) {
                    setHalfScreen(null);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l6c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l6c l6cVar = (l6c) parcelable;
        super.onRestoreInstanceState(l6cVar.getSuperState());
        m6c m6cVar = (m6c) m6c.o.get(l6cVar.a);
        this.b = m6cVar;
        this.c = l6cVar.b;
        int iOrdinal = m6cVar.ordinal();
        if (iOrdinal == 0) {
            j(false);
        } else if (iOrdinal == 1) {
            setHalfScreen(null);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            k();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new l6c(super.onSaveInstanceState(), this.b.ordinal(), this.c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object ipdVar;
        lfh lfhVar = this.s0;
        if (lfhVar.r == null) {
            return super.onTouchEvent(motionEvent);
        }
        this.d = true;
        try {
            lfhVar.j(motionEvent);
            ipdVar = Boolean.TRUE;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e("PopupLayout", "onTouchEvent fail, issue ONEME-9645", thA);
        }
        Boolean bool = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = bool;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        lfh lfhVar = this.s0;
        int i = lfhVar.a;
        if (i == 2 || i == 1) {
            return;
        }
        OverScroller overScroller = lfhVar.p;
        lfhVar.a();
        if (lfhVar.a == 2) {
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            lfhVar.q.k(lfhVar.r, overScroller.getCurrX(), overScroller.getCurrY());
        }
        lfhVar.n(0);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.b == m6c.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final void setCallback(i6c i6cVar) {
        this.a = i6cVar;
    }

    public final void setHalfScreen(sm6 sm6Var) {
        this.b = m6c.b;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            if (sm6Var == null) {
                sm6Var = new h6c(this, 2);
            }
            h(scrollStateOffset, new zfb(22), new g6c(this, 3), sm6Var);
        } else if (this.b == m6c.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
        invalidate();
    }

    public final void setScrollState(m6c m6cVar) {
        this.b = m6cVar;
    }

    public final void setStackFromBottom(boolean z) {
        this.c = z;
    }
}
