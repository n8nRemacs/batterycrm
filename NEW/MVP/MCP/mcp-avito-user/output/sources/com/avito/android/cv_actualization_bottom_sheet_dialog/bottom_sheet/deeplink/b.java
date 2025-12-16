package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationBottomSheetDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f131461a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f131462b;

    public b(dv.b bVar, dv.b bVar2) {
        this.f131461a = bVar;
        this.f131462b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f131461a.get(), (a.f) this.f131462b.get());
    }
}
