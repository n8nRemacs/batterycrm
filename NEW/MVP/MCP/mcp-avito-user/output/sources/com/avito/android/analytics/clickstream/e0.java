package com.avito.android.analytics.clickstream;

import javax.inject.Inject;
import kotlin.Metadata;
import proto.events.apps.EventOuterClass;

/* compiled from: DiskStorageConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/analytics/clickstream/e0;", "Lcom/avito/android/analytics/clickstream/d0;", "Lproto/events/apps/EventOuterClass$Event;", "<init>", "()V", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e0 extends d0<EventOuterClass.Event> {

    /* renamed from: b, reason: collision with root package name */
    public final int f89783b;

    @Inject
    public e0() {
        super(EventOuterClass.Event.newBuilder());
        this.f89783b = 2;
    }

    @Override // com.avito.android.analytics.inhouse_transport.c
    /* renamed from: c, reason: from getter */
    public final int getF89783b() {
        return this.f89783b;
    }
}
