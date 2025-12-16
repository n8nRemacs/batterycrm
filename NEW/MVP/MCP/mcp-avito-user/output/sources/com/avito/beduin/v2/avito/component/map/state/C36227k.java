package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AvitoMapStateFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/Pin;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/avito/component/map/state/Pin;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.avito.component.map.state.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36227k extends kotlin.jvm.internal.N implements Y41.l<Pin, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.beduin.v2.engine.field.m, G0> f334700l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334701m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36227k(Y41.l<? super com.avito.beduin.v2.engine.field.m, G0> lVar, AbstractC36250j.b bVar) {
        super(1);
        this.f334700l = lVar;
        this.f334701m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(Pin pin) {
        Pin pin2 = pin;
        String str = pin2.f334642a;
        AbstractC36250j.b bVar = this.f334701m;
        Q q12 = new Q("pinId", C36273j.e(bVar, str));
        r rVar = r.f334709c;
        x xVar = pin2.f334643b;
        rVar.getClass();
        this.f334700l.invoke(com.avito.beduin.v2.engine.field.entity.n.a(bVar, q12, new Q("point", r.b(xVar, bVar))));
        return G0.f406611a;
    }
}
