package com.avito.android.comfortable_deal.clients;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kp.InterfaceC43479e;

/* compiled from: ClientsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43479e f120123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f120124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC43479e interfaceC43479e, Y41.l<? super Integer, G0> lVar) {
        super(0);
        this.f120123l = interfaceC43479e;
        this.f120124m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Integer num = ((InterfaceC43479e.b) this.f120123l).f413202d;
        if (num != null) {
            this.f120124m.invoke(Integer.valueOf(num.intValue()));
        }
        return G0.f406611a;
    }
}
