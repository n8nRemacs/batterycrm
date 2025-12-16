package com.avito.android.extended_profile_map.bottom_sheet;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileAddressBottomSheetDataConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f151215a;

    public j(l lVar) {
        this.f151215a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Resources) this.f151215a.f393949a);
    }
}
