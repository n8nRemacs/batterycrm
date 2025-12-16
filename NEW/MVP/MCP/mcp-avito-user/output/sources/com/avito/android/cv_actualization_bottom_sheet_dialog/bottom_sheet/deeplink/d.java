package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.deeplink;

import com.avito.android.cv_actualization_bottom_sheet_dialog.deeplink.JsxCvActualizationBottomSheetDeeplink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JsxCvActualizationBottomSheetDeeplinkModule_ProvideJsxCvActualizationBottomSheetDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f131464a;

    public d(b bVar) {
        this.f131464a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f131464a;
        c.f131463a.getClass();
        return new C43834a(JsxCvActualizationBottomSheetDeeplink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JsxCvActualizationBottomSheetDeeplink.class), bVar));
    }
}
