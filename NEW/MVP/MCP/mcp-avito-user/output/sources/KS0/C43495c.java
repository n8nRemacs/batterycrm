package ks0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SerpApi_Module_ProvideSerpApiFactory.java */
@e
@y
@x
/* renamed from: ks0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43495c implements h<InterfaceC43493a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f413257a;

    public C43495c(f fVar) {
        this.f413257a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f413257a.get();
        C43494b.f413256a.getClass();
        InterfaceC43493a interfaceC43493a = (InterfaceC43493a) r02.create(InterfaceC43493a.class);
        t.d(interfaceC43493a);
        return interfaceC43493a;
    }
}
