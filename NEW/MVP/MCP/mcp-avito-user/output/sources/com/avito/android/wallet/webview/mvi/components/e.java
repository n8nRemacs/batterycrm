package com.avito.android.wallet.webview.mvi.components;

import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewInternalAction;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import xP0.InterfaceC49873a;
import xP0.InterfaceC49874b;

/* compiled from: WalletWebViewFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LxP0/a;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewState;", "LxP0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<q<InterfaceC49873a, WalletWebViewInternalAction, WalletWebViewState, InterfaceC49874b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f329417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f329418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f329419n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f329420o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, j jVar, h hVar) {
        super(1);
        this.f329417l = cVar;
        this.f329418m = aVar;
        this.f329419n = jVar;
        this.f329420o = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49873a, WalletWebViewInternalAction, WalletWebViewState, InterfaceC49874b> qVar) {
        q<InterfaceC49873a, WalletWebViewInternalAction, WalletWebViewState, InterfaceC49874b> qVar2 = qVar;
        qVar2.f92008d = this.f329417l;
        qVar2.f92009e = this.f329418m;
        qVar2.f92011g = this.f329419n;
        qVar2.f92010f = this.f329420o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
