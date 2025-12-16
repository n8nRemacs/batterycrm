package com.avito.android.di.module;

import com.avito.android.deeplink.PhotoPickerDeepLink;
import lv.C43834a;

/* compiled from: PhotoPickerDeepLinkModule_ProvidePhotoPickerDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K6 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.photo_picker.deeplink.b f144032a;

    public K6(com.avito.android.photo_picker.deeplink.b bVar) {
        this.f144032a = bVar;
    }

    public static C43834a a(com.avito.android.photo_picker.deeplink.b bVar) {
        J6.f144019a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PhotoPickerDeepLink.class, new com.avito.android.photo_picker.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhotoPickerDeepLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f144032a);
    }
}
