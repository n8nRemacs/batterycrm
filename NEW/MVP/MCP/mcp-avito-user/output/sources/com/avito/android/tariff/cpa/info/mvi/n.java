package com.avito.android.tariff.cpa.info.mvi;

import androidx.compose.runtime.internal.P;
import bB0.C25490c;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import dC0.AbstractC39559a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CpaInfoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "LbB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements u<CpaInfoInternalAction, C25490c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.info.data.a f294785b;

    @Inject
    public n(@Y61.k com.avito.android.tariff.cpa.info.data.a aVar) {
        this.f294785b = aVar;
    }

    public static ArrayList b(C25490c c25490c, boolean z12) {
        com.avito.conveyor_item.a bVar;
        List<com.avito.conveyor_item.a> list = c25490c.f56999c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.conveyor_item.a aVar : list) {
            if (c25490c.f57004h && (aVar instanceof com.avito.android.tariff.cpa.info.ui.items.balance_info.b)) {
                com.avito.android.tariff.cpa.info.ui.items.balance_info.b bVar2 = (com.avito.android.tariff.cpa.info.ui.items.balance_info.b) aVar;
                aVar = new com.avito.android.tariff.cpa.info.ui.items.balance_info.b(bVar2.f294814b, bVar2.f294815c, bVar2.f294816d, bVar2.f294817e, bVar2.f294818f, z12);
            } else {
                boolean z13 = c25490c.f57005i;
                if (z13 && (aVar instanceof com.avito.android.tariff.cpa.info.ui.items.level_info.a)) {
                    com.avito.android.tariff.cpa.info.ui.items.level_info.a aVar2 = (com.avito.android.tariff.cpa.info.ui.items.level_info.a) aVar;
                    bVar = new com.avito.android.tariff.cpa.info.ui.items.level_info.a(aVar2.f294909b, aVar2.f294910c, aVar2.f294911d, aVar2.f294912e, z12);
                } else if (z13 && (aVar instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.b)) {
                    com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.b bVar3 = (com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.b) aVar;
                    bVar = new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.b(bVar3.f294837b, bVar3.f294838c, bVar3.f294839d, bVar3.f294840e, z12);
                } else if (z13 && (aVar instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.a)) {
                    com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.a aVar3 = (com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.a) aVar;
                    aVar = new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.a(aVar3.f294887c, aVar3.f294886b, z12);
                } else if (z13 && (aVar instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.a)) {
                    com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.a aVar4 = (com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.a) aVar;
                    aVar = new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.a(aVar4.f294859b, aVar4.f294860c, aVar4.f294861d, aVar4.f294862e, aVar4.f294863f, aVar4.f294864g, z12);
                }
                aVar = bVar;
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25490c a(CpaInfoInternalAction cpaInfoInternalAction, C25490c c25490c) {
        CpaInfoInternalAction cpaInfoInternalAction2 = cpaInfoInternalAction;
        C25490c c25490c2 = c25490c;
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.MainLoading) {
            return C25490c.a(c25490c2, null, null, null, null, true, false, false, false, 231);
        }
        boolean z12 = cpaInfoInternalAction2 instanceof CpaInfoInternalAction.MainContent;
        com.avito.android.tariff.cpa.info.data.a aVar = this.f294785b;
        if (z12) {
            AbstractC39559a.b bVar = ((CpaInfoInternalAction.MainContent) cpaInfoInternalAction2).f294745b;
            return C25490c.a(c25490c2, bVar.getTitle(), aVar.a(bVar), null, null, false, false, false, false, 228);
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.MainError) {
            return C25490c.a(c25490c2, null, null, null, z.k(((CpaInfoInternalAction.MainError) cpaInfoInternalAction2).f294752b), false, false, false, false, 231);
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.MainDelayedPreLoading) {
            return C25490c.a(c25490c2, null, b(c25490c2, true), null, null, false, true, false, false, 213);
        }
        if (!(cpaInfoInternalAction2 instanceof CpaInfoInternalAction.MainDelayedContent)) {
            return cpaInfoInternalAction2 instanceof CpaInfoInternalAction.MainDelayedError ? C25490c.a(c25490c2, null, b(c25490c2, false), null, z.k(((CpaInfoInternalAction.MainDelayedError) cpaInfoInternalAction2).f294747b), false, false, false, false, 5) : cpaInfoInternalAction2 instanceof CpaInfoInternalAction.RefillContent ? C25490c.a(c25490c2, null, null, ((CpaInfoInternalAction.RefillContent) cpaInfoInternalAction2).f294757b.getSuccessMessage(), null, false, false, false, false, 251) : c25490c2;
        }
        AbstractC39559a.b bVar2 = ((CpaInfoInternalAction.MainDelayedContent) cpaInfoInternalAction2).f294746b;
        return C25490c.a(c25490c2, bVar2.getTitle(), aVar.a(bVar2), null, null, false, false, false, false, 4);
    }
}
