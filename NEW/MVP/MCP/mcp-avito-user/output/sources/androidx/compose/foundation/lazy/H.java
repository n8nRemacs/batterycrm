package androidx.compose.foundation.lazy;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyListIntervalContent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class H extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> f28822l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(Y41.q<? super InterfaceC20793y, ? super androidx.compose.runtime.A, ? super Integer, G0> qVar) {
        super(4);
        this.f28822l = qVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num2.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(interfaceC20793y2) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 131) != 130)) {
            this.f28822l.invoke(interfaceC20793y2, a13, Integer.valueOf(iIntValue & 14));
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
