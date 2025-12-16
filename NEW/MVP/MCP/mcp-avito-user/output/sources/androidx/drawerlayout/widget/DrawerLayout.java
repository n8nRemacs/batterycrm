package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.accessibility.f;
import androidx.core.view.accessibility.i;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import j.InterfaceC42156l;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.c {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f45989n = {R.attr.layout_gravity};

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f45990o;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f45991p;

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f45992q;

    /* renamed from: b, reason: collision with root package name */
    public float f45993b;

    /* renamed from: c, reason: collision with root package name */
    public float f45994c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45995d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45996e;

    /* renamed from: f, reason: collision with root package name */
    public int f45997f;

    /* renamed from: g, reason: collision with root package name */
    public int f45998g;

    /* renamed from: h, reason: collision with root package name */
    public int f45999h;

    /* renamed from: i, reason: collision with root package name */
    public int f46000i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public d f46001j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f46002k;

    /* renamed from: l, reason: collision with root package name */
    public WindowInsets f46003l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f46004m;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public int f46005d;

        /* renamed from: e, reason: collision with root package name */
        public int f46006e;

        /* renamed from: f, reason: collision with root package name */
        public int f46007f;

        /* renamed from: g, reason: collision with root package name */
        public int f46008g;

        /* renamed from: h, reason: collision with root package name */
        public int f46009h;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@N Parcel parcel, @P ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f46005d = 0;
            this.f46005d = parcel.readInt();
            this.f46006e = parcel.readInt();
            this.f46007f = parcel.readInt();
            this.f46008g = parcel.readInt();
            this.f46009h = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f46005d);
            parcel.writeInt(this.f46006e);
            parcel.writeInt(this.f46007f);
            parcel.writeInt(this.f46008g);
            parcel.writeInt(this.f46009h);
        }
    }

    public class a implements i {
        @Override // androidx.core.view.accessibility.i
        public final boolean c(@N View view) {
            throw null;
        }
    }

    public class b extends C22808a {
        @Override // androidx.core.view.C22808a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f44991a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            throw null;
        }

        @Override // androidx.core.view.C22808a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            boolean z12 = DrawerLayout.f45990o;
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            if (z12) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                fVar.f45001c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    fVar.f45000b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                accessibilityNodeInfoObtain.getBoundsInScreen(null);
                fVar.j(null);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                fVar.k(accessibilityNodeInfoObtain.getClassName());
                fVar.o(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                fVar.i(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                fVar.a(accessibilityNodeInfoObtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (DrawerLayout.e(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            fVar.k("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            fVar.h(f.a.f45002e);
            fVar.h(f.a.f45003f);
        }

        @Override // androidx.core.view.C22808a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f45990o || DrawerLayout.e(view)) {
                return this.f44991a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class c extends C22808a {
        @Override // androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (DrawerLayout.e(view)) {
                return;
            }
            fVar.f45000b = -1;
            accessibilityNodeInfo.setParent(null);
        }
    }

    public interface d {
        void a();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f46010a;

        /* renamed from: b, reason: collision with root package name */
        public float f46011b;

        /* renamed from: c, reason: collision with root package name */
        public int f46012c;
    }

    public class g extends d.c {

        public class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // androidx.customview.widget.d.c
        public final int a(View view, int i12, int i13) {
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final int b(View view, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public final int c(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final void e(int i12, int i13) {
            if ((i12 & 1) != 1) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final void f(int i12) {
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final void g(View view, int i12) {
            ((e) view.getLayoutParams()).getClass();
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final void h(int i12) {
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final void i(int i12, int i13, int i14, View view) {
            view.getWidth();
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final void j(View view, float f12, float f13) {
            throw null;
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(View view, int i12) {
            throw null;
        }
    }

    static {
        int i12 = Build.VERSION.SDK_INT;
        f45990o = true;
        f45991p = true;
        f45992q = i12 >= 29;
    }

    public static boolean e(View view) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean f(View view) {
        return ((e) view.getLayoutParams()).f46010a == 0;
    }

    public static boolean g(@N View view) {
        if (h(view)) {
            return (((e) view.getLayoutParams()).f46012c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean h(View view) {
        int i12 = ((e) view.getLayoutParams()).f46010a;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view) {
        int i12 = ((e) view.getLayoutParams()).f46010a;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return (Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 3) == 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i12, int i13) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (!h(childAt)) {
                throw null;
            }
            if (g(childAt)) {
                childAt.addFocusables(arrayList, i12, i13);
                z12 = true;
            }
        }
        if (!z12) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i12, layoutParams);
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i13);
            if ((((e) childAt.getLayoutParams()).f46012c & 1) == 1) {
                break;
            } else {
                i13++;
            }
        }
        if (childAt != null || h(view)) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            view.setImportantForAccessibility(1);
        }
        if (f45990o) {
            return;
        }
        C22823h0.C(view, null);
    }

    public final void b(boolean z12) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            e eVar = (e) childAt.getLayoutParams();
            if (h(childAt)) {
                if (!z12) {
                    childAt.getWidth();
                    if (a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
                eVar.getClass();
            }
        }
        throw null;
    }

    public final View c(int i12) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int i14 = ((e) childAt.getLayoutParams()).f46010a;
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            if ((Gravity.getAbsoluteGravity(i14, getLayoutDirection()) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            fMax = Math.max(fMax, ((e) getChildAt(i12).getLayoutParams()).f46011b);
        }
        this.f45994c = fMax;
        throw null;
    }

    public final int d(@N View view) {
        if (!h(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i12 = ((e) view.getLayoutParams()).f46010a;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int layoutDirection = getLayoutDirection();
        if (i12 == 3) {
            int i13 = this.f45997f;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.f45999h : this.f46000i;
            if (i14 != 3) {
                return i14;
            }
        } else if (i12 == 5) {
            int i15 = this.f45998g;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.f46000i : this.f45999h;
            if (i16 != 3) {
                return i16;
            }
        } else if (i12 == 8388611) {
            int i17 = this.f45999h;
            if (i17 != 3) {
                return i17;
            }
            int i18 = layoutDirection == 0 ? this.f45997f : this.f45998g;
            if (i18 != 3) {
                return i18;
            }
        } else if (i12 == 8388613) {
            int i19 = this.f46000i;
            if (i19 != 3) {
                return i19;
            }
            int i22 = layoutDirection == 0 ? this.f45998g : this.f45997f;
            if (i22 != 3) {
                return i22;
            }
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f45994c <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        int i12 = childCount - 1;
        if (i12 < 0) {
            return false;
        }
        getChildAt(i12).getHitRect(null);
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j12) {
        Drawable background;
        int height = getHeight();
        boolean zF2 = f(view);
        int width = getWidth();
        int iSave = canvas.save();
        if (zF2) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && h(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j12);
        canvas.restoreToCount(iSave);
        if (this.f45994c <= 0.0f || !zF2) {
            return zDrawChild;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -1);
        eVar.f46010a = 0;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            e eVar2 = new e(eVar);
            eVar2.f46010a = 0;
            eVar2.f46010a = eVar.f46010a;
            return eVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar3 = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar3.f46010a = 0;
            return eVar3;
        }
        e eVar4 = new e(layoutParams);
        eVar4.f46010a = 0;
        return eVar4;
    }

    public float getDrawerElevation() {
        if (f45991p) {
            return this.f45993b;
        }
        return 0.0f;
    }

    @P
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f46002k;
    }

    public final void i(@N View view) {
        if (!h(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (!this.f45996e) {
            eVar.f46012c |= 2;
            if (a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        eVar.f46011b = 1.0f;
        eVar.f46012c = 1;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt == view) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                childAt.setImportantForAccessibility(1);
            } else {
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                childAt.setImportantForAccessibility(4);
            }
        }
        f.a aVar = f.a.f45011n;
        C22823h0.y(view, aVar.a());
        C22823h0.u(view, 0);
        if (g(view) && d(view) != 2) {
            C22823h0.z(view, aVar, null);
        }
        invalidate();
    }

    public final void j(int i12, int i13) {
        View viewC;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
        if (i13 == 3) {
            this.f45997f = i12;
        } else if (i13 == 5) {
            this.f45998g = i12;
        } else if (i13 == 8388611) {
            this.f45999h = i12;
        } else if (i13 == 8388613) {
            this.f46000i = i12;
        }
        if (i12 != 0) {
            throw null;
        }
        if (i12 != 1) {
            if (i12 == 2 && (viewC = c(absoluteGravity)) != null) {
                i(viewC);
                return;
            }
            return;
        }
        View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            if (!h(viewC2)) {
                throw new IllegalArgumentException("View " + viewC2 + " is not a sliding drawer");
            }
            e eVar = (e) viewC2.getLayoutParams();
            if (this.f45996e) {
                eVar.f46011b = 0.0f;
                eVar.f46012c = 0;
                invalidate();
                return;
            }
            eVar.f46012c |= 4;
            if (a(viewC2)) {
                viewC2.getWidth();
                viewC2.getTop();
                throw null;
            }
            getWidth();
            viewC2.getTop();
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45996e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45996e = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f46004m || this.f46002k == null) {
            return;
        }
        WindowInsets windowInsets = this.f46003l;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f46002k.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f46002k.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, KeyEvent keyEvent) {
        View childAt;
        if (i12 == 4) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = getChildAt(i13);
                if (h(childAt)) {
                    if (!h(childAt)) {
                        throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                    }
                    if (((e) childAt.getLayoutParams()).f46011b > 0.0f) {
                        break;
                    }
                }
                i13++;
            }
            if (childAt != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i12, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i12, KeyEvent keyEvent) {
        View childAt;
        if (i12 != 4) {
            return super.onKeyUp(i12, keyEvent);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i13);
            if (h(childAt)) {
                if (!h(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((e) childAt.getLayoutParams()).f46011b > 0.0f) {
                    break;
                }
            }
            i13++;
        }
        if (childAt == null || d(childAt) != 0) {
            return childAt != null;
        }
        b(false);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        WindowInsets rootWindowInsets;
        float f12;
        int i16;
        boolean z13 = true;
        this.f45995d = true;
        int i17 = i14 - i12;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (f(childAt)) {
                    int i19 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i19, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt)) {
                        float f13 = measuredWidth;
                        i16 = (-measuredWidth) + ((int) (eVar.f46011b * f13));
                        f12 = (measuredWidth + i16) / f13;
                    } else {
                        float f14 = measuredWidth;
                        f12 = (i17 - r11) / f14;
                        i16 = i17 - ((int) (eVar.f46011b * f14));
                    }
                    boolean z14 = f12 != eVar.f46011b ? z13 : false;
                    int i22 = eVar.f46010a & 112;
                    if (i22 == 16) {
                        int i23 = i15 - i13;
                        int i24 = (i23 - measuredHeight) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = i24 + measuredHeight;
                            int i27 = i23 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i26 > i27) {
                                i24 = i27 - measuredHeight;
                            }
                        }
                        childAt.layout(i16, i24, measuredWidth + i16, measuredHeight + i24);
                    } else if (i22 != 80) {
                        int i28 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i16, i28, measuredWidth + i16, measuredHeight + i28);
                    } else {
                        int i29 = i15 - i13;
                        childAt.layout(i16, (i29 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i16, i29 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z14) {
                        e eVar2 = (e) childAt.getLayoutParams();
                        if (f12 != eVar2.f46011b) {
                            eVar2.f46011b = f12;
                            throw null;
                        }
                    }
                    int i32 = eVar.f46011b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i32) {
                        childAt.setVisibility(i32);
                    }
                }
            }
            i18++;
            z13 = true;
        }
        if (f45992q && (rootWindowInsets = getRootWindowInsets()) != null) {
            J0.s(null, rootWindowInsets).g();
            throw null;
        }
        this.f45995d = false;
        this.f45996e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        int i12 = savedState.f46005d;
        if (i12 != 0 && (viewC = c(i12)) != null) {
            i(viewC);
        }
        int i13 = savedState.f46006e;
        if (i13 != 3) {
            j(i13, 3);
        }
        int i14 = savedState.f46007f;
        if (i14 != 3) {
            j(i14, 5);
        }
        int i15 = savedState.f46008g;
        if (i15 != 3) {
            j(i15, 8388611);
        }
        int i16 = savedState.f46009h;
        if (i16 != 3) {
            j(i16, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i12) {
        if (f45991p) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f46005d = 0;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            e eVar = (e) getChildAt(i12).getLayoutParams();
            int i13 = eVar.f46012c;
            boolean z12 = i13 == 1;
            boolean z13 = i13 == 2;
            if (z12 || z13) {
                savedState.f46005d = eVar.f46010a;
                break;
            }
        }
        savedState.f46006e = this.f45997f;
        savedState.f46007f = this.f45998g;
        savedState.f46008g = this.f45999h;
        savedState.f46009h = this.f46000i;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z12) {
        super.requestDisallowInterceptTouchEvent(z12);
        if (z12) {
            b(true);
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f45995d) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f12) {
        this.f45993b = f12;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (h(childAt)) {
                C22823h0.H(childAt, this.f45993b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        if (this.f46001j != null) {
            throw null;
        }
        if (dVar != null) {
            throw null;
        }
        this.f46001j = dVar;
    }

    public void setDrawerLockMode(int i12) {
        j(i12, 3);
        j(i12, 5);
    }

    public void setScrimColor(@InterfaceC42156l int i12) {
        invalidate();
    }

    public void setStatusBarBackground(@P Drawable drawable) {
        this.f46002k = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@InterfaceC42156l int i12) {
        this.f46002k = new ColorDrawable(i12);
        invalidate();
    }

    public void setStatusBarBackground(int i12) {
        this.f46002k = i12 != 0 ? androidx.core.content.d.getDrawable(getContext(), i12) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f46010a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45989n);
        eVar.f46010a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    public static abstract class f implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void a() {
        }
    }
}
