package cI;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GsmS2BCallActionApi_Module_ProvideGsmS2BCallActionApiFactory.java */
@e
@y
@x
/* renamed from: cI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C27041c implements h<InterfaceC27039a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57805a;

    public C27041c(f fVar) {
        this.f57805a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57805a.get();
        C27040b.f57804a.getClass();
        InterfaceC27039a interfaceC27039a = (InterfaceC27039a) r02.create(InterfaceC27039a.class);
        t.d(interfaceC27039a);
        return interfaceC27039a;
    }
}
