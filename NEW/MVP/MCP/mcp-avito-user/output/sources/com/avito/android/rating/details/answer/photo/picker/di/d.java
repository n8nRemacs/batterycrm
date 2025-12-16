package com.avito.android.rating.details.answer.photo.picker.di;

import android.app.Application;
import com.avito.android.photo_list_view.C33217k;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoPickerModule_ProvideImageListInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<InterfaceC33214h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f246781a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246782b;

    /* renamed from: c, reason: collision with root package name */
    public final u f246783c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Application> f246784d;

    public d(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f246781a = lVar;
        this.f246782b = provider;
        this.f246783c = uVar;
        this.f246784d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments = (RatingAddAnswerPhotoArguments) this.f246781a.f393949a;
        InterfaceC35745a5 interfaceC35745a5 = this.f246782b.get();
        InterfaceC33220n interfaceC33220n = (InterfaceC33220n) this.f246783c.get();
        Application application = this.f246784d.get();
        a.f246778a.getClass();
        return new C33217k(ratingAddAnswerPhotoArguments.f246622d, interfaceC35745a5, interfaceC33220n, application.getContentResolver(), false, 16, null);
    }
}
