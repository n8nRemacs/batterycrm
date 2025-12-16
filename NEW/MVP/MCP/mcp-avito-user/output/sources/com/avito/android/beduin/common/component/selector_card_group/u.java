package com.avito.android.beduin.common.component.selector_card_group;

import com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: SelectorCardGroupExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/u;", "Loj/a;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u implements InterfaceC44784a<BeduinSelectorCardGroupModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44784a<BeduinModel>> f102574a;

    @Inject
    public u(@Y61.k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f102574a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel = (BeduinSelectorCardGroupModel) beduinModel;
        if (beduinSelectorCardGroupModel.getF100853b() == null) {
            return P0.c();
        }
        List<BeduinSelectorCardGroupModel.Option> listF = beduinSelectorCardGroupModel.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (beduinSelectorCardGroupModel.h().contains(((BeduinSelectorCardGroupModel.Option) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h(((BeduinSelectorCardGroupModel.Option) it.next()).getComponents(), arrayList2);
        }
        return P0.k(P0.k(com.avito.android.beduin_shared.model.utils.q.a(arrayList2, this.f102574a.get()), Collections.singletonMap(beduinSelectorCardGroupModel.getF100853b() + "_selectedIds", beduinSelectorCardGroupModel.h())), (beduinSelectorCardGroupModel.j() != BeduinSelectorCardGroupModel.SelectionType.Single || beduinSelectorCardGroupModel.h().isEmpty()) ? P0.c() : Collections.singletonMap(beduinSelectorCardGroupModel.getF100853b(), C42745f0.E(beduinSelectorCardGroupModel.h())));
    }
}
