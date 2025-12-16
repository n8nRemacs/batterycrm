package Hb1;

import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import gc1.C40657a;
import gc1.InterfaceC40658b;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p f7482l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.e f7483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C40657a f7484n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Y41.p pVar, InterfaceC40658b.e eVar, C40657a c40657a) {
        super(3);
        this.f7482l = pVar;
        this.f7483m = eVar;
        this.f7484n = c40657a;
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
        androidx.compose.ui.v vVarB = C21086w0.b(vVar, (androidx.compose.foundation.interaction.m) objT, null, false, null, new h0(this.f7482l, this.f7483m, this.f7484n), 28);
        a12.O();
        return vVarB;
    }
}
