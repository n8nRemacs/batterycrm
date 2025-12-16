package sM0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionApi_Module_ProvideVasUnionApiFactory.java */
@e
@y
@x
/* renamed from: sM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48075c implements h<InterfaceC48073a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f437625a;

    public C48075c(f fVar) {
        this.f437625a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437625a.get();
        C48074b.f437624a.getClass();
        InterfaceC48073a interfaceC48073a = (InterfaceC48073a) r02.create(InterfaceC48073a.class);
        t.d(interfaceC48073a);
        return interfaceC48073a;
    }
}
