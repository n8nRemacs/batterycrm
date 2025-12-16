package com.avito.android.extended_profile_ui_components;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.extended_profile_ui_components.r;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pK0.InterfaceC46971a;

/* compiled from: RoundedShadowFrameLayout.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/RoundedShadowFrameLayout;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "shadowEnabled", "setShadowEnabled", "(Z)V", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RoundedShadowFrameLayout extends FrameLayout implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.button.c f153314b;

    @X41.j
    public RoundedShadowFrameLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        this.f153314b.a(canvas, this);
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f153314b.d(this);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, r.h.f153376a);
        this.f153314b.f(getContext(), typedArrayObtainStyledAttributes, 2, 3, 0);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setShadowEnabled(boolean shadowEnabled) {
        this.f153314b.f178646a = shadowEnabled;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RoundedShadowFrameLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        com.avito.android.lib.design.button.c cVar = new com.avito.android.lib.design.button.c();
        this.f153314b = cVar;
        setWillNotDraw(false);
        cVar.f(getContext(), context.obtainStyledAttributes(attributeSet, r.h.f153376a), 2, 3, 0);
    }
}
