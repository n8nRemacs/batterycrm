package com.avito.android.body_condition_sheet;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.BodyConditionBottomSheetLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BodyConditionSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/body_condition_sheet/k;", "Lev/b;", "Lcom/avito/android/deep_linking/links/BodyConditionBottomSheetLink;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends AbstractC40162b<BodyConditionBottomSheetLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f106882d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f106883e;

    @Inject
    public k(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f106882d = context;
        this.f106883e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BodyConditionBottomSheetLink bodyConditionBottomSheetLink = (BodyConditionBottomSheetLink) deepLink;
        BodyConditionSheetActivity.f106832w.getClass();
        this.f106883e.R(new Intent(this.f106882d, (Class<?>) BodyConditionSheetActivity.class).putExtra("BODY_CONDITION_SHEET_ACTIVITY_EXTRA_BODY", bodyConditionBottomSheetLink.f133054b).putExtra("BODY_CONDITION_SHEET_ACTIVITY_EXTRA_FROM_PAGE", bodyConditionBottomSheetLink.f133055c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
