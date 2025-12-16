package com.avito.android.beduin.common.component.checkbox_group_aggregator;

import Y41.l;
import com.avito.android.beduin.common.component.BeduinCheckableModel;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxGroupAggregatorModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class e extends N implements l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckboxState f100966l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CheckboxState checkboxState) {
        super(1);
        this.f100966l = checkboxState;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel beduinModelApplyChecked = beduinModel;
        if (beduinModelApplyChecked instanceof BeduinCheckableModel) {
            beduinModelApplyChecked = ((BeduinCheckableModel) beduinModelApplyChecked).applyChecked(this.f100966l == CheckboxState.CHECKED);
        }
        return Collections.singletonList(beduinModelApplyChecked);
    }
}
