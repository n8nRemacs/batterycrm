package k90;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PriceListUxFeedbackStorageImpl_Factory.java */
@e
@y
@x
/* renamed from: k90.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42542c implements h<C42541b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f406113a;

    public C42542c(u uVar) {
        this.f406113a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42541b((l) this.f406113a.get());
    }
}
