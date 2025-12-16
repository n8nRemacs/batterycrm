package com.avito.android.edit_basic_info.mvi;

import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditBasicInfoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146174a;

    public m(dagger.internal.l lVar) {
        this.f146174a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((EditBasicInfoArguments) this.f146174a.f393949a);
    }
}
