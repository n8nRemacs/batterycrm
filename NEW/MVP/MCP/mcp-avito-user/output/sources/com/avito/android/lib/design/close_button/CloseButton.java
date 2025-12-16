package com.avito.android.lib.design.close_button;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35779e0;
import com.google.android.material.shape.q;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: CloseButton.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/close_button/CloseButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseButton extends AppCompatImageView implements InterfaceC46971a {
    @j
    public CloseButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void k(TypedArray typedArray) {
        Integer numA;
        Drawable drawable = typedArray.getDrawable(0);
        if (drawable == null) {
            ColorStateList colorStateListA = x.a(typedArray, getContext(), 7);
            ColorStateList colorStateListA2 = x.a(typedArray, getContext(), 8);
            q qVarA = q.a(getContext(), typedArray.getResourceId(9, 0), 0).a();
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVarA);
            kVar.n(colorStateListA == null ? ColorStateList.valueOf(0) : colorStateListA);
            if (colorStateListA2 == null) {
                colorStateListA2 = ColorStateList.valueOf((colorStateListA == null || (numA = C35779e0.a(colorStateListA)) == null) ? 0 : numA.intValue());
            }
            com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(qVarA);
            kVar2.n(ColorStateList.valueOf(-16777216));
            drawable = new RippleDrawable(colorStateListA2, kVar, kVar2);
        }
        setBackground(drawable);
        setImageDrawable(typedArray.getDrawable(1));
        setImageTintList(x.a(typedArray, getContext(), 4));
        setMinimumWidth(typedArray.getDimensionPixelSize(5, 0));
        setMinimumHeight(typedArray.getDimensionPixelSize(6, 0));
        setMaxWidth(typedArray.getDimensionPixelSize(2, Integer.MAX_VALUE));
        setMaxHeight(typedArray.getDimensionPixelSize(3, Integer.MAX_VALUE));
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178980m);
        k(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CloseButton(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178980m, i12, R.style.Design_Widget_CloseButton);
        k(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
