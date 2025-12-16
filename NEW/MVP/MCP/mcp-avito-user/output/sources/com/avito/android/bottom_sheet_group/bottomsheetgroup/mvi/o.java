package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi;

import com.avito.android.bottom_sheet_group.s;
import com.avito.android.bottom_sheet_group.t;
import com.avito.android.bottom_sheet_group.w;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BottomSheetGroupReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bottom_sheet_group.x f107288a;

    /* renamed from: b, reason: collision with root package name */
    public final t f107289b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f107290c;

    public o(com.avito.android.bottom_sheet_group.x xVar, t tVar, dagger.internal.l lVar) {
        this.f107288a = xVar;
        this.f107289b = tVar;
        this.f107290c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f107288a.getClass();
        return new n(new w(), (s) this.f107289b.get(), (BottomSheetGroupParameter) this.f107290c.f393949a);
    }
}
