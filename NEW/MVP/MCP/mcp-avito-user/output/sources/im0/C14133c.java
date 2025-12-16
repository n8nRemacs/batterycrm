package Im0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationApi_Module_ProvideReputationApiFactory.java */
@e
@y
@x
/* renamed from: Im0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14133c implements h<InterfaceC14131a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f8537a;

    public C14133c(f fVar) {
        this.f8537a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f8537a.get();
        C14132b.f8536a.getClass();
        InterfaceC14131a interfaceC14131a = (InterfaceC14131a) r02.create(InterfaceC14131a.class);
        t.d(interfaceC14131a);
        return interfaceC14131a;
    }
}
