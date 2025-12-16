package com.avito.android.messenger.deeplink.bottom_sheet;

import com.avito.android.messenger.deeplink.bottom_sheet.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BottomSheetInputViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final i f195468a;

    public e(i iVar) {
        this.f195468a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.messenger.deeplink.bottom_sheet.mvi.h) this.f195468a.get(), null, 2, null);
    }
}
