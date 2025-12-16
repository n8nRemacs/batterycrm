package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: FoldersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f187671a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.g<MessengerFolderTabsTestGroup>> f187672b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f187673c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<JY.a> f187674d;

    public y(Provider<InterfaceC35745a5> provider, Provider<u3.g<MessengerFolderTabsTestGroup>> provider2, Provider<InterfaceC47842z> provider3, Provider<JY.a> provider4) {
        this.f187671a = provider;
        this.f187672b = provider2;
        this.f187673c = provider3;
        this.f187674d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f187671a.get(), this.f187672b.get(), this.f187673c.get(), this.f187674d.get());
    }
}
