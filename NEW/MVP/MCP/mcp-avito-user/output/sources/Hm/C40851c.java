package hM;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacProblemsStorageImpl_Factory.java */
@e
@y
@x
/* renamed from: hM.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40851c implements h<C40850b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f397184a;

    public C40851c(C30214v6 c30214v6) {
        this.f397184a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40850b((l) this.f397184a.get());
    }
}
