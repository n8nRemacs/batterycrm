package Qr;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptApi_Module_ProvideCptApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC14925a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f14018a;

    public c(f fVar) {
        this.f14018a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f14018a.get();
        C14926b.f14017a.getClass();
        InterfaceC14925a interfaceC14925a = (InterfaceC14925a) r02.create(InterfaceC14925a.class);
        t.d(interfaceC14925a);
        return interfaceC14925a;
    }
}
