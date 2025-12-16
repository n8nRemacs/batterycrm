package com.avito.android.social_management.adapter.notification;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.social_management.adapter.SocialItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/notification/f;", "Lcom/avito/android/social_management/adapter/notification/c;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<j> f284541b;

    @Inject
    public f(@k l41.g<j> gVar) {
        this.f284541b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SocialItem.Notification notification = (SocialItem.Notification) aVar;
        AttributedText attributedText = notification.f284483d;
        hVar.r(attributedText);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(7, this, notification));
        hVar.Oz(new d(this, notification));
        hVar.d(new e(notification, hVar));
    }
}
