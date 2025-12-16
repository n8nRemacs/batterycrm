package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UnreadMessagesPopupFragmentListenerTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<UnreadMessagesPopupFragmentListenerTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<o> f197749a;

    public c(Provider<o> provider) {
        this.f197749a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new UnreadMessagesPopupFragmentListenerTask(this.f197749a.get());
    }
}
