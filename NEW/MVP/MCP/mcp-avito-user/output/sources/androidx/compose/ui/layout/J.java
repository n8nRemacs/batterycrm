package androidx.compose.ui.layout;

import androidx.compose.runtime.C22190v;
import androidx.compose.ui.node.InterfaceC22413h;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Layout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class J extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> f40341l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(List<? extends Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0>> list) {
        super(2);
        this.f40341l = list;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            List<Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> list = this.f40341l;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = list.get(i12);
                int f37888q = a13.getF37888Q();
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40792c;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar2);
                }
                pVar.invoke(a13, 0);
                a13.z();
            }
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
