package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AvitoMapStateFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/MoveReason;", "moveReason", "Lcom/avito/beduin/v2/avito/component/map/state/u;", "mapBounds", "Lcom/avito/beduin/v2/avito/component/map/state/x;", "mapPoint", "", "zoom", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/avito/component/map/state/MoveReason;Lcom/avito/beduin/v2/avito/component/map/state/u;Lcom/avito/beduin/v2/avito/component/map/state/x;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.avito.component.map.state.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36219c extends kotlin.jvm.internal.N implements Y41.r<MoveReason, u, x, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.beduin.v2.engine.field.m, G0> f334690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334691m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36219c(Y41.l<? super com.avito.beduin.v2.engine.field.m, G0> lVar, AbstractC36250j.b bVar) {
        super(4);
        this.f334690l = lVar;
        this.f334691m = bVar;
    }

    @Override // Y41.r
    public final G0 invoke(MoveReason moveReason, u uVar, x xVar, Float f12) {
        u uVar2 = uVar;
        float fFloatValue = f12.floatValue();
        String str = moveReason.f334635b;
        AbstractC36250j.b bVar = this.f334691m;
        Q q12 = new Q("moveReason", C36273j.e(bVar, str));
        r.f334709c.getClass();
        this.f334690l.invoke(com.avito.beduin.v2.engine.field.entity.n.a(bVar, q12, new Q("mapBounds", new com.avito.beduin.v2.engine.field.entity.A(new Q("topLeft", r.b(uVar2.f334754a, bVar)), new Q("bottomRight", r.b(uVar2.f334755b, bVar)))), new Q("mapPoint", r.b(xVar, bVar)), new Q("zoom", C36273j.a(bVar).b(fFloatValue))));
        return G0.f406611a;
    }
}
