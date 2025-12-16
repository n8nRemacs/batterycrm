package com.avito.android.app.task;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import javax.inject.Provider;

/* compiled from: MessageLocallyDeletedChannelsTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.t0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28595t0 implements dagger.internal.h<MessageLocallyDeletedChannelsTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC31857r0> f91735a;

    /* renamed from: b, reason: collision with root package name */
    public final C30713g1 f91736b;

    public C28595t0(C30713g1 c30713g1, Provider provider) {
        this.f91735a = provider;
        this.f91736b = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MessageLocallyDeletedChannelsTask(dagger.internal.g.b(this.f91735a), (C30277e1) this.f91736b.get());
    }
}
