package com.avito.android.rating.details.answer.photo.picker.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.O;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.t;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoPickerModule_ProvideImageListPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33214h> f246785a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s.b> f246786b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246787c;

    /* renamed from: d, reason: collision with root package name */
    public final l f246788d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f246789e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f246790f;

    public e(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f246785a = provider;
        this.f246786b = provider2;
        this.f246787c = provider3;
        this.f246788d = lVar;
        this.f246789e = provider4;
        this.f246790f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33214h interfaceC33214h = this.f246785a.get();
        s.b bVar = this.f246786b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f246787c.get();
        RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = (RatingAddAnswerPhotoFragment) this.f246788d.f393949a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f246789e.get();
        InterfaceC28373a interfaceC28373a = this.f246790f.get();
        a.f246778a.getClass();
        return new t(interfaceC33214h, bVar, null, interfaceC35745a5, ratingAddAnswerPhotoFragment, new com.avito.android.rating.details.answer.photo.picker.a(), new O(interfaceC28373a, aVar));
    }
}
