package Hb1;

import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import gc1.C40657a;
import gc1.InterfaceC40658b;

/* loaded from: classes9.dex */
public final class T extends kotlin.jvm.internal.N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p f7401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.c f7402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C40657a f7403n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Y41.p pVar, InterfaceC40658b.c cVar, C40657a c40657a) {
        super(3);
        this.f7401l = pVar;
        this.f7402m = cVar;
        this.f7403n = c40657a;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.v vVar = (androidx.compose.ui.v) obj;
        androidx.compose.runtime.A a12 = (androidx.compose.runtime.A) obj2;
        ((Number) obj3).intValue();
        a12.I(1421999650);
        a12.I(-492369756);
        Object objT = a12.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = androidx.compose.foundation.interaction.l.a();
            a12.H(objT);
        }
        a12.O();
        androidx.compose.ui.v vVarB = C21086w0.b(vVar, (androidx.compose.foundation.interaction.m) objT, null, false, null, new P(this.f7401l, this.f7402m, this.f7403n), 28);
        a12.O();
        return vVarB;
    }
}
