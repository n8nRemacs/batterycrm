package bQ0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WorkProfileApi_Module_ProvideWorkProfileApiFactory.java */
@e
@y
@x
/* renamed from: bQ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25547c implements h<InterfaceC25545a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57071a;

    public C25547c(f fVar) {
        this.f57071a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57071a.get();
        C25546b.f57070a.getClass();
        InterfaceC25545a interfaceC25545a = (InterfaceC25545a) r02.create(InterfaceC25545a.class);
        t.d(interfaceC25545a);
        return interfaceC25545a;
    }
}
