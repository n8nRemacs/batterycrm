package az;

import com.avito.android.employee_mode_impl.manager.state.C30339b;
import com.avito.android.employee_mode_impl.manager.state.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmployeeModeAccountManagerImpl_Factory.java */
@e
@y
@x
/* renamed from: az.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C24198c implements h<C24197b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f56807a;

    public C24198c(j jVar) {
        this.f56807a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C24197b((C30339b) this.f56807a.get());
    }
}
