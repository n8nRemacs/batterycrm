package cp;

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
/* renamed from: cp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39389c implements h<InterfaceC39387a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f392952a;

    public C39389c(f fVar) {
        this.f392952a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f392952a.get();
        C39388b.f392951a.getClass();
        InterfaceC39387a interfaceC39387a = (InterfaceC39387a) r02.create(InterfaceC39387a.class);
        t.d(interfaceC39387a);
        return interfaceC39387a;
    }
}
