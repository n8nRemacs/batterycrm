package io0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SafetyApi_Module_ProvideSafetyApiFactory.java */
@e
@y
@x
/* renamed from: io0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42084c implements h<InterfaceC42082a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f405237a;

    public C42084c(f fVar) {
        this.f405237a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f405237a.get();
        C42083b.f405236a.getClass();
        InterfaceC42082a interfaceC42082a = (InterfaceC42082a) r02.create(InterfaceC42082a.class);
        t.d(interfaceC42082a);
        return interfaceC42082a;
    }
}
