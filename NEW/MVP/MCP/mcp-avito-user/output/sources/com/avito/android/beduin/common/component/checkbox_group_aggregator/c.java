package com.avito.android.beduin.common.component.checkbox_group_aggregator;

import com.avito.android.beduin.common.component.BeduinCheckableModel;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.component.checkbox_group_aggregator.CheckboxGroupAggregatorModel;
import com.avito.android.beduin.common.utils.C28809e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxGroupAggregatorModel.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<CheckboxState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckboxGroupAggregatorModel f100964l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CheckboxGroupAggregatorModel checkboxGroupAggregatorModel) {
        super(0);
        this.f100964l = checkboxGroupAggregatorModel;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final CheckboxState invoke() {
        CheckboxGroupAggregatorModel.a aVar = CheckboxGroupAggregatorModel.f100944q;
        ArrayList arrayListB = C28809e.b(b.f100963l, (List) this.f100964l.f100961p.getValue());
        if (arrayListB.isEmpty()) {
            return CheckboxState.CHECKED;
        }
        int i12 = 0;
        if (!arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                if (((BeduinCheckableModel) it.next()).isChecked() && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        return i12 == 0 ? CheckboxState.UNCHECKED : i12 == arrayListB.size() ? CheckboxState.CHECKED : CheckboxState.INDETERMINATE;
    }
}
