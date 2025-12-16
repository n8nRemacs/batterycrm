package de0;

import com.avito.android.remote.H0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditAdvertCloudDataSource_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: de0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39717b implements h<C39716a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f393987a;

    public C39717b(Provider<H0> provider) {
        this.f393987a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39716a(this.f393987a.get());
    }
}
