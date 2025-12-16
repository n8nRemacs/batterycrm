package com.avito.android.passport.profile_add.di;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.domain.interactor.q;
import com.avito.android.passport.profile_add.domain.interactor.r;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PassportAddProfileModule_ProvideCompleteAddProfileInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<com.avito.android.passport.profile_add.domain.interactor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.domain.interactor.g f212289a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.domain.interactor.d f212290b;

    /* renamed from: c, reason: collision with root package name */
    public final r f212291c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.h f212292d;

    public c(com.avito.android.passport.profile_add.domain.interactor.g gVar, com.avito.android.passport.profile_add.domain.interactor.d dVar, r rVar, dagger.internal.h hVar) {
        this.f212289a = gVar;
        this.f212290b = dVar;
        this.f212291c = rVar;
        this.f212292d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.domain.interactor.f fVar = (com.avito.android.passport.profile_add.domain.interactor.f) this.f212289a.get();
        com.avito.android.passport.profile_add.domain.interactor.c cVar = (com.avito.android.passport.profile_add.domain.interactor.c) this.f212290b.get();
        q qVar = (q) this.f212291c.get();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = (ProfileCreateExtendedFlow) this.f212292d.get();
        b.f212288a.getClass();
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport) {
            return fVar;
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile) {
            return cVar;
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification) {
            return qVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
