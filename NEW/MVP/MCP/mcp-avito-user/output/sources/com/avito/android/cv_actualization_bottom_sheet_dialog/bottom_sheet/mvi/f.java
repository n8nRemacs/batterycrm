package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxActualizationBottomSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f131516a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f131517b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.d f131518c;

    public f(Provider provider, dagger.internal.l lVar, com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.d dVar) {
        this.f131516a = provider;
        this.f131517b = lVar;
        this.f131518c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f131516a.get(), (DeepLink) this.f131517b.f393949a, (com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.c) this.f131518c.get());
    }
}
