package dm;

import com.avito.android.calltracking_core.f;
import com.avito.android.calltracking_core.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CallTrackingCounterModule_ProvideCallTrackingCoreInteractorFactory.java */
@e
@y
@x
/* renamed from: dm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39753b implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f394036a;

    public C39753b(u uVar) {
        this.f394036a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.calltracking_core.a aVar = (com.avito.android.calltracking_core.a) this.f394036a.get();
        C39752a.f394035a.getClass();
        return new g(aVar);
    }
}
