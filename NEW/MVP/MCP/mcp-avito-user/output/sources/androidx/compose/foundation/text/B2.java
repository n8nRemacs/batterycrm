package androidx.compose.foundation.text;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: TextFieldPressGestureFilter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class B2 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f30180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f30181m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B2(Y41.l<? super l0.g, kotlin.G0> lVar, androidx.compose.foundation.interaction.m mVar) {
        super(3);
        this.f30180l = lVar;
        this.f30181m = mVar;
    }

    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.C(-102778667);
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
            a13.H(objT);
        }
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
        Object objT2 = a13.t();
        if (objT2 == c1651a) {
            objT2 = C22126m3.g(null);
            a13.H(objT2);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(this.f30180l, a13);
        androidx.compose.foundation.interaction.m mVar = this.f30181m;
        boolean zB2 = a13.B(mVar);
        Object objT3 = a13.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = new C21078z2(interfaceC22204y1, mVar);
            a13.H(objT3);
        }
        C22187u0.a(mVar, (Y41.l) objT3, a13);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        boolean zU2 = a13.u(t12) | a13.B(mVar) | a13.B(interfaceC22204y1M);
        Object objT4 = a13.t();
        if (zU2 || objT4 == c1651a) {
            objT4 = new A2(t12, interfaceC22204y1, mVar, interfaceC22204y1M);
            a13.H(objT4);
        }
        androidx.compose.ui.v vVarE = androidx.compose.ui.input.pointer.Z.e(aVar, mVar, (PointerInputEventHandler) objT4);
        a13.h();
        return vVarE;
    }
}
