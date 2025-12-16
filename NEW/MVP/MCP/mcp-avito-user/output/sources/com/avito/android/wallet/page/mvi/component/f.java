package com.avito.android.wallet.page.mvi.component;

import com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletPageActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LZO0/b;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "invoke", "(LZO0/b;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<ZO0.b, InterfaceC43160i<? extends WalletPageInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f328138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<WalletPageState> f328139m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Y41.a<WalletPageState> aVar2) {
        super(1);
        this.f328138l = aVar;
        this.f328139m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends WalletPageInternalAction> invoke(ZO0.b bVar) {
        WalletPageState walletPageStateInvoke = this.f328139m.invoke();
        return this.f328138l.b(bVar, walletPageStateInvoke);
    }
}
