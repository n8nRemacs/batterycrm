package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendProfileInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212313a;

    /* renamed from: b, reason: collision with root package name */
    public final u f212314b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f212315c;

    /* renamed from: d, reason: collision with root package name */
    public final u f212316d;

    public d(dagger.internal.h hVar, u uVar, u uVar2, u uVar3) {
        this.f212313a = uVar;
        this.f212314b = uVar2;
        this.f212315c = hVar;
        this.f212316d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC34401z0) this.f212313a.get(), dagger.internal.g.a(w.a(this.f212314b)), (ProfileCreateExtendedFlow) this.f212315c.get(), (r60.d) this.f212316d.get());
    }
}
