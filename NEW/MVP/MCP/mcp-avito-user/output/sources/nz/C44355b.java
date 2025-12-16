package nZ;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PrefUnreadMessengerCounterStorage_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: nZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44355b implements h<C44354a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f415175a;

    public C44355b(C30214v6 c30214v6) {
        this.f415175a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44354a((l) this.f415175a.get());
    }
}
