package com.avito.android.extended_profile_selection_create.image.mvi;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSetSelectionImageActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151779a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f151780b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.extended_profile_selection_create.image.f f151781c;

    /* renamed from: d, reason: collision with root package name */
    public final u f151782d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f151783e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f151784f;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.extended_profile_selection_create.image.f fVar, u uVar, Provider provider, Provider provider2) {
        this.f151779a = lVar;
        this.f151780b = lVar2;
        this.f151781c = fVar;
        this.f151782d = uVar;
        this.f151783e = provider;
        this.f151784f = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Resources) this.f151779a.f393949a, (ExtendedProfileSetSelectionImageConfig) this.f151780b.f393949a, (com.avito.android.extended_profile_selection_create.image.e) this.f151781c.get(), (com.avito.android.profile_management_core.images.a) this.f151782d.get(), this.f151783e.get(), this.f151784f.get());
    }
}
