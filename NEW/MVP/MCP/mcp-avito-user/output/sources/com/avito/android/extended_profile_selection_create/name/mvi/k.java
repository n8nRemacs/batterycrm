package com.avito.android.extended_profile_selection_create.name.mvi;

import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSetSelectionNameOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151926a;

    public k(dagger.internal.l lVar) {
        this.f151926a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((ExtendedProfileSetSelectionNameConfig) this.f151926a.f393949a);
    }
}
