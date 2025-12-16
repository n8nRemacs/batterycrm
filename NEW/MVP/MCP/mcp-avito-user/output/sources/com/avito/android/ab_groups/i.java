package com.avito.android.ab_groups;

import Fc1.E0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import l41.InterfaceC43543a;
import q3.C47189a;

/* compiled from: AbExperimentsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq3/h;", "it", "Lkotlin/G0;", "invoke", "(Lq3/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.l<q3.h, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbExperimentsActivity f67664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C47189a f67665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AbExperimentsActivity abExperimentsActivity, C47189a c47189a) {
        super(1);
        this.f67664l = abExperimentsActivity;
        this.f67665m = c47189a;
    }

    @Override // Y41.l
    public final G0 invoke(q3.h hVar) {
        q3.h hVar2 = hVar;
        q qVar = this.f67664l.f67645m;
        if (qVar == null) {
            qVar = null;
        }
        String str = L.f(qVar.f67678L.getValue(), Boolean.TRUE) ? "prod" : "staging";
        String label = hVar2.getLabel();
        C47189a c47189a = this.f67665m;
        I0 i0J0 = qVar.f67675E.f429004a.b(str, label, c47189a.getLabel()).x0(io.reactivex.rxjava3.schedulers.b.f404943c).j0(io.reactivex.rxjava3.android.schedulers.b.b());
        r rVar = new r(qVar);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        qVar.f67682P.b(new io.reactivex.rxjava3.internal.operators.observable.N(i0J0.J(interfaceC43543a, rVar), new E0(qVar, 1)).v0(new s(qVar, c47189a, hVar2), new t(qVar), interfaceC43543a));
        G0 g02 = G0.f406611a;
        qVar.f67680N.postValue(g02);
        return g02;
    }
}
