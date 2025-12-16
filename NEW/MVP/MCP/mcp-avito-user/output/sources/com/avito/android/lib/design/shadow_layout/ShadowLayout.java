package com.avito.android.lib.design.shadow_layout;

import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShadowLayout.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/ShadowLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enableShadows", "Lkotlin/G0;", "setEnableShadows", "(Z)V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class ShadowLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Rect f180475b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f180476c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180477d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180479f;

    /* compiled from: ShadowLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/ShadowLayout$a;", "Landroid/widget/FrameLayout$LayoutParams;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f180480a;
    }

    public ShadowLayout(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setLayerType(1, null);
        this.f180475b = new Rect();
        this.f180479f = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178921G);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, C35835l0.d(R.attr.black, getContext()));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setMaskFilter(new BlurMaskFilter(dimensionPixelSize, BlurMaskFilter.Blur.NORMAL));
        paint.setColor(color);
        this.f180476c = paint;
        this.f180477d = dimensionPixelOffset;
        this.f180478e = dimensionPixelOffset2;
        this.f180479f = z12;
    }

    public final void a(Canvas canvas, View view) {
        Rect rect = this.f180475b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int i12 = rect.left;
        int i13 = this.f180477d;
        float f12 = i12 + i13;
        int i14 = rect.top;
        int i15 = this.f180478e;
        float f13 = i14 + i15;
        float f14 = rect.right + i13;
        float f15 = rect.bottom + i15;
        Paint paint = this.f180476c;
        if (paint == null) {
            paint = null;
        }
        canvas.drawRect(f12, f13, f14, f15, paint);
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
        int childCount;
        if (!this.f180479f || getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((childAt instanceof ViewGroup) && (layoutParams instanceof a) && ((a) layoutParams).f180480a) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount() - 1;
                if (childCount2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        a(canvas, viewGroup.getChildAt(i13));
                        if (i13 == childCount2) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            } else {
                a(canvas, childAt);
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void setEnableShadows(boolean enableShadows) {
        this.f180479f = enableShadows;
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        if (layoutParams instanceof a) {
            aVar.f180480a = ((a) layoutParams).f180480a;
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178921G);
        aVar.f180480a = typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }
}
