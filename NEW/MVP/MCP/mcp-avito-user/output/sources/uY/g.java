package Uy;

import com.avito.android.account.G;
import com.avito.android.employee_mode_impl.manager.state.k;
import com.avito.android.remote.model.ProfileInfo;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeModeModule_ProvideEmployeeModeStateHolderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.employee_mode_impl.manager.storage.b f16809a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f16810b;

    public g(com.avito.android.employee_mode_impl.manager.storage.b bVar, Provider provider) {
        this.f16809a = bVar;
        this.f16810b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.employee_mode_impl.manager.storage.c cVar = (com.avito.android.employee_mode_impl.manager.storage.c) this.f16809a.get();
        G g12 = this.f16810b.get();
        C15586c.f16805a.getClass();
        ProfileInfo profileInfoE = g12.e();
        return new k(cVar, new k.a(profileInfoE.getUserId(), profileInfoE.getUserHashId()));
    }
}
