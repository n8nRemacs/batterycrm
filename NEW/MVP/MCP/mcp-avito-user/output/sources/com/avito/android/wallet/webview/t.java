package com.avito.android.wallet.webview;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.wallet.webview.deeplink.WalletWebViewDialogData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletWebViewView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f329448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f329449m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f329450n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        super(2);
        this.f329448l = uVar;
        this.f329449m = aVar;
        this.f329450n = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) throws Resources.NotFoundException {
        String string;
        String subtitle;
        String string2;
        String string3;
        a.b bVar2 = bVar;
        u uVar = this.f329448l;
        q qVar = uVar.f329455e;
        WalletWebViewDialogData walletWebViewDialogData = qVar.f329442b;
        if (walletWebViewDialogData == null || (string = walletWebViewDialogData.getTitle()) == null) {
            string = qVar.f329441a.getString(R.string.wallet_webview_cancellation_dialog_title);
        }
        bVar2.setTitle(string);
        WalletWebViewDialogData walletWebViewDialogData2 = qVar.f329442b;
        if (walletWebViewDialogData2 == null || (subtitle = walletWebViewDialogData2.getSubtitle()) == null) {
            subtitle = "";
        }
        bVar2.setSubtitle(subtitle);
        bVar2.setButtonsOrientation(1);
        Resources resources = qVar.f329441a;
        if (walletWebViewDialogData2 == null || (string2 = walletWebViewDialogData2.getPrimaryButtonTitle()) == null) {
            string2 = resources.getString(R.string.wallet_webview_cancellation_dialog_primary_button_text);
        }
        bVar2.L3(string2, new r(uVar, this.f329449m));
        if (walletWebViewDialogData2 == null || (string3 = walletWebViewDialogData2.getSecondaryButtonTitle()) == null) {
            string3 = resources.getString(R.string.wallet_webview_cancellation_dialog_secondary_button_text);
        }
        bVar2.M3(string3, new s(uVar, this.f329450n));
        bVar2.setCancelable(true);
        bVar2.setCloseButtonVisible(false);
        return G0.f406611a;
    }
}
