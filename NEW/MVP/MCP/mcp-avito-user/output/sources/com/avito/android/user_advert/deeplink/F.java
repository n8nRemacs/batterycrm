package com.avito.android.user_advert.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DraftDeletionLink;
import com.avito.android.user_advert.advert.E1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyDraftDeletionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/F;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DraftDeletionLink;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class F extends AbstractC40161a<DraftDeletionLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E1 f310688f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310689g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310690h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public F(@Y61.k E1 e12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f310688f = e12;
        this.f310689g = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DraftDeletionLink draftDeletionLink = (DraftDeletionLink) deepLink;
        this.f310690h.b(this.f310688f.d(draftDeletionLink.f133285b, draftDeletionLink.f133286c).s(this.f310689g.e()).x(new E(this), io.reactivex.rxjava3.internal.functions.a.f401996f));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310690h.e();
    }
}
