package com.avito.android.beduin.common.container.card_item;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.card_item.BeduinCardItemContainerModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import wK0.AbstractC49528c;

/* compiled from: BeduinCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/h;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel;", "model", "Lkotlin/G0;", "setCardItemBackground", "(Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel;)V", "setCheckMarkVisible", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "getContentContainer", "()Landroid/widget/LinearLayout;", "contentContainer", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f102959b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final LinearLayout contentContainer;

    public h(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.beduin_component_card_item, this);
        View viewFindViewById = findViewById(R.id.card_item_check_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f102959b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.card_item_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.contentContainer = (LinearLayout) viewFindViewById2;
    }

    @k
    public final LinearLayout getContentContainer() {
        return this.contentContainer;
    }

    public final void setCardItemBackground(@k BeduinCardItemContainerModel model) {
        ColorStateList colorStateListE;
        int iB2;
        LayerDrawable layerDrawableB;
        BeduinContainerBackground background = model.getStyle().getBackground();
        UniversalColor color = background.getColor();
        if (color != null) {
            C48063a c48063a = C48063a.f437606a;
            Context context = getContext();
            c48063a.getClass();
            colorStateListE = C48063a.e(context, color);
        } else {
            colorStateListE = null;
        }
        q.b bVar = new q.b();
        Float fValueOf = Wh.b.c(background) != null ? Float.valueOf(y6.d(r3.intValue())) : null;
        if (fValueOf != null) {
            bVar.k(fValueOf.floatValue());
        }
        Float fValueOf2 = Wh.b.d(background) != null ? Float.valueOf(y6.d(r3.intValue())) : null;
        if (fValueOf2 != null) {
            bVar.n(fValueOf2.floatValue());
        }
        Float fValueOf3 = Wh.b.b(background) != null ? Float.valueOf(y6.d(r3.intValue())) : null;
        if (fValueOf3 != null) {
            bVar.h(fValueOf3.floatValue());
        }
        Float fValueOf4 = Wh.b.a(background) != null ? Float.valueOf(y6.d(r0.intValue())) : null;
        if (fValueOf4 != null) {
            bVar.e(fValueOf4.floatValue());
        }
        q qVarA = bVar.a();
        BeduinCardItemContainerModel.SelectionDisplayType selectionDisplayType = model.getSelectionDisplayType();
        if ((selectionDisplayType instanceof BeduinCardItemContainerModel.SelectionDisplayType.Border) || (selectionDisplayType instanceof BeduinCardItemContainerModel.SelectionDisplayType.BorderAndMark)) {
            AbstractC49528c.a aVar = AbstractC49528c.f441377b;
            BeduinCardItemContainerModel.SelectionDisplayType selectionDisplayType2 = model.getSelectionDisplayType();
            if (selectionDisplayType2 instanceof BeduinCardItemContainerModel.SelectionDisplayType.Border) {
                iB2 = y6.b(((BeduinCardItemContainerModel.SelectionDisplayType.Border) model.getSelectionDisplayType()).getWidth());
            } else {
                if (!(selectionDisplayType2 instanceof BeduinCardItemContainerModel.SelectionDisplayType.BorderAndMark)) {
                    throw new NoWhenBranchMatchedException();
                }
                iB2 = y6.b(((BeduinCardItemContainerModel.SelectionDisplayType.BorderAndMark) model.getSelectionDisplayType()).getWidth());
            }
            layerDrawableB = AbstractC49528c.a.b(aVar, qVarA, 0, 0, 0, 0, colorStateListE, null, Float.valueOf(iB2), androidx.core.content.d.getColorStateList(getContext(), R.color.beduin_card_item_container_border_color), 94);
        } else {
            layerDrawableB = AbstractC49528c.a.b(AbstractC49528c.f441377b, qVarA, 0, 0, 0, 0, colorStateListE, null, null, null, 478);
        }
        setBackground(layerDrawableB);
        setCheckMarkVisible(model);
    }

    public final void setCheckMarkVisible(@k BeduinCardItemContainerModel model) {
        BeduinCardItemContainerModel.SelectionDisplayType selectionDisplayType = model.getSelectionDisplayType();
        this.f102959b.setVisibility((selectionDisplayType instanceof BeduinCardItemContainerModel.SelectionDisplayType.Border) || !(selectionDisplayType instanceof BeduinCardItemContainerModel.SelectionDisplayType.BorderAndMark) || !model.f102942b ? 8 : 0);
    }
}
