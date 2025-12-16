package com.avito.android.screens.bbip.ui;

import com.avito.android.screens.bbip.ui.items.budget.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import op0.C44839a;

/* compiled from: BbipViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lop0/a;", "contextBudget", "Lkotlin/G0;", "accept", "(Lop0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f260433b;

    public n(l lVar) {
        this.f260433b = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C44839a c44839a = (C44839a) obj;
        l lVar = this.f260433b;
        lVar.f260415U.f420194c = c44839a;
        List<? extends com.avito.conveyor_item.a> list = lVar.f260414T.f420219a;
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.conveyor_item.a bVar : list) {
            if (bVar instanceof com.avito.android.screens.bbip.ui.items.budget.b) {
                com.avito.android.screens.bbip.ui.items.budget.b bVar2 = (com.avito.android.screens.bbip.ui.items.budget.b) bVar;
                List<b.a> list2 = bVar2.f260306d;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, i12));
                for (b.a aVar : list2) {
                    int i13 = aVar.f260310d;
                    arrayList2.add(new b.a(aVar.f260307a, aVar.f260308b, aVar.f260309c, i13, aVar.f260311e, i13 == c44839a.f420188a, aVar.f260313g));
                }
                bVar = new com.avito.android.screens.bbip.ui.items.budget.b(bVar2.f260304b, bVar2.f260305c, arrayList2);
            }
            arrayList.add(bVar);
            i12 = 10;
        }
        op0.h hVarA = op0.h.a(lVar.f260414T, arrayList, null, null, null, null, null, 62);
        lVar.f260414T = hVarA;
        lVar.me(hVarA.f420219a);
        lVar.ke();
    }
}
