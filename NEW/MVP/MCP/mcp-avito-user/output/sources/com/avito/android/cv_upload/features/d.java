package com.avito.android.cv_upload.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvUploadFeatureModule_ProvideCvUploadFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f131680a;

    public d(Provider<C34161r> provider) {
        this.f131680a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f131680a.get();
        b.f131678a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
