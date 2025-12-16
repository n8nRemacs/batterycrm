package com.avito.android.universal_transaction.navigation.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TransactionDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_transaction/navigation/deeplink/a;", "Lev/b;", "Lcom/avito/android/universal_transaction/navigation/deeplink/TransactionLink;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40162b<TransactionLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DG0.a f306480d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f306481e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f306482f;

    @Inject
    public a(@k DG0.a aVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar2) {
        this.f306480d = aVar;
        this.f306481e = interfaceC4053a;
        this.f306482f = aVar2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TransactionLink transactionLink = (TransactionLink) deepLink;
        NavigationTabSetItem navigationTabSetItemA = this.f306482f.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106974j;
        }
        String str2 = transactionLink.f306475b;
        String str3 = transactionLink.f306476c;
        String str4 = transactionLink.f306477d;
        this.f306481e.R(this.f306480d.a(str2, str3, str4, transactionLink.f306478e, transactionLink.f306479f, navigationTabSetItemA), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
