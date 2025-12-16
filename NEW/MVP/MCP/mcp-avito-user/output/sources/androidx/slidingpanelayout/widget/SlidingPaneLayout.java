package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.C22771k;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import androidx.slidingpanelayout.widget.a;
import androidx.window.layout.c;
import androidx.window.layout.j;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* loaded from: classes10.dex */
public class SlidingPaneLayout extends ViewGroup implements androidx.customview.widget.c {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f54465z;

    /* renamed from: b, reason: collision with root package name */
    public int f54466b;

    /* renamed from: c, reason: collision with root package name */
    public int f54467c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f54468d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f54469e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54470f;

    /* renamed from: g, reason: collision with root package name */
    public View f54471g;

    /* renamed from: h, reason: collision with root package name */
    public float f54472h;

    /* renamed from: i, reason: collision with root package name */
    public float f54473i;

    /* renamed from: j, reason: collision with root package name */
    public int f54474j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54475k;

    /* renamed from: l, reason: collision with root package name */
    public int f54476l;

    /* renamed from: m, reason: collision with root package name */
    public float f54477m;

    /* renamed from: n, reason: collision with root package name */
    public float f54478n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f54479o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public f f54480p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.customview.widget.d f54481q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f54482r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f54483s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f54484t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList<c> f54485u;

    /* renamed from: v, reason: collision with root package name */
    public int f54486v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.window.layout.c f54487w;

    /* renamed from: x, reason: collision with root package name */
    public final a.InterfaceC1924a f54488x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.slidingpanelayout.widget.a f54489y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f54490d;

        /* renamed from: e, reason: collision with root package name */
        public int f54491e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f54490d = parcel.readInt() != 0;
            this.f54491e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f54490d ? 1 : 0);
            parcel.writeInt(this.f54491e);
        }
    }

    public class a implements a.InterfaceC1924a {
        public a() {
        }
    }

    public class b extends C22808a {

        /* renamed from: d, reason: collision with root package name */
        public final Rect f54493d = new Rect();

        public b() {
        }

        @Override // androidx.core.view.C22808a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.f44991a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            Rect rect = this.f54493d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            fVar.j(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            fVar.k(accessibilityNodeInfoObtain.getClassName());
            fVar.o(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            fVar.l(accessibilityNodeInfoObtain.isClickable());
            accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            fVar.i(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
            fVar.a(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
            fVar.k("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            fVar.f45001c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                fVar.f45000b = -1;
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = slidingPaneLayout.getChildAt(i12);
                if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                    childAt.setImportantForAccessibility(1);
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.C22808a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.b(view)) {
                return false;
            }
            return this.f44991a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class d extends d.c {
        public d() {
        }

        @Override // androidx.customview.widget.d.c
        public final int a(View view, int i12, int i13) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            e eVar = (e) slidingPaneLayout.f54471g.getLayoutParams();
            if (!slidingPaneLayout.c()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                return Math.min(Math.max(i12, paddingLeft), slidingPaneLayout.f54474j + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f54471g.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
            return Math.max(Math.min(i12, width), width - slidingPaneLayout.f54474j);
        }

        @Override // androidx.customview.widget.d.c
        public final int b(View view, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public final int c(View view) {
            return SlidingPaneLayout.this.f54474j;
        }

        @Override // androidx.customview.widget.d.c
        public final void e(int i12, int i13) {
            if (l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f54481q.c(slidingPaneLayout.f54471g, i13);
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void f(int i12) {
            if (l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f54481q.c(slidingPaneLayout.f54471g, i12);
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void g(View view, int i12) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = slidingPaneLayout.getChildAt(i13);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void h(int i12) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f54481q.f45375a == 0) {
                float f12 = slidingPaneLayout.f54472h;
                CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f54479o;
                if (f12 != 1.0f) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).a();
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.f54482r = true;
                    return;
                }
                slidingPaneLayout.g(slidingPaneLayout.f54471g);
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).b();
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f54482r = false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void i(int i12, int i13, int i14, View view) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f54471g == null) {
                slidingPaneLayout.f54472h = 0.0f;
            } else {
                boolean zC2 = slidingPaneLayout.c();
                e eVar = (e) slidingPaneLayout.f54471g.getLayoutParams();
                int width = slidingPaneLayout.f54471g.getWidth();
                if (zC2) {
                    i12 = (slidingPaneLayout.getWidth() - i12) - width;
                }
                float paddingRight = (i12 - ((zC2 ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zC2 ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin))) / slidingPaneLayout.f54474j;
                slidingPaneLayout.f54472h = paddingRight;
                if (slidingPaneLayout.f54476l != 0) {
                    slidingPaneLayout.e(paddingRight);
                }
                Iterator it = slidingPaneLayout.f54479o.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).getClass();
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public final void j(View view, float f12, float f13) {
            int paddingLeft;
            e eVar = (e) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.c()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                if (f12 < 0.0f || (f12 == 0.0f && slidingPaneLayout.f54472h > 0.5f)) {
                    paddingRight += slidingPaneLayout.f54474j;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f54471g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f12 > 0.0f || (f12 == 0.0f && slidingPaneLayout.f54472h > 0.5f)) {
                    paddingLeft += slidingPaneLayout.f54474j;
                }
            }
            slidingPaneLayout.f54481q.r(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(View view, int i12) {
            if (l()) {
                return ((e) view.getLayoutParams()).f54498b;
            }
            return false;
        }

        public final boolean l() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f54475k || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (slidingPaneLayout.d() && slidingPaneLayout.getLockMode() == 1) {
                return false;
            }
            return slidingPaneLayout.d() || slidingPaneLayout.getLockMode() != 2;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public static class h extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        f54465z = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@N Context context) {
        super(context, null, 0);
        this.f54466b = 0;
        this.f54472h = 1.0f;
        this.f54479o = new CopyOnWriteArrayList();
        this.f54483s = true;
        this.f54484t = new Rect();
        this.f54485u = new ArrayList<>();
        this.f54488x = new a();
        float f12 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C22823h0.C(this, new b());
        setImportantForAccessibility(1);
        androidx.customview.widget.d dVar = new androidx.customview.widget.d(getContext(), this, new d());
        dVar.f45376b = (int) (2.0f * dVar.f45376b);
        this.f54481q = dVar;
        dVar.f45388n = f12 * 400.0f;
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.a(j.a(context), androidx.core.content.d.getMainExecutor(context)));
    }

    private C22771k getSystemGestureInsets() {
        J0 j0O;
        if (!f54465z || (j0O = C22823h0.o(this)) == null) {
            return null;
        }
        return j0O.g();
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.a aVar) {
        this.f54489y = aVar;
        aVar.f54503d = this.f54488x;
    }

    public final boolean a() {
        if (!this.f54470f) {
            this.f54482r = false;
        }
        if (!this.f54483s && !f(1.0f)) {
            return false;
        }
        this.f54482r = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(@N View view, int i12, @P ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i12, layoutParams);
            return;
        }
        h hVar = new h(view.getContext());
        hVar.addView(view);
        super.addView(hVar, i12, layoutParams);
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.f54470f && ((e) view.getLayoutParams()).f54499c && this.f54472h > 0.0f;
    }

    public final boolean c() {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        androidx.customview.widget.d dVar = this.f54481q;
        if (dVar.h()) {
            if (!this.f54470f) {
                dVar.a();
            } else {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d() {
        return !this.f54470f || this.f54472h == 0.0f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i12;
        int right;
        super.draw(canvas);
        Drawable drawable = c() ? this.f54469e : this.f54468d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            right = childAt.getRight();
            i12 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i13 = left - intrinsicWidth;
            i12 = left;
            right = i13;
        }
        drawable.setBounds(right, top, i12, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j12) {
        boolean zC2 = c() ^ d();
        androidx.customview.widget.d dVar = this.f54481q;
        if (zC2) {
            dVar.f45391q = 1;
            C22771k systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                dVar.f45389o = Math.max(dVar.f45390p, systemGestureInsets.f44775a);
            }
        } else {
            dVar.f45391q = 2;
            C22771k systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                dVar.f45389o = Math.max(dVar.f45390p, systemGestureInsets2.f44777c);
            }
        }
        e eVar = (e) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f54470f && !eVar.f54498b && this.f54471g != null) {
            Rect rect = this.f54484t;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.f54471g.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f54471g.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j12);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final void e(float f12) {
        boolean zC2 = c();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != this.f54471g) {
                float f13 = 1.0f - this.f54473i;
                int i13 = this.f54476l;
                this.f54473i = f12;
                int i14 = ((int) (f13 * i13)) - ((int) ((1.0f - f12) * i13));
                if (zC2) {
                    i14 = -i14;
                }
                childAt.offsetLeftAndRight(i14);
            }
        }
    }

    public final boolean f(float f12) {
        int paddingLeft;
        if (!this.f54470f) {
            return false;
        }
        boolean zC2 = c();
        e eVar = (e) this.f54471g.getLayoutParams();
        if (zC2) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            paddingLeft = (int) (getWidth() - (((f12 * this.f54474j) + paddingRight) + this.f54471g.getWidth()));
        } else {
            paddingLeft = (int) ((f12 * this.f54474j) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
        }
        View view = this.f54471g;
        if (!this.f54481q.t(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        postInvalidateOnAnimation();
        return true;
    }

    public final void g(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z12;
        View view2 = view;
        boolean zC2 = c();
        int width = zC2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zC2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount && (childAt = getChildAt(i12)) != view2) {
            if (childAt.getVisibility() == 8) {
                z12 = zC2;
            } else {
                z12 = zC2;
                childAt.setVisibility((Math.max(zC2 ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zC2 ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i12++;
            view2 = view;
            zC2 = z12;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar.f54497a = 0.0f;
            return eVar;
        }
        e eVar2 = new e(layoutParams);
        eVar2.f54497a = 0.0f;
        return eVar2;
    }

    @InterfaceC42156l
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f54467c;
    }

    public final int getLockMode() {
        return this.f54486v;
    }

    @U
    public int getParallaxDistance() {
        return this.f54476l;
    }

    @InterfaceC42156l
    @Deprecated
    public int getSliderFadeColor() {
        return this.f54466b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f54483s = true;
        if (this.f54489y != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                androidx.slidingpanelayout.widget.a aVar = this.f54489y;
                N0 n02 = aVar.f54502c;
                if (n02 != null) {
                    ((V0) n02).c(null);
                }
                aVar.f54502c = C43259k.d(kotlinx.coroutines.U.a(kotlinx.coroutines.A0.b(aVar.f54501b)), null, null, new androidx.slidingpanelayout.widget.b(aVar, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        N0 n02;
        super.onDetachedFromWindow();
        this.f54483s = true;
        androidx.slidingpanelayout.widget.a aVar = this.f54489y;
        if (aVar != null && (n02 = aVar.f54502c) != null) {
            ((V0) n02).c(null);
        }
        ArrayList<c> arrayList = this.f54485u;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z12;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z13 = this.f54470f;
        androidx.customview.widget.d dVar = this.f54481q;
        if (!z13 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x12 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            dVar.getClass();
            this.f54482r = androidx.customview.widget.d.k(childAt, x12, y12);
        }
        if (!this.f54470f || (this.f54475k && actionMasked != 0)) {
            dVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            dVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f54475k = false;
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            this.f54477m = x13;
            this.f54478n = y13;
            dVar.getClass();
            if (androidx.customview.widget.d.k(this.f54471g, (int) x13, (int) y13) && b(this.f54471g)) {
                z12 = true;
            }
            return dVar.s(motionEvent) || z12;
        }
        if (actionMasked == 2) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            float fAbs = Math.abs(x14 - this.f54477m);
            float fAbs2 = Math.abs(y14 - this.f54478n);
            if (fAbs > dVar.f45376b && fAbs2 > fAbs) {
                dVar.b();
                this.f54475k = true;
                return false;
            }
        }
        z12 = false;
        if (dVar.s(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i22;
        boolean zC2 = c();
        int i23 = i14 - i12;
        int paddingRight = zC2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zC2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f54483s) {
            this.f54472h = (this.f54470f && this.f54482r) ? 0.0f : 1.0f;
        }
        int i24 = paddingRight;
        int i25 = 0;
        while (i25 < childCount) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() == 8) {
                i16 = i24;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f54498b) {
                    int i26 = i23 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i26) - i24) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.f54474j = iMin;
                    int i27 = zC2 ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    eVar.f54499c = (measuredWidth / 2) + ((i24 + i27) + iMin) > i26;
                    float f12 = iMin;
                    int i28 = (int) (this.f54472h * f12);
                    i16 = i27 + i28 + i24;
                    this.f54472h = i28 / f12;
                    i17 = 0;
                } else if (!this.f54470f || (i18 = this.f54476l) == 0) {
                    i16 = paddingRight;
                    i17 = 0;
                } else {
                    i17 = (int) ((1.0f - this.f54472h) * i18);
                    i16 = paddingRight;
                }
                if (zC2) {
                    i22 = (i23 - i16) + i17;
                    i19 = i22 - measuredWidth;
                } else {
                    i19 = i16 - i17;
                    i22 = i19 + measuredWidth;
                }
                childAt.layout(i19, paddingTop, i22, childAt.getMeasuredHeight() + paddingTop);
                androidx.window.layout.c cVar = this.f54487w;
                paddingRight = Math.abs((cVar != null && cVar.b() == c.b.f55309b && this.f54487w.a()) ? this.f54487w.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
            }
            i25++;
            i24 = i16;
        }
        if (this.f54483s) {
            if (this.f54470f && this.f54476l != 0) {
                e(this.f54472h);
            }
            g(this.f54471g);
        }
        this.f54483s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[PHI: r17
  0x007c: PHI (r17v2 float) = (r17v1 float), (r17v3 float) binds: [B:17:0x0073, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ae  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        if (savedState.f54490d) {
            if (!this.f54470f) {
                this.f54482r = true;
            }
            if (this.f54483s || f(0.0f)) {
                this.f54482r = true;
            }
        } else {
            a();
        }
        this.f54482r = savedState.f54490d;
        setLockMode(savedState.f54491e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54490d = this.f54470f ? d() : this.f54482r;
        savedState.f54491e = this.f54486v;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        if (i12 != i14) {
            this.f54483s = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f54470f) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.customview.widget.d dVar = this.f54481q;
        dVar.l(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            this.f54477m = x12;
            this.f54478n = y12;
        } else if (actionMasked == 1 && b(this.f54471g)) {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            float f12 = x13 - this.f54477m;
            float f13 = y13 - this.f54478n;
            int i12 = dVar.f45376b;
            if ((f13 * f13) + (f12 * f12) < i12 * i12 && androidx.customview.widget.d.k(this.f54471g, (int) x13, (int) y13)) {
                a();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@N View view) {
        if (view.getParent() instanceof h) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f54470f) {
            return;
        }
        this.f54482r = view == this.f54471g;
    }

    @Deprecated
    public void setCoveredFadeColor(@InterfaceC42156l int i12) {
        this.f54467c = i12;
    }

    public final void setLockMode(int i12) {
        this.f54486v = i12;
    }

    @Deprecated
    public void setPanelSlideListener(@P f fVar) {
        f fVar2 = this.f54480p;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f54479o;
        if (fVar2 != null) {
            copyOnWriteArrayList.remove(fVar2);
        }
        if (fVar != null) {
            copyOnWriteArrayList.add(fVar);
        }
        this.f54480p = fVar;
    }

    public void setParallaxDistance(@U int i12) {
        this.f54476l = i12;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@P Drawable drawable) {
        this.f54468d = drawable;
    }

    public void setShadowDrawableRight(@P Drawable drawable) {
        this.f54469e = drawable;
    }

    @Deprecated
    public void setShadowResource(@InterfaceC42165v int i12) {
        setShadowDrawableLeft(getResources().getDrawable(i12));
    }

    public void setShadowResourceLeft(int i12) {
        setShadowDrawableLeft(androidx.core.content.d.getDrawable(getContext(), i12));
    }

    public void setShadowResourceRight(int i12) {
        setShadowDrawableRight(androidx.core.content.d.getDrawable(getContext(), i12));
    }

    @Deprecated
    public void setSliderFadeColor(@InterfaceC42156l int i12) {
        this.f54466b = i12;
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: d, reason: collision with root package name */
        public static final int[] f54496d = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f54497a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f54498b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f54499c;

        public e() {
            super(-1, -1);
            this.f54497a = 0.0f;
        }

        public e(int i12) {
            super(i12, -1);
            this.f54497a = 0.0f;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f54497a = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f54496d);
        eVar.f54497a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    public static class g implements f {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public final void a() {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public final void b() {
        }
    }
}
