package com.avito.android.beduin.common.container.tabs;

import Y41.l;
import com.avito.android.beduin.common.form.transforms.SelectTabTransform;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: BeduinTabContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "tabIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinTabContainerModel f103224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f103225m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BeduinTabContainerModel beduinTabContainerModel, a aVar) {
        super(1);
        this.f103224l = beduinTabContainerModel;
        this.f103225m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        List<BeduinAction> onTabClickedActions = this.f103224l.getOnTabClickedActions();
        a aVar = this.f103225m;
        if (onTabClickedActions != null) {
            Iterator<T> it = onTabClickedActions.iterator();
            while (it.hasNext()) {
                aVar.f103219g.o((BeduinAction) it.next());
            }
        }
        BeduinTabContainerModel beduinTabContainerModel = aVar.f103220h;
        aVar.f103218f.h(new d.h(beduinTabContainerModel, beduinTabContainerModel.apply(new SelectTabTransform(beduinTabContainerModel.getTabs().get(iIntValue).getId()))));
        return G0.f406611a;
    }
}
