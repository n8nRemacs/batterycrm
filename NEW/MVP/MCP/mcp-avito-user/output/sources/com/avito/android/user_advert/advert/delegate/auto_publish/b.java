package com.avito.android.user_advert.advert.delegate.auto_publish;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoPublishBlockResourceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f308523a;

    public b(l lVar) {
        this.f308523a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Resources) this.f308523a.f393949a);
    }
}
