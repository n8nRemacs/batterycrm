package com.avito.android.rubricator;

import com.avito.android.rubricator.b;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SerpVerticalRubricatorView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.d f255833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RubricatorDynamicColumnsCountLinearLayoutManager f255834m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f255835n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b.d dVar, RubricatorDynamicColumnsCountLinearLayoutManager rubricatorDynamicColumnsCountLinearLayoutManager, i iVar) {
        super(0);
        this.f255833l = dVar;
        this.f255834m = rubricatorDynamicColumnsCountLinearLayoutManager;
        this.f255835n = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12;
        b.d dVar = this.f255833l;
        int size = dVar.f255726f.size();
        boolean z12 = false;
        RubricatorDynamicColumnsCountLinearLayoutManager rubricatorDynamicColumnsCountLinearLayoutManager = this.f255834m;
        if (rubricatorDynamicColumnsCountLinearLayoutManager != null) {
            i12 = rubricatorDynamicColumnsCountLinearLayoutManager.f255691Q;
            if (i12 <= 0) {
                int i13 = rubricatorDynamicColumnsCountLinearLayoutManager.f53850p;
                int i14 = rubricatorDynamicColumnsCountLinearLayoutManager.f255690P;
                int i15 = rubricatorDynamicColumnsCountLinearLayoutManager.f255692R;
                int i16 = i14 + i15 + i15;
                if (i13 < i16) {
                    i12 = 1;
                } else {
                    int i17 = rubricatorDynamicColumnsCountLinearLayoutManager.f255693S;
                    i12 = (i13 + i17) / (i16 + i17);
                }
            }
        } else {
            i12 = 0;
        }
        kotlin.collections.builders.b bVarT = C42745f0.t();
        RubricatorRefinedItem.SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem = dVar.f255727g;
        if (size > i12 && serpRubricatorLinearServiceItem != null) {
            z12 = true;
        }
        if (rubricatorDynamicColumnsCountLinearLayoutManager != null) {
            rubricatorDynamicColumnsCountLinearLayoutManager.f255694T = z12;
        }
        List<RubricatorRefinedItem> list = dVar.f255726f;
        if (z12) {
            if (serpRubricatorLinearServiceItem != null) {
                bVarT.add(serpRubricatorLinearServiceItem);
            }
            bVarT.addAll(C42745f0.E0(list, i12 - 1));
        } else {
            bVarT.addAll(C42745f0.E0(list, i12));
        }
        kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
        i iVar = this.f255835n;
        iVar.f255751k.clear();
        iVar.f255751k.addAll(bVarP);
        iVar.f255743c.notifyDataSetChanged();
        return G0.f406611a;
    }
}
