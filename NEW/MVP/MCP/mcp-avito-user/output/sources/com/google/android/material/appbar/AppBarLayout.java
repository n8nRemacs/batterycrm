package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.G;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.core.view.accessibility.f;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import j.D;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.X;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import lY0.C43707b;
import m.C43852a;
import wY0.C49576a;

/* loaded from: classes6.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: z, reason: collision with root package name */
    public static final int f355715z = R.style.Widget_Design_AppBarLayout;

    /* renamed from: b, reason: collision with root package name */
    public int f355716b;

    /* renamed from: c, reason: collision with root package name */
    public int f355717c;

    /* renamed from: d, reason: collision with root package name */
    public int f355718d;

    /* renamed from: e, reason: collision with root package name */
    public int f355719e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355720f;

    /* renamed from: g, reason: collision with root package name */
    public int f355721g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public J0 f355722h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f355723i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f355724j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f355725k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f355726l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f355727m;

    /* renamed from: n, reason: collision with root package name */
    @D
    public int f355728n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public WeakReference<View> f355729o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final ColorStateList f355730p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public ValueAnimator f355731q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public final ValueAnimator.AnimatorUpdateListener f355732r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f355733s;

    /* renamed from: t, reason: collision with root package name */
    public final long f355734t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f355735u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f355736v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public Drawable f355737w;

    /* renamed from: x, reason: collision with root package name */
    public final float f355738x;

    /* renamed from: y, reason: collision with root package name */
    public Behavior f355739y;

    public static class BaseBehavior<T extends AppBarLayout> extends i<T> {

        /* renamed from: j, reason: collision with root package name */
        public int f355740j;

        /* renamed from: k, reason: collision with root package name */
        public int f355741k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f355742l;

        /* renamed from: m, reason: collision with root package name */
        public SavedState f355743m;

        /* renamed from: n, reason: collision with root package name */
        @P
        public WeakReference<View> f355744n;

        /* renamed from: o, reason: collision with root package name */
        public Behavior.a f355745o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f355746p;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            public boolean f355747d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f355748e;

            /* renamed from: f, reason: collision with root package name */
            public int f355749f;

            /* renamed from: g, reason: collision with root package name */
            public float f355750g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f355751h;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                @N
                public final SavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @N
                public final Object[] newArray(int i12) {
                    return new SavedState[i12];
                }

                @Override // android.os.Parcelable.Creator
                @P
                public final Object createFromParcel(@N Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            }

            public SavedState(@N Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f355747d = parcel.readByte() != 0;
                this.f355748e = parcel.readByte() != 0;
                this.f355749f = parcel.readInt();
                this.f355750g = parcel.readFloat();
                this.f355751h = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(@N Parcel parcel, int i12) {
                super.writeToParcel(parcel, i12);
                parcel.writeByte(this.f355747d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f355748e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f355749f);
                parcel.writeFloat(this.f355750g);
                parcel.writeByte(this.f355751h ? (byte) 1 : (byte) 0);
            }
        }

        public class a extends C22808a {
            public a() {
            }

            @Override // androidx.core.view.C22808a
            public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
                this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
                fVar.t(BaseBehavior.this.f355746p);
                fVar.k(ScrollView.class.getName());
            }
        }

        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a();
        }

        public BaseBehavior() {
        }

        public static void G(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        @P
        public static View H(@N CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = coordinatorLayout.getChildAt(i12);
                if ((childAt instanceof G) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void O(@j.N androidx.coordinatorlayout.widget.CoordinatorLayout r7, @j.N com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r0 = 1
                int r1 = java.lang.Math.abs(r9)
                int r2 = r8.getChildCount()
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L20
                android.view.View r5 = r8.getChildAt(r4)
                int r6 = r5.getTop()
                if (r1 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r1 > r6) goto L1e
                goto L21
            L1e:
                int r4 = r4 + r0
                goto Lb
            L20:
                r5 = 0
            L21:
                if (r5 == 0) goto L5c
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$e r1 = (com.google.android.material.appbar.AppBarLayout.e) r1
                int r1 = r1.f355756a
                r2 = r1 & 1
                if (r2 == 0) goto L5c
                java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r2 = androidx.core.view.C22823h0.f45055a
                int r2 = r5.getMinimumHeight()
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
            L48:
                r9 = r0
                goto L5d
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5c
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
                goto L48
            L5c:
                r9 = r3
            L5d:
                boolean r10 = r8.f355727m
                if (r10 == 0) goto L69
                android.view.View r9 = H(r7)
                boolean r9 = r8.i(r9)
            L69:
                boolean r9 = r8.h(r9)
                if (r11 != 0) goto L96
                if (r9 == 0) goto L99
                java.util.List r7 = r7.getDependents(r8)
                int r9 = r7.size()
            L79:
                if (r3 >= r9) goto L99
                java.lang.Object r10 = r7.get(r3)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$g r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f44447a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto L94
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r7 = r10.f355835f
                if (r7 == 0) goto L99
                goto L96
            L94:
                int r3 = r3 + r0
                goto L79
            L96:
                r8.jumpDrawablesToCurrentState()
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.O(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // com.google.android.material.appbar.i
        public final int A(@N View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.i
        public final int B(@N View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.i
        public final void C(@N CoordinatorLayout coordinatorLayout, @N View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            M(coordinatorLayout, appBarLayout);
            if (appBarLayout.f355727m) {
                appBarLayout.h(appBarLayout.i(H(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
        @Override // com.google.android.material.appbar.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int D(@j.N androidx.coordinatorlayout.widget.CoordinatorLayout r17, @j.N android.view.View r18, int r19, int r20, int r21) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void F(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, int i12) {
            int iAbs = Math.abs(w() - i12);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iW2 = w();
            if (iW2 == i12) {
                ValueAnimator valueAnimator = this.f355742l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f355742l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f355742l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f355742l = valueAnimator3;
                valueAnimator3.setInterpolator(C43707b.f413883e);
                this.f355742l.addUpdateListener(new com.google.android.material.appbar.d(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f355742l.setDuration(Math.min(iRound, 600));
            this.f355742l.setIntValues(iW2, i12);
            this.f355742l.start();
        }

        /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.material.appbar.b] */
        public void I(@N CoordinatorLayout coordinatorLayout, @N final AppBarLayout appBarLayout, int i12) {
            int iRound;
            super.j(coordinatorLayout, appBarLayout, i12);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f355743m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z12 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i13 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z12) {
                            F(coordinatorLayout, appBarLayout, i13);
                        } else {
                            E(coordinatorLayout, appBarLayout, i13);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z12) {
                            F(coordinatorLayout, appBarLayout, 0);
                        } else {
                            E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f355747d) {
                E(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f355748e) {
                E(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f355749f);
                int i14 = -childAt.getBottom();
                if (this.f355743m.f355751h) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i14;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f355743m.f355750g) + i14;
                }
                E(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f355721g = 0;
            this.f355743m = null;
            y(M0.a.b(v(), -appBarLayout.getTotalScrollRange(), 0));
            O(coordinatorLayout, appBarLayout, v(), 0, true);
            appBarLayout.e(v());
            N(coordinatorLayout, appBarLayout);
            final View viewH = H(coordinatorLayout);
            if (viewH != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    viewH.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: com.google.android.material.appbar.b
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = this.f355804a;
                            View view2 = viewH;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.G(keyEvent, view2, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    viewH.setOnKeyListener(new View.OnKeyListener() { // from class: com.google.android.material.appbar.c
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i15, KeyEvent keyEvent) {
                            View view2 = viewH;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            this.f355807b.getClass();
                            AppBarLayout.BaseBehavior.G(keyEvent, view2, appBarLayout2);
                            return false;
                        }
                    });
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public void n(CoordinatorLayout coordinatorLayout, @N T t12, View view, int i12, int i13, int[] iArr, int i14) {
            int i15;
            int downNestedPreScrollRange;
            if (i13 != 0) {
                if (i13 < 0) {
                    i15 = -t12.getTotalScrollRange();
                    downNestedPreScrollRange = t12.getDownNestedPreScrollRange() + i15;
                } else {
                    i15 = -t12.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i16 = i15;
                int i17 = downNestedPreScrollRange;
                if (i16 != i17) {
                    iArr[1] = D(coordinatorLayout, t12, w() - i13, i16, i17);
                }
            }
            if (t12.f355727m) {
                t12.h(t12.i(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public void o(CoordinatorLayout coordinatorLayout, @N T t12, View view, int i12, int i13, int i14, int i15, int i16, int[] iArr) {
            if (i15 < 0) {
                iArr[1] = D(coordinatorLayout, t12, w() - i15, -t12.getDownNestedScrollRange(), 0);
            }
            if (i15 == 0) {
                N(coordinatorLayout, t12);
            }
        }

        @P
        public final SavedState L(@P Parcelable parcelable, @N T t12) {
            int iV2 = v();
            int childCount = t12.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t12.getChildAt(i12);
                int bottom = childAt.getBottom() + iV2;
                if (childAt.getTop() + iV2 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f45354c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z12 = iV2 == 0;
                    savedState.f355748e = z12;
                    savedState.f355747d = !z12 && (-iV2) >= t12.getTotalScrollRange();
                    savedState.f355749f = i12;
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    savedState.f355751h = bottom == t12.getTopInset() + childAt.getMinimumHeight();
                    savedState.f355750g = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void M(CoordinatorLayout coordinatorLayout, @N T t12) {
            int paddingTop = t12.getPaddingTop() + t12.getTopInset();
            int iW2 = w() - paddingTop;
            int childCount = t12.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    i12 = -1;
                    break;
                }
                View childAt = t12.getChildAt(i12);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if ((eVar.f355756a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i13 = -iW2;
                if (top <= i13 && bottom >= i13) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                View childAt2 = t12.getChildAt(i12);
                e eVar2 = (e) childAt2.getLayoutParams();
                int i14 = eVar2.f355756a;
                if ((i14 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i12 == 0) {
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        if (t12.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= t12.getTopInset();
                        }
                    }
                    if ((i14 & 2) == 2) {
                        WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i14 & 5) == 5) {
                        WeakHashMap<View, A0> weakHashMap3 = C22823h0.f45055a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iW2 < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i14 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) eVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) eVar2).bottomMargin;
                    }
                    if (iW2 < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    F(coordinatorLayout, t12, M0.a.b(topInset + paddingTop, -t12.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void N(androidx.coordinatorlayout.widget.CoordinatorLayout r11, @j.N T r12) {
            /*
                r10 = this;
                androidx.core.view.accessibility.f$a r0 = androidx.core.view.accessibility.f.a.f45007j
                int r0 = r0.a()
                androidx.core.view.C22823h0.y(r11, r0)
                r0 = 0
                androidx.core.view.C22823h0.u(r11, r0)
                androidx.core.view.accessibility.f$a r1 = androidx.core.view.accessibility.f.a.f45008k
                int r1 = r1.a()
                androidx.core.view.C22823h0.y(r11, r1)
                androidx.core.view.C22823h0.u(r11, r0)
                int r1 = r12.getTotalScrollRange()
                if (r1 != 0) goto L20
                return
            L20:
                int r1 = r11.getChildCount()
                r2 = r0
            L25:
                if (r2 >= r1) goto L3c
                android.view.View r3 = r11.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$g r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r4
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f44447a
                boolean r4 = r4 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r4 == 0) goto L39
            L37:
                r8 = r3
                goto L3e
            L39:
                int r2 = r2 + 1
                goto L25
            L3c:
                r3 = 0
                goto L37
            L3e:
                if (r8 != 0) goto L41
                return
            L41:
                int r1 = r12.getChildCount()
                r2 = r0
            L46:
                if (r2 >= r1) goto Lb1
                android.view.View r3 = r12.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$e r3 = (com.google.android.material.appbar.AppBarLayout.e) r3
                int r3 = r3.f355756a
                if (r3 == 0) goto Lae
                android.view.View$AccessibilityDelegate r1 = androidx.core.view.C22823h0.g(r11)
                if (r1 == 0) goto L5d
                goto L65
            L5d:
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r1 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                r1.<init>()
                androidx.core.view.C22823h0.C(r11, r1)
            L65:
                int r1 = r10.w()
                int r2 = r12.getTotalScrollRange()
                int r2 = -r2
                r3 = 1
                if (r1 == r2) goto L7c
                androidx.core.view.accessibility.f$a r1 = androidx.core.view.accessibility.f.a.f45007j
                com.google.android.material.appbar.f r2 = new com.google.android.material.appbar.f
                r2.<init>(r12, r0)
                androidx.core.view.C22823h0.z(r11, r1, r2)
                r0 = r3
            L7c:
                int r1 = r10.w()
                if (r1 == 0) goto Laa
                r1 = -1
                boolean r1 = r8.canScrollVertically(r1)
                if (r1 == 0) goto L9f
                int r1 = r12.getDownNestedPreScrollRange()
                int r9 = -r1
                if (r9 == 0) goto Laa
                androidx.core.view.accessibility.f$a r0 = androidx.core.view.accessibility.f.a.f45008k
                com.google.android.material.appbar.e r1 = new com.google.android.material.appbar.e
                r4 = r1
                r5 = r10
                r6 = r11
                r7 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                androidx.core.view.C22823h0.z(r11, r0, r1)
                goto Lab
            L9f:
                androidx.core.view.accessibility.f$a r0 = androidx.core.view.accessibility.f.a.f45008k
                com.google.android.material.appbar.f r1 = new com.google.android.material.appbar.f
                r1.<init>(r12, r3)
                androidx.core.view.C22823h0.z(r11, r0, r1)
                goto Lab
            Laa:
                r3 = r0
            Lab:
                r10.f355746p = r3
                return
            Lae:
                int r2 = r2 + 1
                goto L46
            Lb1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout):void");
        }

        @Override // com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean j(@N CoordinatorLayout coordinatorLayout, @N View view, int i12) {
            I(coordinatorLayout, (AppBarLayout) view, i12);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean k(@N CoordinatorLayout coordinatorLayout, @N View view, int i12, int i13, int i14) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i12, i13, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(@N View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f355743m = (SavedState) parcelable;
            } else {
                this.f355743m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable r(@N View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateL = L(absSavedState, (AppBarLayout) view);
            return savedStateL == null ? absSavedState : savedStateL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean s(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2, View view3, int i12, int i13) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z12 = (i12 & 2) != 0 && (appBarLayout.f355727m || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z12 && (valueAnimator = this.f355742l) != null) {
                valueAnimator.cancel();
            }
            this.f355744n = null;
            this.f355741k = i13;
            return z12;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void t(CoordinatorLayout coordinatorLayout, @N View view, View view2, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f355741k == 0 || i12 == 1) {
                M(coordinatorLayout, appBarLayout);
                if (appBarLayout.f355727m) {
                    appBarLayout.h(appBarLayout.i(view2));
                }
            }
            this.f355744n = new WeakReference<>(view2);
        }

        @Override // com.google.android.material.appbar.k
        public final int w() {
            return v() + this.f355740j;
        }

        @Override // com.google.android.material.appbar.i
        public final boolean z(View view) {
            View view2;
            Behavior.a aVar = this.f355745o;
            if (aVar != null) {
                return aVar.a();
            }
            WeakReference<View> weakReference = this.f355744n;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.b<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends j {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.j
        public final float A(View view) {
            int i12;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f44447a;
                int iW2 = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).w() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iW2 > downNestedPreScrollRange) && (i12 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iW2 / i12) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.j
        public final int B(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) {
            int iB2;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.g) view2.getLayoutParams()).f44447a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f355740j + this.f355834e;
                if (this.f355835f == 0) {
                    iB2 = 0;
                } else {
                    float fA2 = A(view2);
                    int i12 = this.f355835f;
                    iB2 = M0.a.b((int) (fA2 * i12), 0, i12);
                }
                int i13 = bottom - iB2;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                view.offsetTopAndBottom(i13);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f355727m) {
                    appBarLayout.h(appBarLayout.i(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void g(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) {
            if (view2 instanceof AppBarLayout) {
                C22823h0.y(coordinatorLayout, f.a.f45007j.a());
                C22823h0.u(coordinatorLayout, 0);
                C22823h0.y(coordinatorLayout, f.a.f45008k.a());
                C22823h0.u(coordinatorLayout, 0);
                C22823h0.C(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(@N CoordinatorLayout coordinatorLayout, @N View view, @N Rect rect, boolean z12) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i12);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i12++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f355832c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.g(false, !z12, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.j
        @P
        public final AppBarLayout z(@N List list) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) list.get(i12);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            this.f355835f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements M {
        public a() {
        }

        @Override // androidx.core.view.M
        public final J0 h(View view, J0 j02) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            J0 j03 = appBarLayout.getFitsSystemWindows() ? j02 : null;
            if (!Objects.equals(appBarLayout.f355722h, j03)) {
                appBarLayout.f355722h = j03;
                appBarLayout.setWillNotDraw(!(appBarLayout.f355737w != null && appBarLayout.getTopInset() > 0));
                appBarLayout.requestLayout();
            }
            return j02;
        }
    }

    public interface b<T extends AppBarLayout> {
        void c(T t12, int i12);
    }

    public static abstract class c {
    }

    public static class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f355754a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f355755b = new Rect();
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f355756a;

        /* renamed from: b, reason: collision with root package name */
        public d f355757b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f355758c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface b {
        }
    }

    public interface f {
        void a();
    }

    public interface g extends b<AppBarLayout> {
    }

    public AppBarLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public static e c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            e eVar = new e((LinearLayout.LayoutParams) layoutParams);
            eVar.f355756a = 1;
            return eVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar2 = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar2.f355756a = 1;
            return eVar2;
        }
        e eVar3 = new e(layoutParams);
        eVar3.f355756a = 1;
        return eVar3;
    }

    public final void a(g gVar) {
        if (this.f355723i == null) {
            this.f355723i = new ArrayList();
        }
        if (gVar == null || this.f355723i.contains(gVar)) {
            return;
        }
        this.f355723i.add(gVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f355756a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
        eVar.f355756a = typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        eVar.f355757b = typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new d();
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            eVar.f355758c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void d() {
        Behavior behavior = this.f355739y;
        BaseBehavior.SavedState savedStateL = (behavior == null || this.f355717c == -1 || this.f355721g != 0) ? null : behavior.L(AbsSavedState.f45354c, this);
        this.f355717c = -1;
        this.f355718d = -1;
        this.f355719e = -1;
        if (savedStateL != null) {
            Behavior behavior2 = this.f355739y;
            if (behavior2.f355743m != null) {
                return;
            }
            behavior2.f355743m = savedStateL;
        }
    }

    @Override // android.view.View
    public final void draw(@N Canvas canvas) {
        super.draw(canvas);
        if (this.f355737w == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f355716b);
        this.f355737w.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f355737w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i12) {
        this.f355716b = i12;
        if (!willNotDraw()) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f355723i;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) this.f355723i.get(i13);
                if (bVar != null) {
                    bVar.c(this, i12);
                }
            }
        }
    }

    public final void f(g gVar) {
        ArrayList arrayList = this.f355723i;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.remove(gVar);
    }

    public final void g(boolean z12, boolean z13, boolean z14) {
        this.f355721g = (z12 ? 1 : 2) | (z13 ? 4 : 0) | (z14 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -2);
        eVar.f355756a = 1;
        return eVar;
    }

    @N
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f355739y = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.f355718d
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$e r7 = (com.google.android.material.appbar.AppBarLayout.e) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.f355756a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r7 = androidx.core.view.C22823h0.f45055a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r7 = androidx.core.view.C22823h0.f45055a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r9 = androidx.core.view.C22823h0.f45055a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.f355718d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i12 = this.f355719e;
        if (i12 != -1) {
            return i12;
        }
        int childCount = getChildCount();
        int i13 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + childAt.getMeasuredHeight();
                int i14 = eVar.f355756a;
                if ((i14 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i14 & 2) != 0) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i13++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f355719e = iMax;
        return iMax;
    }

    @D
    public int getLiftOnScrollTargetViewId() {
        return this.f355728n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f355721g;
    }

    @P
    public Drawable getStatusBarForeground() {
        return this.f355737w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @k0
    public final int getTopInset() {
        J0 j02 = this.f355722h;
        if (j02 != null) {
            return j02.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i12 = this.f355717c;
        if (i12 != -1) {
            return i12;
        }
        int childCount = getChildCount();
        int i13 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = eVar.f355756a;
                if ((i14 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + minimumHeight;
                if (i13 == 0) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i14 & 2) != 0) {
                    WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i13++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f355717c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(boolean z12) {
        if (this.f355724j || this.f355726l == z12) {
            return false;
        }
        this.f355726l = z12;
        refreshDrawableState();
        if (this.f355727m && (getBackground() instanceof com.google.android.material.shape.k)) {
            if (this.f355730p != null) {
                k(z12 ? 0.0f : 255.0f, z12 ? 255.0f : 0.0f);
            } else {
                float f12 = this.f355738x;
                k(z12 ? 0.0f : f12, z12 ? f12 : 0.0f);
            }
        }
        return true;
    }

    public final boolean i(@P View view) {
        int i12;
        if (this.f355729o == null && (i12 = this.f355728n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i12) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f355728n);
            }
            if (viewFindViewById != null) {
                this.f355729o = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f355729o;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean j() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return !childAt.getFitsSystemWindows();
    }

    public final void k(float f12, float f13) {
        ValueAnimator valueAnimator = this.f355731q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f12, f13);
        this.f355731q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f355734t);
        this.f355731q.setInterpolator(this.f355735u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f355732r;
        if (animatorUpdateListener != null) {
            this.f355731q.addUpdateListener(animatorUpdateListener);
        }
        this.f355731q.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i12) {
        if (this.f355736v == null) {
            this.f355736v = new int[4];
        }
        int[] iArr = this.f355736v;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + iArr.length);
        boolean z12 = this.f355725k;
        int i13 = R.attr.state_liftable;
        if (!z12) {
            i13 = -i13;
        }
        iArr[0] = i13;
        iArr[1] = (z12 && this.f355726l) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i14 = R.attr.state_collapsible;
        if (!z12) {
            i14 = -i14;
        }
        iArr[2] = i14;
        iArr[3] = (z12 && this.f355726l) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f355729o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f355729o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        boolean z13 = true;
        super.onLayout(z12, i12, i13, i14, i15);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (getFitsSystemWindows() && j()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        d();
        this.f355720f = false;
        int childCount2 = getChildCount();
        int i16 = 0;
        while (true) {
            if (i16 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i16).getLayoutParams()).f355758c != null) {
                this.f355720f = true;
                break;
            }
            i16++;
        }
        Drawable drawable = this.f355737w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f355724j) {
            return;
        }
        if (!this.f355727m) {
            int childCount3 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount3) {
                    z13 = false;
                    break;
                }
                int i18 = ((e) getChildAt(i17).getLayoutParams()).f355756a;
                if ((i18 & 1) == 1 && (i18 & 10) != 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (this.f355725k != z13) {
            this.f355725k = z13;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        int mode = View.MeasureSpec.getMode(i13);
        if (mode != 1073741824) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (getFitsSystemWindows() && j()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = M0.a.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i13));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        com.google.android.material.shape.m.b(this, f12);
    }

    public void setExpanded(boolean z12) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        g(z12, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z12) {
        this.f355727m = z12;
    }

    public void setLiftOnScrollTargetView(@P View view) {
        this.f355728n = -1;
        if (view != null) {
            this.f355729o = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f355729o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f355729o = null;
    }

    public void setLiftOnScrollTargetViewId(@D int i12) {
        this.f355728n = i12;
        WeakReference<View> weakReference = this.f355729o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f355729o = null;
    }

    public void setLiftableOverrideEnabled(boolean z12) {
        this.f355724j = z12;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i12) {
        if (i12 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i12);
    }

    public void setStatusBarForeground(@P Drawable drawable) {
        Drawable drawable2 = this.f355737w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f355737w = drawableMutate;
            boolean z12 = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f355737w.setState(getDrawableState());
                }
                Drawable drawable3 = this.f355737w;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f355737w.setVisible(getVisibility() == 0, false);
                this.f355737w.setCallback(this);
            }
            if (this.f355737w != null && getTopInset() > 0) {
                z12 = true;
            }
            setWillNotDraw(true ^ z12);
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@InterfaceC42156l int i12) {
        setStatusBarForeground(new ColorDrawable(i12));
    }

    public void setStatusBarForegroundResource(@InterfaceC42165v int i12) {
        setStatusBarForeground(C43852a.a(getContext(), i12));
    }

    @Deprecated
    public void setTargetElevation(float f12) throws Resources.NotFoundException {
        m.a(this, f12);
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        boolean z12 = i12 == 0;
        Drawable drawable = this.f355737w;
        if (drawable != null) {
            drawable.setVisible(z12, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@N Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f355737w;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@N Context context, @P AttributeSet attributeSet, int i12) throws Resources.NotFoundException {
        int i13 = f355715z;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f355717c = -1;
        this.f355718d = -1;
        this.f355719e = -1;
        final int i14 = 0;
        this.f355721g = 0;
        this.f355733s = new ArrayList();
        Context context2 = getContext();
        final int i15 = 1;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = com.google.android.material.internal.G.d(context3, attributeSet, m.f355842a, i12, i13, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = com.google.android.material.internal.G.d(context2, attributeSet, R.styleable.AppBarLayout, i12, i13, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(R.styleable.AppBarLayout_android_background);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setBackground(drawable);
            ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayD2, context2, R.styleable.AppBarLayout_liftOnScrollColor);
            this.f355730p = colorStateListB;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                final com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
                kVar.n(ColorStateList.valueOf(colorDrawable.getColor()));
                if (colorStateListB != null) {
                    kVar.setAlpha(this.f355726l ? 255 : 0);
                    kVar.n(colorStateListB);
                    this.f355732r = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.appbar.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppBarLayout f355802b;

                        {
                            this.f355802b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            com.google.android.material.shape.k kVar2 = kVar;
                            AppBarLayout appBarLayout = this.f355802b;
                            switch (i15) {
                                case 0:
                                    int i16 = AppBarLayout.f355715z;
                                    appBarLayout.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kVar2.m(fFloatValue);
                                    Drawable drawable2 = appBarLayout.f355737w;
                                    if (drawable2 instanceof com.google.android.material.shape.k) {
                                        ((com.google.android.material.shape.k) drawable2).m(fFloatValue);
                                    }
                                    Iterator it = appBarLayout.f355733s.iterator();
                                    while (it.hasNext()) {
                                        ((AppBarLayout.f) it.next()).a();
                                    }
                                    break;
                                default:
                                    int i17 = AppBarLayout.f355715z;
                                    appBarLayout.getClass();
                                    int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kVar2.setAlpha(iFloatValue);
                                    Iterator it2 = appBarLayout.f355733s.iterator();
                                    while (it2.hasNext()) {
                                        AppBarLayout.f fVar = (AppBarLayout.f) it2.next();
                                        ColorStateList colorStateList = kVar2.f357034b.f357059c;
                                        if (colorStateList != null) {
                                            colorStateList.withAlpha(iFloatValue).getDefaultColor();
                                            fVar.a();
                                        }
                                    }
                                    break;
                            }
                        }
                    };
                } else {
                    kVar.j(context2);
                    this.f355732r = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.appbar.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppBarLayout f355802b;

                        {
                            this.f355802b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            com.google.android.material.shape.k kVar2 = kVar;
                            AppBarLayout appBarLayout = this.f355802b;
                            switch (i14) {
                                case 0:
                                    int i16 = AppBarLayout.f355715z;
                                    appBarLayout.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kVar2.m(fFloatValue);
                                    Drawable drawable2 = appBarLayout.f355737w;
                                    if (drawable2 instanceof com.google.android.material.shape.k) {
                                        ((com.google.android.material.shape.k) drawable2).m(fFloatValue);
                                    }
                                    Iterator it = appBarLayout.f355733s.iterator();
                                    while (it.hasNext()) {
                                        ((AppBarLayout.f) it.next()).a();
                                    }
                                    break;
                                default:
                                    int i17 = AppBarLayout.f355715z;
                                    appBarLayout.getClass();
                                    int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kVar2.setAlpha(iFloatValue);
                                    Iterator it2 = appBarLayout.f355733s.iterator();
                                    while (it2.hasNext()) {
                                        AppBarLayout.f fVar = (AppBarLayout.f) it2.next();
                                        ColorStateList colorStateList = kVar2.f357034b.f357059c;
                                        if (colorStateList != null) {
                                            colorStateList.withAlpha(iFloatValue).getDefaultColor();
                                            fVar.a();
                                        }
                                    }
                                    break;
                            }
                        }
                    };
                }
                setBackground(kVar);
            }
            this.f355734t = C49576a.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f355735u = C49576a.d(context2, R.attr.motionEasingStandardInterpolator, C43707b.f413879a);
            if (typedArrayD2.hasValue(R.styleable.AppBarLayout_expanded)) {
                g(typedArrayD2.getBoolean(R.styleable.AppBarLayout_expanded, false), false, false);
            }
            if (typedArrayD2.hasValue(R.styleable.AppBarLayout_elevation)) {
                m.a(this, typedArrayD2.getDimensionPixelSize(R.styleable.AppBarLayout_elevation, 0));
            }
            if (typedArrayD2.hasValue(R.styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayD2.getBoolean(R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayD2.hasValue(R.styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayD2.getBoolean(R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
            this.f355738x = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f355727m = typedArrayD2.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
            this.f355728n = typedArrayD2.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
            typedArrayD2.recycle();
            C22823h0.K(this, new a());
        } catch (Throwable th2) {
            typedArrayD.recycle();
            throw th2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -2);
        eVar.f355756a = 1;
        return eVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
