package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewPagerFixedSizeLayout.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/A;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/internal/widget/tabs/A$a;", "heightCalculator", "Lkotlin/G0;", "setHeightCalculator", "(Lcom/yandex/div/internal/widget/tabs/A$a;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "getCollapsiblePaddingBottom", "()I", "setCollapsiblePaddingBottom", "(I)V", "collapsiblePaddingBottom", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class A extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f370381b;

    /* renamed from: c, reason: collision with root package name */
    public int f370382c;

    /* compiled from: ViewPagerFixedSizeLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/A$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        int a(int i12, int i13);

        void b();

        boolean c(float f12, int i12);

        void d(float f12, int i12);
    }

    public A(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    /* renamed from: getCollapsiblePaddingBottom, reason: from getter */
    public final int getF370382c() {
        return this.f370382c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        a aVar = this.f370381b;
        if (aVar != null) {
            i13 = View.MeasureSpec.makeMeasureSpec(aVar.a(i12, i13), 1073741824);
        }
        super.onMeasure(i12, i13);
    }

    public final void setCollapsiblePaddingBottom(int i12) {
        if (this.f370382c != i12) {
            this.f370382c = i12;
        }
    }

    public final void setHeightCalculator(@Y61.l a heightCalculator) {
        this.f370381b = heightCalculator;
    }
}
