package com.avito.android.extended_profile_selection_create.image;

import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSetSelectionImageInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151735a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D0> f151736b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f151737c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f151738d;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f151735a = lVar;
        this.f151736b = provider;
        this.f151737c = provider2;
        this.f151738d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((ExtendedProfileSetSelectionImageConfig) this.f151735a.f393949a, dagger.internal.g.a(w.a(this.f151736b)), dagger.internal.g.a(w.a(this.f151737c)), this.f151738d.get());
    }
}
