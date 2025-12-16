package com.avito.android.wallet.webview;

import android.content.res.Resources;
import com.avito.android.wallet.webview.deeplink.WalletWebViewDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WalletWebViewResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/q;", "Lcom/avito/android/wallet/webview/p;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f329441a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final WalletWebViewDialogData f329442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f329443c;

    public q(@Y61.k Resources resources, @Y61.l WalletWebViewDialogData walletWebViewDialogData, @Y61.l String str, @Y61.l String str2) {
        this.f329441a = resources;
        this.f329442b = walletWebViewDialogData;
        this.f329443c = str2;
    }

    public /* synthetic */ q(Resources resources, WalletWebViewDialogData walletWebViewDialogData, String str, String str2, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? null : walletWebViewDialogData, str, str2);
    }
}
