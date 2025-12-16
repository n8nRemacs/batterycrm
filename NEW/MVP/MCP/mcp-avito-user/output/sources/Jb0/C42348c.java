package jb0;

import android.app.Application;
import com.avito.android.photo_storage.i;
import com.avito.android.photo_storage.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileManagementImageModule_ProvideBitmapFileProviderFactory.java */
@e
@y
@x
/* renamed from: jb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42348c implements h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C42347b f405665a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f405666b;

    /* renamed from: c, reason: collision with root package name */
    public final k f405667c;

    public C42348c(C42347b c42347b, Provider provider, k kVar) {
        this.f405665a = c42347b;
        this.f405666b = provider;
        this.f405667c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f405666b.get();
        i iVar = (i) this.f405667c.get();
        this.f405665a.getClass();
        return new com.avito.android.photo_picker.converter.c(application.getApplicationContext(), iVar);
    }
}
