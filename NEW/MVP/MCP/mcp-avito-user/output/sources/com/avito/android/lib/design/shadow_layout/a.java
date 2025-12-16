package com.avito.android.lib.design.shadow_layout;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
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
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: LegacyShadowFrameLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/a;", "Landroid/widget/FrameLayout;", "", "enabled", "Lkotlin/G0;", "setShadowEnabled", "(Z)V", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f180490h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f180491i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Rect f180492b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f180493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180494d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180495e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180496f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ColorStateList f180497g;

    /* compiled from: LegacyShadowFrameLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.shadow_layout.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5295a extends H implements p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C5295a f180498b = new C5295a();

        public C5295a() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet);
        }
    }

    /* compiled from: LegacyShadowFrameLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/a$b;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LegacyShadowFrameLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/shadow_layout/a$c;", "Landroid/widget/FrameLayout$LayoutParams;", "Lcom/avito/android/lib/design/shadow_layout/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends FrameLayout.LayoutParams implements com.avito.android.lib.design.shadow_layout.c {

        /* renamed from: b, reason: collision with root package name */
        public boolean f180499b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f180500c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public ColorStateList f180501d;

        @Override // com.avito.android.lib.design.shadow_layout.c
        public final void a(boolean z12) {
            this.f180499b = z12;
        }
    }

    static {
        AvitoLayoutInflater.f181382a.getClass();
        f180491i = AvitoLayoutInflater.a(C5295a.f180498b, AvitoLayoutInflater.f181389h);
    }

    public a(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.shadowLayout);
        setWillNotDraw(false);
        setLayerType(1, null);
        this.f180492b = new Rect();
        this.f180496f = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178910A0, R.attr.shadowLayout, R.style.Design_Widget_ShadowLayout);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 1);
        this.f180497g = colorStateListA == null ? C35835l0.e(R.attr.black, getContext()) : colorStateListA;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setMaskFilter(new BlurMaskFilter(dimensionPixelSize, BlurMaskFilter.Blur.NORMAL));
        this.f180493c = paint;
        this.f180494d = dimensionPixelOffset;
        this.f180495e = dimensionPixelOffset2;
        this.f180496f = z12;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        int childCount;
        ColorStateList colorStateList;
        if (!this.f180496f || (childCount = getChildCount() - 1) < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            c cVar = layoutParams instanceof c ? (c) layoutParams : null;
            if (cVar != null && cVar.f180500c && !cVar.f180499b) {
                Rect rect = this.f180492b;
                childAt.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(childAt, rect);
                Paint paint = this.f180493c;
                if (paint == null) {
                    paint = null;
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                c cVar2 = layoutParams2 instanceof c ? (c) layoutParams2 : null;
                if (cVar2 == null || (colorStateList = cVar2.f180501d) == null) {
                    colorStateList = this.f180497g;
                }
                paint.setColor(colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : 0);
                int i13 = rect.left;
                int i14 = this.f180494d;
                float f12 = i13 + i14;
                int i15 = rect.top;
                int i16 = this.f180495e;
                float f13 = i15 + i16;
                float f14 = rect.right + i14;
                float f15 = rect.bottom + i16;
                Paint paint2 = this.f180493c;
                canvas.drawRect(f12, f13, f14, f15, paint2 == null ? null : paint2);
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void setShadowEnabled(boolean enabled) {
        this.f180496f = enabled;
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        c cVar = new c(layoutParams);
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar.f180500c = cVar2.f180500c;
            cVar.f180501d = cVar2.f180501d;
        }
        return cVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @k
    public final FrameLayout.LayoutParams generateLayoutParams(@k AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178912B0);
        cVar.f180500c = typedArrayObtainStyledAttributes.getBoolean(1, false);
        cVar.f180501d = x.a(typedArrayObtainStyledAttributes, context, 0);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }
}
