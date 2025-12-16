package Lt0;

import com.avito.android.J0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ys0.InterfaceC50291b;

/* compiled from: ScheduleRepetitionDaysConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f10172a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC50291b> f10173b;

    public g(Provider<J0> provider, Provider<InterfaceC50291b> provider2) {
        this.f10172a = provider;
        this.f10173b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f10172a.get(), this.f10173b.get());
    }
}
