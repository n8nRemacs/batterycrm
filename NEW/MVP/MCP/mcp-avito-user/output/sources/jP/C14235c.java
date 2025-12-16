package Jp;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealApi_Module_ProvideComfortableDealApiFactory.java */
@e
@y
@x
/* renamed from: Jp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14235c implements h<InterfaceC14233a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f9161a;

    public C14235c(f fVar) {
        this.f9161a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f9161a.get();
        C14234b.f9160a.getClass();
        InterfaceC14233a interfaceC14233a = (InterfaceC14233a) r02.create(InterfaceC14233a.class);
        t.d(interfaceC14233a);
        return interfaceC14233a;
    }
}
