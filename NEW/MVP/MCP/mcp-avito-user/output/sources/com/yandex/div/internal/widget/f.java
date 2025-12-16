package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.F;
import com.yandex.div.core.widget.InterfaceC38049e;
import com.yandex.div.internal.widget.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;

/* compiled from: FrameContainerLayout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0014\u0010%\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0014\u0010'\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0014\u0010)\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001c¨\u0006*"}, d2 = {"Lcom/yandex/div/internal/widget/f;", "Lcom/yandex/div/internal/widget/d;", "Lcom/yandex/div/core/widget/e;", "", "gravity", "Lkotlin/G0;", "setForegroundGravity", "(I)V", "", "d", "Z", "getMeasureAllChildren", "()Z", "setMeasureAllChildren", "(Z)V", "getMeasureAllChildren$annotations", "()V", "measureAllChildren", "", "<set-?>", "k", "Lkotlin/properties/h;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getPaddingLeftWithForeground", "()I", "paddingLeftWithForeground", "getPaddingRightWithForeground", "paddingRightWithForeground", "getPaddingTopWithForeground", "paddingTopWithForeground", "getPaddingBottomWithForeground", "paddingBottomWithForeground", "getUseAspect", "useAspect", "getHorizontalPadding", "horizontalPadding", "getVerticalPadding", "verticalPadding", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class f extends d implements InterfaceC38049e {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f370264l = {m0.f406844a.e(new Y(f.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Rect f370265c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean measureAllChildren;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f370267e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f370268f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f370269g;

    /* renamed from: h, reason: collision with root package name */
    public int f370270h;

    /* renamed from: i, reason: collision with root package name */
    public int f370271i;

    /* renamed from: j, reason: collision with root package name */
    public int f370272j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final kotlin.properties.h aspectRatio;

    /* compiled from: FrameContainerLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f370274l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            return Float.valueOf(kotlin.ranges.s.a(f12.floatValue(), 0.0f));
        }
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.f370265c.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.f370265c.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.f370265c.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.f370265c.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    @Override // com.yandex.div.internal.widget.d, android.view.ViewGroup
    @Y61.k
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f370264l[0])).floatValue();
    }

    public final boolean getMeasureAllChildren() {
        return this.measureAllChildren;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (right - left) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (bottom - top) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16 + 1;
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                c cVar = (c) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(cVar.f370243a, getLayoutDirection());
                int i18 = cVar.f370243a & 112;
                int i19 = absoluteGravity & 7;
                int iF2 = i19 != 1 ? i19 != 5 ? ((ViewGroup.MarginLayoutParams) cVar).leftMargin + paddingLeftWithForeground : (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin : androidx.appcompat.app.r.f(((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, 2, paddingLeftWithForeground);
                int iF3 = i18 != 16 ? i18 != 80 ? ((ViewGroup.MarginLayoutParams) cVar).topMargin + paddingTopWithForeground : (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin : androidx.appcompat.app.r.f(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) cVar).topMargin, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, 2, paddingTopWithForeground);
                childAt.layout(iF2, iF3, measuredWidth + iF2, measuredHeight + iF3);
            }
            i16 = i17;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i12, int i13) {
        c cVar;
        String str;
        View view;
        int horizontalPadding;
        Integer numValueOf;
        int verticalPadding;
        int i14;
        int iA2;
        int iA3;
        char c12;
        int i15;
        boolean z12;
        boolean z13 = false;
        this.f370270h = 0;
        this.f370271i = 0;
        this.f370272j = 0;
        int iMakeMeasureSpec = getUseAspect() ? !F.e(i12) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(kotlin.math.b.b(View.MeasureSpec.getSize(i12) / getAspectRatio()), 1073741824) : i13;
        boolean z14 = this.measureAllChildren;
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            LinkedHashSet linkedHashSet = this.f370267e;
            LinkedHashSet linkedHashSet2 = this.f370268f;
            int i17 = -1;
            String str2 = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams";
            if (i16 >= childCount) {
                LinkedHashSet<View> linkedHashSet3 = this.f370269g;
                C42745f0.h(linkedHashSet, linkedHashSet3);
                C42745f0.h(linkedHashSet2, linkedHashSet3);
                if (!linkedHashSet3.isEmpty()) {
                    if (F.d(i12) && this.f370270h == 0) {
                        this.f370270h = View.MeasureSpec.getSize(i12);
                    }
                    if (!getUseAspect() && F.d(iMakeMeasureSpec) && this.f370271i == 0) {
                        this.f370271i = View.MeasureSpec.getSize(iMakeMeasureSpec);
                    }
                }
                if (!linkedHashSet3.isEmpty()) {
                    boolean zE2 = F.e(i12);
                    boolean zE3 = F.e(iMakeMeasureSpec);
                    if (!zE2 || !zE3) {
                        boolean z15 = !zE2 && this.f370270h == 0;
                        boolean z16 = (zE3 || getUseAspect() || this.f370271i != 0) ? false : true;
                        if (z15 || z16) {
                            for (View view2 : linkedHashSet3) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                if (layoutParams == null) {
                                    throw new NullPointerException(str2);
                                }
                                c cVar2 = (c) layoutParams;
                                if (linkedHashSet2.contains(view2) && ((((ViewGroup.MarginLayoutParams) cVar2).width == i17 && z15) || (((ViewGroup.MarginLayoutParams) cVar2).height == i17 && z16))) {
                                    cVar = cVar2;
                                    str = str2;
                                    measureChildWithMargins(view2, i12, 0, iMakeMeasureSpec, 0);
                                    this.f370272j = View.combineMeasuredStates(this.f370272j, view2.getMeasuredState());
                                    view = view2;
                                    linkedHashSet2.remove(view);
                                } else {
                                    cVar = cVar2;
                                    str = str2;
                                    view = view2;
                                }
                                if (z15) {
                                    this.f370270h = Math.max(this.f370270h, cVar.a() + view.getMeasuredWidth());
                                }
                                if (z16) {
                                    this.f370271i = Math.max(this.f370271i, cVar.b() + view.getMeasuredHeight());
                                }
                                str2 = str;
                                i17 = -1;
                            }
                        } else {
                            Iterator it = linkedHashSet3.iterator();
                            while (it.hasNext()) {
                                ViewGroup.LayoutParams layoutParams2 = ((View) it.next()).getLayoutParams();
                                if (layoutParams2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                                }
                                c cVar3 = (c) layoutParams2;
                                if (!zE2 && ((ViewGroup.MarginLayoutParams) cVar3).width == -1) {
                                    this.f370270h = Math.max(this.f370270h, cVar3.a());
                                }
                                if (!zE3 && ((ViewGroup.MarginLayoutParams) cVar3).height == -1) {
                                    this.f370271i = Math.max(this.f370271i, cVar3.b());
                                }
                            }
                        }
                    }
                }
                String str3 = str2;
                Integer numValueOf2 = null;
                if (F.e(i12)) {
                    horizontalPadding = 0;
                } else {
                    horizontalPadding = this.f370270h + getHorizontalPadding();
                    int suggestedMinimumWidth = getSuggestedMinimumWidth();
                    if (horizontalPadding < suggestedMinimumWidth) {
                        horizontalPadding = suggestedMinimumWidth;
                    }
                    Drawable foreground = getForeground();
                    if (foreground == null) {
                        numValueOf = null;
                    } else {
                        int minimumWidth = foreground.getMinimumWidth();
                        if (horizontalPadding >= minimumWidth) {
                            minimumWidth = horizontalPadding;
                        }
                        numValueOf = Integer.valueOf(minimumWidth);
                    }
                    if (numValueOf != null) {
                        horizontalPadding = numValueOf.intValue();
                    }
                }
                int iResolveSizeAndState = View.resolveSizeAndState(horizontalPadding, i12, this.f370272j);
                int i18 = 16777215 & iResolveSizeAndState;
                if (F.e(iMakeMeasureSpec)) {
                    i14 = 0;
                } else {
                    if (!getUseAspect() || F.e(i12)) {
                        verticalPadding = this.f370271i + getVerticalPadding();
                        int suggestedMinimumHeight = getSuggestedMinimumHeight();
                        if (verticalPadding < suggestedMinimumHeight) {
                            verticalPadding = suggestedMinimumHeight;
                        }
                        Drawable foreground2 = getForeground();
                        if (foreground2 != null) {
                            int minimumHeight = foreground2.getMinimumHeight();
                            if (verticalPadding >= minimumHeight) {
                                minimumHeight = verticalPadding;
                            }
                            numValueOf2 = Integer.valueOf(minimumHeight);
                        }
                        if (numValueOf2 != null) {
                            verticalPadding = numValueOf2.intValue();
                        }
                    } else {
                        verticalPadding = kotlin.math.b.b(i18 / getAspectRatio());
                    }
                    i14 = verticalPadding;
                }
                if (View.MeasureSpec.getMode(iMakeMeasureSpec) == 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    if (getUseAspect() && !F.e(i12)) {
                        boolean z17 = this.measureAllChildren;
                        int childCount2 = getChildCount();
                        int i19 = 0;
                        while (i19 < childCount2) {
                            int i22 = i19 + 1;
                            View childAt = getChildAt(i19);
                            if (z17) {
                                c12 = '\b';
                            } else {
                                c12 = '\b';
                                if (childAt.getVisibility() == 8) {
                                    i15 = childCount2;
                                    z12 = z17;
                                }
                                i19 = i22;
                                childCount2 = i15;
                                z17 = z12;
                            }
                            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                            if (layoutParams3 == null) {
                                throw new NullPointerException(str3);
                            }
                            if (((ViewGroup.MarginLayoutParams) ((c) layoutParams3)).height == -3) {
                                i15 = childCount2;
                                z12 = z17;
                                measureChildWithMargins(childAt, i12, 0, iMakeMeasureSpec, 0);
                                linkedHashSet3.remove(childAt);
                            } else {
                                i15 = childCount2;
                                z12 = z17;
                            }
                            i19 = i22;
                            childCount2 = i15;
                            z17 = z12;
                        }
                    }
                }
                setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(i14, iMakeMeasureSpec, this.f370272j << 16));
                for (View view3 : linkedHashSet3) {
                    ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException(str3);
                    }
                    c cVar4 = (c) layoutParams4;
                    int iA4 = cVar4.a() + getHorizontalPadding();
                    int iB2 = cVar4.b() + getVerticalPadding();
                    int i23 = ((ViewGroup.MarginLayoutParams) cVar4).width;
                    d.a aVar = d.f370251b;
                    if (i23 == -1) {
                        int measuredWidth = getMeasuredWidth() - iA4;
                        if (measuredWidth < 0) {
                            measuredWidth = 0;
                        }
                        iA2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    } else {
                        int minimumWidth2 = view3.getMinimumWidth();
                        int i24 = cVar4.f370250h;
                        aVar.getClass();
                        iA2 = d.a.a(i12, iA4, i23, minimumWidth2, i24);
                    }
                    int i25 = ((ViewGroup.MarginLayoutParams) cVar4).height;
                    if (i25 == -1) {
                        int measuredHeight = getMeasuredHeight() - iB2;
                        if (measuredHeight < 0) {
                            measuredHeight = 0;
                        }
                        iA3 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    } else {
                        int minimumHeight2 = view3.getMinimumHeight();
                        int i26 = cVar4.f370249g;
                        aVar.getClass();
                        iA3 = d.a.a(iMakeMeasureSpec, iB2, i25, minimumHeight2, i26);
                    }
                    view3.measure(iA2, iA3);
                    if (linkedHashSet2.contains(view3)) {
                        this.f370272j = View.combineMeasuredStates(this.f370272j, view3.getMeasuredState());
                    }
                }
                linkedHashSet.clear();
                linkedHashSet2.clear();
                linkedHashSet3.clear();
                return;
            }
            int i27 = i16 + 1;
            View childAt2 = getChildAt(i16);
            if (z14 || childAt2.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams5 = childAt2.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                c cVar5 = (c) layoutParams5;
                boolean zE4 = F.e(i12);
                boolean zE5 = F.e(iMakeMeasureSpec);
                boolean z18 = ((ViewGroup.MarginLayoutParams) cVar5).width == -1 ? true : z13;
                int i28 = ((ViewGroup.MarginLayoutParams) cVar5).height;
                boolean z19 = i28 == -1 ? true : z13;
                if ((zE4 && zE5) || (!zE5 ? !(!zE4 ? z18 && (z19 || (i28 == -3 && getUseAspect())) : z19) : !z18)) {
                    measureChildWithMargins(childAt2, i12, 0, iMakeMeasureSpec, 0);
                    this.f370272j = View.combineMeasuredStates(this.f370272j, childAt2.getMeasuredState());
                    if ((!zE4 && ((ViewGroup.MarginLayoutParams) cVar5).width == -1) || (!zE5 && ((ViewGroup.MarginLayoutParams) cVar5).height == -1)) {
                        linkedHashSet.add(childAt2);
                    }
                    if (!zE4 && !z18) {
                        this.f370270h = Math.max(this.f370270h, cVar5.a() + childAt2.getMeasuredWidth());
                    }
                    if (!zE5 && !z19 && !getUseAspect()) {
                        this.f370271i = Math.max(this.f370271i, cVar5.b() + childAt2.getMeasuredHeight());
                    }
                } else if ((!zE4 && ((ViewGroup.MarginLayoutParams) cVar5).width == -1) || (!zE5 && ((ViewGroup.MarginLayoutParams) cVar5).height == -1)) {
                    linkedHashSet2.add(childAt2);
                }
            }
            i16 = i27;
            z13 = false;
        }
    }

    @Override // com.yandex.div.core.widget.InterfaceC38049e
    public void setAspectRatio(float f12) {
        this.aspectRatio.setValue(this, f370264l[0], Float.valueOf(f12));
    }

    @Override // android.view.View
    public void setForegroundGravity(int gravity) {
        if (getForegroundGravity() == gravity) {
            return;
        }
        super.setForegroundGravity(gravity);
        int foregroundGravity = getForegroundGravity();
        Rect rect = this.f370265c;
        if (foregroundGravity != 119 || getForeground() == null) {
            rect.setEmpty();
        } else {
            getForeground().getPadding(rect);
        }
        requestLayout();
    }

    public final void setMeasureAllChildren(boolean z12) {
        this.measureAllChildren = z12;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @X41.j
    public f(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f370265c = new Rect();
        this.f370267e = new LinkedHashSet();
        this.f370268f = new LinkedHashSet();
        this.f370269g = new LinkedHashSet();
        this.aspectRatio = F.b(a.f370274l);
    }

    public static /* synthetic */ void getMeasureAllChildren$annotations() {
    }
}
