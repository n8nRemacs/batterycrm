package com.avito.android.wallet.pin.impl.verification.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletPinVerificationBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/component/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.android.arch.mvi.b<WalletPinVerificationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f329167a;

    @Inject
    public h(@Y61.k m mVar) {
        this.f329167a = mVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WalletPinVerificationInternalAction> a() {
        m mVar = this.f329167a;
        mVar.getClass();
        return C43175k.G(new o(mVar, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
