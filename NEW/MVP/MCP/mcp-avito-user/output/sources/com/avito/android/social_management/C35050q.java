package com.avito.android.social_management;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import hx0.InterfaceC41187a;
import javax.inject.Provider;
import jx0.InterfaceC42441a;

/* compiled from: SocialManagementInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.social_management.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35050q implements dagger.internal.h<C35046m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f284691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41187a> f284692b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f284693c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42441a> f284694d;

    public C35050q(Provider<InterfaceC34401z0> provider, Provider<InterfaceC41187a> provider2, Provider<InterfaceC35745a5> provider3, Provider<InterfaceC42441a> provider4) {
        this.f284691a = provider;
        this.f284692b = provider2;
        this.f284693c = provider3;
        this.f284694d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35046m(this.f284691a.get(), this.f284692b.get(), this.f284693c.get(), this.f284694d.get());
    }
}
