package zF0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSellerBannersApi_Module_ProvideTravelSellerBannersApiFactory.java */
@e
@y
@x
/* renamed from: zF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50457c implements h<InterfaceC50455a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f443987a;

    public C50457c(f fVar) {
        this.f443987a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f443987a.get();
        C50456b.f443986a.getClass();
        InterfaceC50455a interfaceC50455a = (InterfaceC50455a) r02.create(InterfaceC50455a.class);
        t.d(interfaceC50455a);
        return interfaceC50455a;
    }
}
