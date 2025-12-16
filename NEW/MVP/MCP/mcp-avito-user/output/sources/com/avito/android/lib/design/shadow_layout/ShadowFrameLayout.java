package com.avito.android.lib.design.shadow_layout;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShadowFrameLayout.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/ShadowFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setShadowEnabled", "(Z)V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShadowFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Rect f180464b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f180465c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180466d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180467e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180468f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180469g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ColorStateList f180470h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SparseArray<Bitmap> f180471i;

    /* compiled from: ShadowFrameLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/ShadowFrameLayout$a;", "Landroid/widget/FrameLayout$LayoutParams;", "Lcom/avito/android/lib/design/shadow_layout/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends FrameLayout.LayoutParams implements c {

        /* renamed from: b, reason: collision with root package name */
        public boolean f180472b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public ColorStateList f180473c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f180474d;

        @Override // com.avito.android.lib.design.shadow_layout.c
        public final void a(boolean z12) {
            this.f180474d = z12;
        }
    }

    public ShadowFrameLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.shadowLayout);
        setWillNotDraw(false);
        this.f180464b = new Rect();
        this.f180468f = true;
        this.f180471i = new SparseArray<>();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178910A0, R.attr.shadowLayout, R.style.Design_Widget_ShadowLayout);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 1);
        this.f180470h = colorStateListA == null ? C35835l0.e(R.attr.black, getContext()) : colorStateListA;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setMaskFilter(new BlurMaskFilter(dimensionPixelSize, BlurMaskFilter.Blur.NORMAL));
        this.f180465c = paint;
        this.f180466d = dimensionPixelOffset;
        this.f180467e = dimensionPixelOffset2;
        this.f180468f = z12;
        this.f180469g = dimensionPixelSize;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        SparseArray<Bitmap> sparseArray = this.f180471i;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = sparseArray.keyAt(i12);
            View childAt = getChildAt(iKeyAt);
            Rect rect = this.f180464b;
            childAt.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(childAt, rect);
            Bitmap bitmap = sparseArray.get(iKeyAt);
            float f12 = rect.left;
            int i13 = this.f180469g;
            canvas.drawBitmap(bitmap, f12 - i13, rect.top - i13, (Paint) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount;
        ColorStateList colorStateList;
        super.onLayout(z12, i12, i13, i14, i15);
        SparseArray<Bitmap> sparseArray = this.f180471i;
        sparseArray.clear();
        if (!this.f180468f || (childCount = getChildCount() - 1) < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            View childAt = getChildAt(i16);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            a aVar = layoutParams instanceof a ? (a) layoutParams : null;
            if (aVar != null && aVar.f180472b && !aVar.f180474d) {
                Paint paint = this.f180465c;
                if (paint == null) {
                    paint = null;
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                a aVar2 = layoutParams2 instanceof a ? (a) layoutParams2 : null;
                if (aVar2 == null || (colorStateList = aVar2.f180473c) == null) {
                    colorStateList = this.f180470h;
                }
                paint.setColor(colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : 0);
                Rect rect = this.f180464b;
                childAt.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(childAt, rect);
                float f12 = this.f180469g * 4.0f;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (rect.width() + f12), (int) (rect.height() + f12), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f13 = this.f180466d;
                float f14 = this.f180469g;
                float f15 = f13 + f14;
                float f16 = this.f180467e + f14;
                float fWidth = this.f180469g + rect.width() + this.f180466d;
                float fHeight = rect.height() + this.f180467e + this.f180469g;
                Paint paint2 = this.f180465c;
                canvas.drawRect(f15, f16, fWidth, fHeight, paint2 == null ? null : paint2);
                sparseArray.append(i16, bitmapCreateBitmap);
            }
            if (i16 == childCount) {
                return;
            } else {
                i16++;
            }
        }
    }

    public final void setShadowEnabled(boolean enabled) {
        this.f180468f = enabled;
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        if (layoutParams instanceof a) {
            a aVar2 = (a) layoutParams;
            aVar.f180472b = aVar2.f180472b;
            aVar.f180473c = aVar2.f180473c;
        }
        return aVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @k
    public final FrameLayout.LayoutParams generateLayoutParams(@k AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178912B0);
        aVar.f180472b = typedArrayObtainStyledAttributes.getBoolean(1, false);
        aVar.f180473c = x.a(typedArrayObtainStyledAttributes, context, 0);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }
}
