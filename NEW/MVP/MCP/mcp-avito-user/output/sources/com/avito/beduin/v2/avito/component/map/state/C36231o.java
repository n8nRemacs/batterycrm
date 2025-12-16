package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AvitoMapStateFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/MoveReason;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/avito/component/map/state/MoveReason;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.avito.component.map.state.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36231o extends kotlin.jvm.internal.N implements Y41.l<MoveReason, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.beduin.v2.engine.field.m, G0> f334705l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36231o(Y41.l<? super com.avito.beduin.v2.engine.field.m, G0> lVar, AbstractC36250j.b bVar) {
        super(1);
        this.f334705l = lVar;
        this.f334706m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(MoveReason moveReason) {
        String str = moveReason.f334635b;
        AbstractC36250j.b bVar = this.f334706m;
        this.f334705l.invoke(com.avito.beduin.v2.engine.field.entity.n.a(bVar, new Q("moveReason", C36273j.e(bVar, str))));
        return G0.f406611a;
    }
}
