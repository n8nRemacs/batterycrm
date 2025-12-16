package AO;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetItemPriceHistoryFormUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321a;

    public b(u uVar) {
        this.f321a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f321a.get());
    }
}
