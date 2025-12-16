package org.koin.androidx.scope;

import androidx.view.O0;
import g71.C40544c;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;

/* compiled from: ComponentActivityExt.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lorg/koin/core/scope/a;", "invoke", "()Lorg/koin/core/scope/a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class a extends N implements Y41.a<org.koin.core.scope.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f421405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar) {
        super(0);
        this.f421405l = pVar;
    }

    @Override // Y41.a
    public final org.koin.core.scope.a invoke() {
        p pVar = this.f421405l;
        r rVar = (r) new O0(m0.f406844a.b(r.class), new d(pVar), new c(pVar), new e(pVar)).getValue();
        if (rVar.f421423E == null) {
            rVar.f421423E = C40544c.a(pVar).a(org.koin.core.component.g.a(pVar), org.koin.core.component.g.b(pVar), null);
        }
        return rVar.f421423E;
    }
}
