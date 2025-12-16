package com.avito.android.beduin.common.component.real_estate_filter;

import android.view.View;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28803d f102327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f102328m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C28803d c28803d, B b12) {
        super(1);
        this.f102327l = c28803d;
        this.f102328m = b12;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        C28803d c28803d = this.f102327l;
        BeduinRealEstateFilterModel beduinRealEstateFilterModel = c28803d.f102290f;
        List<BeduinAction> actions = beduinRealEstateFilterModel.getActions();
        if (actions != null) {
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                c28803d.f102289e.o((BeduinAction) it.next());
            }
        }
        c28803d.f102295k = beduinRealEstateFilterModel.getFilterState();
        s sVar = new s(this.f102328m.getContext(), beduinRealEstateFilterModel.getFilters(), c28803d.f102295k, c28803d);
        c28803d.f102296l = sVar;
        com.avito.android.lib.util.g.a(sVar.f102339d);
        return G0.f406611a;
    }
}
