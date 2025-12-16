package com.avito.android.mvi.rx3.with_monolithic_state;

import com.avito.android.item_map.view.C31075l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "StateT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/t;", "invoke", "()Lcom/avito/android/mvi/rx3/with_monolithic_state/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.a<t<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t<Object> f207164m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractC32892c<Object> abstractC32892c, t<Object> tVar) {
        super(0);
        this.f207163l = abstractC32892c;
        this.f207164m = tVar;
    }

    @Override // Y41.a
    public final t<Object> invoke() {
        AbstractC32892c<Object> abstractC32892c = this.f207163l;
        t<Object> tVar = this.f207164m;
        io.reactivex.rxjava3.core.z<R> zVarU = tVar.getF207120c().j0(abstractC32892c.f207140R).u(new com.avito.android.blueprints.publish.reg_number.d(12, new j(abstractC32892c, tVar)));
        C31075l c31075l = new C31075l(15, new k(abstractC32892c));
        zVarU.getClass();
        abstractC32892c.f207142T = (io.reactivex.rxjava3.internal.observers.y) zVarU.J(io.reactivex.rxjava3.internal.functions.a.f401993c, c31075l).m0(new com.avito.android.blueprints.publish.reg_number.d(13, new l(abstractC32892c))).s0();
        return tVar;
    }
}
