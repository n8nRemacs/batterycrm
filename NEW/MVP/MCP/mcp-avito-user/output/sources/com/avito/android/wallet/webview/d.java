package com.avito.android.wallet.webview;

import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import xP0.InterfaceC49873a;

/* compiled from: WalletWebViewActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletWebViewActivity f329381b;

    public d(WalletWebViewActivity walletWebViewActivity) {
        this.f329381b = walletWebViewActivity;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = WalletWebViewActivity.f329347C;
        this.f329381b.b2().accept(new InterfaceC49873a.b((PowerWebViewStateChangeEvent) obj));
    }
}
