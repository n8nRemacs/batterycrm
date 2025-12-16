package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.remote.A1;
import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212366a;

    /* renamed from: b, reason: collision with root package name */
    public final u f212367b;

    /* renamed from: c, reason: collision with root package name */
    public final u f212368c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.h f212369d;

    /* renamed from: e, reason: collision with root package name */
    public final u f212370e;

    /* renamed from: f, reason: collision with root package name */
    public final u f212371f;

    public r(u uVar, u uVar2, u uVar3, dagger.internal.h hVar, u uVar4, u uVar5) {
        this.f212366a = uVar;
        this.f212367b = uVar2;
        this.f212368c = uVar3;
        this.f212369d = hVar;
        this.f212370e = uVar4;
        this.f212371f = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((InterfaceC34401z0) this.f212366a.get(), (A1) this.f212367b.get(), dagger.internal.g.a(w.a(this.f212368c)), (ProfileCreateExtendedFlow) this.f212369d.get(), (InterfaceC28373a) this.f212370e.get(), (r60.d) this.f212371f.get());
    }
}
