package com.avito.android.notification_center.list.item;

import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ErrorSnippetItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/item/f;", "Lcom/avito/android/notification_center/list/item/c;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<NotificationCenterListItem.ErrorSnippet> f207614b;

    @Inject
    public f(@Y61.k com.jakewharton.rxrelay3.c<NotificationCenterListItem.ErrorSnippet> cVar) {
        this.f207614b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        NotificationCenterListItem.ErrorSnippet errorSnippet = (NotificationCenterListItem.ErrorSnippet) aVar;
        hVar.i7(errorSnippet.f207599c);
        hVar.Od(new d(this, errorSnippet));
        hVar.d(new e(hVar));
    }
}
