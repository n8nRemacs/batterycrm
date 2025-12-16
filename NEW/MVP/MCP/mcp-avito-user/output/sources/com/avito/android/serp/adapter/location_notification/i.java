package com.avito.android.serp.adapter.location_notification;

import kotlin.Metadata;

/* compiled from: LocationNotificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "adapterPosition", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f270259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocationNotificationItem f270260c;

    public i(m mVar, LocationNotificationItem locationNotificationItem) {
        this.f270259b = mVar;
        this.f270260c = locationNotificationItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).intValue();
        com.jakewharton.rxrelay3.d<a> dVar = this.f270259b.f270265b;
        LocationNotificationItem locationNotificationItem = this.f270260c;
        dVar.accept(new a(locationNotificationItem.f270240h, false, locationNotificationItem.f270239g));
    }
}
