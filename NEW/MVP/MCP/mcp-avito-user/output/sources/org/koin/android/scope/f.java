package org.koin.android.scope;

import g71.C40544c;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceExt.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lorg/koin/core/scope/a;", "invoke", "()Lorg/koin/core/scope/a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class f extends N implements Y41.a<org.koin.core.scope.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f421401l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(0);
        this.f421401l = eVar;
    }

    @Override // Y41.a
    public final org.koin.core.scope.a invoke() {
        e eVar = this.f421401l;
        o71.d dVarA = C40544c.a(eVar);
        org.koin.core.scope.a aVarB = dVarA.b(org.koin.core.component.g.a(eVar));
        return aVarB == null ? dVarA.a(org.koin.core.component.g.a(eVar), org.koin.core.component.g.b(eVar), eVar) : aVarB;
    }
}
