package com.avito.android.certificate_pinning.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkInternalAction;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<UnsafeNetworkInternalAction, UnsafeNetworkState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final UnsafeNetworkState a(UnsafeNetworkInternalAction unsafeNetworkInternalAction, UnsafeNetworkState unsafeNetworkState) {
        UnsafeNetworkInternalAction unsafeNetworkInternalAction2 = unsafeNetworkInternalAction;
        UnsafeNetworkState unsafeNetworkState2 = unsafeNetworkState;
        if (unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.AuthorizationRequired) {
            return UnsafeNetworkState.a(unsafeNetworkState2, ((UnsafeNetworkInternalAction.AuthorizationRequired) unsafeNetworkInternalAction2).f117805b, false, UnsafeNetworkState.ViewState.AuthorizationRequired.f117820b, 2);
        }
        return unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.UnsafeNetwork ? UnsafeNetworkState.a(unsafeNetworkState2, null, false, UnsafeNetworkState.ViewState.UnsafeNetwork.f117821b, 1) : unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.Loading ? UnsafeNetworkState.a(unsafeNetworkState2, null, true, null, 11) : UnsafeNetworkState.a(unsafeNetworkState2, null, false, null, 11);
    }
}
