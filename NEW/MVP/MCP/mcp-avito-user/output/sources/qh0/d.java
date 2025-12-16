package qH0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertParameterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f429152a;

    public d(u uVar) {
        this.f429152a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC28373a) this.f429152a.get());
    }
}
