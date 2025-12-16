package com.avito.android.tariff_lf_constructor.configure.subcategories;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorConfigureSubCategoriesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<List<? extends com.avito.conveyor_item.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureSubCategoryFragment f300437l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment) {
        super(1);
        this.f300437l = constructorConfigureSubCategoryFragment;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends com.avito.conveyor_item.a> list) {
        List<? extends com.avito.conveyor_item.a> list2 = list;
        ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment = this.f300437l;
        com.avito.konveyor.adapter.a aVar = constructorConfigureSubCategoryFragment.f300419n0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list2);
        com.avito.konveyor.adapter.j jVar = constructorConfigureSubCategoryFragment.f300420o0;
        (jVar != null ? jVar : null).notifyDataSetChanged();
        return G0.f406611a;
    }
}
