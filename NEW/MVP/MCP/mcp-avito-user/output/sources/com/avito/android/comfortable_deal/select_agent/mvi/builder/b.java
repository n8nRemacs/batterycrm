package com.avito.android.comfortable_deal.select_agent.mvi.builder;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35945t1;
import dp.C39772a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAgentItemListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/builder/b;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/builder/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f122745a;

    @Inject
    public b(@k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f122745a = interfaceC35945t1;
    }

    @Override // com.avito.android.comfortable_deal.select_agent.mvi.builder.a
    @k
    public final ArrayList a(@k List list, boolean z12) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.avito.android.comfortable_deal.select_agent.item.agent.c.a((com.avito.android.comfortable_deal.select_agent.item.agent.c) it.next(), false, z12, 31));
        }
        return arrayList;
    }

    @Override // com.avito.android.comfortable_deal.select_agent.mvi.builder.a
    @k
    public final ArrayList b(@l String str, @k List list) {
        List<com.avito.android.comfortable_deal.select_agent.item.agent.c> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (com.avito.android.comfortable_deal.select_agent.item.agent.c cVar : list2) {
            arrayList.add(com.avito.android.comfortable_deal.select_agent.item.agent.c.a(cVar, L.f(cVar.f122715b, str), false, 47));
        }
        return arrayList;
    }

    @Override // com.avito.android.comfortable_deal.select_agent.mvi.builder.a
    @k
    public final ArrayList c(@l String str, @k List list) {
        List<C39772a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C39772a c39772a : list2) {
            arrayList.add(new com.avito.android.comfortable_deal.select_agent.item.agent.c(c39772a.getId(), c39772a.getName(), this.f122745a.a(c39772a.getPhone()), c39772a.getAvatar(), L.f(c39772a.getId(), str), false, 32, null));
        }
        return arrayList;
    }
}
