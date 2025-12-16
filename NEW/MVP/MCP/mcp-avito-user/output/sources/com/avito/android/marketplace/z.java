package com.avito.android.marketplace;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewDialogData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FinanceMarketplaceWebView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f185966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f185967m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f185968n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a12, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        super(2);
        this.f185966l = a12;
        this.f185967m = aVar;
        this.f185968n = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) throws Resources.NotFoundException {
        String string;
        String subtitle;
        String string2;
        String string3;
        a.b bVar2 = bVar;
        A a12 = this.f185966l;
        s sVar = a12.f185837e;
        FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData = sVar.f185957b;
        if (financeMarketplaceWebViewDialogData == null || (string = financeMarketplaceWebViewDialogData.getTitle()) == null) {
            string = sVar.f185956a.getString(R.string.cancellation_dialog_title);
        }
        bVar2.setTitle(string);
        FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData2 = sVar.f185957b;
        if (financeMarketplaceWebViewDialogData2 == null || (subtitle = financeMarketplaceWebViewDialogData2.getSubtitle()) == null) {
            subtitle = "";
        }
        bVar2.setSubtitle(subtitle);
        bVar2.setButtonsOrientation(1);
        Resources resources = sVar.f185956a;
        if (financeMarketplaceWebViewDialogData2 == null || (string2 = financeMarketplaceWebViewDialogData2.getPrimaryButtonTitle()) == null) {
            string2 = resources.getString(R.string.cancellation_dialog_primary_button_text);
        }
        bVar2.L3(string2, new x(a12, this.f185967m));
        if (financeMarketplaceWebViewDialogData2 == null || (string3 = financeMarketplaceWebViewDialogData2.getSecondaryButtonTitle()) == null) {
            string3 = resources.getString(R.string.cancellation_dialog_secondary_button_text);
        }
        bVar2.M3(string3, new y(a12, this.f185968n));
        bVar2.setCancelable(true);
        bVar2.setCloseButtonVisible(false);
        return G0.f406611a;
    }
}
