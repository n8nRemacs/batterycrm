package com.avito.android.order.feature.mvi;

import P40.c;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LP40/c$a$a;", "invoke", "(LP40/c$a$a;)LP40/c$a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A extends N implements Y41.l<c.a.C0831a, c.a.C0831a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ OrderInternalAction f209592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(OrderInternalAction orderInternalAction) {
        super(1);
        this.f209592l = orderInternalAction;
    }

    @Override // Y41.l
    public final c.a.C0831a invoke(c.a.C0831a c0831a) {
        return c.a.C0831a.a(c0831a, null, ((OrderInternalAction.ExecuteRequestStateChanged) this.f209592l).f209629b, 3);
    }
}
