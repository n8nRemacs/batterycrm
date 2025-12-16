package Xf0;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendPushTokenStorageImpl_Factory.java */
@e
@y
@x
/* renamed from: Xf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C17002b implements h<C17001a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f19007a;

    public C17002b(C30214v6 c30214v6) {
        this.f19007a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C17001a((l) this.f19007a.get());
    }
}
