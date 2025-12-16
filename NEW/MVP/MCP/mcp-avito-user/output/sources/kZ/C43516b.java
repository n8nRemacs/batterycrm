package kz;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.employee_stub_impl.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmployeeOffLimitLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: kz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43516b implements h<C43515a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f413344a;

    /* renamed from: b, reason: collision with root package name */
    public final i f413345b;

    public C43516b(dv.b bVar, i iVar) {
        this.f413344a = bVar;
        this.f413345b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43515a((a.InterfaceC4053a) this.f413344a.get(), (com.avito.android.employee_stub_public.a) this.f413345b.get());
    }
}
