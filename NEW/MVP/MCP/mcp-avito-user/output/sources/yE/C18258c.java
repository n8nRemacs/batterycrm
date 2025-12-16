package Ye;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectApi_Module_ProvideAutoSelectApiFactory.java */
@e
@y
@x
/* renamed from: Ye.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18258c implements h<InterfaceC18256a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19605a;

    public C18258c(f fVar) {
        this.f19605a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19605a.get();
        C18257b.f19604a.getClass();
        InterfaceC18256a interfaceC18256a = (InterfaceC18256a) r02.create(InterfaceC18256a.class);
        t.d(interfaceC18256a);
        return interfaceC18256a;
    }
}
