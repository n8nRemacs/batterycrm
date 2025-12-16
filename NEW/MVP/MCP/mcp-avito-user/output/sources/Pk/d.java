package pK;

import com.avito.android.server_time.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CurrentTimeImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f428506a;

    public d(Provider<f> provider) {
        this.f428506a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f428506a.get());
    }
}
