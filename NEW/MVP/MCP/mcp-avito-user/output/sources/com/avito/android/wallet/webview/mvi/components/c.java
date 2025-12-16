package com.avito.android.wallet.webview.mvi.components;

import Y61.l;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vP0.InterfaceC49248a;

/* compiled from: WalletWebViewBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/components/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.b<WalletWebViewInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f329415a;

    @Inject
    public c(@InterfaceC49248a boolean z12) {
        this.f329415a = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WalletWebViewInternalAction> a() {
        return this.f329415a ? C43175k.w() : new C43210w(WalletWebViewInternalAction.FirstLaunch.f329427b);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
