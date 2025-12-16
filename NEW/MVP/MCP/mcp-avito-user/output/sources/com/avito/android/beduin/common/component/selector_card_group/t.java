package com.avito.android.beduin.common.component.selector_card_group;

import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectorCardGroupView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/k;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/selector_card_group/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class t extends N implements Y41.l<k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f102571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f102572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> f102573n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(LinkedHashMap linkedHashMap, n nVar, Y41.l lVar) {
        super(1);
        this.f102571l = linkedHashMap;
        this.f102572m = nVar;
        this.f102573n = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(k kVar) {
        k kVar2 = kVar;
        int i12 = n.f102556e;
        this.f102572m.getClass();
        Iterable iterable = (List) this.f102571l.get(kVar2.getTag().toString());
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f102573n).invoke(it.next()));
        }
        kVar2.setComponents(arrayList);
        return G0.f406611a;
    }
}
