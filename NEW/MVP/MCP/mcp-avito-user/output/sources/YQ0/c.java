package Yq0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerRoomApi_Module_ProvideSellerRoomApiFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC18319a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19701a;

    public c(f fVar) {
        this.f19701a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19701a.get();
        b.f19700a.getClass();
        InterfaceC18319a interfaceC18319a = (InterfaceC18319a) r02.create(InterfaceC18319a.class);
        t.d(interfaceC18319a);
        return interfaceC18319a;
    }
}
