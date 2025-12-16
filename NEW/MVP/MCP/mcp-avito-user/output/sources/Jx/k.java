package JX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nM.InterfaceC44291a;

/* compiled from: MainStartOnboardingMiuiProblemSheetCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9019a;

    public k(u uVar) {
        this.f9019a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((InterfaceC44291a) this.f9019a.get());
    }
}
