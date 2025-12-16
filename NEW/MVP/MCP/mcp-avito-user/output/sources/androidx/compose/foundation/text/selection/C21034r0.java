package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20321u;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.I3;
import kotlin.Metadata;

/* compiled from: SelectionMagnifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.selection.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21034r0 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<l0.g> f32120l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Y41.a<l0.g>, androidx.compose.ui.v> f32121m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21034r0(Y41.a<l0.g> aVar, Y41.l<? super Y41.a<l0.g>, ? extends androidx.compose.ui.v> lVar) {
        super(3);
        this.f32120l = aVar;
        this.f32121m = lVar;
    }

    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.C(759876635);
        C20321u c20321u = C21031p0.f32100a;
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.d(this.f32120l);
            a13.H(objT);
        }
        I3 i32 = (I3) objT;
        Object objT2 = a13.t();
        if (objT2 == obj) {
            objT2 = new C20268c(l0.g.a(((l0.g) i32.getF42167b()).f413387a), C21031p0.f32101b, l0.g.a(C21031p0.f32102c), null, 8, null);
            a13.H(objT2);
        }
        C20268c c20268c = (C20268c) objT2;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        boolean zU2 = a13.u(c20268c);
        Object objT3 = a13.t();
        if (zU2 || objT3 == obj) {
            objT3 = new C21036s0(i32, c20268c, null);
            a13.H(objT3);
        }
        C22187u0.d((Y41.p) objT3, a13, g02);
        androidx.compose.animation.core.r<T, V> rVar = c20268c.f26225d;
        boolean zB2 = a13.B(rVar);
        Object objT4 = a13.t();
        if (zB2 || objT4 == obj) {
            objT4 = new C21033q0(rVar);
            a13.H(objT4);
        }
        androidx.compose.ui.v vVarInvoke = this.f32121m.invoke((Y41.a) objT4);
        a13.h();
        return vVarInvoke;
    }
}
