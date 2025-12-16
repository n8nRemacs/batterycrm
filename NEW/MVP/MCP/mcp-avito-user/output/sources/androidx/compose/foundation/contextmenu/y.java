package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContextMenuUi.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class y extends N implements Y41.q<J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f27074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f27075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Y41.l<? super p, G0> lVar, g gVar) {
        super(3);
        this.f27074l = (N) lVar;
        this.f27075m = gVar;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final G0 invoke(J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new p();
                a13.H(objT);
            }
            p pVar = (p) objT;
            pVar.f27037a.clear();
            this.f27074l.invoke(pVar);
            pVar.a(this.f27075m, a13, 0);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
