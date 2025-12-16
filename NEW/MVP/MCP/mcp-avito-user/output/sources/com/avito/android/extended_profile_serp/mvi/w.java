package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;

/* compiled from: ExtendedProfileSerpOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f153065a;

    public w(dagger.internal.l lVar) {
        this.f153065a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((ExtendedProfileSerpConfig) this.f153065a.f393949a);
    }
}
