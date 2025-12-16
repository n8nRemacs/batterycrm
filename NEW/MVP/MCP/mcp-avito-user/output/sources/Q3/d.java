package q3;

import com.avito.android.remote.R0;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AbExperimentsApi_Module_ProvideAbExperimentsApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<InterfaceC47190b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f429003a;

    public d(dagger.internal.f fVar) {
        this.f429003a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f429003a.get();
        C47191c.f429002a.getClass();
        InterfaceC47190b interfaceC47190b = (InterfaceC47190b) r02.create(InterfaceC47190b.class);
        t.d(interfaceC47190b);
        return interfaceC47190b;
    }
}
