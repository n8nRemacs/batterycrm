package yI;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppendingRetryModule_ProvideAppendingLargeRetryItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<com.avito.android.home.appending_item.retry.b> {

    /* renamed from: a, reason: collision with root package name */
    public final d f443016a;

    /* renamed from: b, reason: collision with root package name */
    public final u f443017b;

    public e(d dVar, u uVar) {
        this.f443016a = dVar;
        this.f443017b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.appending_item.retry.f fVar = (com.avito.android.home.appending_item.retry.f) this.f443017b.get();
        this.f443016a.getClass();
        return new com.avito.android.home.appending_item.retry.b(fVar);
    }
}
