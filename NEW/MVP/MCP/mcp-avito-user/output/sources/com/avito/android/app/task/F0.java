package com.avito.android.app.task;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.remote.notification.InterfaceC34350q;
import javax.inject.Provider;

/* compiled from: MessengerNotificationsTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class F0 implements dagger.internal.h<MessengerNotificationsTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30713g1 f91402a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34350q> f91403b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.notification.e> f91404c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f91405d;

    public F0(C30713g1 c30713g1, Provider provider, Provider provider2, dagger.internal.u uVar) {
        this.f91402a = c30713g1;
        this.f91403b = provider;
        this.f91404c = provider2;
        this.f91405d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MessengerNotificationsTask((C30277e1) this.f91402a.get(), this.f91403b.get(), dagger.internal.g.b(this.f91404c), dagger.internal.g.a(dagger.internal.w.a(this.f91405d)));
    }
}
