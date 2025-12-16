package com.avito.android.cv_validation_bottom_sheet.mvi;

import com.avito.android.di.module.C30125n4;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationBottomSheetReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final C30125n4 f131918a;

    public r(C30125n4 c30125n4) {
        this.f131918a = c30125n4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.date_time_formatter.b) this.f131918a.get());
    }
}
