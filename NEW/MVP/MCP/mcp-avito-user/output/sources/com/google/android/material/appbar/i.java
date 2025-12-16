package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import j.P;
import java.util.WeakHashMap;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes6.dex */
abstract class i<V extends View> extends k<V> {

    /* renamed from: c, reason: collision with root package name */
    @P
    public Runnable f355822c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f355823d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f355824e;

    /* renamed from: f, reason: collision with root package name */
    public int f355825f;

    /* renamed from: g, reason: collision with root package name */
    public int f355826g;

    /* renamed from: h, reason: collision with root package name */
    public int f355827h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public VelocityTracker f355828i;

    /* compiled from: HeaderBehavior.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final CoordinatorLayout f355829b;

        /* renamed from: c, reason: collision with root package name */
        public final V f355830c;

        public a(CoordinatorLayout coordinatorLayout, V v12) {
            this.f355829b = coordinatorLayout;
            this.f355830c = v12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar;
            OverScroller overScroller;
            V v12 = this.f355830c;
            if (v12 == null || (overScroller = (iVar = i.this).f355823d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f355829b;
            if (!zComputeScrollOffset) {
                iVar.C(coordinatorLayout, v12);
                return;
            }
            iVar.E(coordinatorLayout, v12, iVar.f355823d.getCurrY());
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            v12.postOnAnimation(this);
        }
    }

    public i() {
        this.f355825f = -1;
        this.f355827h = -1;
    }

    public int A(@N V v12) {
        return -v12.getHeight();
    }

    public int B(@N V v12) {
        return v12.getHeight();
    }

    public int D(CoordinatorLayout coordinatorLayout, V v12, int i12, int i13, int i14) {
        int iB2;
        int iV2 = v();
        if (i13 == 0 || iV2 < i13 || iV2 > i14 || iV2 == (iB2 = M0.a.b(i12, i13, i14))) {
            return 0;
        }
        y(iB2);
        return iV2 - iB2;
    }

    public final void E(CoordinatorLayout coordinatorLayout, View view, int i12) {
        D(coordinatorLayout, view, i12, BeduinInputModel.MIN_TEXT_VERSION, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f355827h < 0) {
            this.f355827h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f355824e) {
            int i12 = this.f355825f;
            if (i12 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i12)) == -1) {
                return false;
            }
            int y12 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y12 - this.f355826g) > this.f355827h) {
                this.f355826g = y12;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f355825f = -1;
            int x12 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            boolean z12 = z(v12) && coordinatorLayout.isPointInChildBounds(v12, x12, y13);
            this.f355824e = z12;
            if (z12) {
                this.f355826g = y13;
                this.f355825f = motionEvent.getPointerId(0);
                if (this.f355828i == null) {
                    this.f355828i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f355823d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f355823d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f355828i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(@j.N androidx.coordinatorlayout.widget.CoordinatorLayout r20, @j.N V r21, @j.N android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.i.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean z(V v12) {
        return false;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f355825f = -1;
        this.f355827h = -1;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v12) {
    }
}
