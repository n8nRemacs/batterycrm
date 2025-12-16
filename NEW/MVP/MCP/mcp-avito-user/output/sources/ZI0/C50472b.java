package zI0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileHeaderListListener_Factory.java */
@e
@y
@x
/* renamed from: zI0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50472b implements h<C50471a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f444012a;

    public C50472b(u uVar) {
        this.f444012a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50471a((InterfaceC50474d) this.f444012a.get());
    }
}
