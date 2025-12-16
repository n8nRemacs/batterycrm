package com.avito.android.edit_basic_info;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: EditBasicInfoViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.edit_basic_info.mvi.i f146204a;

    public t(com.avito.android.edit_basic_info.mvi.i iVar) {
        this.f146204a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.edit_basic_info.mvi.h hVar = (com.avito.android.edit_basic_info.mvi.h) this.f146204a.get();
        i2.f411430a.getClass();
        return new s(hVar, i2.a.f411433c);
    }
}
