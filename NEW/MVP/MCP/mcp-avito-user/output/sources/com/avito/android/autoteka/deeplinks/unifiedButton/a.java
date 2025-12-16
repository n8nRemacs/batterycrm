package com.avito.android.autoteka.deeplinks.unifiedButton;

import Ju.AbstractC14250d;
import com.avito.android.autoteka.deeplinks.AutotekaChoosingPurchaseLink;
import com.avito.android.autoteka.deeplinks.AutotekaReportLink;
import com.avito.android.autoteka.deeplinks.AutotekaUnifiedButtonLink;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaUnifiedButtonDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaPurchaseAction f96316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutotekaUnifiedButtonLink f96317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f96318n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f96319o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutotekaPurchaseAction autotekaPurchaseAction, AutotekaUnifiedButtonLink autotekaUnifiedButtonLink, String str, b bVar) {
        super(0);
        this.f96316l = autotekaPurchaseAction;
        this.f96317m = autotekaUnifiedButtonLink;
        this.f96318n = str;
        this.f96319o = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.autoteka.helpers.b bVar = com.avito.android.autoteka.helpers.b.f96647a;
        AutotekaUnifiedButtonLink autotekaUnifiedButtonLink = this.f96317m;
        Long lValueOf = Long.valueOf(autotekaUnifiedButtonLink.f96238b.getFromBlock());
        Boolean isRepurchase = autotekaUnifiedButtonLink.f96238b.getIsRepurchase();
        boolean zBooleanValue = isRepurchase != null ? isRepurchase.booleanValue() : false;
        bVar.getClass();
        AutotekaPurchaseAction autotekaPurchaseAction = this.f96316l;
        String reportPublicId = autotekaPurchaseAction.getData().getReportPublicId();
        String str = this.f96318n;
        DeepLink autotekaReportLink = reportPublicId != null ? new AutotekaReportLink(new ReportDetails(str, reportPublicId, lValueOf, autotekaPurchaseAction.getData().getActionType())) : new AutotekaChoosingPurchaseLink(new ChoosingPurchaseDetails(autotekaPurchaseAction.getData().getSearchKey(), str, lValueOf, autotekaPurchaseAction.getData().getActionType(), zBooleanValue));
        b bVar2 = this.f96319o;
        b.a.a(bVar2.f96321g, autotekaReportLink, null, null, 6);
        bVar2.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
