package Jc1;

import Y41.l;
import Y41.q;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import gc1.C40657a;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class e extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f9067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C40657a f9068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, C40657a c40657a) {
        super(3);
        this.f9067l = lVar;
        this.f9068m = c40657a;
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
        v vVarB = C21086w0.b(vVar, (m) objT, null, false, null, new d(this.f9067l, this.f9068m), 28);
        a12.O();
        return vVarB;
    }
}
