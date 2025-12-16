package com.avito.android.app.task;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;

/* compiled from: MessengerBackgroundTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class B0 implements dagger.internal.h<MessengerBackgroundTask> {

    /* renamed from: a, reason: collision with root package name */
    public final K0 f91382a;

    /* renamed from: b, reason: collision with root package name */
    public final N1 f91383b;

    /* renamed from: c, reason: collision with root package name */
    public final C28591s f91384c;

    /* renamed from: d, reason: collision with root package name */
    public final C28613z0 f91385d;

    /* renamed from: e, reason: collision with root package name */
    public final L0 f91386e;

    /* renamed from: f, reason: collision with root package name */
    public final K f91387f;

    /* renamed from: g, reason: collision with root package name */
    public final F0 f91388g;

    /* renamed from: h, reason: collision with root package name */
    public final C28595t0 f91389h;

    /* renamed from: i, reason: collision with root package name */
    public final C28594t f91390i;

    /* renamed from: j, reason: collision with root package name */
    public final C30713g1 f91391j;

    public B0(K0 k02, N1 n12, C28591s c28591s, C28613z0 c28613z0, L0 l02, K k12, F0 f02, C28595t0 c28595t0, C28594t c28594t, C30713g1 c30713g1) {
        this.f91382a = k02;
        this.f91383b = n12;
        this.f91384c = c28591s;
        this.f91385d = c28613z0;
        this.f91386e = l02;
        this.f91387f = k12;
        this.f91388g = f02;
        this.f91389h = c28595t0;
        this.f91390i = c28594t;
        this.f91391j = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MessengerBackgroundTask((MessengerPhotosCleanupTask) this.f91382a.get(), (SendPendingMessagesTask) this.f91383b.get(), (ChannelSyncTask) this.f91384c.get(), (MessageSyncTask) this.f91385d.get(), (MessengerReadStatusSyncTask) this.f91386e.get(), (HashIdChangesObservingTask) this.f91387f.get(), (MessengerNotificationsTask) this.f91388g.get(), (MessageLocallyDeletedChannelsTask) this.f91389h.get(), (ChannelWarmUpTask) this.f91390i.get(), (C30277e1) this.f91391j.get());
    }
}
