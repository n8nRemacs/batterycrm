package com.avito.android.publish.category_edit;

import androidx.view.InterfaceC23487e;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.Navigation;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryEditViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f232410a;

    /* renamed from: b, reason: collision with root package name */
    public final u f232411b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f232412c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f232413d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f232414e;

    public o(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f232410a = provider;
        this.f232411b = uVar;
        this.f232412c = provider2;
        this.f232413d = provider3;
        this.f232414e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f232410a.get(), (a) this.f232411b.get(), this.f232412c.get(), this.f232413d.get(), (Navigation) this.f232414e.f393949a);
    }
}
