package bi0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckerboardApi_Module_ProvideCheckerboardApiFactory.java */
@e
@y
@x
/* renamed from: bi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25657c implements h<InterfaceC25655a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57397a;

    public C25657c(f fVar) {
        this.f57397a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57397a.get();
        C25656b.f57396a.getClass();
        InterfaceC25655a interfaceC25655a = (InterfaceC25655a) r02.create(InterfaceC25655a.class);
        t.d(interfaceC25655a);
        return interfaceC25655a;
    }
}
