package com.avito.android.authorization.change_password;

import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChangeResettedPasswordInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f93346a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f93347b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f93348c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93349d;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f93346a = lVar;
        this.f93347b = lVar2;
        this.f93348c = provider;
        this.f93349d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((String) this.f93346a.f393949a, (String) this.f93347b.f393949a, this.f93348c.get(), this.f93349d.get());
    }
}
