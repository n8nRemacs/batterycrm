package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import androidx.core.os.C22774b;
import androidx.core.view.C22808a;
import androidx.core.view.C22818f;
import androidx.core.view.C22823h0;
import androidx.core.view.F;
import androidx.core.view.H;
import androidx.core.view.InterfaceC22820g;
import androidx.core.view.J;
import androidx.core.view.L;
import androidx.core.view.T;
import androidx.core.view.accessibility.f;
import androidx.core.widget.f;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import j.P;
import j.X;
import j.k0;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements J, F, T {

    /* renamed from: D, reason: collision with root package name */
    public static final float f45100D = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: E, reason: collision with root package name */
    public static final a f45101E = new a();

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f45102F = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public float f45103A;

    /* renamed from: B, reason: collision with root package name */
    public e f45104B;

    /* renamed from: C, reason: collision with root package name */
    @k0
    public final C22818f f45105C;

    /* renamed from: b, reason: collision with root package name */
    public final float f45106b;

    /* renamed from: c, reason: collision with root package name */
    public long f45107c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f45108d;

    /* renamed from: e, reason: collision with root package name */
    public final OverScroller f45109e;

    /* renamed from: f, reason: collision with root package name */
    @N
    @k0
    @RestrictTo
    public final EdgeEffect f45110f;

    /* renamed from: g, reason: collision with root package name */
    @N
    @k0
    @RestrictTo
    public final EdgeEffect f45111g;

    /* renamed from: h, reason: collision with root package name */
    public int f45112h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45113i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45114j;

    /* renamed from: k, reason: collision with root package name */
    public View f45115k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45116l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f45117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45118n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f45119o;

    /* renamed from: p, reason: collision with root package name */
    public final int f45120p;

    /* renamed from: q, reason: collision with root package name */
    public final int f45121q;

    /* renamed from: r, reason: collision with root package name */
    public final int f45122r;

    /* renamed from: s, reason: collision with root package name */
    public int f45123s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f45124t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f45125u;

    /* renamed from: v, reason: collision with root package name */
    public int f45126v;

    /* renamed from: w, reason: collision with root package name */
    public int f45127w;

    /* renamed from: x, reason: collision with root package name */
    public SavedState f45128x;

    /* renamed from: y, reason: collision with root package name */
    public final L f45129y;

    /* renamed from: z, reason: collision with root package name */
    public final H f45130z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f45131b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f45131b = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        @N
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return AK.c.i(this.f45131b, "}", sb2);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f45131b);
        }
    }

    public static class a extends C22808a {
        @Override // androidx.core.view.C22808a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            int scrollRange;
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            fVar.k(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            fVar.t(true);
            if (nestedScrollView.getScrollY() > 0) {
                fVar.b(f.a.f45008k);
                fVar.b(f.a.f45012o);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                fVar.b(f.a.f45007j);
                fVar.b(f.a.f45014q);
            }
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(View view, int i12, Bundle bundle) {
            if (super.g(view, i12, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i12 != 4096) {
                if (i12 == 8192 || i12 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
                if (i12 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    @X
    public static class b {
    }

    @X
    public static final class c {
        public static void a(NestedScrollView nestedScrollView, float f12) {
            try {
                nestedScrollView.setFrameContentVelocity(f12);
            } catch (LinkageError unused) {
            }
        }
    }

    public class d implements InterfaceC22820g {
        public d() {
        }

        @Override // androidx.core.view.InterfaceC22820g
        public final boolean a(float f12) {
            if (f12 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.d((int) f12);
            return true;
        }

        @Override // androidx.core.view.InterfaceC22820g
        public final float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC22820g
        public final void c() {
            NestedScrollView.this.f45109e.abortAnimation();
        }
    }

    public interface e {
        void g(@N NestedScrollView nestedScrollView, int i12, int i13, int i14, int i15);
    }

    public NestedScrollView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, com.avito.android.R.attr.nestedScrollViewStyle);
        this.f45108d = new Rect();
        this.f45113i = true;
        this.f45114j = false;
        this.f45115k = null;
        this.f45116l = false;
        this.f45119o = true;
        this.f45123s = -1;
        this.f45124t = new int[2];
        this.f45125u = new int[2];
        this.f45105C = new C22818f(getContext(), new d());
        int i12 = Build.VERSION.SDK_INT;
        this.f45110f = i12 >= 31 ? f.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f45111g = i12 >= 31 ? f.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f45106b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f45109e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f45120p = viewConfiguration.getScaledTouchSlop();
        this.f45121q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f45122r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45102F, com.avito.android.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f45129y = new L();
        this.f45130z = new H(this);
        setNestedScrollingEnabled(true);
        C22823h0.C(this, f45101E);
    }

    public static boolean f(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && f((View) parent, nestedScrollView);
    }

    public final boolean a(int i12) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i12);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !g(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i12 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i12 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i12 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f45108d;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m(b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i12);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !g(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(@N View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i13, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        }
        if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i13 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(@N KeyEvent keyEvent) {
        this.f45108d.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? e(33) : a(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? e(130) : a(130);
                }
                if (keyCode == 62) {
                    k(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return e(33);
                }
                if (keyCode == 93) {
                    return e(130);
                }
                if (keyCode == 122) {
                    k(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                k(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    @RestrictTo
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    @RestrictTo
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    @RestrictTo
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    @RestrictTo
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public void d(int i12) {
        if (getChildCount() > 0) {
            this.f45109e.fling(getScrollX(), getScrollY(), 0, i12, 0, 0, BeduinInputModel.MIN_TEXT_VERSION, Integer.MAX_VALUE, 0, 0);
            this.f45130z.h(2, 1);
            this.f45127w = getScrollY();
            postInvalidateOnAnimation();
            if (C22774b.a()) {
                c.a(this, Math.abs(this.f45109e.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f12, float f13, boolean z12) {
        return this.f45130z.a(f12, f13, z12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f12, float f13) {
        return this.f45130z.b(f12, f13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i12, int i13, @P int[] iArr, @P int[] iArr2) {
        return this.f45130z.c(i12, i13, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i12, int i13, int i14, int i15, @P int[] iArr) {
        return this.f45130z.d(i12, i13, i14, i15, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(@N Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f45110f;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f45111g;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i12) {
        int childCount;
        boolean z12 = i12 == 130;
        int height = getHeight();
        Rect rect = this.f45108d;
        rect.top = 0;
        rect.bottom = height;
        if (z12 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return l(i12, rect.top, rect.bottom);
    }

    public final boolean g(View view, int i12, int i13) {
        Rect rect = this.f45108d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i12 >= getScrollY() && rect.top - i12 <= getScrollY() + i13;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f45129y.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @k0
    public float getVerticalScrollFactorCompat() {
        if (this.f45103A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f45103A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f45103A;
    }

    public final void h(int i12, int i13, @P int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i12);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f45130z.d(0, scrollY2, 0, i12 - scrollY2, null, i13, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f45130z.f(0);
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f45123s) {
            int i12 = actionIndex == 0 ? 1 : 0;
            this.f45112h = (int) motionEvent.getY(i12);
            this.f45123s = motionEvent.getPointerId(i12);
            VelocityTracker velocityTracker = this.f45117m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f45130z.f44937d;
    }

    public final boolean j(int i12, int i13, int i14, int i15) {
        boolean z12;
        boolean z13;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i14 + i12;
        if (i13 <= 0 && i13 >= 0) {
            z12 = false;
        } else {
            i13 = 0;
            z12 = true;
        }
        if (i16 > i15) {
            z13 = true;
        } else if (i16 < 0) {
            i15 = 0;
            z13 = true;
        } else {
            i15 = i16;
            z13 = false;
        }
        if (z13 && !this.f45130z.f(1)) {
            this.f45109e.springBack(i13, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i15);
        return z12 || z13;
    }

    public final void k(int i12) {
        boolean z12 = i12 == 130;
        int height = getHeight();
        Rect rect = this.f45108d;
        if (z12) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i13 = rect.top;
        int i14 = height + i13;
        rect.bottom = i14;
        l(i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.m(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.l(int, int, int):boolean");
    }

    public final int m(int i12, int i13, int i14, boolean z12) {
        int i15;
        int i16;
        boolean z13;
        VelocityTracker velocityTracker;
        H h12 = this.f45130z;
        if (i14 == 1) {
            h12.h(2, i14);
        }
        boolean zC2 = this.f45130z.c(0, i12, i14, this.f45125u, this.f45124t);
        int[] iArr = this.f45125u;
        int[] iArr2 = this.f45124t;
        if (zC2) {
            i15 = i12 - iArr[1];
            i16 = iArr2[1];
        } else {
            i15 = i12;
            i16 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z14 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z12;
        boolean z15 = j(i15, 0, scrollY, scrollRange) && !h12.f(i14);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f45130z.d(0, scrollY2, 0, i15 - scrollY2, this.f45124t, i14, iArr);
        int i17 = i16 + iArr2[1];
        int i18 = i15 - iArr[1];
        int i19 = scrollY + i18;
        EdgeEffect edgeEffect = this.f45111g;
        EdgeEffect edgeEffect2 = this.f45110f;
        if (i19 < 0) {
            if (z14) {
                f.c(edgeEffect2, (-i18) / getHeight(), i13 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i19 > scrollRange && z14) {
            f.c(edgeEffect, i18 / getHeight(), 1.0f - (i13 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z13 = z15;
        } else {
            postInvalidateOnAnimation();
            z13 = false;
        }
        if (z13 && i14 == 0 && (velocityTracker = this.f45117m) != null) {
            velocityTracker.clear();
        }
        if (i14 == 1) {
            r(i14);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i17;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(@N View view, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i12, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i12, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i12, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i13, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(@N EdgeEffect edgeEffect, int i12) {
        if (i12 > 0) {
            return true;
        }
        float fA2 = f.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i12) * 0.35f;
        float f12 = this.f45106b * 0.015f;
        double dLog = Math.log(fAbs / f12);
        double d12 = f45100D;
        return ((float) (Math.exp((d12 / (d12 - 1.0d)) * dLog) * ((double) f12))) < fA2;
    }

    public final void o(int i12, int i13, boolean z12) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f45107c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f45109e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i13 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z12) {
                this.f45130z.h(2, 1);
            } else {
                r(1);
            }
            this.f45127w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f45109e.isFinished()) {
                this.f45109e.abortAnimation();
                r(1);
            }
            scrollBy(i12, i13);
        }
        this.f45107c = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45114j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(@N MotionEvent motionEvent) {
        int i12;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f45116l) {
            if ((motionEvent.getSource() & 2) == 2) {
                i12 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                i12 = 26;
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                axisValue = axisValue2;
            } else {
                i12 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
                if (i12 != 0) {
                    this.f45105C.a(motionEvent, i12);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(@j.N android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredHeight;
        super.onLayout(z12, i12, i13, i14, i15);
        int i16 = 0;
        this.f45113i = false;
        View view = this.f45115k;
        if (view != null && f(view, this)) {
            View view2 = this.f45115k;
            Rect rect = this.f45108d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB2 = b(rect);
            if (iB2 != 0) {
                scrollBy(0, iB2);
            }
        }
        this.f45115k = null;
        if (!this.f45114j) {
            if (this.f45128x != null) {
                scrollTo(getScrollX(), this.f45128x.f45131b);
                this.f45128x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i15 - i13) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i16 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i16 != scrollY) {
                scrollTo(getScrollX(), i16);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f45114j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (this.f45118n && View.MeasureSpec.getMode(i13) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i12, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@N View view, float f12, float f13, boolean z12) {
        if (z12) {
            return false;
        }
        dispatchNestedFling(0.0f, f13, true);
        d((int) f13);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@N View view, float f12, float f13) {
        return this.f45130z.b(f12, f13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@N View view, int i12, int i13, @N int[] iArr) {
        this.f45130z.c(i12, i13, 0, iArr, null);
    }

    @Override // androidx.core.view.J
    public final void onNestedScroll(@N View view, int i12, int i13, int i14, int i15, int i16, @N int[] iArr) {
        h(i15, i16, iArr);
    }

    @Override // androidx.core.view.I
    public final void onNestedScrollAccepted(@N View view, @N View view2, int i12, int i13) {
        L l12 = this.f45129y;
        if (i13 == 1) {
            l12.f44969b = i12;
        } else {
            l12.f44968a = i12;
        }
        this.f45130z.h(2, i13);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i12, int i13, boolean z12, boolean z13) {
        super.scrollTo(i12, i13);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i12, Rect rect) {
        if (i12 == 2) {
            i12 = 130;
        } else if (i12 == 1) {
            i12 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i12) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i12);
        if (viewFindNextFocus != null && g(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i12, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f45128x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @N
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f45131b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i12, int i13, int i14, int i15) {
        super.onScrollChanged(i12, i13, i14, i15);
        e eVar = this.f45104B;
        if (eVar != null) {
            eVar.g(this, i12, i13, i14, i15);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !g(viewFindFocus, 0, i15)) {
            return;
        }
        Rect rect = this.f45108d;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB2 = b(rect);
        if (iB2 != 0) {
            if (this.f45119o) {
                o(0, iB2, false);
            } else {
                scrollBy(0, iB2);
            }
        }
    }

    @Override // androidx.core.view.I
    public final boolean onStartNestedScroll(@N View view, @N View view2, int i12, int i13) {
        return (i12 & 2) != 0;
    }

    @Override // androidx.core.view.I
    public final void onStopNestedScroll(@N View view, int i12) {
        L l12 = this.f45129y;
        if (i12 == 1) {
            l12.f44969b = 0;
        } else {
            l12.f44968a = 0;
        }
        r(i12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@N MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f45117m == null) {
            this.f45117m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f45126v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f12 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f45126v);
        H h12 = this.f45130z;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f45111g;
            EdgeEffect edgeEffect2 = this.f45110f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f45117m;
                velocityTracker.computeCurrentVelocity(1000, this.f45122r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f45123s);
                if (Math.abs(yVelocity) >= this.f45121q) {
                    if (f.a(edgeEffect2) != 0.0f) {
                        if (n(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            d(-yVelocity);
                        }
                    } else if (f.a(edgeEffect) != 0.0f) {
                        int i12 = -yVelocity;
                        if (n(edgeEffect, i12)) {
                            edgeEffect.onAbsorb(i12);
                        } else {
                            d(i12);
                        }
                    } else {
                        int i13 = -yVelocity;
                        float f13 = i13;
                        if (!h12.b(0.0f, f13)) {
                            dispatchNestedFling(0.0f, f13, true);
                            d(i13);
                        }
                    }
                } else if (this.f45109e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f45123s = -1;
                this.f45116l = false;
                VelocityTracker velocityTracker2 = this.f45117m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f45117m = null;
                }
                r(0);
                this.f45110f.onRelease();
                this.f45111g.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f45123s);
                if (iFindPointerIndex != -1) {
                    int y12 = (int) motionEvent.getY(iFindPointerIndex);
                    int i14 = this.f45112h - y12;
                    float x12 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i14 / getHeight();
                    if (f.a(edgeEffect2) != 0.0f) {
                        float f14 = -f.c(edgeEffect2, -height, x12);
                        if (f.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f12 = f14;
                    } else if (f.a(edgeEffect) != 0.0f) {
                        float fC2 = f.c(edgeEffect, height, 1.0f - x12);
                        if (f.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f12 = fC2;
                    }
                    int iRound = Math.round(f12 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i15 = i14 - iRound;
                    if (!this.f45116l && Math.abs(i15) > this.f45120p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f45116l = true;
                        i15 = i15 > 0 ? i15 - this.f45120p : i15 + this.f45120p;
                    }
                    if (this.f45116l) {
                        int iM2 = m(i15, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f45112h = y12 - iM2;
                        this.f45126v += iM2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f45116l && getChildCount() > 0 && this.f45109e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f45123s = -1;
                this.f45116l = false;
                VelocityTracker velocityTracker3 = this.f45117m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f45117m = null;
                }
                r(0);
                this.f45110f.onRelease();
                this.f45111g.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f45112h = (int) motionEvent.getY(actionIndex);
                this.f45123s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                i(motionEvent);
                this.f45112h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f45123s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f45116l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f45109e.isFinished()) {
                this.f45109e.abortAnimation();
                r(1);
            }
            int y13 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f45112h = y13;
            this.f45123s = pointerId;
            h12.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f45117m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i12) {
        o(0 - getScrollX(), i12 - getScrollY(), false);
    }

    public final boolean q(MotionEvent motionEvent) {
        boolean z12;
        EdgeEffect edgeEffect = this.f45110f;
        if (f.a(edgeEffect) != 0.0f) {
            f.c(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z12 = true;
        } else {
            z12 = false;
        }
        EdgeEffect edgeEffect2 = this.f45111g;
        if (f.a(edgeEffect2) == 0.0f) {
            return z12;
        }
        f.c(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void r(int i12) {
        this.f45130z.i(i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f45113i) {
            this.f45115k = view2;
        } else {
            Rect rect = this.f45108d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB2 = b(rect);
            if (iB2 != 0) {
                scrollBy(0, iB2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(@N View view, Rect rect, boolean z12) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB2 = b(rect);
        boolean z13 = iB2 != 0;
        if (z13) {
            if (z12) {
                scrollBy(0, iB2);
            } else {
                o(0, iB2, false);
            }
        }
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z12) {
        VelocityTracker velocityTracker;
        if (z12 && (velocityTracker = this.f45117m) != null) {
            velocityTracker.recycle();
            this.f45117m = null;
        }
        super.requestDisallowInterceptTouchEvent(z12);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f45113i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i12, int i13) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i12 < 0) {
                i12 = 0;
            } else if (width + i12 > width2) {
                i12 = width2 - width;
            }
            if (height >= height2 || i13 < 0) {
                i13 = 0;
            } else if (height + i13 > height2) {
                i13 = height2 - height;
            }
            if (i12 == getScrollX() && i13 == getScrollY()) {
                return;
            }
            super.scrollTo(i12, i13);
        }
    }

    public void setFillViewport(boolean z12) {
        if (z12 != this.f45118n) {
            this.f45118n = z12;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z12) {
        this.f45130z.g(z12);
    }

    public void setOnScrollChangeListener(@P e eVar) {
        this.f45104B = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z12) {
        this.f45119o = z12;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i12) {
        return this.f45130z.h(i12, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        r(0);
    }

    @Override // androidx.core.view.I
    public final void onNestedPreScroll(@N View view, int i12, int i13, @N int[] iArr, int i14) {
        this.f45130z.c(i12, i13, i14, iArr, null);
    }

    @Override // androidx.core.view.I
    public final void onNestedScroll(@N View view, int i12, int i13, int i14, int i15, int i16) {
        h(i15, i16, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@N View view, @N View view2, int i12) {
        return onStartNestedScroll(view, view2, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@N View view, int i12, int i13, int i14, int i15) {
        h(i15, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i12) {
        if (getChildCount() <= 0) {
            super.addView(view, i12);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@N View view, @N View view2, int i12) {
        onNestedScrollAccepted(view, view2, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@N View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i12, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
