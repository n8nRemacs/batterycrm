package uH0;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SalesContractDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f439875a;

    /* renamed from: b, reason: collision with root package name */
    public final u f439876b;

    public c(u uVar, u uVar2) {
        this.f439875a = uVar;
        this.f439876b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((E) this.f439876b.get(), (InterfaceC28373a) this.f439875a.get());
    }
}
