package com.avito.android.certificate_pinning.mvi;

import com.avito.android.certificate_pinning.NetworkState;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkInternalAction;
import kotlin.Metadata;

/* compiled from: NetworkStateExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_unsafe-network_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {
    public static UnsafeNetworkInternalAction a(NetworkState networkState, boolean z12, int i12) {
        boolean z13 = (i12 & 1) == 0;
        if ((i12 & 2) != 0) {
            z12 = true;
        }
        long j12 = networkState.f117751b;
        return j12 == 0 ? UnsafeNetworkInternalAction.NetworkReady.f117809b : j12 == 1 ? new UnsafeNetworkInternalAction.AuthorizationRequired(networkState.f117752c) : j12 == 2 ? (z13 || z12) ? UnsafeNetworkInternalAction.UnsafeNetwork.f117813b : UnsafeNetworkInternalAction.StayUnsafeNetwork.f117811b : j12 == 3 ? UnsafeNetworkInternalAction.NetworkError.f117808b : UnsafeNetworkInternalAction.UnknownSafetyCheckingError.f117812b;
    }
}
