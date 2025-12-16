package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y41.l;
import bV0.C25569a;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: CartTotalQuantityRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbV0/a;", "totalQuantity", "Lkotlin/G0;", "invoke", "(LbV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements l<C25569a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36272i f338155l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<com.avito.beduin.v2.engine.field.d, G0> f338156m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(C36272i c36272i, l<? super com.avito.beduin.v2.engine.field.d, G0> lVar) {
        super(1);
        this.f338155l = c36272i;
        this.f338156m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(C25569a c25569a) {
        com.avito.beduin.v2.engine.field.d a12;
        C25569a c25569a2 = c25569a;
        if (c25569a2 != null) {
            a12 = new A(new Q("quantity", this.f338155l.c(c25569a2.f57097a)));
        } else {
            a12 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        this.f338156m.invoke(a12);
        return G0.f406611a;
    }
}
