package com.avito.android.libs.saved_searches.domain;

import TV.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchLink;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f181474b;

    public n(t tVar) {
        this.f181474b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = (DeepLink) obj;
        SavedSearchLink savedSearchLink = deepLink instanceof SavedSearchLink ? (SavedSearchLink) deepLink : null;
        String str = savedSearchLink != null ? savedSearchLink.f181437b : null;
        this.f181474b.f181479c.i(str != null ? new e.a(str) : new e.b(null));
    }
}
