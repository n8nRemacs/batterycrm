package Fc1;

import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import androidx.compose.ui.platform.C22535v1;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13775y {

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.y$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5894l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<kotlin.G0> aVar) {
            super(3);
            this.f5894l = aVar;
        }

        @Override // Y41.q
        public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.ui.v vVar2 = vVar;
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.I(-218298968);
            a13.I(-492369756);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            a13.O();
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            a13.I(1157296644);
            Y41.a<kotlin.G0> aVar = this.f5894l;
            boolean zB2 = a13.B(aVar);
            Object objT2 = a13.t();
            if (zB2 || objT2 == obj) {
                objT2 = new C13596e(aVar);
                a13.H(objT2);
            }
            a13.O();
            androidx.compose.ui.v vVarB = C21086w0.b(vVar2, mVar, null, false, null, (Y41.a) objT2, 28);
            a13.O();
            return vVarB;
        }
    }

    public static final long a(@Y61.k N7 n72) {
        return androidx.compose.ui.graphics.V.b(n72.e());
    }

    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        return androidx.compose.ui.n.a(vVar, C22535v1.f41625a, new a(aVar));
    }
}
