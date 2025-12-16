package com.avito.android.wallet.pin.impl.verification;

import Y41.l;
import com.avito.android.wallet.pin.impl.verification.mvi.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pP0.InterfaceC46989a;

/* compiled from: WalletPinVerificationActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpP0/a;", "it", "Lkotlin/G0;", "invoke", "(LpP0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<InterfaceC46989a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WalletPinVerificationActivity f329044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WalletPinVerificationActivity walletPinVerificationActivity) {
        super(1);
        this.f329044l = walletPinVerificationActivity;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC46989a interfaceC46989a) {
        ((p) this.f329044l.f329026n.getValue()).accept(interfaceC46989a);
        return G0.f406611a;
    }
}
