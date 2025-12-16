package com.avito.android.photo_picker.legacy.di;

import com.avito.android.analytics.b0;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_picker.legacy.C33245g;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.photo_picker.legacy.InterfaceC33244f;
import com.avito.android.photo_picker.legacy.di.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvidePhotoPickerPresenter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<InterfaceC33244f> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219756a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f219757b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f219758c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33243e> f219759d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.device_orientation.i> f219760e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f219761f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f219762g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.computer_vision.a> f219763h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f219764i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<b0> f219765j;

    /* renamed from: k, reason: collision with root package name */
    public final m f219766k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<HM.a> f219767l;

    public p(f fVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.u uVar, Provider provider6, Provider provider7, Provider provider8, m mVar, Provider provider9) {
        this.f219756a = fVar;
        this.f219757b = provider;
        this.f219758c = provider2;
        this.f219759d = provider3;
        this.f219760e = provider4;
        this.f219761f = provider5;
        this.f219762g = uVar;
        this.f219763h = provider6;
        this.f219764i = provider7;
        this.f219765j = provider8;
        this.f219766k = mVar;
        this.f219767l = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f219757b.get();
        com.avito.konveyor.adapter.a aVar2 = this.f219758c.get();
        InterfaceC33243e interfaceC33243e = this.f219759d.get();
        com.avito.android.device_orientation.i iVar = this.f219760e.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.j) this.f219761f).get();
        com.avito.android.photo_picker.legacy.y yVar = (com.avito.android.photo_picker.legacy.y) this.f219762g.get();
        com.avito.android.computer_vision.a aVar3 = (com.avito.android.computer_vision.a) ((a.c.b) this.f219763h).get();
        InterfaceC35863o4 interfaceC35863o4 = (InterfaceC35863o4) ((a.c.i) this.f219764i).get();
        b0 b0Var = (b0) ((a.c.h) this.f219765j).get();
        InterfaceC30978i interfaceC30978i = (InterfaceC30978i) this.f219766k.get();
        HM.a aVarD7 = ((a.c.f) this.f219767l).f219712a.d7();
        f fVar = this.f219756a;
        return new C33245g(aVar, aVar2, interfaceC33243e, iVar, yVar, interfaceC35745a5, fVar.f219722f, fVar.f219723g, aVar3, interfaceC35863o4, b0Var, fVar.f219720d, interfaceC30978i, aVarD7, fVar.f219724h);
    }
}
