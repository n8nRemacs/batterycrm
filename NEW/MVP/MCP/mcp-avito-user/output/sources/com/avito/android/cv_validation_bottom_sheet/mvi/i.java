package com.avito.android.cv_validation_bottom_sheet.mvi;

import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvValidationBottomSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f131901a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f131902b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cv_validation_bottom_sheet.domain.b f131903c;

    public i(Provider provider, dagger.internal.l lVar, com.avito.android.cv_validation_bottom_sheet.domain.b bVar) {
        this.f131901a = provider;
        this.f131902b = lVar;
        this.f131903c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f131901a.get(), (CvValidationBottomSheetOpenParams) this.f131902b.f393949a, (com.avito.android.cv_validation_bottom_sheet.domain.a) this.f131903c.get());
    }
}
