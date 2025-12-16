package com.avito.android.lib.design.shadow_layout;

import Y61.k;
import Y61.l;
import android.content.Context;
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
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShadowLinearLayout.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/ShadowLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setShadowEnabled", "(Z)V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShadowLinearLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Rect f180481b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f180482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180483d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180484e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180485f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f180486g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SparseArray<Bitmap> f180487h;

    /* compiled from: ShadowLinearLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/ShadowLinearLayout$a;", "Landroid/widget/LinearLayout$LayoutParams;", "Lcom/avito/android/lib/design/shadow_layout/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends LinearLayout.LayoutParams implements c {

        /* renamed from: b, reason: collision with root package name */
        public boolean f180488b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f180489c;

        @Override // com.avito.android.lib.design.shadow_layout.c
        public final void a(boolean z12) {
            this.f180489c = z12;
        }
    }

    public ShadowLinearLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.shadowLayout);
        setWillNotDraw(false);
        this.f180481b = new Rect();
        this.f180486g = true;
        this.f180487h = new SparseArray<>();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178910A0, R.attr.shadowLayout, R.style.Design_Widget_ShadowLayout);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        int color = typedArrayObtainStyledAttributes.getColor(1, C35835l0.d(R.attr.black, getContext()));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setMaskFilter(new BlurMaskFilter(dimensionPixelSize, BlurMaskFilter.Blur.NORMAL));
        paint.setColor(color);
        this.f180482c = paint;
        this.f180483d = dimensionPixelOffset;
        this.f180484e = dimensionPixelOffset2;
        this.f180486g = z12;
        this.f180485f = dimensionPixelSize;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(@k Canvas canvas) {
        SparseArray<Bitmap> sparseArray = this.f180487h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = sparseArray.keyAt(i12);
            View childAt = getChildAt(iKeyAt);
            Rect rect = this.f180481b;
            childAt.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(childAt, rect);
            Bitmap bitmap = sparseArray.get(iKeyAt);
            float f12 = rect.left;
            int i13 = this.f180485f;
            canvas.drawBitmap(bitmap, f12 - i13, rect.top - i13, (Paint) null);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount;
        super.onLayout(z12, i12, i13, i14, i15);
        SparseArray<Bitmap> sparseArray = this.f180487h;
        sparseArray.clear();
        if (!this.f180486g || (childCount = getChildCount() - 1) < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            View childAt = getChildAt(i16);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            a aVar = layoutParams instanceof a ? (a) layoutParams : null;
            if (aVar != null && aVar.f180488b && !aVar.f180489c) {
                Rect rect = this.f180481b;
                childAt.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(childAt, rect);
                float f12 = this.f180485f * 4.0f;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (rect.width() + f12), (int) (rect.height() + f12), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f13 = this.f180483d;
                float f14 = this.f180485f;
                float f15 = f13 + f14;
                float f16 = this.f180484e + f14;
                float fWidth = this.f180485f + rect.width() + this.f180483d;
                float fHeight = rect.height() + this.f180484e + this.f180485f;
                Paint paint = this.f180482c;
                canvas.drawRect(f15, f16, fWidth, fHeight, paint == null ? null : paint);
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
        this.f180486g = enabled;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @k
    public final LinearLayout.LayoutParams generateLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        if (layoutParams instanceof a) {
            aVar.f180488b = ((a) layoutParams).f180488b;
        }
        return aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @k
    public final LinearLayout.LayoutParams generateLayoutParams(@k AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178912B0);
        aVar.f180488b = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }
}
