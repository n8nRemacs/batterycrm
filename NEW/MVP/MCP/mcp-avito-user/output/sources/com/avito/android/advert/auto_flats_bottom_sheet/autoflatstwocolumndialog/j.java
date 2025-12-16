package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import Zf.InterfaceC19551a;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.z;
import com.avito.android.remote.model.model_card.ModelCardInfo;
import javax.inject.Provider;

/* compiled from: AutoFlatsTwoColumnDialogInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19551a> f68701a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f68702b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f68701a = provider;
        this.f68702b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC19551a) ((z.b.a) this.f68701a).get(), (ModelCardInfo) this.f68702b.f393949a);
    }
}
