package com.avito.beduin.v2.avito.component.items_controller;

import com.avito.beduin.v2.avito.component.items_controller.i;
import com.avito.beduin.v2.engine.E;
import com.avito.beduin.v2.engine.component.I;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: ItemsRendererState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/component/i;", "rendererState", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/component/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements Y41.l<InterfaceC36249i, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<I> f334567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f334568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<i.a, G0> f334569n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(l0.h<I> hVar, i iVar, Y41.l<? super i.a, G0> lVar) {
        super(1);
        this.f334567l = hVar;
        this.f334568m = iVar;
        this.f334569n = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.avito.beduin.v2.engine.component.I] */
    @Override // Y41.l
    public final G0 invoke(InterfaceC36249i interfaceC36249i) {
        E.f336419a.getClass();
        i iVar = new i(E.a(interfaceC36249i));
        l0.h<I> hVar = this.f334567l;
        I i12 = hVar.f406842b;
        if (i12 != null) {
            i12.a();
        }
        Y41.l<i.a, G0> lVar = this.f334569n;
        l lVar2 = new l(lVar);
        this.f334568m.getClass();
        j jVar = new j(lVar2);
        i.a aVar = iVar.f334561b;
        hVar.f406842b = aVar.n(jVar);
        lVar.invoke(aVar);
        return G0.f406611a;
    }
}
