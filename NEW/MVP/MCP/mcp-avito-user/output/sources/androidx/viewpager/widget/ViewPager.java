package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.appcompat.app.r;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.customview.view.AbsSavedState;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f54978e0 = {R.attr.layout_gravity};

    /* renamed from: f0, reason: collision with root package name */
    public static final Comparator<e> f54979f0 = new a();

    /* renamed from: g0, reason: collision with root package name */
    public static final Interpolator f54980g0 = new b();

    /* renamed from: h0, reason: collision with root package name */
    public static final m f54981h0 = new m();

    /* renamed from: A, reason: collision with root package name */
    public final int f54982A;

    /* renamed from: B, reason: collision with root package name */
    public int f54983B;

    /* renamed from: C, reason: collision with root package name */
    public final int f54984C;

    /* renamed from: D, reason: collision with root package name */
    public float f54985D;

    /* renamed from: E, reason: collision with root package name */
    public float f54986E;

    /* renamed from: F, reason: collision with root package name */
    public float f54987F;

    /* renamed from: G, reason: collision with root package name */
    public float f54988G;

    /* renamed from: H, reason: collision with root package name */
    public int f54989H;

    /* renamed from: I, reason: collision with root package name */
    public VelocityTracker f54990I;

    /* renamed from: J, reason: collision with root package name */
    public final int f54991J;

    /* renamed from: K, reason: collision with root package name */
    public final int f54992K;

    /* renamed from: L, reason: collision with root package name */
    public final int f54993L;

    /* renamed from: M, reason: collision with root package name */
    public final int f54994M;

    /* renamed from: N, reason: collision with root package name */
    public final EdgeEffect f54995N;

    /* renamed from: O, reason: collision with root package name */
    public final EdgeEffect f54996O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f54997P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f54998Q;

    /* renamed from: R, reason: collision with root package name */
    public int f54999R;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f55000S;

    /* renamed from: T, reason: collision with root package name */
    public i f55001T;

    /* renamed from: U, reason: collision with root package name */
    public ArrayList f55002U;

    /* renamed from: V, reason: collision with root package name */
    public j f55003V;

    /* renamed from: W, reason: collision with root package name */
    public int f55004W;

    /* renamed from: a0, reason: collision with root package name */
    public int f55005a0;

    /* renamed from: b, reason: collision with root package name */
    public int f55006b;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayList<View> f55007b0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f55008c;

    /* renamed from: c0, reason: collision with root package name */
    public final Runnable f55009c0;

    /* renamed from: d, reason: collision with root package name */
    public final e f55010d;

    /* renamed from: d0, reason: collision with root package name */
    public int f55011d0;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f55012e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.viewpager.widget.a f55013f;

    /* renamed from: g, reason: collision with root package name */
    public int f55014g;

    /* renamed from: h, reason: collision with root package name */
    public int f55015h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f55016i;

    /* renamed from: j, reason: collision with root package name */
    public ClassLoader f55017j;

    /* renamed from: k, reason: collision with root package name */
    public final Scroller f55018k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f55019l;

    /* renamed from: m, reason: collision with root package name */
    public k f55020m;

    /* renamed from: n, reason: collision with root package name */
    public int f55021n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f55022o;

    /* renamed from: p, reason: collision with root package name */
    public int f55023p;

    /* renamed from: q, reason: collision with root package name */
    public int f55024q;

    /* renamed from: r, reason: collision with root package name */
    public float f55025r;

    /* renamed from: s, reason: collision with root package name */
    public float f55026s;

    /* renamed from: t, reason: collision with root package name */
    public int f55027t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f55028u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f55029v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f55030w;

    /* renamed from: x, reason: collision with root package name */
    public int f55031x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f55032y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f55033z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public int f55034d;

        /* renamed from: e, reason: collision with root package name */
        public Parcelable f55035e;

        /* renamed from: f, reason: collision with root package name */
        public final ClassLoader f55036f;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f55034d = parcel.readInt();
            this.f55035e = parcel.readParcelable(classLoader);
            this.f55036f = classLoader;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return AK.c.i(this.f55034d, "}", sb2);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f55034d);
            parcel.writeParcelable(this.f55035e, i12);
        }
    }

    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f55039b - eVar2.f55039b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f12) {
            float f13 = f12 - 1.0f;
            return (f13 * f13 * f13 * f13 * f13) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.r();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Object f55038a;

        /* renamed from: b, reason: collision with root package name */
        public int f55039b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f55040c;

        /* renamed from: d, reason: collision with root package name */
        public float f55041d;

        /* renamed from: e, reason: collision with root package name */
        public float f55042e;
    }

    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f55043a;

        /* renamed from: b, reason: collision with root package name */
        public int f55044b;

        /* renamed from: c, reason: collision with root package name */
        public float f55045c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f55046d;

        /* renamed from: e, reason: collision with root package name */
        public int f55047e;

        /* renamed from: f, reason: collision with root package name */
        public int f55048f;

        public f() {
            super(-1, -1);
            this.f55045c = 0.0f;
        }
    }

    public class g extends C22808a {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        @Override // androidx.core.view.C22808a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.c(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                androidx.viewpager.widget.a r0 = r3.f55013f
                if (r0 == 0) goto L1a
                int r0 = r0.c()
                r1 = 1
                if (r0 <= r1) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3b
                androidx.viewpager.widget.a r0 = r3.f55013f
                if (r0 == 0) goto L3b
                int r0 = r0.c()
                r4.setItemCount(r0)
                int r0 = r3.f55014g
                r4.setFromIndex(r0)
                int r3 = r3.f55014g
                r4.setToIndex(r3)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            fVar.k(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            androidx.viewpager.widget.a aVar = viewPager.f55013f;
            fVar.t(aVar != null && aVar.c() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                fVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                fVar.a(8192);
            }
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(View view, int i12, Bundle bundle) {
            if (super.g(view, i12, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i12 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f55014g + 1);
                return true;
            }
            if (i12 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f55014g - 1);
            return true;
        }
    }

    public interface h {
        void a(@N ViewPager viewPager, @P androidx.viewpager.widget.a aVar);
    }

    public interface i {
        void b(int i12);

        void c(int i12);

        void h(int i12, float f12, @U int i13);
    }

    public interface j {
        void a(@N View view, float f12);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() throws Resources.NotFoundException {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.g();
        }
    }

    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            f fVar = (f) view.getLayoutParams();
            f fVar2 = (f) view2.getLayoutParams();
            boolean z12 = fVar.f55043a;
            return z12 != fVar2.f55043a ? z12 ? 1 : -1 : fVar.f55047e - fVar2.f55047e;
        }
    }

    public ViewPager(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55008c = new ArrayList<>();
        this.f55010d = new e();
        this.f55012e = new Rect();
        this.f55015h = -1;
        this.f55016i = null;
        this.f55017j = null;
        this.f55025r = -3.4028235E38f;
        this.f55026s = Float.MAX_VALUE;
        this.f55031x = 1;
        this.f54989H = -1;
        this.f54997P = true;
        this.f55009c0 = new c();
        this.f55011d0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f55018k = new Scroller(context2, f54980g0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f12 = context2.getResources().getDisplayMetrics().density;
        this.f54984C = viewConfiguration.getScaledPagingTouchSlop();
        this.f54991J = (int) (400.0f * f12);
        this.f54992K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f54995N = new EdgeEffect(context2);
        this.f54996O = new EdgeEffect(context2);
        this.f54993L = (int) (25.0f * f12);
        this.f54994M = (int) (2.0f * f12);
        this.f54982A = (int) (f12 * 16.0f);
        C22823h0.C(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C22823h0.K(this, new androidx.viewpager.widget.f(this));
    }

    public static boolean e(int i12, int i13, int i14, View view, boolean z12) {
        int i15;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i16 = i13 + scrollX;
                if (i16 >= childAt.getLeft() && i16 < childAt.getRight() && (i15 = i14 + scrollY) >= childAt.getTop() && i15 < childAt.getBottom() && e(i12, i16 - childAt.getLeft(), i15 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z12 && view.canScrollHorizontally(-i12);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z12) {
        if (this.f55029v != z12) {
            this.f55029v = z12;
        }
    }

    public final void A() {
        if (this.f55005a0 != 0) {
            ArrayList<View> arrayList = this.f55007b0;
            if (arrayList == null) {
                this.f55007b0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                this.f55007b0.add(getChildAt(i12));
            }
            Collections.sort(this.f55007b0, f54981h0);
        }
    }

    public final e a(int i12, int i13) {
        e eVar = new e();
        eVar.f55039b = i12;
        eVar.f55038a = this.f55013f.f(this, i12);
        this.f55013f.getClass();
        eVar.f55041d = 1.0f;
        ArrayList<e> arrayList = this.f55008c;
        if (i13 < 0 || i13 >= arrayList.size()) {
            arrayList.add(eVar);
        } else {
            arrayList.add(i13, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i12, int i13) {
        e eVarJ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() == 0 && (eVarJ = j(childAt)) != null && eVarJ.f55039b == this.f55014g) {
                    childAt.addFocusables(arrayList, i12, i13);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i13 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e eVarJ;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (eVarJ = j(childAt)) != null && eVarJ.f55039b == this.f55014g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new f();
        }
        f fVar = (f) layoutParams;
        boolean z12 = fVar.f55043a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f55043a = z12;
        if (!this.f55028u) {
            super.addView(view, i12, layoutParams);
        } else {
            if (z12) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f55046d = true;
            addViewInLayout(view, i12, layoutParams);
        }
    }

    public final void b(@N h hVar) {
        if (this.f55002U == null) {
            this.f55002U = new ArrayList();
        }
        this.f55002U.add(hVar);
    }

    public final void c(@N i iVar) {
        if (this.f55000S == null) {
            this.f55000S = new ArrayList();
        }
        this.f55000S.add(iVar);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i12) {
        if (this.f55013f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i12 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f55025r)) : i12 > 0 && scrollX < ((int) (((float) clientWidth) * this.f55026s));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() throws Resources.NotFoundException {
        this.f55019l = true;
        Scroller scroller = this.f55018k;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!p(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        postInvalidateOnAnimation();
    }

    public final boolean d(int i12) throws Resources.NotFoundException {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                parent2.getClass();
            }
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i12);
        boolean zO2 = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f55012e;
            if (i12 == 17) {
                int i13 = i(viewFindNextFocus, rect).left;
                int i14 = i(viewFindFocus, rect).left;
                if (viewFindFocus == null || i13 < i14) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                    zO2 = zRequestFocus;
                } else {
                    int i15 = this.f55014g;
                    if (i15 > 0) {
                        x(i15 - 1, true);
                        zO2 = true;
                    }
                }
            } else if (i12 == 66) {
                zRequestFocus = (viewFindFocus == null || i(viewFindNextFocus, rect).left > i(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : o();
                zO2 = zRequestFocus;
            }
        } else if (i12 == 17 || i12 == 1) {
            int i16 = this.f55014g;
            if (i16 > 0) {
                x(i16 - 1, true);
                zO2 = true;
            }
        } else if (i12 == 66 || i12 == 2) {
            zO2 = o();
        }
        if (zO2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i12));
        }
        return zO2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L64
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5f
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5f
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.d(r4)
            goto L60
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5f
            boolean r6 = r5.d(r1)
            goto L60
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.o()
            goto L60
        L41:
            r6 = 66
            boolean r6 = r5.d(r6)
            goto L60
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L58
            int r6 = r5.f55014g
            if (r6 <= 0) goto L5f
            int r6 = r6 - r1
            r5.x(r6, r1)
            r6 = r1
            goto L60
        L58:
            r6 = 17
            boolean r6 = r5.d(r6)
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            r1 = r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e eVarJ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (eVarJ = j(childAt)) != null && eVarJ.f55039b == this.f55014g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        EdgeEffect edgeEffect = this.f54996O;
        EdgeEffect edgeEffect2 = this.f54995N;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f55013f) != null && aVar.c() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f55025r * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f55026s + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f55022o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void f(boolean z12) throws Resources.NotFoundException {
        Scroller scroller = this.f55018k;
        boolean z13 = this.f55011d0 == 2;
        if (z13) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.f55030w = false;
        int i12 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f55008c;
            if (i12 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i12);
            if (eVar.f55040c) {
                eVar.f55040c = false;
                z13 = true;
            }
            i12++;
        }
        if (z13) {
            Runnable runnable = this.f55009c0;
            if (!z12) {
                ((c) runnable).run();
            } else {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postOnAnimation(runnable);
            }
        }
    }

    public final void g() throws Resources.NotFoundException {
        int iC2 = this.f55013f.c();
        this.f55006b = iC2;
        ArrayList<e> arrayList = this.f55008c;
        boolean z12 = arrayList.size() < (this.f55031x * 2) + 1 && arrayList.size() < iC2;
        int iMax = this.f55014g;
        int i12 = 0;
        boolean z13 = false;
        while (i12 < arrayList.size()) {
            e eVar = arrayList.get(i12);
            int iD2 = this.f55013f.d(eVar.f55038a);
            if (iD2 != -1) {
                if (iD2 == -2) {
                    arrayList.remove(i12);
                    i12--;
                    if (!z13) {
                        this.f55013f.m(this);
                        z13 = true;
                    }
                    this.f55013f.a(this, eVar.f55039b, eVar.f55038a);
                    int i13 = this.f55014g;
                    if (i13 == eVar.f55039b) {
                        iMax = Math.max(0, Math.min(i13, iC2 - 1));
                    }
                } else {
                    int i14 = eVar.f55039b;
                    if (i14 != iD2) {
                        if (i14 == this.f55014g) {
                            iMax = iD2;
                        }
                        eVar.f55039b = iD2;
                    }
                }
                z12 = true;
            }
            i12++;
        }
        if (z13) {
            this.f55013f.b();
        }
        Collections.sort(arrayList, f54979f0);
        if (z12) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                f fVar = (f) getChildAt(i15).getLayoutParams();
                if (!fVar.f55043a) {
                    fVar.f55045c = 0.0f;
                }
            }
            y(iMax, 0, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f();
    }

    @P
    public androidx.viewpager.widget.a getAdapter() {
        return this.f55013f;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i12, int i13) {
        if (this.f55005a0 == 2) {
            i13 = (i12 - 1) - i13;
        }
        return ((f) this.f55007b0.get(i13).getLayoutParams()).f55048f;
    }

    public int getCurrentItem() {
        return this.f55014g;
    }

    public int getOffscreenPageLimit() {
        return this.f55031x;
    }

    public int getPageMargin() {
        return this.f55021n;
    }

    public final void h(int i12) {
        i iVar = this.f55001T;
        if (iVar != null) {
            iVar.b(i12);
        }
        ArrayList arrayList = this.f55000S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                i iVar2 = (i) this.f55000S.get(i13);
                if (iVar2 != null) {
                    iVar2.b(i12);
                }
            }
        }
    }

    public final Rect i(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final e j(View view) {
        int i12 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f55008c;
            if (i12 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i12);
            if (this.f55013f.g(view, eVar.f55038a)) {
                return eVar;
            }
            i12++;
        }
    }

    public final e k() {
        e eVar;
        int i12;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f13 = clientWidth > 0 ? this.f55021n / clientWidth : 0.0f;
        int i13 = 0;
        boolean z12 = true;
        e eVar2 = null;
        int i14 = -1;
        float f14 = 0.0f;
        while (true) {
            ArrayList<e> arrayList = this.f55008c;
            if (i13 >= arrayList.size()) {
                return eVar2;
            }
            e eVar3 = arrayList.get(i13);
            if (z12 || eVar3.f55039b == (i12 = i14 + 1)) {
                eVar = eVar3;
            } else {
                float f15 = f12 + f14 + f13;
                e eVar4 = this.f55010d;
                eVar4.f55042e = f15;
                eVar4.f55039b = i12;
                this.f55013f.getClass();
                eVar4.f55041d = 1.0f;
                i13--;
                eVar = eVar4;
            }
            f12 = eVar.f55042e;
            float f16 = eVar.f55041d + f12 + f13;
            if (!z12 && scrollX < f12) {
                return eVar2;
            }
            if (scrollX < f16 || i13 == arrayList.size() - 1) {
                break;
            }
            int i15 = eVar.f55039b;
            float f17 = eVar.f55041d;
            i13++;
            z12 = false;
            e eVar5 = eVar;
            i14 = i15;
            f14 = f17;
            eVar2 = eVar5;
        }
        return eVar;
    }

    public final e l(int i12) {
        int i13 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f55008c;
            if (i13 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i13);
            if (eVar.f55039b == i12) {
                return eVar;
            }
            i13++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @j.InterfaceC42153i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f54999R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.f55043a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f55044b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            androidx.viewpager.widget.ViewPager$i r0 = r12.f55001T
            if (r0 == 0) goto L73
            r0.h(r13, r14, r15)
        L73:
            java.util.ArrayList r0 = r12.f55000S
            if (r0 == 0) goto L8e
            int r0 = r0.size()
            r3 = r1
        L7c:
            if (r3 >= r0) goto L8e
            java.util.ArrayList r4 = r12.f55000S
            java.lang.Object r4 = r4.get(r3)
            androidx.viewpager.widget.ViewPager$i r4 = (androidx.viewpager.widget.ViewPager.i) r4
            if (r4 == 0) goto L8b
            r4.h(r13, r14, r15)
        L8b:
            int r3 = r3 + 1
            goto L7c
        L8e:
            androidx.viewpager.widget.ViewPager$j r13 = r12.f55003V
            if (r13 == 0) goto Lbf
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L9a:
            if (r1 >= r14) goto Lbf
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r0 = (androidx.viewpager.widget.ViewPager.f) r0
            boolean r0 = r0.f55043a
            if (r0 == 0) goto Lab
            goto Lbc
        Lab:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f55003V
            r3.a(r15, r0)
        Lbc:
            int r1 = r1 + 1
            goto L9a
        Lbf:
            r12.f54998Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m(int, float, int):void");
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f54989H) {
            int i12 = actionIndex == 0 ? 1 : 0;
            this.f54985D = motionEvent.getX(i12);
            this.f54989H = motionEvent.getPointerId(i12);
            VelocityTracker velocityTracker = this.f54990I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f55013f;
        if (aVar == null || this.f55014g >= aVar.c() - 1) {
            return false;
        }
        x(this.f55014g + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54997P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f55009c0);
        Scroller scroller = this.f55018k;
        if (scroller != null && !scroller.isFinished()) {
            this.f55018k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i12;
        float f12;
        ArrayList<e> arrayList;
        float f13;
        super.onDraw(canvas);
        if (this.f55021n <= 0 || this.f55022o == null) {
            return;
        }
        ArrayList<e> arrayList2 = this.f55008c;
        if (arrayList2.size() <= 0 || this.f55013f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f14 = this.f55021n / width;
        int i13 = 0;
        e eVar = arrayList2.get(0);
        float f15 = eVar.f55042e;
        int size = arrayList2.size();
        int i14 = eVar.f55039b;
        int i15 = arrayList2.get(size - 1).f55039b;
        while (i14 < i15) {
            while (true) {
                i12 = eVar.f55039b;
                if (i14 <= i12 || i13 >= size) {
                    break;
                }
                i13++;
                eVar = arrayList2.get(i13);
            }
            if (i14 == i12) {
                float f16 = eVar.f55042e;
                float f17 = eVar.f55041d;
                f12 = (f16 + f17) * width;
                f15 = f16 + f17 + f14;
            } else {
                this.f55013f.getClass();
                f12 = (f15 + 1.0f) * width;
                f15 = 1.0f + f14 + f15;
            }
            if (this.f55021n + f12 > scrollX) {
                arrayList = arrayList2;
                f13 = f14;
                this.f55022o.setBounds(Math.round(f12), this.f55023p, Math.round(this.f55021n + f12), this.f55024q);
                this.f55022o.draw(canvas);
            } else {
                arrayList = arrayList2;
                f13 = f14;
            }
            if (f12 > scrollX + r3) {
                return;
            }
            i14++;
            arrayList2 = arrayList;
            f14 = f13;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int i12 = this.f54984C;
        Scroller scroller = this.f55018k;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.f55032y) {
                return true;
            }
            if (this.f55033z) {
                return false;
            }
        }
        if (action == 0) {
            float x12 = motionEvent.getX();
            this.f54987F = x12;
            this.f54985D = x12;
            float y12 = motionEvent.getY();
            this.f54988G = y12;
            this.f54986E = y12;
            this.f54989H = motionEvent.getPointerId(0);
            this.f55033z = false;
            this.f55019l = true;
            scroller.computeScrollOffset();
            if (this.f55011d0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f54994M) {
                f(false);
                this.f55032y = false;
            } else {
                scroller.abortAnimation();
                this.f55030w = false;
                r();
                this.f55032y = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i13 = this.f54989H;
            if (i13 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i13);
                float x13 = motionEvent.getX(iFindPointerIndex);
                float f12 = x13 - this.f54985D;
                float fAbs = Math.abs(f12);
                float y13 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y13 - this.f54988G);
                if (f12 != 0.0f) {
                    float f13 = this.f54985D;
                    if ((f13 >= this.f54983B || f12 <= 0.0f) && ((f13 <= getWidth() - this.f54983B || f12 >= 0.0f) && e((int) f12, (int) x13, (int) y13, this, false))) {
                        this.f54985D = x13;
                        this.f54986E = y13;
                        this.f55033z = true;
                        return false;
                    }
                }
                float f14 = i12;
                if (fAbs > f14 && fAbs * 0.5f > fAbs2) {
                    this.f55032y = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f15 = this.f54987F;
                    float f16 = i12;
                    this.f54985D = f12 > 0.0f ? f15 + f16 : f15 - f16;
                    this.f54986E = y13;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f14) {
                    this.f55033z = true;
                }
                if (this.f55032y && q(x13)) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        if (this.f54990I == null) {
            this.f54990I = VelocityTracker.obtain();
        }
        this.f54990I.addMovement(motionEvent);
        return this.f55032y;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i12, int i13) throws Resources.NotFoundException {
        f fVar;
        f fVar2;
        int i14;
        setMeasuredDimension(View.getDefaultSize(0, i12), View.getDefaultSize(0, i13));
        int measuredWidth = getMeasuredWidth();
        this.f54983B = Math.min(measuredWidth / 10, this.f54982A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            boolean z12 = true;
            int i16 = 1073741824;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f55043a) {
                int i17 = fVar2.f55044b;
                int i18 = i17 & 7;
                int i19 = i17 & 112;
                boolean z13 = i19 == 48 || i19 == 80;
                if (i18 != 3 && i18 != 5) {
                    z12 = false;
                }
                int i22 = BeduinInputModel.MIN_TEXT_VERSION;
                if (z13) {
                    i14 = Integer.MIN_VALUE;
                    i22 = 1073741824;
                } else {
                    i14 = z12 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i23 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i23 != -2) {
                    if (i23 == -1) {
                        i23 = paddingLeft;
                    }
                    i22 = 1073741824;
                } else {
                    i23 = paddingLeft;
                }
                int i24 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i24 == -2) {
                    i24 = measuredHeight;
                    i16 = i14;
                } else if (i24 == -1) {
                    i24 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, i22), View.MeasureSpec.makeMeasureSpec(i24, i16));
                if (z13) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z12) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i15++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f55027t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f55028u = true;
        r();
        this.f55028u = false;
        int childCount2 = getChildCount();
        for (int i25 = 0; i25 < childCount2; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f55043a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f55045c), 1073741824), this.f55027t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i12, Rect rect) {
        int i13;
        int i14;
        int i15;
        e eVarJ;
        int childCount = getChildCount();
        if ((i12 & 2) != 0) {
            i14 = childCount;
            i13 = 0;
            i15 = 1;
        } else {
            i13 = childCount - 1;
            i14 = -1;
            i15 = -1;
        }
        while (i13 != i14) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (eVarJ = j(childAt)) != null && eVarJ.f55039b == this.f55014g && childAt.requestFocus(i12, rect)) {
                return true;
            }
            i13 += i15;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        androidx.viewpager.widget.a aVar = this.f55013f;
        ClassLoader classLoader = savedState.f55036f;
        if (aVar != null) {
            aVar.j(savedState.f55035e, classLoader);
            y(savedState.f55034d, 0, false, true);
        } else {
            this.f55015h = savedState.f55034d;
            this.f55016i = savedState.f55035e;
            this.f55017j = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f55034d = this.f55014g;
        androidx.viewpager.widget.a aVar = this.f55013f;
        if (aVar != null) {
            savedState.f55035e = aVar.k();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) throws Resources.NotFoundException {
        super.onSizeChanged(i12, i13, i14, i15);
        if (i12 != i14) {
            int i16 = this.f55021n;
            t(i12, i14, i16, i16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i12) {
        if (this.f55008c.size() == 0) {
            if (this.f54997P) {
                return false;
            }
            this.f54998Q = false;
            m(0, 0.0f, 0);
            if (this.f54998Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e eVarK = k();
        int clientWidth = getClientWidth();
        int i13 = this.f55021n;
        int i14 = clientWidth + i13;
        float f12 = clientWidth;
        int i15 = eVarK.f55039b;
        float f13 = ((i12 / f12) - eVarK.f55042e) / (eVarK.f55041d + (i13 / f12));
        this.f54998Q = false;
        m(i15, f13, (int) (i14 * f13));
        if (this.f54998Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean q(float f12) {
        boolean z12;
        boolean z13;
        float f13 = this.f54985D - f12;
        this.f54985D = f12;
        float scrollX = getScrollX() + f13;
        float clientWidth = getClientWidth();
        float f14 = this.f55025r * clientWidth;
        float f15 = this.f55026s * clientWidth;
        ArrayList<e> arrayList = this.f55008c;
        boolean z14 = false;
        e eVar = arrayList.get(0);
        e eVar2 = (e) r.j(1, arrayList);
        if (eVar.f55039b != 0) {
            f14 = eVar.f55042e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (eVar2.f55039b != this.f55013f.c() - 1) {
            f15 = eVar2.f55042e * clientWidth;
            z13 = false;
        } else {
            z13 = true;
        }
        if (scrollX < f14) {
            if (z12) {
                this.f54995N.onPull(Math.abs(f14 - scrollX) / clientWidth);
                z14 = true;
            }
            scrollX = f14;
        } else if (scrollX > f15) {
            if (z13) {
                this.f54996O.onPull(Math.abs(scrollX - f15) / clientWidth);
                z14 = true;
            }
            scrollX = f15;
        }
        int i12 = (int) scrollX;
        this.f54985D = (scrollX - i12) + this.f54985D;
        scrollTo(i12, getScrollY());
        p(i12);
        return z14;
    }

    public final void r() throws Resources.NotFoundException {
        s(this.f55014g);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f55028u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2 A[PHI: r7 r11 r15
  0x00c2: PHI (r7v16 int) = (r7v15 int), (r7v5 int), (r7v19 int) binds: [B:63:0x00e4, B:60:0x00d0, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:63:0x00e4, B:60:0x00d0, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:63:0x00e4, B:60:0x00d0, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141 A[PHI: r3 r12
  0x0141: PHI (r3v21 float) = (r3v19 float), (r3v20 float), (r3v18 float) binds: [B:97:0x0168, B:94:0x0152, B:87:0x0138] A[DONT_GENERATE, DONT_INLINE]
  0x0141: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:97:0x0168, B:94:0x0152, B:87:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.s(int):void");
    }

    public void setAdapter(@P androidx.viewpager.widget.a aVar) {
        ArrayList<e> arrayList;
        androidx.viewpager.widget.a aVar2 = this.f55013f;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f55052b = null;
            }
            this.f55013f.m(this);
            int i12 = 0;
            while (true) {
                arrayList = this.f55008c;
                if (i12 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i12);
                this.f55013f.a(this, eVar.f55039b, eVar.f55038a);
                i12++;
            }
            this.f55013f.b();
            arrayList.clear();
            int i13 = 0;
            while (i13 < getChildCount()) {
                if (!((f) getChildAt(i13).getLayoutParams()).f55043a) {
                    removeViewAt(i13);
                    i13--;
                }
                i13++;
            }
            this.f55014g = 0;
            scrollTo(0, 0);
        }
        this.f55013f = aVar;
        this.f55006b = 0;
        if (aVar != null) {
            if (this.f55020m == null) {
                this.f55020m = new k();
            }
            androidx.viewpager.widget.a aVar3 = this.f55013f;
            k kVar = this.f55020m;
            synchronized (aVar3) {
                aVar3.f55052b = kVar;
            }
            this.f55030w = false;
            boolean z12 = this.f54997P;
            this.f54997P = true;
            this.f55006b = this.f55013f.c();
            if (this.f55015h >= 0) {
                this.f55013f.j(this.f55016i, this.f55017j);
                y(this.f55015h, 0, false, true);
                this.f55015h = -1;
                this.f55016i = null;
                this.f55017j = null;
            } else if (z12) {
                requestLayout();
            } else {
                r();
            }
        }
        ArrayList arrayList2 = this.f55002U;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f55002U.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((h) this.f55002U.get(i14)).a(this, aVar);
        }
    }

    public void setCurrentItem(int i12) {
        this.f55030w = false;
        y(i12, 0, !this.f54997P, false);
    }

    public void setOffscreenPageLimit(int i12) throws Resources.NotFoundException {
        if (i12 < 1) {
            i12 = 1;
        }
        if (i12 != this.f55031x) {
            this.f55031x = i12;
            r();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f55001T = iVar;
    }

    public void setPageMargin(int i12) throws Resources.NotFoundException {
        int i13 = this.f55021n;
        this.f55021n = i12;
        int width = getWidth();
        t(width, width, i12, i13);
        requestLayout();
    }

    public void setPageMarginDrawable(@P Drawable drawable) {
        this.f55022o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i12) {
        if (this.f55011d0 == i12) {
            return;
        }
        this.f55011d0 = i12;
        if (this.f55003V != null) {
            boolean z12 = i12 != 0;
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                getChildAt(i13).setLayerType(z12 ? this.f55004W : 0, null);
            }
        }
        i iVar = this.f55001T;
        if (iVar != null) {
            iVar.c(i12);
        }
        ArrayList arrayList = this.f55000S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                i iVar2 = (i) this.f55000S.get(i14);
                if (iVar2 != null) {
                    iVar2.c(i12);
                }
            }
        }
    }

    public final void t(int i12, int i13, int i14, int i15) throws Resources.NotFoundException {
        if (i13 > 0 && !this.f55008c.isEmpty()) {
            if (!this.f55018k.isFinished()) {
                this.f55018k.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i13 - getPaddingLeft()) - getPaddingRight()) + i15)) * (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)), getScrollY());
                return;
            }
        }
        e eVarL = l(this.f55014g);
        int iMin = (int) ((eVarL != null ? Math.min(eVarL.f55042e, this.f55026s) : 0.0f) * ((i12 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            f(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final void u(@N i iVar) {
        ArrayList arrayList = this.f55000S;
        if (arrayList != null) {
            arrayList.remove(iVar);
        }
    }

    public final boolean v() {
        this.f54989H = -1;
        this.f55032y = false;
        this.f55033z = false;
        VelocityTracker velocityTracker = this.f54990I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f54990I = null;
        }
        this.f54995N.onRelease();
        this.f54996O.onRelease();
        return this.f54995N.isFinished() || this.f54996O.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f55022o;
    }

    public final void w(int i12, int i13, boolean z12, boolean z13) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        Scroller scroller = this.f55018k;
        e eVarL = l(i12);
        int iMax = eVarL != null ? (int) (Math.max(this.f55025r, Math.min(eVarL.f55042e, this.f55026s)) * getClientWidth()) : 0;
        if (!z12) {
            if (z13) {
                h(i12);
            }
            f(false);
            scrollTo(iMax, 0);
            p(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f55019l ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i14 = scrollX;
            int scrollY = getScrollY();
            int i15 = iMax - i14;
            int i16 = 0 - scrollY;
            if (i15 == 0 && i16 == 0) {
                f(false);
                r();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i17 = clientWidth / 2;
                float f12 = clientWidth;
                float f13 = i17;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i15) * 1.0f) / f12) - 0.5f) * 0.47123894f)) * f13) + f13;
                int iAbs2 = Math.abs(i13);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f55013f.getClass();
                    iAbs = (int) (((Math.abs(i15) / ((f12 * 1.0f) + this.f55021n)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f55019l = false;
                this.f55018k.startScroll(i14, scrollY, i15, i16, iMin);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }
        if (z13) {
            h(i12);
        }
    }

    public final void x(int i12, boolean z12) throws Resources.NotFoundException {
        this.f55030w = false;
        y(i12, 0, z12, false);
    }

    public final void y(int i12, int i13, boolean z12, boolean z13) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f55013f;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<e> arrayList = this.f55008c;
        if (!z13 && this.f55014g == i12 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i12 < 0) {
            i12 = 0;
        } else if (i12 >= this.f55013f.c()) {
            i12 = this.f55013f.c() - 1;
        }
        int i14 = this.f55031x;
        int i15 = this.f55014g;
        if (i12 > i15 + i14 || i12 < i15 - i14) {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                arrayList.get(i16).f55040c = true;
            }
        }
        boolean z14 = this.f55014g != i12;
        if (!this.f54997P) {
            s(i12);
            w(i12, i13, z12, z14);
        } else {
            this.f55014g = i12;
            if (z14) {
                h(i12);
            }
            requestLayout();
        }
    }

    public final void z(@P j jVar) {
        boolean z12 = this.f55003V == null;
        this.f55003V = jVar;
        setChildrenDrawingOrderEnabled(true);
        this.f55005a0 = 1;
        this.f55004W = 2;
        if (z12) {
            r();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f55045c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f54978e0);
        fVar.f55044b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }

    public void setPageMarginDrawable(@InterfaceC42165v int i12) {
        setPageMarginDrawable(androidx.core.content.d.getDrawable(getContext(), i12));
    }

    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void h(int i12, float f12, int i13) {
        }
    }
}
