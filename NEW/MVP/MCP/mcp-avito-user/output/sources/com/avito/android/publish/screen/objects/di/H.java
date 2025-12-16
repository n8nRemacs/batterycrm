package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.objects.ObjectFillFormScreenParams;

/* compiled from: ObjectSupportModule_ProvideObjectParameterIndexFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class H implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239557a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239558b;

    public H(y yVar, dagger.internal.l lVar) {
        this.f239557a = yVar;
        this.f239558b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ObjectFillFormScreenParams objectFillFormScreenParams = (ObjectFillFormScreenParams) this.f239558b.f393949a;
        this.f239557a.getClass();
        return objectFillFormScreenParams.f237558c;
    }
}
