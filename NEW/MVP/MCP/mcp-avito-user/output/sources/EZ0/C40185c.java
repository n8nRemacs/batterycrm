package ez0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersApi_Module_ProvideStrSellerOrdersApiFactory.java */
@e
@y
@x
/* renamed from: ez0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40185c implements h<InterfaceC40183a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f395495a;

    public C40185c(f fVar) {
        this.f395495a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f395495a.get();
        C40184b.f395494a.getClass();
        InterfaceC40183a interfaceC40183a = (InterfaceC40183a) r02.create(InterfaceC40183a.class);
        t.d(interfaceC40183a);
        return interfaceC40183a;
    }
}
