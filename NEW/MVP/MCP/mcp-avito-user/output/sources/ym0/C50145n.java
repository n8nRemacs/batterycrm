package yM0;

import android.content.Context;
import android.content.pm.PackageManager;
import com.avito.android.di.module.C30102l3;

/* compiled from: VerificationDeepLinkHandlerModule_ProvidePackageManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50145n implements dagger.internal.h<PackageManager> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f443066a;

    public C50145n(C30102l3 c30102l3) {
        this.f443066a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f443066a.get();
        C50134c.f443050a.getClass();
        return context.getPackageManager();
    }
}
