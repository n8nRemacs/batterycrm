package vc;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import uc.C49034i;
import uc.InterfaceC49033h;

/* compiled from: MyTrackerModule_ProvideMyTrackerReattributionInteractorFactory.java */
@e
@y
@x
/* renamed from: vc.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49301d implements h<InterfaceC49033h> {

    /* renamed from: a, reason: collision with root package name */
    public final C49298a f440892a;

    public C49301d(C49298a c49298a) {
        this.f440892a = c49298a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f440892a.getClass();
        return new C49034i();
    }
}
