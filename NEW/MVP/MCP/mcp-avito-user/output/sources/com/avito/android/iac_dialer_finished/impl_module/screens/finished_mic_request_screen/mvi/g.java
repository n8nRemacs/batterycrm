package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import ZK.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import com.avito.android.permissions.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: IacFinishedMicRequestScreenActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LZK/a;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements com.avito.android.arch.mvi.a<ZK.a, IacFinishedMicRequestScreenInternalAction, IacFinishedMicRequestScreenState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f166783a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f166784b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f166785c;

    @Inject
    public g(@Y61.k z zVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC47842z interfaceC47842z) {
        this.f166783a = zVar;
        this.f166784b = interfaceC28373a;
        this.f166785c = interfaceC47842z;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<IacFinishedMicRequestScreenInternalAction> b(ZK.a aVar, IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState) {
        ZK.a aVar2 = aVar;
        IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState2 = iacFinishedMicRequestScreenState;
        if (aVar2.equals(a.g.f20101b)) {
            return C43175k.G(new f(this, iacFinishedMicRequestScreenState2, null));
        }
        if (aVar2.equals(a.b.f20096b)) {
            return C43175k.G(new a(this, iacFinishedMicRequestScreenState2, null));
        }
        if (aVar2.equals(a.d.f20098b)) {
            return C43175k.G(new c(iacFinishedMicRequestScreenState2, null));
        }
        if (aVar2.equals(a.e.f20099b)) {
            return C43175k.G(new d(this, iacFinishedMicRequestScreenState2, null));
        }
        if (aVar2.equals(a.f.f20100b)) {
            return C43175k.G(new e(this, iacFinishedMicRequestScreenState2, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new b(iacFinishedMicRequestScreenState2, (a.c) aVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
