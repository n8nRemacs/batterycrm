package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.customview.widget.d;
import j.N;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public d f355904a;

    /* renamed from: b, reason: collision with root package name */
    public b f355905b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f355907d;

    /* renamed from: e, reason: collision with root package name */
    public int f355908e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final float f355909f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public float f355910g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f355911h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public final d.c f355912i = new a();

    public class a extends d.c {

        /* renamed from: a, reason: collision with root package name */
        public int f355913a;

        /* renamed from: b, reason: collision with root package name */
        public int f355914b = -1;

        public a() {
        }

        @Override // androidx.customview.widget.d.c
        public final int a(@N View view, int i12, int i13) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            boolean z12 = view.getLayoutDirection() == 1;
            int i14 = SwipeDismissBehavior.this.f355908e;
            if (i14 == 0) {
                if (z12) {
                    width = this.f355913a - view.getWidth();
                    width2 = this.f355913a;
                } else {
                    width = this.f355913a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i14 != 1) {
                width = this.f355913a - view.getWidth();
                width2 = view.getWidth() + this.f355913a;
            } else if (z12) {
                width = this.f355913a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f355913a - view.getWidth();
                width2 = this.f355913a;
            }
            return Math.min(Math.max(width, i12), width2);
        }

        @Override // androidx.customview.widget.d.c
        public final int b(@N View view, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public final int c(@N View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public final void g(@N View view, int i12) {
            this.f355914b = i12;
            this.f355913a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f355907d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f355907d = false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void h(int i12) {
            b bVar = SwipeDismissBehavior.this.f355905b;
            if (bVar != null) {
                bVar.a(i12);
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void i(int i12, int i13, int i14, @N View view) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f12 = width * swipeDismissBehavior.f355910g;
            float width2 = view.getWidth() * swipeDismissBehavior.f355911h;
            float fAbs = Math.abs(i12 - this.f355913a);
            if (fAbs <= f12) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f12) / (width2 - f12))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
        @Override // androidx.customview.widget.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void j(@j.N android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f355914b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r5 = androidx.core.view.C22823h0.f45055a
                int r5 = r9.getLayoutDirection()
                if (r5 != r3) goto L1a
                r5 = r3
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r2.f355908e
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L2a:
                if (r1 <= 0) goto L66
                goto L52
            L2d:
                if (r6 != r3) goto L66
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L66
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f355913a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r2.f355909f
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L66
            L52:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L61
                int r10 = r9.getLeft()
                int r0 = r8.f355913a
                if (r10 >= r0) goto L5f
                goto L61
            L5f:
                int r0 = r0 + r11
                goto L69
            L61:
                int r10 = r8.f355913a
                int r0 = r10 - r11
                goto L69
            L66:
                int r0 = r8.f355913a
                r3 = r4
            L69:
                androidx.customview.widget.d r10 = r2.f355904a
                int r11 = r9.getTop()
                boolean r10 = r10.r(r0, r11)
                if (r10 == 0) goto L80
                com.google.android.material.behavior.SwipeDismissBehavior$c r10 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                r10.<init>(r9, r3)
                java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r11 = androidx.core.view.C22823h0.f45055a
                r9.postOnAnimation(r10)
                goto L89
            L80:
                if (r3 == 0) goto L89
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = r2.f355905b
                if (r10 == 0) goto L89
                r10.b(r9)
            L89:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(View view, int i12) {
            int i13 = this.f355914b;
            return (i13 == -1 || i13 == i12) && SwipeDismissBehavior.this.v(view);
        }
    }

    public interface b {
        void a(int i12);

        void b(View view);
    }

    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final View f355916b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f355917c;

        public c(View view, boolean z12) {
            this.f355916b = view;
            this.f355917c = z12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            d dVar = swipeDismissBehavior.f355904a;
            View view = this.f355916b;
            if (dVar != null && dVar.h()) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                view.postOnAnimation(this);
            } else {
                if (!this.f355917c || (bVar = swipeDismissBehavior.f355905b) == null) {
                    return;
                }
                bVar.b(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f355906c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v12, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f355906c = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f355906c = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        if (this.f355904a == null) {
            this.f355904a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f355912i);
        }
        return !this.f355907d && this.f355904a.s(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (v12.getImportantForAccessibility() == 0) {
            v12.setImportantForAccessibility(1);
            C22823h0.y(v12, 1048576);
            C22823h0.u(v12, 0);
            if (v(v12)) {
                C22823h0.z(v12, f.a.f45011n, new com.google.android.material.behavior.b(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean u(CoordinatorLayout coordinatorLayout, V v12, MotionEvent motionEvent) {
        if (this.f355904a == null) {
            return false;
        }
        if (this.f355907d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f355904a.l(motionEvent);
        return true;
    }

    public boolean v(@N View view) {
        return true;
    }
}
