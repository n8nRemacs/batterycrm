package x31;

import Y41.q;
import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class k extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f442164l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar) {
        super(3);
        this.f442164l = cVar;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = (v) obj;
        A a12 = (A) obj2;
        ((Number) obj3).intValue();
        a12.I(1421999650);
        a12.I(-492369756);
        Object objT = a12.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = androidx.compose.foundation.interaction.l.a();
            a12.H(objT);
        }
        a12.O();
        v vVarB = C21086w0.b(vVar, (androidx.compose.foundation.interaction.m) objT, null, false, null, new j(this.f442164l), 28);
        a12.O();
        return vVarB;
    }
}
