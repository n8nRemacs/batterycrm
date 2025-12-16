package yI;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppendingEmptyModule_ProvideAppendingEmptyBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: yI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50117b implements h<com.avito.android.home.appending_item.empty.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C50116a f443013a;

    /* renamed from: b, reason: collision with root package name */
    public final u f443014b;

    public C50117b(C50116a c50116a, u uVar) {
        this.f443013a = c50116a;
        this.f443014b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.appending_item.empty.c cVar = (com.avito.android.home.appending_item.empty.c) this.f443014b.get();
        this.f443013a.getClass();
        return new com.avito.android.home.appending_item.empty.b(cVar);
    }
}
