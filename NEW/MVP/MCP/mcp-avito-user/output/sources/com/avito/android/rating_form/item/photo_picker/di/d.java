package com.avito.android.rating_form.item.photo_picker.di;

import android.app.Application;
import com.avito.android.photo_list_view.C33217k;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.photo_list_view.r;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPhotoPickerModule_Companion_ProvideImageListInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<InterfaceC33214h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f248517a;

    /* renamed from: b, reason: collision with root package name */
    public final r f248518b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Application> f248519c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f248520d;

    public d(Provider provider, r rVar, Provider provider2, dagger.internal.l lVar) {
        this.f248517a = provider;
        this.f248518b = rVar;
        this.f248519c = provider2;
        this.f248520d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f248517a.get();
        InterfaceC33220n interfaceC33220n = (InterfaceC33220n) this.f248518b.get();
        Application application = this.f248519c.get();
        String str = (String) this.f248520d.f393949a;
        b.f248514a.getClass();
        return new C33217k(str, interfaceC35745a5, interfaceC33220n, application.getContentResolver(), false, 16, null);
    }
}
