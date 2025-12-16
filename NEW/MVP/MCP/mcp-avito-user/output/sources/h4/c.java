package h4;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertBadgeBarLightConverterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f396995a;

    public c(Provider<Context> provider) {
        this.f396995a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f396995a.get());
    }
}
