package lA0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestAddressesApi_Module_ProvideSuggestAddressesApiFactory.java */
@e
@y
@x
/* renamed from: lA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43612c implements h<InterfaceC43610a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f413577a;

    public C43612c(f fVar) {
        this.f413577a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f413577a.get();
        C43611b.f413576a.getClass();
        InterfaceC43610a interfaceC43610a = (InterfaceC43610a) r02.create(InterfaceC43610a.class);
        t.d(interfaceC43610a);
        return interfaceC43610a;
    }
}
