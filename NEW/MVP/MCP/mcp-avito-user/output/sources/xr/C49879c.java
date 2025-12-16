package xR;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsApi_Module_ProvideLfLevelsApiFactory.java */
@e
@y
@x
/* renamed from: xR.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49879c implements h<InterfaceC49877a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f442506a;

    public C49879c(f fVar) {
        this.f442506a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f442506a.get();
        C49878b.f442505a.getClass();
        InterfaceC49877a interfaceC49877a = (InterfaceC49877a) r02.create(InterfaceC49877a.class);
        t.d(interfaceC49877a);
        return interfaceC49877a;
    }
}
