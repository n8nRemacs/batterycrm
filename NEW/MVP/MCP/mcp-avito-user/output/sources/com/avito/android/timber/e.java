package com.avito.android.timber;

import com.avito.android.server_time.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimberBufferingTree_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f301451a;

    public e(Provider<f> provider) {
        this.f301451a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f301451a.get());
    }
}
