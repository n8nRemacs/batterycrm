package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Tree.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class q extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.category_items_tree.screens.tree_screen.k> f117067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.category_items_tree.screens.tree_screen.k, G0> f117068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Y41.l lVar, List list) {
        super(1);
        this.f117067l = list;
        this.f117068m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        k kVar = k.f117057l;
        m mVar = m.f117060l;
        List<com.avito.android.category_items_tree.screens.tree_screen.k> list = this.f117067l;
        m0Var2.a(list.size(), kVar != null ? new n(kVar, list) : null, new o(mVar, list), new C22096n(-632812321, new p(this.f117068m, list), true));
        return G0.f406611a;
    }
}
