package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import bo.C25686c;
import bo.InterfaceC25684a;
import bo.InterfaceC25685b;
import com.avito.android.arch.mvi.q;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.entity.TreeInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TreeFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lbo/a;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lbo/c;", "Lbo/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<q<InterfaceC25684a, TreeInternalAction, C25686c, InterfaceC25685b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f117169l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f117170m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b f117171n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f117172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, l lVar, b bVar, j jVar) {
        super(1);
        this.f117169l = eVar;
        this.f117170m = lVar;
        this.f117171n = bVar;
        this.f117172o = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25684a, TreeInternalAction, C25686c, InterfaceC25685b> qVar) {
        q<InterfaceC25684a, TreeInternalAction, C25686c, InterfaceC25685b> qVar2 = qVar;
        qVar2.f92008d = this.f117169l;
        qVar2.f92011g = this.f117170m;
        qVar2.f92009e = this.f117171n;
        qVar2.f92010f = this.f117172o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
