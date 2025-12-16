package ru.rambler.libs.swipe_layout;

import A11.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.customview.widget.d;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public class SwipeLayout extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f436722o = 0;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.customview.widget.d f436723b;

    /* renamed from: c, reason: collision with root package name */
    public View f436724c;

    /* renamed from: d, reason: collision with root package name */
    public View f436725d;

    /* renamed from: e, reason: collision with root package name */
    public View f436726e;

    /* renamed from: f, reason: collision with root package name */
    public final float f436727f;

    /* renamed from: g, reason: collision with root package name */
    public final float f436728g;

    /* renamed from: h, reason: collision with root package name */
    public c f436729h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f436730i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f436731j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f436732k;

    /* renamed from: l, reason: collision with root package name */
    public int f436733l;

    /* renamed from: m, reason: collision with root package name */
    public float f436734m;

    /* renamed from: n, reason: collision with root package name */
    public float f436735n;

    public class a extends d.c {

        /* renamed from: a, reason: collision with root package name */
        public int f436736a;

        public a() {
        }

        @Override // androidx.customview.widget.d.c
        public final int a(View view, int i12, int i13) {
            return i13 > 0 ? m(view, i12) : l(view, i12);
        }

        @Override // androidx.customview.widget.d.c
        public final int c(View view) {
            return SwipeLayout.this.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public final void i(int i12, int i13, int i14, View view) {
            int iN2;
            int iN3;
            int iN4;
            int iN5;
            int i15 = SwipeLayout.f436722o;
            SwipeLayout swipeLayout = SwipeLayout.this;
            swipeLayout.b(view, i14);
            if (swipeLayout.f436729h == null) {
                return;
            }
            if (i14 > 0) {
                View view2 = swipeLayout.f436724c;
                if (view2 != null && (iN5 = n(view2)) != -2 && swipeLayout.f436724c.getRight() - iN5 > 0 && (swipeLayout.f436724c.getRight() - iN5) - i14 <= 0) {
                    swipeLayout.f436729h.getClass();
                }
                View view3 = swipeLayout.f436725d;
                if (view3 == null || (iN4 = n(view3)) == -2 || swipeLayout.f436725d.getLeft() + iN4 <= swipeLayout.getWidth() || (swipeLayout.f436725d.getLeft() + iN4) - i14 > swipeLayout.getWidth()) {
                    return;
                }
                swipeLayout.f436729h.getClass();
                return;
            }
            if (i14 < 0) {
                View view4 = swipeLayout.f436724c;
                if (view4 != null && (iN3 = n(view4)) != -2 && swipeLayout.f436724c.getRight() - iN3 <= 0 && (swipeLayout.f436724c.getRight() - iN3) - i14 > 0) {
                    swipeLayout.f436729h.getClass();
                }
                View view5 = swipeLayout.f436725d;
                if (view5 == null || (iN2 = n(view5)) == -2 || swipeLayout.f436725d.getLeft() + iN2 > swipeLayout.getWidth() || (swipeLayout.f436725d.getLeft() + iN2) - i14 <= swipeLayout.getWidth()) {
                    return;
                }
                swipeLayout.f436729h.getClass();
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void j(View view, float f12, float f13) {
            int i12 = SwipeLayout.f436722o;
            SwipeLayout swipeLayout = SwipeLayout.this;
            float f14 = swipeLayout.f436727f;
            int left = view.getLeft() - this.f436736a;
            if (left == 0) {
                return;
            }
            if (left > 0 ? f12 >= 0.0f ? p(view, left, f12) : o(view, left, f12) : f12 <= 0.0f ? o(view, left, f12) : p(view, left, f12)) {
                return;
            }
            SwipeLayout.a(swipeLayout, view, view.getLeft() - swipeLayout.f436726e.getLeft(), false, left > 0);
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(View view, int i12) {
            this.f436736a = view.getLeft();
            return true;
        }

        public final int l(View view, int i12) {
            SwipeLayout swipeLayout = SwipeLayout.this;
            View view2 = swipeLayout.f436725d;
            if (view2 == null) {
                return Math.max(i12, view == swipeLayout.f436726e ? 0 : -view.getWidth());
            }
            b bVar = (b) view2.getLayoutParams();
            int i13 = bVar.f436741d;
            if (i13 == -2) {
                return Math.max(i12, (view.getLeft() + (swipeLayout.getWidth() - swipeLayout.f436725d.getLeft())) - swipeLayout.f436725d.getWidth());
            }
            if (i13 != -1) {
                return Math.max(i12, (view.getLeft() + (swipeLayout.getWidth() - swipeLayout.f436725d.getLeft())) - bVar.f436741d);
            }
            return Math.max(view.getLeft() - swipeLayout.f436725d.getLeft(), i12);
        }

        public final int m(View view, int i12) {
            SwipeLayout swipeLayout = SwipeLayout.this;
            View view2 = swipeLayout.f436724c;
            if (view2 == null) {
                return Math.min(i12, view == swipeLayout.f436726e ? 0 : swipeLayout.getWidth());
            }
            b bVar = (b) view2.getLayoutParams();
            int i13 = bVar.f436741d;
            if (i13 == -2) {
                return Math.min(i12, view.getLeft() - swipeLayout.f436724c.getLeft());
            }
            if (i13 != -1) {
                return Math.min(i12, (view.getLeft() - swipeLayout.f436724c.getRight()) + bVar.f436741d);
            }
            return Math.min(i12, (view.getLeft() + swipeLayout.getWidth()) - swipeLayout.f436724c.getRight());
        }

        public final int n(View view) {
            int i12 = SwipeLayout.f436722o;
            int i13 = ((b) view.getLayoutParams()).f436739b;
            if (i13 == -2) {
                return -2;
            }
            return i13 == -1 ? view.getWidth() : i13;
        }

        public final boolean o(View view, int i12, float f12) {
            View view2;
            int i13;
            float f13 = -f12;
            SwipeLayout swipeLayout = SwipeLayout.this;
            if (f13 > swipeLayout.f436727f) {
                SwipeLayout.a(swipeLayout, view, l(view, swipeLayout.f436726e.getLeft() > 0 ? view.getLeft() - swipeLayout.f436726e.getLeft() : -swipeLayout.getWidth()), !(swipeLayout.f436726e.getLeft() > 0), false);
                return true;
            }
            View view3 = swipeLayout.f436725d;
            if (view3 == null) {
                SwipeLayout.a(swipeLayout, view, view.getLeft() - swipeLayout.f436726e.getLeft(), false, false);
                return true;
            }
            b bVar = (b) view3.getLayoutParams();
            if (i12 < 0 && f12 <= 0.0f && (view2 = swipeLayout.f436725d) != null && ((i13 = bVar.f436741d) == -2 ? view2.getRight() <= swipeLayout.getWidth() : !(i13 == -1 ? view2.getRight() > swipeLayout.getWidth() : view2.getLeft() + bVar.f436741d > swipeLayout.getWidth()))) {
                c cVar = swipeLayout.f436729h;
                if (cVar != null) {
                    cVar.b(false);
                }
                return true;
            }
            if (i12 < 0 && f12 <= 0.0f && bVar.f436742e != -1 && swipeLayout.f436725d.getLeft() + bVar.f436742e < swipeLayout.getWidth()) {
                SwipeLayout.a(swipeLayout, view, l(view, swipeLayout.f436726e.getLeft() > 0 ? view.getLeft() - swipeLayout.f436726e.getLeft() : -swipeLayout.getWidth()), true, false);
                return true;
            }
            int width = bVar.f436739b;
            if (width != -2) {
                if (width == -1) {
                    width = swipeLayout.f436725d.getWidth();
                }
                float f14 = width * bVar.f436740c;
                float f15 = -f14;
                float right = (swipeLayout.f436726e.getRight() + width) - swipeLayout.getWidth();
                if (right >= f15 && right <= f14) {
                    int i14 = bVar.f436741d;
                    SwipeLayout.a(swipeLayout, view, (swipeLayout.getWidth() + (view.getLeft() - swipeLayout.f436725d.getLeft())) - width, (i14 == -2 && width == swipeLayout.f436725d.getWidth()) || i14 == width || (i14 == -1 && width == swipeLayout.getWidth()), false);
                    return true;
                }
            }
            return false;
        }

        public final boolean p(View view, int i12, float f12) {
            View view2;
            int i13;
            SwipeLayout swipeLayout = SwipeLayout.this;
            if (f12 > swipeLayout.f436727f) {
                SwipeLayout.a(swipeLayout, view, m(view, swipeLayout.f436726e.getLeft() < 0 ? view.getLeft() - swipeLayout.f436726e.getLeft() : swipeLayout.getWidth()), !(swipeLayout.f436726e.getLeft() < 0), true);
                return true;
            }
            View view3 = swipeLayout.f436724c;
            if (view3 == null) {
                SwipeLayout.a(swipeLayout, view, view.getLeft() - swipeLayout.f436726e.getLeft(), false, true);
                return true;
            }
            b bVar = (b) view3.getLayoutParams();
            if (i12 > 0 && f12 >= 0.0f && (view2 = swipeLayout.f436724c) != null && ((i13 = bVar.f436741d) == -2 ? view2.getRight() >= swipeLayout.f436724c.getWidth() : !(i13 == -1 ? view2.getRight() < swipeLayout.getWidth() : view2.getRight() < bVar.f436741d))) {
                c cVar = swipeLayout.f436729h;
                if (cVar != null) {
                    cVar.b(true);
                }
                return true;
            }
            if (i12 > 0 && f12 >= 0.0f && bVar.f436742e != -1 && swipeLayout.f436724c.getRight() > bVar.f436742e) {
                SwipeLayout.a(swipeLayout, view, m(view, swipeLayout.f436726e.getLeft() < 0 ? view.getLeft() - swipeLayout.f436726e.getLeft() : swipeLayout.getWidth()), true, true);
                return true;
            }
            int width = bVar.f436739b;
            if (width != -2) {
                if (width == -1) {
                    width = swipeLayout.f436724c.getWidth();
                }
                float f13 = width * bVar.f436740c;
                float f14 = -f13;
                float left = swipeLayout.f436726e.getLeft() - width;
                if (left >= f14 && left <= f13) {
                    int i14 = bVar.f436741d;
                    if ((i14 == -2 && width == swipeLayout.f436724c.getWidth()) || i14 == width || (i14 == -1 && width == swipeLayout.getWidth())) {
                        z = true;
                    }
                    SwipeLayout.a(swipeLayout, view, (view.getLeft() - swipeLayout.f436726e.getLeft()) + width, z, true);
                    return true;
                }
            }
            return false;
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f436738a;

        /* renamed from: b, reason: collision with root package name */
        public int f436739b;

        /* renamed from: c, reason: collision with root package name */
        public float f436740c;

        /* renamed from: d, reason: collision with root package name */
        public int f436741d;

        /* renamed from: e, reason: collision with root package name */
        public int f436742e;
    }

    public interface c {
        void a();

        void b(boolean z12);
    }

    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final View f436743b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f436744c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f436745d;

        public d(View view, boolean z12, boolean z13) {
            this.f436743b = view;
            this.f436744c = z12;
            this.f436745d = z13;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar;
            SwipeLayout swipeLayout = SwipeLayout.this;
            androidx.customview.widget.d dVar = swipeLayout.f436723b;
            if (dVar != null && dVar.h()) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                this.f436743b.postOnAnimation(this);
                return;
            }
            int i12 = SwipeLayout.f436722o;
            if (!this.f436744c || (cVar = swipeLayout.f436729h) == null) {
                return;
            }
            cVar.b(this.f436745d);
        }
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f436730i = new WeakHashMap();
        this.f436731j = true;
        this.f436732k = true;
        this.f436733l = 0;
        androidx.customview.widget.d dVar = new androidx.customview.widget.d(getContext(), this, new a());
        dVar.f45376b = (int) (1.0f * dVar.f45376b);
        this.f436723b = dVar;
        this.f436727f = TypedValue.applyDimension(1, 1500.0f, getResources().getDisplayMetrics());
        this.f436728g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.n.f52a);
            if (typedArrayObtainStyledAttributes.hasValue(7)) {
                this.f436731j = typedArrayObtainStyledAttributes.getBoolean(7, true);
                this.f436732k = typedArrayObtainStyledAttributes.getBoolean(7, true);
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                this.f436731j = typedArrayObtainStyledAttributes.getBoolean(3, true);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                this.f436732k = typedArrayObtainStyledAttributes.getBoolean(4, true);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void a(SwipeLayout swipeLayout, View view, int i12, boolean z12, boolean z13) {
        c cVar;
        if (swipeLayout.f436723b.r(i12, view.getTop())) {
            d dVar = swipeLayout.new d(view, z12, z13);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.postOnAnimation(dVar);
        } else {
            if (!z12 || (cVar = swipeLayout.f436729h) == null) {
                return;
            }
            cVar.b(z13);
        }
    }

    public final void b(View view, int i12) {
        if (i12 == 0) {
            return;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != view) {
                childAt.offsetLeftAndRight(i12);
                invalidate(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        b bVar = new b(-1, -2);
        bVar.f436738a = 0;
        bVar.f436740c = 0.9f;
        bVar.f436741d = -2;
        bVar.f436742e = -1;
        return bVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b bVar = new b(context, attributeSet);
        bVar.f436738a = 0;
        bVar.f436740c = 0.9f;
        bVar.f436741d = -2;
        bVar.f436742e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.n.f52a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 2) {
                bVar.f436738a = typedArrayObtainStyledAttributes.getInt(index, 0);
            } else if (index == 5) {
                bVar.f436739b = typedArrayObtainStyledAttributes.getLayoutDimension(index, -1);
            } else if (index == 1) {
                bVar.f436741d = typedArrayObtainStyledAttributes.getLayoutDimension(index, -2);
            } else if (index == 0) {
                bVar.f436742e = typedArrayObtainStyledAttributes.getLayoutDimension(index, -1);
            } else if (index == 6) {
                bVar.f436740c = typedArrayObtainStyledAttributes.getFloat(index, 0.9f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return bVar;
    }

    public int getOffset() {
        View view = this.f436726e;
        if (view == null) {
            return 0;
        }
        return view.getLeft();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f436731j && !this.f436732k) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f436733l = 0;
            this.f436734m = motionEvent.getX();
            this.f436735n = motionEvent.getY();
        }
        return this.f436723b.s(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        this.f436726e = null;
        this.f436724c = null;
        this.f436725d = null;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int i17 = ((b) childAt.getLayoutParams()).f436738a;
                if (i17 == -1) {
                    this.f436724c = childAt;
                } else if (i17 == 0) {
                    this.f436726e = childAt;
                } else if (i17 == 1) {
                    this.f436725d = childAt;
                }
            }
        }
        if (this.f436726e == null) {
            throw new RuntimeException("Center view must be added");
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                b bVar = (b) childAt2.getLayoutParams();
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                int i19 = bVar.f436738a;
                int left = i19 != -1 ? i19 != 1 ? childAt2.getLeft() : this.f436726e.getRight() : this.f436726e.getLeft() - measuredWidth;
                childAt2.layout(left, paddingTop, measuredWidth + left, measuredHeight + paddingTop);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iMax;
        int childCount = getChildCount();
        if (View.MeasureSpec.getMode(i13) == 1073741824) {
            measureChildren(i12, i13);
            iMax = 0;
        } else {
            iMax = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                measureChild(childAt, i12, i13);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
            if (iMax > 0) {
                i13 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                measureChildren(i12, i13);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredHeight());
            }
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i12), View.resolveSize(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i13));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.rambler.libs.swipe_layout.SwipeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setLeftSwipeEnabled(boolean z12) {
        this.f436731j = z12;
    }

    public void setOffset(int i12) {
        View view = this.f436726e;
        if (view != null) {
            b(null, i12 - view.getLeft());
        }
    }

    public void setOnSwipeListener(c cVar) {
        this.f436729h = cVar;
    }

    public void setRightSwipeEnabled(boolean z12) {
        this.f436732k = z12;
    }

    public void setSwipeEnabled(boolean z12) {
        this.f436731j = z12;
        this.f436732k = z12;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b bVar = new b(layoutParams);
        bVar.f436738a = 0;
        bVar.f436740c = 0.9f;
        bVar.f436741d = -2;
        bVar.f436742e = -1;
        return bVar;
    }
}
