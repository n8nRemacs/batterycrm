package Mh;

import android.app.Application;
import android.content.ContentResolver;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinFileUploaderModule_ProvideContentResolver$_avito_beduin_implFactory.java */
@e
@y
@x
/* renamed from: Mh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14489b implements h<ContentResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final C14488a f10990a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f10991b;

    public C14489b(C14488a c14488a, Provider<Application> provider) {
        this.f10990a = c14488a;
        this.f10991b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f10991b.get();
        this.f10990a.getClass();
        return application.getContentResolver();
    }
}
