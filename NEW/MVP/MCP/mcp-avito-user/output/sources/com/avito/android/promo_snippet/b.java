package com.avito.android.promo_snippet;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.list.next_button.PromoNextButtonItem;
import com.avito.android.promo_snippet.models.GigPromoSnippetWidget;
import com.avito.android.promo_snippet.models.MoreMotivations;
import com.avito.android.promo_snippet.models.MotivationItem;
import com.avito.android.promo_snippet.models.MotivationItemActionButton;
import com.avito.android.promo_snippet.models.MotivationItemFooterInfo;
import com.avito.android.promo_snippet.models.MotivationItemProgressItem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GigPromoSnippetItemConverterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo_snippet/b;", "Lcom/avito/android/promo_snippet/a;", "<init>", "()V", "_avito_gig_promo-snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.promo_snippet.a
    @k
    public final PromoSnippetListState a(@k GigPromoSnippetWidget gigPromoSnippetWidget) {
        ArrayList arrayList;
        String title = gigPromoSnippetWidget.getTitle();
        List<MotivationItem> listD = gigPromoSnippetWidget.d();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, 10));
        Iterator<T> it = listD.iterator();
        while (true) {
            ActionButton actionButton = null;
            if (!it.hasNext()) {
                break;
            }
            MotivationItem motivationItem = (MotivationItem) it.next();
            String title2 = motivationItem.getTitle();
            String subtitle = motivationItem.getSubtitle();
            Boolean showError = motivationItem.getShowError();
            boolean zBooleanValue = showError != null ? showError.booleanValue() : false;
            String price = motivationItem.getPrice();
            List<MotivationItemProgressItem> listE = motivationItem.e();
            if (listE != null) {
                arrayList = new ArrayList();
                Iterator<T> it2 = listE.iterator();
                while (it2.hasNext()) {
                    Double value = ((MotivationItemProgressItem) it2.next()).getValue();
                    if (value != null) {
                        arrayList.add(value);
                    }
                }
            } else {
                arrayList = null;
            }
            MotivationItemFooterInfo footerInfo = motivationItem.getFooterInfo();
            FooterInfo footerInfo2 = footerInfo != null ? new FooterInfo(footerInfo.getProgressText(), footerInfo.getDeadline()) : null;
            DeepLink deeplink = motivationItem.getDeeplink();
            MotivationItemActionButton actionButton2 = motivationItem.getActionButton();
            if (actionButton2 != null) {
                actionButton = new ActionButton(actionButton2.getTitle(), actionButton2.getDeeplink());
            }
            arrayList2.add(new PromoSnippetState(title2, subtitle, price, arrayList, footerInfo2, deeplink, actionButton, zBooleanValue, motivationItem.getShowBackgroundColor(), motivationItem.getIsLocked(), false, null, null, 7168, null));
        }
        MoreMotivations moreButton = gigPromoSnippetWidget.getMoreButton();
        return new PromoSnippetListState(title, arrayList2, moreButton != null ? new PromoNextButtonItem(moreButton.getTitle(), moreButton.getUri(), false, null, 12, null) : null, null, null, 24, null);
    }
}
