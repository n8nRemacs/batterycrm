package Si0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReferralContactsApi_Module_ProvideReferralContactsApiFactory.java */
@e
@y
@x
/* renamed from: Si0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15190c implements h<InterfaceC15188a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f15130a;

    public C15190c(f fVar) {
        this.f15130a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f15130a.get();
        C15189b.f15129a.getClass();
        InterfaceC15188a interfaceC15188a = (InterfaceC15188a) r02.create(InterfaceC15188a.class);
        t.d(interfaceC15188a);
        return interfaceC15188a;
    }
}
