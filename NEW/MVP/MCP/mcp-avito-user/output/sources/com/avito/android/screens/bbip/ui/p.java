package com.avito.android.screens.bbip.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import op0.C44841c;

/* compiled from: BbipViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lop0/c;", "contextDuration", "Lkotlin/G0;", "accept", "(Lop0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f260435b;

    public p(l lVar) {
        this.f260435b = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C44841c c44841c = (C44841c) obj;
        l lVar = this.f260435b;
        lVar.f260415U.f420195d = c44841c;
        List<? extends com.avito.conveyor_item.a> list = lVar.f260414T.f420219a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.conveyor_item.a bVar : list) {
            if (bVar instanceof com.avito.android.screens.bbip.ui.items.duration.b) {
                Integer num = c44841c.f420196a;
                com.avito.android.screens.bbip.ui.items.duration.b bVar2 = (com.avito.android.screens.bbip.ui.items.duration.b) bVar;
                TreeSet treeSetQ0 = C42745f0.Q0(bVar2.f260345g);
                treeSetQ0.add(num);
                bVar = new com.avito.android.screens.bbip.ui.items.duration.b(bVar2.f260340b, bVar2.f260341c, bVar2.f260342d, bVar2.f260343e, bVar2.f260344f, C42745f0.M0(treeSetQ0), bVar2.f260346h, num != null ? num.intValue() : 0, bVar2.f260348j);
            }
            arrayList.add(bVar);
        }
        op0.h hVarA = op0.h.a(lVar.f260414T, arrayList, null, null, null, null, null, 62);
        lVar.f260414T = hVarA;
        lVar.me(hVarA.f420219a);
        lVar.ke();
    }
}
