package com.avito.android.mvi.rx3.with_monolithic_state;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.x1;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00050\u0005 \u0002*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "kotlin.jvm.PlatformType", "oldState", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "invoke", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<Object, io.reactivex.rxjava3.core.E<? extends Q<Object, Object>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207153l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x<Object> f207154m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t<Object> f207155n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC32892c<Object> abstractC32892c, x<Object> xVar, t<Object> tVar) {
        super(1);
        this.f207153l = abstractC32892c;
        this.f207154m = xVar;
        this.f207155n = tVar;
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.E<? extends Q<Object, Object>> invoke(Object obj) {
        AbstractC32892c<Object> abstractC32892c = this.f207153l;
        StringBuilder sb2 = new StringBuilder("New Reducible: ");
        x<Object> xVar = this.f207154m;
        sb2.append(xVar);
        abstractC32892c.f207136N.invoke(sb2.toString());
        io.reactivex.rxjava3.core.z<Object> zVarF = xVar.a(obj).F();
        com.jakewharton.rxrelay3.c f207120c = this.f207155n.getF207120c();
        InterfaceC35745a5 interfaceC35745a5 = abstractC32892c.f207133K;
        x1 x1VarA0 = zVarF.A0(f207120c.j0(interfaceC35745a5.c()).N(new AJ.b(14, new C32893d(abstractC32892c, xVar))).x0(interfaceC35745a5.c()));
        hu.akarnokd.rxjava3.schedulers.c cVar = abstractC32892c.f207140R;
        return x1VarA0.j0(cVar).m0(new com.avito.android.blueprints.publish.reg_number.d(16, new C32894e(abstractC32892c, xVar, obj))).d0(new com.avito.android.blueprints.publish.reg_number.d(17, new C32895f(obj))).x0(cVar);
    }
}
