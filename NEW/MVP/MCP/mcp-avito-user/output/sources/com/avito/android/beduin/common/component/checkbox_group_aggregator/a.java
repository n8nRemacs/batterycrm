package com.avito.android.beduin.common.component.checkbox_group_aggregator;

import com.avito.android.beduin.common.component.checkbox_group_aggregator.CheckboxGroupAggregatorModel;
import com.avito.android.beduin.common.component.spacing.BeduinSpacingModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxGroupAggregatorModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckboxGroupAggregatorModel f100962l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CheckboxGroupAggregatorModel checkboxGroupAggregatorModel) {
        super(0);
        this.f100962l = checkboxGroupAggregatorModel;
    }

    @Override // Y41.a
    public final List<? extends BeduinModel> invoke() {
        CheckboxGroupAggregatorModel checkboxGroupAggregatorModel = this.f100962l;
        List<BeduinModel> children = checkboxGroupAggregatorModel.f100950e.getChildren();
        CheckboxGroupAggregatorModel.Body body = checkboxGroupAggregatorModel.f100950e;
        Integer interItemSpacing = body.getInterItemSpacing();
        if ((interItemSpacing != null ? interItemSpacing.intValue() : 0) == 0 || children.size() < 2) {
            return children;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : children) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            BeduinModel beduinModel = (BeduinModel) obj;
            C42745f0.h(i12 == children.size() - 1 ? Collections.singletonList(beduinModel) : C42745f0.U(beduinModel, new BeduinSpacingModel(checkboxGroupAggregatorModel.f100947b + "-spacing-" + i12, null, body.getInterItemSpacing(), null, 10, null)), arrayList);
            i12 = i13;
        }
        return arrayList;
    }
}
