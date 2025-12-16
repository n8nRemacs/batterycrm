package dy0;

import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: StrBookingDiffUtilCallback_Factory.java */
@e
@y
@x
/* renamed from: dy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39828b implements h<C39827a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f394184a;

    public C39828b(A a12) {
        this.f394184a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39827a((Set) this.f394184a.get());
    }
}
