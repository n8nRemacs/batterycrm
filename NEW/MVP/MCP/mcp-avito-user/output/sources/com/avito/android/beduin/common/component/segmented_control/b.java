package com.avito.android.beduin.common.component.segmented_control;

import Y41.p;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lj.d;

/* compiled from: BeduinSegmentedControlComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "position", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements p<Integer, CharSequence, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102390l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(2);
        this.f102390l = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, CharSequence charSequence) {
        int iIntValue = num.intValue();
        a aVar = this.f102390l;
        BeduinSegmentedControlModel beduinSegmentedControlModel = aVar.f102389g;
        BeduinSegmentedControlModel beduinSegmentedControlModel2 = aVar.f102389g;
        aVar.f102388f.h(new d.h(beduinSegmentedControlModel2, beduinSegmentedControlModel.apply(new SelectedIdTransform(beduinSegmentedControlModel2.getOptions().get(iIntValue).getId()))));
        List<BeduinAction> onChangeSelectedActions = beduinSegmentedControlModel2.getOnChangeSelectedActions();
        if (onChangeSelectedActions != null) {
            C28806b.a(aVar.f102387e, onChangeSelectedActions);
        }
        return G0.f406611a;
    }
}
