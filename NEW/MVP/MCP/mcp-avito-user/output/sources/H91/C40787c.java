package h91;

import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateChannelByItemApicoResponseConverter_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: h91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40787c implements dagger.internal.h<C40785a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f397030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f397031b;

    public C40787c(dagger.internal.f fVar, Provider provider) {
        this.f397030a = fVar;
        this.f397031b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40785a((com.avito.android.deep_linking.x) this.f397030a.get(), this.f397031b.get());
    }
}
