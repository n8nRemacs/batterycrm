package Vy;

import com.avito.android.employee_mode_impl.manager.state.InterfaceC30338a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeEnvironmentProvider_Factory.java */
@e
@y
@x
/* renamed from: Vy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15728c implements h<C15726a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30338a> f17531a;

    public C15728c(Provider<InterfaceC30338a> provider) {
        this.f17531a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15726a(this.f17531a.get());
    }
}
