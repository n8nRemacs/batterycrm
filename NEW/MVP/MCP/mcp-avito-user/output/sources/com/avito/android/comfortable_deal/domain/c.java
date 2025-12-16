package com.avito.android.comfortable_deal.domain;

import com.avito.android.comfortable_deal.repository.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealStageInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f122009a;

    public c(l lVar) {
        this.f122009a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.comfortable_deal.repository.a) this.f122009a.get());
    }
}
