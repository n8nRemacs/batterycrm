package com.avito.android.autoteka.helpers;

import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.deeplinks.AutotekaUnifiedButtonLink;
import com.avito.android.autoteka.deeplinks.UnifiedButtonLinkDetails;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.remote.model.autotekateaser.AutotekaAnalytic;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.ShowProductsAction;
import com.avito.android.remote.model.autotekateaser.ShowReportAction;
import kotlin.Metadata;

/* compiled from: AutotekaUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/helpers/b;", "", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f96647a = new b();

    @Y61.l
    public static AutotekaPurchaseAction a(@Y61.k AutotekaTeaserResult autotekaTeaserResult) {
        ShowReportAction showReportAction = autotekaTeaserResult.getShowReportAction();
        if (showReportAction != null) {
            String text = showReportAction.getText();
            String actionType = showReportAction.getActionType();
            String reportPublicId = showReportAction.getReportPublicId();
            AutoSearchType[] autoSearchTypeArr = AutoSearchType.f96643b;
            return new AutotekaPurchaseAction(text, null, new AutotekaPurchaseAction.Data(actionType, null, reportPublicId, new AutotekaAnalytic(1)));
        }
        ShowProductsAction showProductsAction = autotekaTeaserResult.getShowProductsAction();
        if (showProductsAction == null) {
            return null;
        }
        String text2 = showProductsAction.getText();
        String subTitle = showProductsAction.getSubTitle();
        String actionType2 = showProductsAction.getActionType();
        String itemId = showProductsAction.getItemId();
        AutoSearchType[] autoSearchTypeArr2 = AutoSearchType.f96643b;
        return new AutotekaPurchaseAction(text2, subTitle, new AutotekaPurchaseAction.Data(actionType2, itemId, null, new AutotekaAnalytic(1)));
    }

    public static AutotekaChoosingPurchaseButtonParams b(b bVar, AutotekaPurchaseAction autotekaPurchaseAction, FromBlock fromBlock, String str) {
        bVar.getClass();
        return c(autotekaPurchaseAction, fromBlock.f96095b, str, null, null);
    }

    @Y61.k
    public static AutotekaChoosingPurchaseButtonParams c(@Y61.k AutotekaPurchaseAction autotekaPurchaseAction, int i12, @Y61.l String str, @Y61.l String str2, @Y61.l Boolean bool) {
        return new AutotekaChoosingPurchaseButtonParams(new AutotekaUnifiedButtonLink(new UnifiedButtonLinkDetails(autotekaPurchaseAction, str, i12, str2, bool)), autotekaPurchaseAction.getLabel(), autotekaPurchaseAction.getSubLabel(), autotekaPurchaseAction.getData().getActionType());
    }
}
