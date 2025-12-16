package coil.compose;

import androidx.compose.runtime.C22082i3;
import coil.compose.C27242f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SubcomposeAsyncImage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil/compose/E;", "Lkotlin/G0;", "invoke", "(Lcoil/compose/E;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D extends N implements Y41.q<E, androidx.compose.runtime.A, Integer, G0> {
    @Override // Y41.q
    public final G0 invoke(E e12, androidx.compose.runtime.A a12, Integer num) {
        E e13 = e12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(e13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            C27242f.c cVar = (C27242f.c) ((C22082i3) e13.a().f58208s).getF42167b();
            if ((cVar instanceof C27242f.c.C2065c) || (cVar instanceof C27242f.c.d) || (cVar instanceof C27242f.c.b)) {
                a13.I(-418317557);
                a13.O();
            } else if (cVar instanceof C27242f.c.a) {
                a13.I(-418301399);
                a13.O();
            } else {
                a13.I(-418301339);
                a13.O();
            }
            B.a(e13, null, null, null, null, null, 0.0f, null, false, a13, iIntValue & 14, 255);
        }
        return G0.f406611a;
    }
}
