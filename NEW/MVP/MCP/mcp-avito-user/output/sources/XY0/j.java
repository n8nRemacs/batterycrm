package Xy0;

import androidx.fragment.app.FragmentManager;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f19179a;

    public j(u uVar) {
        this.f19179a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((FragmentManager) this.f19179a.get());
    }
}
