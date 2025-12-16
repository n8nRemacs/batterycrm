package com.avito.android.extended_profile_map.mvi;

import com.avito.android.avito_map.AvitoMapPoint;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: ExtendedProfileMapBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151297a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f151298b;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f151297a = lVar;
        this.f151298b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((AvitoMapPoint) this.f151297a.f393949a, (Set) this.f151298b.f393949a);
    }
}
