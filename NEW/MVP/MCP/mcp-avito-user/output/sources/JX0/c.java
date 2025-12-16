package jx0;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SocialNotificationStateStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C42442b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f405896a;

    public c(C30214v6 c30214v6) {
        this.f405896a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42442b((l) this.f405896a.get());
    }
}
