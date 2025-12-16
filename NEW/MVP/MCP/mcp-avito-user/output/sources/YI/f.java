package yI;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppendingRetryModule_ProvideAppendingRetryItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<com.avito.android.home.appending_item.retry.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f443018a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.home.appending_item.retry.f> f443019b;

    public f(d dVar, Provider<com.avito.android.home.appending_item.retry.f> provider) {
        this.f443018a = dVar;
        this.f443019b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.appending_item.retry.f fVar = this.f443019b.get();
        this.f443018a.getClass();
        return new com.avito.android.home.appending_item.retry.d(fVar);
    }
}
