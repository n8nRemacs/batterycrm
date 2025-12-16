package com.avito.android.autoteka.deeplinks.unifiedButton;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaUnifiedButtonLink;
import com.avito.android.autoteka.deeplinks.UnifiedButtonLinkDetails;
import com.avito.android.autoteka.helpers.ActionType;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaUnifiedButtonDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/unifiedButton/b;", "Lev/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaUnifiedButtonLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AutotekaUnifiedButtonLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f96320f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f96321g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.autoteka.data.a f96322h;

    @Inject
    public b(@k C25719a c25719a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.autoteka.data.a aVar2) {
        this.f96320f = c25719a;
        this.f96321g = aVar;
        this.f96322h = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String actionType;
        AutotekaUnifiedButtonLink autotekaUnifiedButtonLink = (AutotekaUnifiedButtonLink) deepLink;
        UnifiedButtonLinkDetails unifiedButtonLinkDetails = autotekaUnifiedButtonLink.f96238b;
        String autotekaX = unifiedButtonLinkDetails.getAutotekaX();
        if (autotekaX == null) {
            com.avito.android.autoteka.helpers.c.f96648a.getClass();
            autotekaX = com.avito.android.autoteka.helpers.c.a();
        }
        AutotekaPurchaseAction autotekaPurchaseAction = unifiedButtonLinkDetails.getAutotekaPurchaseAction();
        String searchKey = autotekaPurchaseAction.getData().getSearchKey();
        int searchType = autotekaPurchaseAction.getData().getAutotekaAnalytic().getSearchType();
        if (L.f(unifiedButtonLinkDetails.getIsRepurchase(), Boolean.TRUE)) {
            ActionType[] actionTypeArr = ActionType.f96641b;
            actionType = "repurchase";
        } else {
            actionType = autotekaPurchaseAction.getData().getActionType();
        }
        String str2 = actionType;
        String searchContext = unifiedButtonLinkDetails.getSearchContext();
        this.f96322h.a(searchKey, searchType, Long.valueOf(unifiedButtonLinkDetails.getFromBlock()), searchContext, str2, autotekaX);
        this.f96320f.a(autotekaUnifiedButtonLink, this, AuthSource.f92691Z, new a(autotekaPurchaseAction, autotekaUnifiedButtonLink, autotekaX, this));
    }
}
