package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetStartData;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacEnableBottomSheetReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f227859a;

    public m(dagger.internal.l lVar) {
        this.f227859a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((IacEnableBottomSheetStartData) this.f227859a.f393949a);
    }
}
