package com.avito.android.di.module;

import android.app.Application;
import com.google.android.gms.common.C36687f;

/* compiled from: GooglePlayServicesInfoModule_ProvideGooglePlayServicesInfoFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.k5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30093k5 implements dagger.internal.h<com.avito.android.util.I1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144365a;

    public C30093k5(dagger.internal.u uVar) {
        this.f144365a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144365a.get();
        int i12 = C30082j5.f144353a;
        return new com.avito.android.util.K1(application, C36687f.f349287e);
    }
}
