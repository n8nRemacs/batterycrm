package com.avito.android.advert_core.discount.item.dotted_discount;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DottedDiscountItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/discount/item/dotted_discount/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/discount/item/dotted_discount/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f83395b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.dotted_discount);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f83395b = (DescriptionParameterItem) viewFindViewById;
    }

    @Override // com.avito.android.advert_core.discount.item.dotted_discount.f
    public final void m(@k String str) {
        this.f83395b.getRightTextView().setText(str);
    }

    @Override // com.avito.android.advert_core.discount.item.dotted_discount.f
    public final void setTitle(@k String str) {
        this.f83395b.getLeftTextView().setText(str);
    }
}
