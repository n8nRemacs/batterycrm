package ei;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinGroupingProcessorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C40109c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f395320a;

    public d(Provider<Context> provider) {
        this.f395320a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40109c(this.f395320a.get());
    }
}
