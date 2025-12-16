package com.avito.android.bottom_sheet_group;

import android.content.res.Resources;

/* compiled from: BottomSheetGroupResourceProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f107421a;

    public t(dagger.internal.l lVar) {
        this.f107421a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s((Resources) this.f107421a.f393949a);
    }
}
