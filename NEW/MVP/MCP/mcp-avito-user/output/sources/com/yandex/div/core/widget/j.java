package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.widgets.C38010b;
import com.yandex.div.core.view2.divs.widgets.InterfaceC38013e;
import com.yandex.div2.K;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivViewWrapper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/widget/j;", "Lcom/yandex/div/internal/widget/f;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/s;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lkotlin/G0;", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "", "value", "m", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j extends com.yandex.div.internal.widget.f implements InterfaceC38013e, com.yandex.div.internal.widget.s {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    public j(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 0) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view");
        }
        super.addView(view, 0, layoutParams);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        KeyEvent.Callback child = getChild();
        InterfaceC38013e interfaceC38013e = child instanceof InterfaceC38013e ? (InterfaceC38013e) child : null;
        if (interfaceC38013e == null) {
            return;
        }
        interfaceC38013e.c(eVar, k12);
    }

    @Override // com.yandex.div.internal.widget.d, android.view.ViewGroup
    public final boolean checkLayoutParams(@Y61.l ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !layoutParams.equals(getLayoutParams());
    }

    @Override // com.yandex.div.internal.widget.f, com.yandex.div.internal.widget.d, android.view.ViewGroup
    @Y61.k
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams instanceof com.yandex.div.internal.widget.c ? layoutParams : layoutParams == null ? new com.yandex.div.internal.widget.c(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // com.yandex.div.internal.widget.d, android.view.ViewGroup
    @Y61.k
    public final ViewGroup.LayoutParams generateLayoutParams(@Y61.l ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        k.a(layoutParamsGenerateDefaultLayoutParams, layoutParams);
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        KeyEvent.Callback child = getChild();
        InterfaceC38013e interfaceC38013e = child instanceof InterfaceC38013e ? (InterfaceC38013e) child : null;
        if (interfaceC38013e == null) {
            return null;
        }
        return interfaceC38013e.getBorder();
    }

    @Y61.l
    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer */
    public C38010b getF368989C() {
        KeyEvent.Callback child = getChild();
        InterfaceC38013e interfaceC38013e = child instanceof InterfaceC38013e ? (InterfaceC38013e) child : null;
        if (interfaceC38013e == null) {
            return null;
        }
        return interfaceC38013e.getF368989C();
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // com.yandex.div.internal.widget.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        View child = getChild();
        if (child == null) {
            return;
        }
        child.layout(0, 0, i14 - i12, i15 - i13);
    }

    @Override // com.yandex.div.internal.widget.f, android.view.View
    public final void onMeasure(int i12, int i13) {
        View child = getChild();
        if (child != null) {
            child.measure(i12, i13);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
            return;
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i12, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), i13, 0));
    }

    @Override // android.view.View
    public void setLayoutParams(@Y61.l ViewGroup.LayoutParams params) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(params);
            return;
        }
        if (params != null) {
            k.a(params, child.getLayoutParams());
        }
        super.setLayoutParams(params);
        child.setLayoutParams(params);
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }
}
