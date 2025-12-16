package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.objects.ObjectFillFormScreenParams;

/* compiled from: ObjectSupportModule_ProvideObjectParameterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class G implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239555a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239556b;

    public G(y yVar, dagger.internal.l lVar) {
        this.f239555a = yVar;
        this.f239556b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ObjectFillFormScreenParams objectFillFormScreenParams = (ObjectFillFormScreenParams) this.f239556b.f393949a;
        this.f239555a.getClass();
        String str = objectFillFormScreenParams.f237557b;
        dagger.internal.t.d(str);
        return str;
    }
}
