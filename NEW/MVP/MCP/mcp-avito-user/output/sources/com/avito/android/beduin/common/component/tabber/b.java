package com.avito.android.beduin.common.component.tabber;

import Ui.InterfaceC15523b;
import Y41.l;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: BeduinTabberComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "tabIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinTabberModel f102761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f102762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BeduinTabberModel beduinTabberModel, a aVar) {
        super(1);
        this.f102761l = beduinTabberModel;
        this.f102762m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        List<BeduinAction> onSelectTabActions;
        int iIntValue = num.intValue();
        BeduinTabberModel beduinTabberModel = this.f102761l;
        BeduinTabberChild beduinTabberChild = (BeduinTabberChild) C42745f0.K(iIntValue, beduinTabberModel.getTabs());
        a aVar = this.f102762m;
        if (beduinTabberChild != null && (onSelectTabActions = beduinTabberChild.getOnSelectTabActions()) != null) {
            InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f102756e;
            Iterator<T> it = onSelectTabActions.iterator();
            while (it.hasNext()) {
                interfaceC15523b.o((BeduinAction) it.next());
            }
        }
        List<BeduinAction> onTabClickedActions = beduinTabberModel.getOnTabClickedActions();
        if (onTabClickedActions != null) {
            InterfaceC15523b<BeduinAction> interfaceC15523b2 = aVar.f102756e;
            Iterator<T> it2 = onTabClickedActions.iterator();
            while (it2.hasNext()) {
                interfaceC15523b2.o((BeduinAction) it2.next());
            }
        }
        aVar.f102758g.h(new d.h(beduinTabberModel, beduinTabberModel.apply(new SelectedIdTransform(beduinTabberModel.getTabs().get(iIntValue).getId()))));
        return G0.f406611a;
    }
}
