package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.C29270c0;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C40049d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: BeduinReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/v;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "LeT/c;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements com.avito.android.arch.mvi.u<BeduinInternalAction, AbstractC40048c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36238a f176356b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.handler.flow.processor.b f176357c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f176358d;

    @Inject
    public v(@Y61.k InterfaceC36238a interfaceC36238a, @Y61.k com.avito.beduin.v2.handler.flow.processor.b bVar, @Y61.k C29270c0 c29270c0) {
        this.f176356b = interfaceC36238a;
        this.f176357c = bVar;
        this.f176358d = c29270c0;
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC40048c a(BeduinInternalAction beduinInternalAction, AbstractC40048c abstractC40048c) {
        BeduinInternalAction beduinInternalAction2 = beduinInternalAction;
        AbstractC40048c abstractC40048c2 = abstractC40048c;
        BeduinInternalAction.ForReducer forReducer = beduinInternalAction2 instanceof BeduinInternalAction.ForReducer ? (BeduinInternalAction.ForReducer) beduinInternalAction2 : null;
        if (forReducer instanceof BeduinInternalAction.ShowContent) {
            boolean zBooleanValue = this.f176358d.v().invoke().booleanValue();
            InterfaceC36238a interfaceC36238a = this.f176356b;
            com.avito.beduin.v2.handler.flow.processor.b bVar = this.f176357c;
            if (!zBooleanValue) {
                com.avito.beduin.v2.handler.flow.m mVar = ((BeduinInternalAction.ShowContent) forReducer).f176262b;
                bVar.b(interfaceC36238a, mVar);
                return new AbstractC40048c.a.C11083a(mVar.f337166a, interfaceC36238a.getF336542f());
            }
            com.avito.beduin.v2.handler.flow.m mVar2 = ((BeduinInternalAction.ShowContent) forReducer).f176262b;
            bVar.b(interfaceC36238a, mVar2);
            C40049d.a aVar = C40049d.f395219b;
            D f336542f = interfaceC36238a.getF336542f();
            aVar.getClass();
            LinkedHashMap linkedHashMapJ = P0.j(new Q(u.b.f337551c, f336542f));
            ArrayList arrayList = new ArrayList();
            int iF2 = P0.f(C42745f0.q(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 >= 16 ? iF2 : 16);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.avito.beduin.v2.interaction.navigation.flow.t tVar = (com.avito.beduin.v2.interaction.navigation.flow.t) it.next();
                linkedHashMap.put(tVar.getF337544a(), tVar.getF337545b());
            }
            linkedHashMapJ.putAll(linkedHashMap);
            return new AbstractC40048c.a.b(mVar2.f337166a, new C40049d(linkedHashMapJ, null));
        }
        if (!(forReducer instanceof BeduinInternalAction.OnBeduinScreen)) {
            if (forReducer instanceof BeduinInternalAction.ShowError) {
                return new AbstractC40048c.b(((BeduinInternalAction.ShowError) forReducer).f176263b);
            }
            if (forReducer instanceof BeduinInternalAction.StartLoadingContent ? true : forReducer instanceof BeduinInternalAction.StartParsing) {
                return AbstractC40048c.d.f395218b;
            }
            if (forReducer instanceof BeduinInternalAction.DisplayScreenErrorException) {
                return new AbstractC40048c.b(((BeduinInternalAction.DisplayScreenErrorException) forReducer).f176254b);
            }
            if (forReducer == null) {
                return abstractC40048c2;
            }
            throw new NoWhenBranchMatchedException();
        }
        com.avito.beduin.v2.interaction.navigation.flow.t tVar2 = ((BeduinInternalAction.OnBeduinScreen) forReducer).f176258b;
        if (!(abstractC40048c2 instanceof AbstractC40048c.a.b)) {
            return abstractC40048c2;
        }
        AbstractC40048c.a.b bVar2 = (AbstractC40048c.a.b) abstractC40048c2;
        C40049d.f395219b.getClass();
        ArrayList arrayList2 = new ArrayList();
        com.avito.beduin.v2.interaction.navigation.flow.t tVar3 = new com.avito.beduin.v2.interaction.navigation.flow.t[]{tVar2}[0];
        if (tVar3.getF337545b() != null) {
            arrayList2.add(tVar3);
        }
        int iF3 = P0.f(C42745f0.q(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF3 >= 16 ? iF3 : 16);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            com.avito.beduin.v2.interaction.navigation.flow.t tVar4 = (com.avito.beduin.v2.interaction.navigation.flow.t) it2.next();
            linkedHashMap2.put(tVar4.getF337544a(), tVar4.getF337545b());
        }
        return new AbstractC40048c.a.b(bVar2.f395214d, new C40049d(P0.k(bVar2.f395215e.f395220a, linkedHashMap2), null));
    }
}
