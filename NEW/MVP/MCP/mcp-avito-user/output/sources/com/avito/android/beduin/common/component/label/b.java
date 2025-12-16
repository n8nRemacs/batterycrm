package com.avito.android.beduin.common.component.label;

import com.avito.android.beduin.common.form.transforms.LabelExpandTransform;
import com.avito.android.beduin.network.model.ExpandToken;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: BeduinLabelComponent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f101661l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(0);
        this.f101661l = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<BeduinAction> onExpandActions;
        a aVar = this.f101661l;
        BeduinLabelModel beduinLabelModel = aVar.f101657g;
        ExpandToken expandToken = beduinLabelModel.getExpandToken();
        if (expandToken != null && (onExpandActions = expandToken.getOnExpandActions()) != null) {
            Iterator<T> it = onExpandActions.iterator();
            while (it.hasNext()) {
                aVar.f101658h.o((BeduinAction) it.next());
            }
        }
        aVar.f101655e.h(new d.h(beduinLabelModel, beduinLabelModel.apply(new LabelExpandTransform(true))));
        return G0.f406611a;
    }
}
