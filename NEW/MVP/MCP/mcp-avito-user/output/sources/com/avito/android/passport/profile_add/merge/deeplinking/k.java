package com.avito.android.passport.profile_add.merge.deeplinking;

import Ju.AbstractC14250d;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportMergeAccountsCloseAsyncLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/deeplinking/k;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsCloseLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends AbstractC40161a<PassportMergeAccountsCloseLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f212953f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f212954g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f212955h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f212953f = aVar;
        this.f212954g = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeepLink deepLink2 = ((PassportMergeAccountsCloseLink) deepLink).f133537b;
        G0 g02 = null;
        if (deepLink2 != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f212953f;
            b.a.a(aVar, deepLink2, null, null, 6);
            this.f212955h.b(aVar.d9().v0(new i(this), j.f212952b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            this.f212954g.s1();
            j(AbstractC14250d.c.f9171c);
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f212955h.e();
    }
}
