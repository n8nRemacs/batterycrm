package mQ;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationNeedDraftApi_Module_ProvideCvValidationNeedDraftApiFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<InterfaceC44001a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414496a;

    public c(f fVar) {
        this.f414496a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414496a.get();
        b.f414495a.getClass();
        InterfaceC44001a interfaceC44001a = (InterfaceC44001a) r02.create(InterfaceC44001a.class);
        t.d(interfaceC44001a);
        return interfaceC44001a;
    }
}
