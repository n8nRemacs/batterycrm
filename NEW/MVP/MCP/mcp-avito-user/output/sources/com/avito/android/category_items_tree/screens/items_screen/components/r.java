package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryItemsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.category_items_tree.screens.items_screen.a> f116892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Api1PromoCategoryTreeItemsResponse.ActionType f116893m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f116894n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(List list, Api1PromoCategoryTreeItemsResponse.ActionType actionType, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f116892l = list;
        this.f116893m = actionType;
        this.f116894n = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        l lVar = l.f116881l;
        m mVar = m.f116882l;
        List<com.avito.android.category_items_tree.screens.items_screen.a> list = this.f116892l;
        m0Var2.a(list.size(), lVar != null ? new o(lVar, list) : null, new p(mVar, list), new C22096n(-632812321, new q(list, this.f116893m, this.f116894n), true));
        return G0.f406611a;
    }
}
