package com.avito.android.publish.objects.di;

import android.app.Application;
import com.avito.android.photo_list_view.C33217k;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: ImageListUploadModule_ProvideImageListInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33924g implements dagger.internal.h<InterfaceC33214h> {

    /* renamed from: a, reason: collision with root package name */
    public final C33921d f237994a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f237995b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f237996c;

    /* renamed from: d, reason: collision with root package name */
    public final C33925h f237997d;

    public C33924g(C33921d c33921d, dagger.internal.u uVar, dagger.internal.u uVar2, C33925h c33925h) {
        this.f237994a = c33921d;
        this.f237995b = uVar;
        this.f237996c = uVar2;
        this.f237997d = c33925h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f237995b.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f237996c.get();
        InterfaceC33220n interfaceC33220n = (InterfaceC33220n) this.f237997d.get();
        C33921d c33921d = this.f237994a;
        c33921d.getClass();
        return new C33217k(c33921d.f237986b, interfaceC35745a5, interfaceC33220n, application.getContentResolver(), false, 16, null);
    }
}
