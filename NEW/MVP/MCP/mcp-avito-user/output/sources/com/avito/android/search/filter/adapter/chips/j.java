package com.avito.android.search.filter.adapter.chips;

import com.avito.android.search.filter.converter.ParameterElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsMultiSelectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/lib/design/chips/h;", "selectedValues", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.l<List<? extends com.avito.android.lib.design.chips.h>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.s f262162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f262163m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f262164n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ParameterElement.s sVar, k kVar, ArrayList arrayList) {
        super(1);
        this.f262162l = sVar;
        this.f262163m = kVar;
        this.f262164n = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends com.avito.android.lib.design.chips.h> list) {
        List<? extends com.avito.android.lib.design.chips.h> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) ((com.avito.android.lib.design.chips.h) it.next())).f262140b);
        }
        ParameterElement.s sVar = this.f262162l;
        List<Cp0.e> list3 = sVar.f262819e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list3) {
            if (this.f262164n.contains(((Cp0.e) obj).f2697b)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Cp0.e eVar = (Cp0.e) it2.next();
            eVar.f2700e = arrayList.contains(eVar.f2697b);
        }
        this.f262163m.f262166c.accept(sVar);
        return G0.f406611a;
    }
}
