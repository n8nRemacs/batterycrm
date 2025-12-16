package GY;

import com.avito.android.messenger.channels.filter.f;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelsFilterHeaderStateFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f6567a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<JY.a> f6568b;

    public e(u uVar, Provider provider) {
        this.f6567a = uVar;
        this.f6568b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f6567a.get(), this.f6568b.get());
    }
}
