package com.avito.android.certificate_pinning.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkInternalAction;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import io.InterfaceC41432a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: UnsafeNetworkActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lio/a;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC41432a, UnsafeNetworkInternalAction, UnsafeNetworkState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.certificate_pinning.domain.a f117803a;

    @Inject
    public d(@Y61.k com.avito.android.certificate_pinning.domain.a aVar) {
        this.f117803a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UnsafeNetworkInternalAction> b(InterfaceC41432a interfaceC41432a, UnsafeNetworkState unsafeNetworkState) {
        InterfaceC41432a interfaceC41432a2 = interfaceC41432a;
        UnsafeNetworkState unsafeNetworkState2 = unsafeNetworkState;
        if (interfaceC41432a2 instanceof InterfaceC41432a.b) {
            return y.a(this.f117803a.a().r(new b(unsafeNetworkState2)).F());
        }
        if (interfaceC41432a2 instanceof InterfaceC41432a.C11394a) {
            return C43175k.G(new c(unsafeNetworkState2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
