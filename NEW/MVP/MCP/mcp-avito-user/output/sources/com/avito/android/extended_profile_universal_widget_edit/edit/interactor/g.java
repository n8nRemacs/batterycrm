package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Za0.InterfaceC19524a;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import w80.C49468b;

/* compiled from: UniversalWidgetEditInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f153908a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC19524a> f153909b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f153910c;

    /* renamed from: d, reason: collision with root package name */
    public final l f153911d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.f> f153912e;

    /* renamed from: f, reason: collision with root package name */
    public final k f153913f;

    /* renamed from: g, reason: collision with root package name */
    public final C49468b f153914g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.extended_profile_universal_widget_edit.l f153915h;

    public g(Provider provider, Provider provider2, Provider provider3, l lVar, Provider provider4, k kVar, C49468b c49468b, com.avito.android.extended_profile_universal_widget_edit.l lVar2) {
        this.f153908a = provider;
        this.f153909b = provider2;
        this.f153910c = provider3;
        this.f153911d = lVar;
        this.f153912e = provider4;
        this.f153913f = kVar;
        this.f153914g = c49468b;
        this.f153915h = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f153908a);
        h31.e eVarB2 = dagger.internal.g.b(this.f153909b);
        R0 r02 = this.f153910c.get();
        UniversalWidgetEditArguments universalWidgetEditArguments = (UniversalWidgetEditArguments) this.f153911d.f393949a;
        com.avito.android.photo_picker.converter.f fVar = this.f153912e.get();
        j jVar = (j) this.f153913f.get();
        SharedPhotosStorage sharedPhotosStorage = (SharedPhotosStorage) this.f153914g.get();
        this.f153915h.getClass();
        return new d(eVarB, eVarB2, r02, universalWidgetEditArguments, fVar, jVar, sharedPhotosStorage, new com.avito.android.extended_profile_universal_widget_edit.k());
    }
}
