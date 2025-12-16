package Zy;

import com.avito.android.employee_mode_impl.manager.state.InterfaceC30338a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeModeHeader_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C19620a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30338a> f20593a;

    public c(Provider<InterfaceC30338a> provider) {
        this.f20593a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C19620a(this.f20593a.get());
    }
}
