package Ck;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasBundlesApi_Module_ProvideVasBundlesApiFactory.java */
@e
@y
@x
/* renamed from: Ck.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13316c implements h<InterfaceC13314a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f2648a;

    public C13316c(f fVar) {
        this.f2648a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f2648a.get();
        C13315b.f2647a.getClass();
        InterfaceC13314a interfaceC13314a = (InterfaceC13314a) r02.create(InterfaceC13314a.class);
        t.d(interfaceC13314a);
        return interfaceC13314a;
    }
}
