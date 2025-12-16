package com.avito.android.stories.mvi;

import com.avito.android.stories.StoriesArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StoriesInitialStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f285291a;

    public m(dagger.internal.l lVar) {
        this.f285291a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((StoriesArguments) this.f285291a.f393949a);
    }
}
