package com.avito.android.extended_profile_serp.di;

import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;
import com.avito.android.remote.model.SearchParamsSegmentParser;

/* compiled from: ExtendedProfileSerpModule_ProvideFromSpaceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152868a;

    public u(dagger.internal.l lVar) {
        this.f152868a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ExtendedProfileSerpConfig extendedProfileSerpConfig = (ExtendedProfileSerpConfig) this.f152868a.f393949a;
        C30538h.f152853a.getClass();
        return SearchParamsSegmentParser.INSTANCE.fromParam(extendedProfileSerpConfig.f152444d).getFromSpace();
    }
}
