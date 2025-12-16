package vc;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import uc.C49028c;
import uc.InterfaceC49026a;

/* compiled from: MyTrackerModule_ProvideMyTrackerDeferredDeeplinkConsumerFactory.java */
@e
@y
@x
/* renamed from: vc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49299b implements h<InterfaceC49026a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49298a f440887a;

    /* renamed from: b, reason: collision with root package name */
    public final f f440888b;

    public C49299b(C49298a c49298a, f fVar) {
        this.f440887a = c49298a;
        this.f440888b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f440888b.get();
        this.f440887a.getClass();
        return new C49028c(xVar);
    }
}
