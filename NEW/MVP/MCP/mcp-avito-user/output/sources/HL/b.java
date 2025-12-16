package HL;

import com.avito.android.permissions.z;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacMicOnboardingLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f7043a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z> f7044b;

    public b(f fVar, Provider provider) {
        this.f7043a = fVar;
        this.f7044b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deeplink_handler.handler.composite.a) this.f7043a.get(), this.f7044b.get());
    }
}
