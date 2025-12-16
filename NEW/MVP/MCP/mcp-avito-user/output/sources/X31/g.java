package x31;

import androidx.view.S0;
import g71.C40542a;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;

/* loaded from: classes8.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0.h f442161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f442162m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g0.h hVar, f fVar) {
        super(0);
        this.f442161l = hVar;
        this.f442162m = fVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        S0 f42820b = this.f442162m.f442160l.getF42820b();
        g0.h hVar = this.f442161l;
        return org.koin.androidx.viewmodel.b.a(m0.f406844a.b(C31.a.class), f42820b, null, hVar.getDefaultViewModelCreationExtras(), C40542a.a(hVar));
    }
}
