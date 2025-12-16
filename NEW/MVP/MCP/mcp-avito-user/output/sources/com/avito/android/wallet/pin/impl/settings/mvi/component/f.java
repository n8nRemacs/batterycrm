package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState;
import kP0.InterfaceC42615a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletSecuritySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LkP0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "invoke", "(LkP0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<InterfaceC42615a, InterfaceC43160i<? extends WalletSecuritySettingsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f328799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<WalletSecuritySettingsState> f328800m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Y41.a<WalletSecuritySettingsState> aVar2) {
        super(1);
        this.f328799l = aVar;
        this.f328800m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends WalletSecuritySettingsInternalAction> invoke(InterfaceC42615a interfaceC42615a) {
        WalletSecuritySettingsState walletSecuritySettingsStateInvoke = this.f328800m.invoke();
        a aVar = this.f328799l;
        aVar.getClass();
        return C43175k.G(new g(interfaceC42615a, aVar, walletSecuritySettingsStateInvoke, null));
    }
}
