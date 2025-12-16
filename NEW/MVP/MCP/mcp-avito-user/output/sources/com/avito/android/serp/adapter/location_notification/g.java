package com.avito.android.serp.adapter.location_notification;

import kotlin.Metadata;

/* compiled from: LocationNotificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f270256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationNotificationItem f270257c;

    public g(m mVar, LocationNotificationItem locationNotificationItem) {
        this.f270256b = mVar;
        this.f270257c = locationNotificationItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.jakewharton.rxrelay3.d<a> dVar = this.f270256b.f270265b;
        LocationNotificationItem locationNotificationItem = this.f270257c;
        dVar.accept(new a(locationNotificationItem.f270240h, true, locationNotificationItem.f270239g, 0, 8, null));
    }
}
