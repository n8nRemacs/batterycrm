package com.avito.android.serp.adapter.location_notification;

import kotlin.Metadata;

/* compiled from: LocationNotificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f270262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationNotificationItem f270263c;

    public k(m mVar, LocationNotificationItem locationNotificationItem) {
        this.f270262b = mVar;
        this.f270263c = locationNotificationItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.jakewharton.rxrelay3.d<a> dVar = this.f270262b.f270266c;
        LocationNotificationItem locationNotificationItem = this.f270263c;
        dVar.accept(new a(locationNotificationItem.f270240h, false, locationNotificationItem.f270239g, 0, 8, null));
    }
}
