package androidx.coordinatorlayout.widget;

import G0.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.G;
import androidx.collection.o1;
import androidx.compose.foundation.H;
import androidx.core.util.y;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.I;
import androidx.core.view.J;
import androidx.core.view.J0;
import androidx.core.view.L;
import androidx.core.view.M;
import androidx.customview.view.AbsSavedState;
import com.avito.android.R;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements I, J {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final y.a<Rect> sRectPool;
    private M mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.a<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private J0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final L mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private h mOnPreDrawListener;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public SparseArray<Parcelable> f44444d;

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
            int i12 = parcel.readInt();
            int[] iArr = new int[i12];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f44444d = new SparseArray<>(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                this.f44444d.append(iArr[i13], parcelableArray[i13]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            SparseArray<Parcelable> sparseArray = this.f44444d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i13 = 0; i13 < size; i13++) {
                iArr[i13] = this.f44444d.keyAt(i13);
                parcelableArr[i13] = this.f44444d.valueAt(i13);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i12);
        }
    }

    public class a implements M {
        public a() {
        }

        @Override // androidx.core.view.M
        public final J0 h(View view, J0 j02) {
            return CoordinatorLayout.this.setWindowInsets(j02);
        }
    }

    public interface b {
        @N
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean c(@N View view, @N Rect rect) {
            return false;
        }

        public boolean d(@N View view, @N View view2) {
            return false;
        }

        public boolean f(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view) {
            return false;
        }

        public boolean i(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
            return false;
        }

        public boolean j(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) {
            return false;
        }

        public boolean k(@N CoordinatorLayout coordinatorLayout, @N View view, int i12, int i13, int i14) {
            return false;
        }

        public boolean m(@N View view, @N View view2, float f12) {
            return false;
        }

        public void o(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, int i12, int i13, int i14, int i15, int i16, @N int[] iArr) {
            iArr[0] = iArr[0] + i14;
            iArr[1] = iArr[1] + i15;
        }

        public boolean p(@N CoordinatorLayout coordinatorLayout, @N V v12, @N Rect rect, boolean z12) {
            return false;
        }

        @P
        public Parcelable r(@N View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean s(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, @N View view2, int i12, int i13) {
            return false;
        }

        public boolean u(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void h() {
        }

        public void e(@N g gVar) {
        }

        public void l(float f12) {
        }

        public void q(@N View view, @N Parcelable parcelable) {
        }

        public void g(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view) {
        }

        public void t(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, int i12) {
        }

        public void n(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, int i12, int i13, @N int[] iArr, int i14) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    public class f implements ViewGroup.OnHierarchyChangeListener {
        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class h implements ViewTreeObserver.OnPreDrawListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float fS2 = C22823h0.s(view);
            float fS3 = C22823h0.s(view2);
            if (fS2 > fS3) {
                return -1;
            }
            return fS2 < fS3 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new i();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new y.c(12);
    }

    public CoordinatorLayout(@N Context context) {
        this(context, null);
    }

    @N
    private static Rect acquireTempRect() {
        Rect rectB = sRectPool.b();
        return rectB == null ? new Rect() : rectB;
    }

    private void constrainChildRect(g gVar, Rect rect, int i12, int i13) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i12) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i13) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(iMax, iMax2, i12 + iMax, i13 + iMax2);
    }

    private J0 dispatchApplyWindowInsetsToBehaviors(J0 j02) {
        if (j02.o()) {
            return j02;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (childAt.getFitsSystemWindows() && ((g) childAt.getLayoutParams()).f44447a != null && j02.o()) {
                break;
            }
        }
        return j02;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i12, Rect rect, Rect rect2, g gVar, int i13, int i14) {
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveAnchoredChildGravity(gVar.f44449c), i12);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(resolveGravity(gVar.f44450d), i12);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        int iWidth = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 == 1) {
            iWidth -= i13 / 2;
        } else if (i15 != 5) {
            iWidth -= i13;
        }
        if (i16 == 16) {
            iHeight -= i14 / 2;
        } else if (i16 != 80) {
            iHeight -= i14;
        }
        rect2.set(iWidth, iHeight, i13 + iWidth, i14 + iHeight);
    }

    private int getKeyline(int i12) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i12 >= 0 && i12 < iArr.length) {
            return iArr[i12];
        }
        toString();
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i12) : i12));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        o1<View, ArrayList<View>> o1Var = this.mChildDag.f44465b;
        int i12 = o1Var.f25790d;
        for (int i13 = 0; i13 < i12; i13++) {
            ArrayList<View> arrayListK = o1Var.k(i13);
            if (arrayListK != null && arrayListK.contains(view)) {
                return true;
            }
        }
        return false;
    }

    private void layoutChild(View view, int i12) {
        g gVar = (g) view.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.mLastInsets != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectAcquireTempRect.left = this.mLastInsets.i() + rectAcquireTempRect.left;
                rectAcquireTempRect.top = this.mLastInsets.k() + rectAcquireTempRect.top;
                rectAcquireTempRect.right -= this.mLastInsets.j();
                rectAcquireTempRect.bottom -= this.mLastInsets.h();
            }
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        Gravity.apply(resolveGravity(gVar.f44449c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i12);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i12) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i12, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i12, int i13) {
        g gVar = (g) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(gVar.f44449c), i13);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i13 == 1) {
            i12 = width - i12;
        }
        int keyline = getKeyline(i12) - measuredWidth;
        if (i14 == 1) {
            keyline += measuredWidth / 2;
        } else if (i14 == 5) {
            keyline += measuredWidth;
        }
        int i16 = i15 != 16 ? i15 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i16, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void offsetChildByInset(View view, Rect rect, int i12) {
        boolean z12;
        boolean z13;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c cVar = gVar.f44447a;
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVar == null || !cVar.c(view, rectAcquireTempRect)) {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            } else if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectAcquireTempRect.toShortString() + " | Bounds:" + rectAcquireTempRect2.toShortString());
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(gVar.f44454h, i12);
            boolean z14 = true;
            if ((absoluteGravity & 48) != 48 || (i17 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.f44456j) >= (i18 = rect.top)) {
                z12 = false;
            } else {
                setInsetOffsetY(view, i18 - i17);
                z12 = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.f44456j) < (i16 = rect.bottom)) {
                setInsetOffsetY(view, height - i16);
                z12 = true;
            }
            if (!z12) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i14 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.f44455i) >= (i15 = rect.left)) {
                z13 = false;
            } else {
                setInsetOffsetX(view, i15 - i14);
                z13 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.f44455i) >= (i13 = rect.right)) {
                z14 = z13;
            } else {
                setInsetOffsetX(view, width - i13);
            }
            if (!z14) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c parseBehavior(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = H.i('.', str2, str);
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e12) {
            throw new RuntimeException(G.f("Could not inflate Behavior subclass ", str), e12);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i12) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zI2 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = list.get(i13);
            c cVar = ((g) view.getLayoutParams()).f44447a;
            if (zI2 && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i12 == 0) {
                        cVar.i(this, view, motionEventObtain);
                    } else if (i12 == 1) {
                        cVar.u(this, view, motionEventObtain);
                    }
                }
            } else if (!zI2 && cVar != null) {
                if (i12 == 0) {
                    zI2 = cVar.i(this, view, motionEvent);
                } else if (i12 == 1) {
                    zI2 = cVar.u(this, view, motionEvent);
                }
                if (zI2) {
                    this.mBehaviorTouchView = view;
                }
            }
        }
        list.clear();
        return zI2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void prepareChildren() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.prepareChildren():void");
    }

    private static void releaseTempRect(@N Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    private void resetTouchBehaviors(boolean z12) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            c cVar = ((g) childAt.getLayoutParams()).f44447a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z12) {
                    cVar.i(this, childAt, motionEventObtain);
                } else {
                    cVar.u(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            ((g) getChildAt(i13).getLayoutParams()).getClass();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i12) {
        if (i12 == 0) {
            return 17;
        }
        return i12;
    }

    private static int resolveGravity(int i12) {
        if ((i12 & 7) == 0) {
            i12 |= 8388611;
        }
        return (i12 & 112) == 0 ? i12 | 48 : i12;
    }

    private static int resolveKeylineGravity(int i12) {
        if (i12 == 0) {
            return 8388661;
        }
        return i12;
    }

    private void setInsetOffsetX(View view, int i12) {
        g gVar = (g) view.getLayoutParams();
        int i13 = gVar.f44455i;
        if (i13 != i12) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.offsetLeftAndRight(i12 - i13);
            gVar.f44455i = i12;
        }
    }

    private void setInsetOffsetY(View view, int i12) {
        g gVar = (g) view.getLayoutParams();
        int i13 = gVar.f44456j;
        if (i13 != i12) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.offsetTopAndBottom(i12 - i13);
            gVar.f44456j = i12;
        }
    }

    private void setupForInsets() {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!getFitsSystemWindows()) {
            C22823h0.K(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        C22823h0.K(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@N View view) {
        ArrayList<View> arrayList = this.mChildDag.f44465b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            View view2 = arrayList.get(i12);
            c cVar = ((g) view2.getLayoutParams()).f44447a;
            if (cVar != null) {
                cVar.f(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j12) {
        c cVar = ((g) view.getLayoutParams()).f44447a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i12))) {
                z12 = true;
                break;
            }
            i12++;
        }
        if (z12 != this.mNeedsPreDrawListener) {
            if (z12) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public void getChildRect(View view, boolean z12, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z12) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @N
    public List<View> getDependencies(@N View view) {
        o1<View, ArrayList<View>> o1Var = this.mChildDag.f44465b;
        int i12 = o1Var.f25790d;
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < i12; i13++) {
            ArrayList<View> arrayListK = o1Var.k(i13);
            if (arrayListK != null && arrayListK.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o1Var.f(i13));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    @k0
    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @N
    public List<View> getDependents(@N View view) {
        ArrayList<View> arrayList = this.mChildDag.f44465b.get(view);
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = androidx.coordinatorlayout.widget.b.f44468a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = androidx.coordinatorlayout.widget.b.f44468a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        androidx.coordinatorlayout.widget.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = androidx.coordinatorlayout.widget.b.f44469b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i12, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i12, rect, rect2, gVar, measuredWidth, measuredHeight);
        constrainChildRect(gVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).f44462p);
    }

    @RestrictTo
    public final J0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g getResolvedLayoutParams(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f44448b) {
            if (view instanceof b) {
                gVar.b(((b) view).getBehavior());
                gVar.f44448b = true;
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        dVar.value().getName();
                    }
                }
                gVar.f44448b = true;
            }
        }
        return gVar;
    }

    @P
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(@N View view, int i12, int i13) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i12, i13);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i12) {
        c cVar;
        g gVar = (g) view.getLayoutParams();
        if (gVar.f44457k != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(gVar.f44457k, rectAcquireTempRect);
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i12, rectAcquireTempRect, rectAcquireTempRect3, gVar, measuredWidth, measuredHeight);
            boolean z12 = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(gVar, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i13 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i14 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i13 != 0) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                view.offsetLeftAndRight(i13);
            }
            if (i14 != 0) {
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                view.offsetTopAndBottom(i14);
            }
            if (z12 && (cVar = gVar.f44447a) != null) {
                cVar.f(this, view, gVar.f44457k);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (getFitsSystemWindows()) {
                C22823h0.A(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Type inference failed for: r13v20, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChildViewsChanged(int r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onChildViewsChanged(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        J0 j02 = this.mLastInsets;
        int iK2 = j02 != null ? j02.k() : 0;
        if (iK2 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iK2);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        c cVar;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = this.mDependencySortedChildren.get(i16);
            if (view.getVisibility() != 8 && ((cVar = ((g) view.getLayoutParams()).f44447a) == null || !cVar.j(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@N View view, int i12) {
        g gVar = (g) view.getLayoutParams();
        View view2 = gVar.f44457k;
        if (view2 == null && gVar.f44452f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i12);
            return;
        }
        int i13 = gVar.f44451e;
        if (i13 >= 0) {
            layoutChildWithKeyline(view, i13, i12);
        } else {
            layoutChild(view, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f12, float f13, boolean z12) {
        c cVar;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a(0) && (cVar = gVar.f44447a) != null) {
                    cVar.l(f13);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f12, float f13) {
        c cVar;
        int childCount = getChildCount();
        boolean zM2 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a(0) && (cVar = gVar.f44447a) != null) {
                    zM2 |= cVar.m(childAt, view, f13);
                }
            }
        }
        return zM2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i12, int i13, int[] iArr) {
        onNestedPreScroll(view, i12, i13, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i12, i13, i14, i15, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i12) {
        onNestedScrollAccepted(view, view2, i12, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        SparseArray<Parcelable> sparseArray = savedState.f44444d;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            c cVar = getResolvedLayoutParams(childAt).f44447a;
            if (id2 != -1 && cVar != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            c cVar = ((g) childAt.getLayoutParams()).f44447a;
            if (id2 != -1 && cVar != null && (parcelableR = cVar.r(childAt)) != null) {
                sparseArray.append(id2, parcelableR);
            }
        }
        savedState.f44444d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i12) {
        return onStartNestedScroll(view, view2, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f44447a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.u(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.resetTouchBehaviors(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((g) view.getLayoutParams()).f44462p.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z12) {
        c cVar = ((g) view.getLayoutParams()).f44447a;
        if (cVar == null || !cVar.p(this, view, rect, z12)) {
            return super.requestChildRectangleOnScreen(view, rect, z12);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z12) {
        super.requestDisallowInterceptTouchEvent(z12);
        if (!z12 || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z12) {
        super.setFitsSystemWindows(z12);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@P Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(@InterfaceC42156l int i12) {
        setStatusBarBackground(new ColorDrawable(i12));
    }

    public void setStatusBarBackgroundResource(@InterfaceC42165v int i12) {
        setStatusBarBackground(i12 != 0 ? androidx.core.content.d.getDrawable(getContext(), i12) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        boolean z12 = i12 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z12) {
            return;
        }
        this.mStatusBarBackground.setVisible(z12, false);
    }

    public final J0 setWindowInsets(J0 j02) {
        if (Objects.equals(this.mLastInsets, j02)) {
            return j02;
        }
        this.mLastInsets = j02;
        boolean z12 = false;
        boolean z13 = j02 != null && j02.k() > 0;
        this.mDrawStatusBarBackground = z13;
        if (!z13 && getBackground() == null) {
            z12 = true;
        }
        setWillNotDraw(z12);
        J0 j0DispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(j02);
        requestLayout();
        return j0DispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // androidx.core.view.I
    public void onNestedPreScroll(View view, int i12, int i13, int[] iArr, int i14) {
        c cVar;
        int childCount = getChildCount();
        boolean z12 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a(i14) && (cVar = gVar.f44447a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.n(this, childAt, view, i12, i13, iArr2, i14);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z12 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z12) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.I
    public void onNestedScroll(View view, int i12, int i13, int i14, int i15, int i16) {
        onNestedScroll(view, i12, i13, i14, i15, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.I
    public void onNestedScrollAccepted(View view, View view2, int i12, int i13) {
        L l12 = this.mNestedScrollingParentHelper;
        if (i13 == 1) {
            l12.f44969b = i12;
        } else {
            l12.f44968a = i12;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            ((g) getChildAt(i14).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.I
    public boolean onStartNestedScroll(View view, View view2, int i12, int i13) {
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c cVar = gVar.f44447a;
                if (cVar != null) {
                    boolean zS2 = cVar.s(this, childAt, view, view2, i12, i13);
                    z12 |= zS2;
                    if (i13 == 0) {
                        gVar.f44459m = zS2;
                    } else if (i13 == 1) {
                        gVar.f44460n = zS2;
                    }
                } else if (i13 == 0) {
                    gVar.f44459m = false;
                } else if (i13 == 1) {
                    gVar.f44460n = false;
                }
            }
        }
        return z12;
    }

    @Override // androidx.core.view.I
    public void onStopNestedScroll(View view, int i12) {
        L l12 = this.mNestedScrollingParentHelper;
        if (i12 == 1) {
            l12.f44969b = 0;
        } else {
            l12.f44968a = 0;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.a(i12)) {
                c cVar = gVar.f44447a;
                if (cVar != null) {
                    cVar.t(this, childAt, view, i12);
                }
                if (i12 == 0) {
                    gVar.f44459m = false;
                } else if (i12 == 1) {
                    gVar.f44460n = false;
                }
                gVar.f44461o = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(@N Context context, @P AttributeSet attributeSet, @InterfaceC42150f int i12) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i12);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.a<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new L();
        int[] iArr = a.j.f6132a;
        if (i12 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i12, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i12 != 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i12, 0);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
            }
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f12 = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i13 = 0; i13 < length; i13++) {
                this.mKeylines[i13] = (int) (r12[i13] * f12);
            }
        }
        this.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new f());
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // androidx.core.view.J
    public void onNestedScroll(@N View view, int i12, int i13, int i14, int i15, int i16, @N int[] iArr) {
        c cVar;
        boolean z12;
        int iMin;
        int childCount = getChildCount();
        boolean z13 = false;
        int iMax = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a(i16) && (cVar = gVar.f44447a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.o(this, childAt, view, i12, i13, i14, i15, i16, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i14 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i15 > 0) {
                        z12 = true;
                        iMin = Math.max(i17, this.mBehaviorConsumed[1]);
                    } else {
                        z12 = true;
                        iMin = Math.min(i17, this.mBehaviorConsumed[1]);
                    }
                    i17 = iMin;
                    z13 = z12;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i17;
        if (z13) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f44447a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f44448b;

        /* renamed from: c, reason: collision with root package name */
        public int f44449c;

        /* renamed from: d, reason: collision with root package name */
        public int f44450d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44451e;

        /* renamed from: f, reason: collision with root package name */
        public final int f44452f;

        /* renamed from: g, reason: collision with root package name */
        public int f44453g;

        /* renamed from: h, reason: collision with root package name */
        public int f44454h;

        /* renamed from: i, reason: collision with root package name */
        public int f44455i;

        /* renamed from: j, reason: collision with root package name */
        public int f44456j;

        /* renamed from: k, reason: collision with root package name */
        public View f44457k;

        /* renamed from: l, reason: collision with root package name */
        public View f44458l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f44459m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f44460n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f44461o;

        /* renamed from: p, reason: collision with root package name */
        public final Rect f44462p;

        public g(int i12, int i13) {
            super(i12, i13);
            this.f44448b = false;
            this.f44449c = 0;
            this.f44450d = 0;
            this.f44451e = -1;
            this.f44452f = -1;
            this.f44453g = 0;
            this.f44454h = 0;
            this.f44462p = new Rect();
        }

        public final boolean a(int i12) {
            if (i12 == 0) {
                return this.f44459m;
            }
            if (i12 != 1) {
                return false;
            }
            return this.f44460n;
        }

        public final void b(@P c cVar) {
            c cVar2 = this.f44447a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.h();
                }
                this.f44447a = cVar;
                this.f44448b = true;
                if (cVar != null) {
                    cVar.e(this);
                }
            }
        }

        public g(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44448b = false;
            this.f44449c = 0;
            this.f44450d = 0;
            this.f44451e = -1;
            this.f44452f = -1;
            this.f44453g = 0;
            this.f44454h = 0;
            this.f44462p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f6133b);
            this.f44449c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f44452f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f44450d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f44451e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f44453g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f44454h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f44448b = zHasValue;
            if (zHasValue) {
                this.f44447a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f44447a;
            if (cVar != null) {
                cVar.e(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.f44448b = false;
            this.f44449c = 0;
            this.f44450d = 0;
            this.f44451e = -1;
            this.f44452f = -1;
            this.f44453g = 0;
            this.f44454h = 0;
            this.f44462p = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f44448b = false;
            this.f44449c = 0;
            this.f44450d = 0;
            this.f44451e = -1;
            this.f44452f = -1;
            this.f44453g = 0;
            this.f44454h = 0;
            this.f44462p = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44448b = false;
            this.f44449c = 0;
            this.f44450d = 0;
            this.f44451e = -1;
            this.f44452f = -1;
            this.f44453g = 0;
            this.f44454h = 0;
            this.f44462p = new Rect();
        }
    }
}
