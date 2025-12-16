package com.avito.android.app.task;

import com.avito.android.di.module.C30093k5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;

/* compiled from: UserKeysAnalyticsTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class Z1 implements dagger.internal.h<UserKeysAnalyticsTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.error_reporting.error_reporter.n> f91562a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f91563b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.H> f91564c;

    /* renamed from: d, reason: collision with root package name */
    public final C30093k5 f91565d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91566e;

    public Z1(Provider provider, Provider provider2, Provider provider3, C30093k5 c30093k5, Provider provider4) {
        this.f91562a = provider;
        this.f91563b = provider2;
        this.f91564c = provider3;
        this.f91565d = c30093k5;
        this.f91566e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new UserKeysAnalyticsTask(this.f91562a.get(), this.f91563b.get(), this.f91564c.get(), (com.avito.android.util.I1) this.f91565d.get(), this.f91566e.get());
    }
}
