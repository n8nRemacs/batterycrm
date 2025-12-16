package dH;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TutorialsApi_Module_ProvideTutorialsApiFactory.java */
@e
@y
@x
/* renamed from: dH.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39582c implements h<InterfaceC39580a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f393777a;

    public C39582c(f fVar) {
        this.f393777a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f393777a.get();
        C39581b.f393776a.getClass();
        InterfaceC39580a interfaceC39580a = (InterfaceC39580a) r02.create(InterfaceC39580a.class);
        t.d(interfaceC39580a);
        return interfaceC39580a;
    }
}
