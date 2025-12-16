package Iz0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersCalendarApi_Module_ProvideStrSellerOrdersCalendarApiFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<InterfaceC14179a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f8693a;

    public c(f fVar) {
        this.f8693a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f8693a.get();
        C14180b.f8692a.getClass();
        InterfaceC14179a interfaceC14179a = (InterfaceC14179a) r02.create(InterfaceC14179a.class);
        t.d(interfaceC14179a);
        return interfaceC14179a;
    }
}
