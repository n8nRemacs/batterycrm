package iF0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelPaymentSelectorApi_Module_ProvideTravelPaymentSelectorApiFactory.java */
@e
@y
@x
/* renamed from: iF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41282c implements h<InterfaceC41280a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398458a;

    public C41282c(f fVar) {
        this.f398458a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398458a.get();
        C41281b.f398457a.getClass();
        InterfaceC41280a interfaceC41280a = (InterfaceC41280a) r02.create(InterfaceC41280a.class);
        t.d(interfaceC41280a);
        return interfaceC41280a;
    }
}
