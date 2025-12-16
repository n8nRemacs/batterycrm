package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.yandex.div.internal.widget.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;

/* compiled from: LinearContainerLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\tR0\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\tR+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010+\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010\u0010\u0012\u0004\b*\u0010\u0014\u001a\u0004\b(\u0010\u0005\"\u0004\b)\u0010\tR\"\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0010\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\tR$\u00102\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\t¨\u00063"}, d2 = {"Lcom/yandex/div/core/widget/n;", "Lcom/yandex/div/internal/widget/d;", "Lcom/yandex/div/core/widget/e;", "", "getBaseline", "()I", "horizontalGravity", "Lkotlin/G0;", "setHorizontalGravity", "(I)V", "verticalGravity", "setVerticalGravity", "measureSpec", "setParentCrossSizeIfNeeded", "value", "e", "I", "getOrientation", "setOrientation", "getOrientation$annotations", "()V", "orientation", "", "<set-?>", "j", "Lkotlin/properties/h;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "Landroid/graphics/drawable/Drawable;", "m", "Landroid/graphics/drawable/Drawable;", "getDividerDrawable", "()Landroid/graphics/drawable/Drawable;", "setDividerDrawable", "(Landroid/graphics/drawable/Drawable;)V", "dividerDrawable", "n", "getShowDividers", "setShowDividers", "getShowDividers$annotations", "showDividers", "o", "getDividerPadding", "setDividerPadding", "dividerPadding", "getGravity", "setGravity", "gravity", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class n extends com.yandex.div.internal.widget.d implements InterfaceC38049e {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f369288u = {m0.f406844a.e(new Y(n.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: c, reason: collision with root package name */
    public int f369289c;

    /* renamed from: d, reason: collision with root package name */
    public int f369290d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int orientation;

    /* renamed from: f, reason: collision with root package name */
    public int f369292f;

    /* renamed from: g, reason: collision with root package name */
    public int f369293g;

    /* renamed from: h, reason: collision with root package name */
    public int f369294h;

    /* renamed from: i, reason: collision with root package name */
    public int f369295i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final kotlin.properties.h aspectRatio;

    /* renamed from: k, reason: collision with root package name */
    public int f369297k;

    /* renamed from: l, reason: collision with root package name */
    public int f369298l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Drawable dividerDrawable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int showDividers;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int dividerPadding;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369302p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f369303q;

    /* renamed from: r, reason: collision with root package name */
    public int f369304r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f369305s;

    /* renamed from: t, reason: collision with root package name */
    public float f369306t;

    /* compiled from: LinearContainerLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f369307l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            return Float.valueOf(kotlin.ranges.s.a(f12.floatValue(), 0.0f));
        }
    }

    public /* synthetic */ n(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    public static int k(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return ((com.yandex.div.internal.widget.c) layoutParams).f370249g;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
    }

    public static int l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return ((com.yandex.div.internal.widget.c) layoutParams).f370250h;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
    }

    public static boolean n(View view, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams)).height != -1 || View.MeasureSpec.getMode(i12) == 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
    }

    public static boolean o(View view, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams)).width != -1 || View.MeasureSpec.getMode(i12) == 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
    }

    private final void setParentCrossSizeIfNeeded(int measureSpec) {
        if (!this.f369305s.isEmpty() && this.f369304r <= 0 && F.d(measureSpec)) {
            this.f369304r = View.MeasureSpec.getSize(measureSpec);
        }
    }

    public final G0 f(Canvas canvas, int i12, int i13, int i14, int i15) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f12 = (i12 + i14) / 2.0f;
        float f13 = (i13 + i15) / 2.0f;
        float f14 = this.f369297k / 2.0f;
        float f15 = this.f369298l / 2.0f;
        drawable.setBounds((int) (f12 - f14), (int) (f13 - f15), (int) (f12 + f14), (int) (f13 + f15));
        drawable.draw(canvas);
        return G0.f406611a;
    }

    @Override // com.yandex.div.internal.widget.d, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.orientation == 1 ? new com.yandex.div.internal.widget.c(-1, -2) : new com.yandex.div.internal.widget.c(-2, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getAspectRatio() {
        kotlin.properties.h hVar = this.aspectRatio;
        kotlin.reflect.n<Object> nVar = f369288u[0];
        g gVar = (g) hVar;
        gVar.getClass();
        return ((Number) gVar.f369255b).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.orientation != 1) {
            int i12 = this.f369289c;
            return i12 != -1 ? getPaddingTop() + i12 : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (layoutParams != null) {
            return getPaddingTop() + baseline + ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams)).topMargin;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
    }

    @Y61.l
    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    public final int getDividerPadding() {
        return this.dividerPadding;
    }

    /* renamed from: getGravity, reason: from getter */
    public final int getF369292f() {
        return this.f369292f;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getShowDividers() {
        return this.showDividers;
    }

    public final void h(Y41.l<? super View, G0> lVar) {
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            int i13 = i12 + 1;
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                lVar.invoke(childAt);
            }
            i12 = i13;
        }
    }

    public final void i(Y41.p<? super View, ? super Integer, G0> pVar) {
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            int i13 = i12 + 1;
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                pVar.invoke(childAt, Integer.valueOf(i12));
            }
            i12 = i13;
        }
    }

    public final boolean m(int i12) {
        int i13;
        if (i12 == 0) {
            if ((this.showDividers & 1) == 0) {
                return false;
            }
        } else if (i12 == getChildCount()) {
            if ((this.showDividers & 4) == 0) {
                return false;
            }
        } else {
            if ((this.showDividers & 2) == 0 || (i13 = i12 - 1) < 0) {
                return false;
            }
            while (true) {
                int i14 = i13 - 1;
                if (getChildAt(i13).getVisibility() != 8) {
                    return true;
                }
                if (i14 < 0) {
                    return false;
                }
                i13 = i14;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        int width;
        Integer numValueOf;
        if (this.dividerDrawable == null) {
            return;
        }
        if (this.orientation == 1) {
            i(new p(this, canvas));
            if (m(getChildCount())) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt == null) {
                    numValueOf = null;
                } else {
                    int bottom = childAt.getBottom();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    }
                    numValueOf = Integer.valueOf(bottom + ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams)).bottomMargin);
                }
                int height = numValueOf == null ? (getHeight() - getPaddingBottom()) - this.f369298l : numValueOf.intValue();
                f(canvas, getPaddingLeft() + this.dividerPadding, height, (getWidth() - getPaddingRight()) - this.dividerPadding, height + this.f369298l);
                return;
            }
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z12 = getLayoutDirection() == 1;
        i(new o(this, z12, canvas));
        if (m(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 == null && z12) {
                width = getPaddingLeft();
            } else if (childAt2 == null) {
                width = (getWidth() - getPaddingRight()) - this.f369297k;
            } else if (z12) {
                int left = childAt2.getLeft();
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                width = (left - ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams2)).leftMargin) - this.f369297k;
            } else {
                int right = childAt2.getRight();
                ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                width = ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams3)).rightMargin + right;
            }
            int i12 = width;
            f(canvas, i12, getPaddingTop() + this.dividerPadding, i12 + this.f369297k, (getHeight() - getPaddingBottom()) - this.dividerPadding);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        int childCount;
        int i17;
        char c12;
        int i18;
        int iF2;
        int i19 = 0;
        char c13 = 2;
        if (this.orientation == 1) {
            int i22 = i14 - i12;
            int paddingRight = i22 - getPaddingRight();
            int paddingLeft = (i22 - getPaddingLeft()) - getPaddingRight();
            int f369292f = getF369292f() & 112;
            int f369292f2 = getF369292f() & 8388615;
            l0.f fVar = new l0.f();
            int paddingTop = f369292f != 16 ? (f369292f == 48 || f369292f != 80) ? getPaddingTop() : ((getPaddingTop() + i15) - i13) - this.f369293g : androidx.appcompat.app.r.f(i15 - i13, this.f369293g, 2, getPaddingTop());
            fVar.f406840b = paddingTop;
            i(new q(f369292f2, this, paddingLeft, paddingRight, fVar));
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z13 = getLayoutDirection() == 1;
        int i23 = i15 - i13;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingTop2 = (i23 - getPaddingTop()) - getPaddingBottom();
        int f369292f3 = 8388615 & getF369292f();
        int f369292f4 = getF369292f() & 112;
        int absoluteGravity = Gravity.getAbsoluteGravity(f369292f3, getLayoutDirection());
        int paddingLeft2 = absoluteGravity != 1 ? (absoluteGravity == 3 || absoluteGravity != 5) ? getPaddingLeft() : ((getPaddingLeft() + i14) - i12) - this.f369293g : androidx.appcompat.app.r.f(i14 - i12, this.f369293g, 2, getPaddingLeft());
        int i24 = -1;
        if (z13) {
            childCount = getChildCount() - 1;
            i16 = -1;
        } else {
            i16 = 1;
            childCount = 0;
        }
        int childCount2 = getChildCount();
        while (i19 < childCount2) {
            int i25 = i19 + 1;
            int i26 = (i19 * i16) + childCount;
            View childAt = getChildAt(i26);
            if (childAt == null) {
                i17 = childCount;
                c12 = c13;
                i18 = paddingBottom;
            } else if (childAt.getVisibility() == 8) {
                i17 = childCount;
                i18 = paddingBottom;
                c12 = 2;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                int baseline = (!cVar.f370244b || ((ViewGroup.MarginLayoutParams) cVar).height == i24) ? i24 : childAt.getBaseline();
                int i27 = cVar.f370243a;
                if (i27 < 0) {
                    i27 = f369292f4;
                }
                int i28 = i27 & 112;
                i17 = childCount;
                if (i28 != 16) {
                    if (i28 != 48) {
                        iF2 = i28 != 80 ? getPaddingTop() : (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                        i18 = paddingBottom;
                    } else {
                        int paddingTop3 = getPaddingTop();
                        int i29 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        int i32 = paddingTop3 + i29;
                        i18 = paddingBottom;
                        iF2 = baseline != -1 ? ((this.f369289c - baseline) - i29) + i32 : i32;
                    }
                    c12 = 2;
                } else {
                    i18 = paddingBottom;
                    c12 = 2;
                    iF2 = androidx.appcompat.app.r.f((paddingTop2 - measuredHeight) + ((ViewGroup.MarginLayoutParams) cVar).topMargin, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, 2, getPaddingTop());
                }
                if (m(i26)) {
                    paddingLeft2 += this.f369297k;
                }
                int i33 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                childAt.layout(i33, iF2, i33 + measuredWidth, measuredHeight + iF2);
                paddingLeft2 = i33 + measuredWidth + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
            }
            childCount = i17;
            paddingBottom = i18;
            c13 = c12;
            i19 = i25;
            i24 = -1;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        this.f369293g = 0;
        this.f369306t = 0.0f;
        this.f369295i = 0;
        if (this.orientation == 1) {
            q(i12, i13);
        } else {
            p(i12, i13);
        }
        this.f369302p.clear();
        this.f369305s.clear();
        this.f369303q.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[EDGE_INSN: B:94:0x0105->B:44:0x0105 BREAK  A[LOOP:2: B:37:0x00ec->B:95:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.widget.n.p(int, int):void");
    }

    public final void q(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        boolean z12 = View.MeasureSpec.getMode(i12) == 1073741824;
        l0.f fVar = new l0.f();
        fVar.f406840b = getAspectRatio() == 0.0f ? i13 : z12 ? View.MeasureSpec.makeMeasureSpec(kotlin.math.b.b(size / getAspectRatio()), 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        if (!z12) {
            size = getSuggestedMinimumWidth();
        }
        int i14 = size < 0 ? 0 : size;
        this.f369304r = i14;
        i(new v(this, i12, fVar));
        setParentCrossSizeIfNeeded(i12);
        int i15 = fVar.f406840b;
        boolean zE2 = F.e(i12);
        LinkedHashSet linkedHashSet = this.f369303q;
        LinkedHashSet<View> linkedHashSet2 = this.f369305s;
        if (!zE2) {
            if (this.f369304r != 0) {
                for (View view : linkedHashSet2) {
                    int i16 = this.f369304r;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    }
                    this.f369304r = Math.max(i16, ((com.yandex.div.internal.widget.c) layoutParams).a());
                }
            } else {
                for (View view2 : linkedHashSet2) {
                    r(view2, i12, i15, true, false);
                    linkedHashSet.remove(view2);
                    linkedHashSet2 = linkedHashSet2;
                }
            }
        }
        for (View view3 : linkedHashSet2) {
            int i17 = fVar.f406840b;
            if (n(view3, i17)) {
                r(view3, View.MeasureSpec.makeMeasureSpec(this.f369304r, 1073741824), i17, false, true);
                linkedHashSet.remove(view3);
            }
        }
        h(new w(this, fVar));
        if (this.f369293g > 0 && m(getChildCount())) {
            this.f369293g += this.f369298l;
        }
        this.f369293g = getPaddingBottom() + getPaddingTop() + this.f369293g;
        int size2 = View.MeasureSpec.getSize(fVar.f406840b);
        if (getAspectRatio() != 0.0f && !z12) {
            size2 = kotlin.math.b.b((View.resolveSizeAndState(r0 + (this.f369304r == i14 ? 0 : getPaddingRight() + getPaddingLeft()), i12, this.f369295i) & 16777215) / getAspectRatio());
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            fVar.f406840b = iMakeMeasureSpec;
            v(i12, size2, iMakeMeasureSpec, i14);
        } else if (getAspectRatio() != 0.0f || F.e(fVar.f406840b)) {
            v(i12, size2, fVar.f406840b, i14);
        } else {
            int iMax = Math.max(this.f369293g, getSuggestedMinimumHeight());
            if (F.d(fVar.f406840b) && this.f369306t > 0.0f) {
                iMax = Math.max(View.MeasureSpec.getSize(fVar.f406840b), iMax);
            }
            v(i12, View.resolveSize(iMax, fVar.f406840b), fVar.f406840b, i14);
            size2 = Math.max(this.f369293g, getSuggestedMinimumHeight());
        }
        int i18 = this.f369304r;
        setMeasuredDimension(View.resolveSizeAndState(i18 + (i18 == i14 ? 0 : getPaddingRight() + getPaddingLeft()), i12, this.f369295i), View.resolveSizeAndState(size2, fVar.f406840b, this.f369295i << 16));
    }

    public final void r(View view, int i12, int i13, boolean z12, boolean z13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        if (((ViewGroup.MarginLayoutParams) cVar).height == -3) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            }
            com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
            int i14 = cVar2.f370249g;
            ((ViewGroup.MarginLayoutParams) cVar2).height = -2;
            cVar2.f370249g = Integer.MAX_VALUE;
            measureChildWithMargins(view, i12, 0, i13, 0);
            ((ViewGroup.MarginLayoutParams) cVar2).height = -3;
            cVar2.f370249g = i14;
            if (z13) {
                int i15 = this.f369294h;
                this.f369294h = Math.max(i15, cVar2.b() + view.getMeasuredHeight() + i15);
                ArrayList arrayList = this.f369302p;
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            }
        } else {
            measureChildWithMargins(view, i12, 0, i13, 0);
        }
        this.f369295i = View.combineMeasuredStates(this.f369295i, view.getMeasuredState());
        if (z12) {
            x(i12, cVar.a() + view.getMeasuredWidth());
        }
        if (z13 && n(view, i13)) {
            int i16 = this.f369293g;
            this.f369293g = Math.max(i16, cVar.b() + view.getMeasuredHeight() + i16);
        }
    }

    public final boolean s(int i12, int i13) {
        if (View.MeasureSpec.getMode(i13) == 0) {
            return false;
        }
        if (this.f369303q.isEmpty()) {
            if (i12 > 0) {
                if (this.f369306t <= 0.0f) {
                    return false;
                }
            } else if (i12 >= 0 || this.f369294h <= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.yandex.div.core.widget.InterfaceC38049e
    public void setAspectRatio(float f12) {
        ((g) this.aspectRatio).setValue(this, f369288u[0], Float.valueOf(f12));
    }

    public final void setDividerDrawable(@Y61.l Drawable drawable) {
        if (L.f(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.f369297k = drawable == null ? 0 : drawable.getIntrinsicWidth();
        this.f369298l = drawable == null ? 0 : drawable.getIntrinsicHeight();
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerPadding(int i12) {
        this.dividerPadding = i12;
    }

    public final void setGravity(int i12) {
        if (this.f369292f == i12) {
            return;
        }
        if ((8388615 & i12) == 0) {
            i12 |= 8388611;
        }
        if ((i12 & 112) == 0) {
            i12 |= 48;
        }
        this.f369292f = i12;
        requestLayout();
    }

    public final void setHorizontalGravity(int horizontalGravity) {
        int i12 = horizontalGravity & 8388615;
        if ((8388615 & getF369292f()) == i12) {
            return;
        }
        this.f369292f = i12 | (getF369292f() & (-8388616));
        requestLayout();
    }

    public final void setOrientation(int i12) {
        if (this.orientation != i12) {
            this.orientation = i12;
            requestLayout();
        }
    }

    public final void setShowDividers(int i12) {
        if (this.showDividers == i12) {
            return;
        }
        this.showDividers = i12;
        requestLayout();
    }

    public final void setVerticalGravity(int verticalGravity) {
        int i12 = verticalGravity & 112;
        if ((getF369292f() & 112) == i12) {
            return;
        }
        this.f369292f = i12 | (getF369292f() & (-113));
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final int t(View view, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        int iB2 = cVar.b() + getPaddingBottom() + getPaddingTop();
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).height;
        int minimumHeight = view.getMinimumHeight();
        int i15 = cVar.f370249g;
        com.yandex.div.internal.widget.d.f370251b.getClass();
        view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), d.a.a(i12, iB2, i14, minimumHeight, i15));
        return View.combineMeasuredStates(this.f369295i, view.getMeasuredState() & (-16777216));
    }

    public final void u(int i12, int i13, int i14, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        int i15 = ((ViewGroup.MarginLayoutParams) cVar).width;
        if (i15 == -1) {
            if (i13 == 0) {
                ((ViewGroup.MarginLayoutParams) cVar).width = -3;
            } else {
                i12 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            }
        }
        int iA2 = cVar.a() + getPaddingRight() + getPaddingLeft();
        int i16 = ((ViewGroup.MarginLayoutParams) cVar).width;
        int minimumWidth = view.getMinimumWidth();
        int i17 = cVar.f370250h;
        com.yandex.div.internal.widget.d.f370251b.getClass();
        int iA3 = d.a.a(i12, iA2, i16, minimumWidth, i17);
        ((ViewGroup.MarginLayoutParams) cVar).width = i15;
        view.measure(iA3, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        this.f369295i = View.combineMeasuredStates(this.f369295i, view.getMeasuredState() & (-256));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.widget.n.v(int, int, int, int):void");
    }

    public final void w(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        if (cVar.f370244b && (baseline = view.getBaseline()) != -1) {
            this.f369289c = Math.max(this.f369289c, ((ViewGroup.MarginLayoutParams) cVar).topMargin + baseline);
            this.f369290d = Math.max(this.f369290d, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) cVar).topMargin);
        }
    }

    public final void x(int i12, int i13) {
        if (F.e(i12)) {
            return;
        }
        this.f369304r = Math.max(this.f369304r, i13);
    }

    @X41.j
    public n(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f369289c = -1;
        this.f369290d = -1;
        this.f369292f = 8388659;
        this.aspectRatio = new g(a.f369307l, Float.valueOf(0.0f));
        this.f369302p = new ArrayList();
        this.f369303q = new LinkedHashSet();
        this.f369305s = new LinkedHashSet();
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    @D
    public static /* synthetic */ void getShowDividers$annotations() {
    }
}
