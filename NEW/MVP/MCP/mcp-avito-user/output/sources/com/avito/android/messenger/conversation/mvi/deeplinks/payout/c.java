package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import com.avito.android.deep_linking.links.PayoutLink;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: AbstractPayoutDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "", "it", "Lcom/avito/android/util/P2;", "Landroid/net/Uri;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<PayoutLink> f190540b;

    public c(b<PayoutLink> bVar) {
        this.f190540b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new P2.a(this.f190540b.getF190619j().a((Throwable) obj));
    }
}
