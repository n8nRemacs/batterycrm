package gH0;

import com.avito.android.util.U;
import com.avito.android.util.W;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AddressPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final W f396420a;

    public d(W w12) {
        this.f396420a = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((U) this.f396420a.get());
    }
}
