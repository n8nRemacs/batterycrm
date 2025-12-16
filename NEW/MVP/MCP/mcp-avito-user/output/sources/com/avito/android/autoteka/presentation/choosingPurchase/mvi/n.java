package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import Hf.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink;
import com.avito.android.autoteka.deeplinks.AutotekaReportGenerationLink;
import com.avito.android.autoteka.deeplinks.AutotekaReportLink;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaChoosingPurchaseOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "LHf/b;", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements t<AutotekaChoosingPurchaseInternalAction, Hf.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ChoosingPurchaseDetails f97206b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f97207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97208d;

    /* compiled from: AutotekaChoosingPurchaseOneTimeEventProducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/n$a;", "", "<init>", "()V", "", "CHOOSING_PRODUCTS_UTM_CAMPAIGN_VALUE", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public n(@Y61.k ChoosingPurchaseDetails choosingPurchaseDetails, @Y61.k com.avito.android.autoteka.data.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f97206b = choosingPurchaseDetails;
        this.f97207c = aVar;
        this.f97208d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Hf.b b(AutotekaChoosingPurchaseInternalAction autotekaChoosingPurchaseInternalAction) {
        AutotekaChoosingPurchaseInternalAction autotekaChoosingPurchaseInternalAction2 = autotekaChoosingPurchaseInternalAction;
        boolean z12 = autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenStandalone;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f97208d;
        com.avito.android.autoteka.data.a aVar2 = this.f97207c;
        ChoosingPurchaseDetails choosingPurchaseDetails = this.f97206b;
        if (z12) {
            AutotekaChoosingPurchaseInternalAction.OpenStandalone openStandalone = (AutotekaChoosingPurchaseInternalAction.OpenStandalone) autotekaChoosingPurchaseInternalAction2;
            b.a.a(aVar, new AutotekaBuyReportLink(openStandalone.f97170b, "products_bottomsheet", null, null, 12, null), null, null, 6);
            String searchKey = choosingPurchaseDetails.getSearchKey();
            if (searchKey == null) {
                return null;
            }
            aVar2.b(searchKey, openStandalone.f97170b, FromBlock.f96088h, openStandalone.f97171c);
            return null;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenPayment) {
            return new b.d(choosingPurchaseDetails.getSearchKey(), ((AutotekaChoosingPurchaseInternalAction.OpenPayment) autotekaChoosingPurchaseInternalAction2).f97166b, choosingPurchaseDetails.getAutotekaX());
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenAuthScreen) {
            return b.c.f7579a;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.UseReportPackageError) {
            ApiError apiError = ((AutotekaChoosingPurchaseInternalAction.UseReportPackageError) autotekaChoosingPurchaseInternalAction2).f97181b;
            if (apiError instanceof ApiError.Unauthorized) {
                return b.c.f7579a;
            }
            com.avito.android.autoteka.helpers.l.f96668a.getClass();
            return new b.g(com.avito.android.autoteka.helpers.l.a(apiError));
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageOnSuccess) {
            b.a.a(aVar, new AutotekaReportGenerationLink(new ReportGenerationDetails(((AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageOnSuccess) autotekaChoosingPurchaseInternalAction2).f97172b, choosingPurchaseDetails.getAutotekaX(), null)), null, null, 6);
            return b.f.f7583a;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenReportGenerationFromBuyAgainState) {
            b.a.a(aVar, new AutotekaReportGenerationLink(new ReportGenerationDetails(((AutotekaChoosingPurchaseInternalAction.OpenReportGenerationFromBuyAgainState) autotekaChoosingPurchaseInternalAction2).f97169b, choosingPurchaseDetails.getAutotekaX(), null)), null, null, 6);
            return b.a.f7577a;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenReport) {
            b.a.a(aVar, new AutotekaReportLink(new ReportDetails(choosingPurchaseDetails.getAutotekaX(), ((AutotekaChoosingPurchaseInternalAction.OpenReport) autotekaChoosingPurchaseInternalAction2).f97168b, null, null)), null, null, 6);
            return b.a.f7577a;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.BuyReportViaStandalone) {
            String searchKey2 = choosingPurchaseDetails.getSearchKey();
            if (searchKey2 != null) {
                AutotekaChoosingPurchaseInternalAction.BuyReportViaStandalone buyReportViaStandalone = (AutotekaChoosingPurchaseInternalAction.BuyReportViaStandalone) autotekaChoosingPurchaseInternalAction2;
                aVar2.b(searchKey2, buyReportViaStandalone.f97156b, FromBlock.f96089i, buyReportViaStandalone.f97157c);
            }
            b.a.a(aVar, new AutotekaBuyReportLink(((AutotekaChoosingPurchaseInternalAction.BuyReportViaStandalone) autotekaChoosingPurchaseInternalAction2).f97156b, null, null, null, 14, null), null, null, 6);
            return null;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.PurchaseViaStandaloneState) {
            return null;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenDeeplink) {
            b.a.a(aVar, ((AutotekaChoosingPurchaseInternalAction.OpenDeeplink) autotekaChoosingPurchaseInternalAction2).f97165b, null, null, 6);
            return b.a.f7577a;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.CloseScreenWithSuccessResult) {
            return b.C0430b.f7578a;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.OpenPreviewSearch) {
            b.a.a(aVar, new AutotekaPreviewSearchLink(new AutotekaPreviewSearchDetails(choosingPurchaseDetails.getSearchKey(), null, null, null, choosingPurchaseDetails.getIsRepurchase(), false)), null, null, 6);
            return b.a.f7577a;
        }
        if (!(autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.SendSelectProductEvent)) {
            return null;
        }
        AutotekaChoosingPurchaseInternalAction.SendSelectProductEvent sendSelectProductEvent = (AutotekaChoosingPurchaseInternalAction.SendSelectProductEvent) autotekaChoosingPurchaseInternalAction2;
        aVar2.e(sendSelectProductEvent.f97180e, sendSelectProductEvent.f97177b, sendSelectProductEvent.f97178c, sendSelectProductEvent.f97179d);
        return null;
    }
}
