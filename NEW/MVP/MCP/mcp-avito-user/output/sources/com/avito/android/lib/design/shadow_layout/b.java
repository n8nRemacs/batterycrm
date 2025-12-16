package com.avito.android.lib.design.shadow_layout;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: LegacyShadowLinearLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/b;", "Landroid/widget/LinearLayout;", "", "enabled", "Lkotlin/G0;", "setShadowEnabled", "(Z)V", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C5296b f180502g = new C5296b(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f180503h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Rect f180504b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f180505c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180506d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180508f;

    /* compiled from: LegacyShadowLinearLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements p<Context, AttributeSet, b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f180509b = new a();

        public a() {
            super(2, b.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;)V", 0);
        }

        @Override // Y41.p
        public final b invoke(Context context, AttributeSet attributeSet) {
            return new b(context, attributeSet);
        }
    }

    /* compiled from: LegacyShadowLinearLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/b$b;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.shadow_layout.b$b, reason: collision with other inner class name */
    public static final class C5296b {
        public /* synthetic */ C5296b(C42822w c42822w) {
            this();
        }

        public C5296b() {
        }
    }

    /* compiled from: LegacyShadowLinearLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/b$c;", "Landroid/widget/LinearLayout$LayoutParams;", "Lcom/avito/android/lib/design/shadow_layout/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends LinearLayout.LayoutParams implements com.avito.android.lib.design.shadow_layout.c {

        /* renamed from: b, reason: collision with root package name */
        public boolean f180510b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f180511c;

        @Override // com.avito.android.lib.design.shadow_layout.c
        public final void a(boolean z12) {
            this.f180510b = z12;
        }
    }

    static {
        AvitoLayoutInflater.f181382a.getClass();
        f180503h = AvitoLayoutInflater.a(a.f180509b, AvitoLayoutInflater.f181390i);
    }

    public b(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.shadowLayout);
        setWillNotDraw(false);
        setLayerType(1, null);
        this.f180504b = new Rect();
        this.f180508f = true;
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
        this.f180505c = paint;
        this.f180506d = dimensionPixelOffset;
        this.f180507e = dimensionPixelOffset2;
        this.f180508f = z12;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(@k Canvas canvas) {
        int childCount;
        if (!this.f180508f || (childCount = getChildCount() - 1) < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            c cVar = layoutParams instanceof c ? (c) layoutParams : null;
            if (cVar != null && cVar.f180511c && !cVar.f180510b) {
                Rect rect = this.f180504b;
                childAt.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(childAt, rect);
                int i13 = rect.left;
                int i14 = this.f180506d;
                float f12 = i13 + i14;
                int i15 = rect.top;
                int i16 = this.f180507e;
                float f13 = i15 + i16;
                float f14 = rect.right + i14;
                float f15 = rect.bottom + i16;
                Paint paint = this.f180505c;
                canvas.drawRect(f12, f13, f14, f15, paint == null ? null : paint);
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void setShadowEnabled(boolean enabled) {
        this.f180508f = enabled;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @k
    public final LinearLayout.LayoutParams generateLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        c cVar = new c(layoutParams);
        if (layoutParams instanceof c) {
            cVar.f180511c = ((c) layoutParams).f180511c;
        }
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @k
    public final LinearLayout.LayoutParams generateLayoutParams(@k AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178912B0);
        cVar.f180511c = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }
}
