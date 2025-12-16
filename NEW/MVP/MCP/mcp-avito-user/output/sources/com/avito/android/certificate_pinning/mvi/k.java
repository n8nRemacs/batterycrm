package com.avito.android.certificate_pinning.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkInternalAction;
import io.InterfaceC41433b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "Lio/b;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements t<UnsafeNetworkInternalAction, InterfaceC41433b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.certificate_pinning.resources.a f117841b;

    @Inject
    public k(@Y61.k com.avito.android.certificate_pinning.resources.a aVar) {
        this.f117841b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC41433b b(UnsafeNetworkInternalAction unsafeNetworkInternalAction) {
        UnsafeNetworkInternalAction unsafeNetworkInternalAction2 = unsafeNetworkInternalAction;
        if (unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.NetworkReady) {
            return InterfaceC41433b.a.f398770a;
        }
        if (unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.ProcessAuthorization) {
            return new InterfaceC41433b.C11395b(((UnsafeNetworkInternalAction.ProcessAuthorization) unsafeNetworkInternalAction2).f117810b);
        }
        boolean z12 = unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.StayUnsafeNetwork;
        com.avito.android.certificate_pinning.resources.a aVar = this.f117841b;
        if (z12) {
            return new InterfaceC41433b.c(aVar.c());
        }
        if (unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.NetworkError) {
            return new InterfaceC41433b.c(aVar.b());
        }
        if (unsafeNetworkInternalAction2 instanceof UnsafeNetworkInternalAction.UnknownSafetyCheckingError) {
            return new InterfaceC41433b.c(aVar.a());
        }
        return null;
    }
}
