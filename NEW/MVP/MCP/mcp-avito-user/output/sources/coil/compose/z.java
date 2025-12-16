package coil.compose;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class z extends N implements Y41.q<androidx.compose.foundation.layout.F, androidx.compose.runtime.A, Integer, G0> {
    public z() {
        throw null;
    }

    @Override // Y41.q
    public final G0 invoke(androidx.compose.foundation.layout.F f12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.foundation.layout.F f13 = f12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(f13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
            return G0.f406611a;
        }
        f13.f();
        throw null;
    }
}
