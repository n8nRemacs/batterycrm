package com.avito.android.authorization.change_password;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChangeResettedPasswordPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f93370a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93371b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f93372c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f93373d;

    public n(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f93370a = provider;
        this.f93371b = provider2;
        this.f93372c = provider3;
        this.f93373d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f93370a.get(), this.f93371b.get(), this.f93372c.get(), (Kundle) this.f93373d.f393949a);
    }
}
