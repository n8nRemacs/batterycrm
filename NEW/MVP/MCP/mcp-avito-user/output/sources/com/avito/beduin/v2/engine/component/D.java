package com.avito.beduin.v2.engine.component;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Reader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class D extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.core.u<InterfaceC36243c> f336555l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36243c f336556m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.avito.beduin.v2.engine.core.u<InterfaceC36243c> uVar, InterfaceC36243c interfaceC36243c) {
        super(0);
        this.f336555l = uVar;
        this.f336556m = interfaceC36243c;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f336555l.set(this.f336556m);
        return G0.f406611a;
    }
}
