package com.avito.android.photo_picker.legacy.di;

import com.avito.android.analytics.b0;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.photo_picker.legacy.X;
import com.avito.android.photo_picker.legacy.di.a;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import w80.C49468b;

/* compiled from: PhotoPickerModule_ProvidePhotoPickerInteractor$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<InterfaceC33243e> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219746a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f219747b;

    /* renamed from: c, reason: collision with root package name */
    public final C49468b f219748c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f219749d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<D70.a> f219750e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<b0> f219751f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.computer_vision.a> f219752g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f219753h;

    /* renamed from: i, reason: collision with root package name */
    public final N70.d f219754i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.photo_info.d f219755j;

    public o(f fVar, Provider provider, C49468b c49468b, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, N70.d dVar, com.avito.android.photo_info.d dVar2) {
        this.f219746a = fVar;
        this.f219747b = provider;
        this.f219748c = c49468b;
        this.f219749d = provider2;
        this.f219750e = provider3;
        this.f219751f = provider4;
        this.f219752g = provider5;
        this.f219753h = provider6;
        this.f219754i = dVar;
        this.f219755j = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_cache.b bVar = (com.avito.android.photo_cache.b) ((a.c.g) this.f219747b).get();
        SharedPhotosStorage sharedPhotosStorage = (SharedPhotosStorage) this.f219748c.get();
        com.avito.android.photo_picker.converter.b bVar2 = this.f219749d.get();
        D70.a aVar = this.f219750e.get();
        b0 b0Var = (b0) ((a.c.h) this.f219751f).get();
        com.avito.android.computer_vision.a aVar2 = (com.avito.android.computer_vision.a) ((a.c.b) this.f219752g).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.j) this.f219753h).get();
        N70.b bVar3 = (N70.b) this.f219754i.get();
        com.avito.android.photo_info.b bVar4 = (com.avito.android.photo_info.b) this.f219755j.get();
        f fVar = this.f219746a;
        return new X(bVar, sharedPhotosStorage, bVar2, aVar, fVar.f219718b, fVar.f219719c, b0Var, aVar2, interfaceC35745a5, bVar3, bVar4, fVar.f219721e);
    }
}
