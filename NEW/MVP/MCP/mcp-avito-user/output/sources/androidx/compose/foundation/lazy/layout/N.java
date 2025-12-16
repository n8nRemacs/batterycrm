package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.V0;
import androidx.compose.ui.layout.Y0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: LazyLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/l;", "saveableStateHolder", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/saveable/l;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class N extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.runtime.saveable.l, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20714d0 f29346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f29347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Q, C22712b, InterfaceC22367j0> f29348n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f29349o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C20714d0 c20714d0, androidx.compose.ui.v vVar, Y41.p pVar, InterfaceC22204y1 interfaceC22204y1) {
        super(3);
        this.f29346l = c20714d0;
        this.f29347m = vVar;
        this.f29348n = pVar;
        this.f29349o = interfaceC22204y1;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.runtime.saveable.l lVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVarD0;
        androidx.compose.runtime.saveable.l lVar2 = lVar;
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = new B(lVar2, new M(this.f29349o));
            a13.H(objT);
        }
        B b12 = (B) objT;
        Object objT2 = a13.t();
        if (objT2 == c1651a) {
            objT2 = new Y0(new H(b12));
            a13.H(objT2);
        }
        Y0 y02 = (Y0) objT2;
        C20714d0 c20714d0 = this.f29346l;
        if (c20714d0 != null) {
            a13.C(204281539);
            K0 k02 = c20714d0.f29402a;
            if (k02 == null) {
                a13.C(6591363);
                k02 = L0.f29309a;
                if (k02 != null) {
                    a13.C(1213893039);
                    a13.h();
                } else {
                    a13.C(1213931944);
                    View view = (View) a13.o(AndroidCompositionLocals_androidKt.f41073f);
                    boolean zB2 = a13.B(view);
                    Object objT3 = a13.t();
                    if (zB2 || objT3 == c1651a) {
                        objT3 = new RunnableC20707a(view);
                        a13.H(objT3);
                    }
                    a13.h();
                    k02 = (RunnableC20707a) objT3;
                }
            } else {
                a13.C(6590278);
            }
            a13.h();
            Object[] objArr = {c20714d0, b12, y02, k02};
            boolean zB3 = a13.B(c20714d0) | a13.u(b12) | a13.u(y02) | a13.u(k02);
            Object objT4 = a13.t();
            if (zB3 || objT4 == c1651a) {
                objT4 = new K(c20714d0, b12, y02, k02);
                a13.H(objT4);
            }
            C22187u0.c(objArr, (Y41.l) objT4, a13);
            a13.h();
        } else {
            a13.C(204710145);
            a13.h();
        }
        int i12 = C20716e0.f29410b;
        androidx.compose.ui.v vVar = this.f29347m;
        if (c20714d0 != null && (vVarD0 = vVar.d0(new TraversablePrefetchStateModifierElement(c20714d0))) != null) {
            vVar = vVarD0;
        }
        boolean zB4 = a13.B(b12);
        Y41.p<Q, C22712b, InterfaceC22367j0> pVar = this.f29348n;
        boolean zB5 = zB4 | a13.B(pVar);
        Object objT5 = a13.t();
        if (zB5 || objT5 == c1651a) {
            objT5 = new L(b12, pVar);
            a13.H(objT5);
        }
        V0.b(y02, vVar, (Y41.p) objT5, a13, 8);
        return kotlin.G0.f406611a;
    }
}
