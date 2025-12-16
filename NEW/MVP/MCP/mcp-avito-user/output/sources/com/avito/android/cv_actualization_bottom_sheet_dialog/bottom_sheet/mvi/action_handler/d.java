package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler;

import com.avito.android.deep_linking.links.DeepLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import xt.C49995a;
import xt.C49996b;

/* compiled from: JsxActualizationBottomSheetKeepPhoneActionHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C49996b f131493a;

    /* renamed from: b, reason: collision with root package name */
    public final l f131494b;

    /* renamed from: c, reason: collision with root package name */
    public final l f131495c;

    public d(C49996b c49996b, l lVar, l lVar2) {
        this.f131493a = c49996b;
        this.f131494b = lVar;
        this.f131495c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C49995a) this.f131493a.get(), (DeepLink) this.f131494b.f393949a, ((Boolean) this.f131495c.f393949a).booleanValue());
    }
}
