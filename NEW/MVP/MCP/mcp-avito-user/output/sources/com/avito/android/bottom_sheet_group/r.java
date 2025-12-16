package com.avito.android.bottom_sheet_group;

import com.avito.android.bottom_sheet_group.BottomSheetGroupParameterWrapper;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;

/* compiled from: BottomSheetGroupParameterWrapper_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<BottomSheetGroupParameterWrapper> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f107418a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f107419b;

    public r(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f107418a = lVar;
        this.f107419b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new BottomSheetGroupParameterWrapper((BottomSheetGroupParameter) this.f107418a.f393949a, (BottomSheetGroupParameterWrapper.ParameterState) this.f107419b.f393949a);
    }
}
