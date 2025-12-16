package com.avito.android.beduin.common.component.checkbox_group_aggregator;

import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.component.checkbox_group_aggregator.CheckboxGroupAggregatorModel;
import com.avito.android.beduin.common.component.checkbox_list_item.BeduinCheckboxListItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxGroupAggregatorModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<BeduinCheckboxListItemModel> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckboxGroupAggregatorModel f100965l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CheckboxGroupAggregatorModel checkboxGroupAggregatorModel) {
        super(0);
        this.f100965l = checkboxGroupAggregatorModel;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final BeduinCheckboxListItemModel invoke() {
        CheckboxGroupAggregatorModel checkboxGroupAggregatorModel = this.f100965l;
        String str = checkboxGroupAggregatorModel.f100947b;
        CheckboxState checkboxState = (CheckboxState) checkboxGroupAggregatorModel.f100960o.getValue();
        CheckboxGroupAggregatorModel.Header header = checkboxGroupAggregatorModel.f100949d;
        return new BeduinCheckboxListItemModel(str, checkboxGroupAggregatorModel.f100948c, checkboxGroupAggregatorModel.f100954i, checkboxGroupAggregatorModel.f100955j, checkboxGroupAggregatorModel.f100953h, checkboxState, checkboxGroupAggregatorModel.f100951f, new BeduinCheckboxListItemModel.Content(header.getChildren(), header.getInterItemSpacing()), checkboxGroupAggregatorModel.f100952g, checkboxGroupAggregatorModel.f100956k, checkboxGroupAggregatorModel.f100957l, checkboxGroupAggregatorModel.f100958m);
    }
}
