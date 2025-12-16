package Ie;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoLoansCabinetApi_Module_ProvideAutoLoansCabinetApiFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC14063a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f8222a;

    public c(f fVar) {
        this.f8222a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f8222a.get();
        C14064b.f8221a.getClass();
        InterfaceC14063a interfaceC14063a = (InterfaceC14063a) r02.create(InterfaceC14063a.class);
        t.d(interfaceC14063a);
        return interfaceC14063a;
    }
}
