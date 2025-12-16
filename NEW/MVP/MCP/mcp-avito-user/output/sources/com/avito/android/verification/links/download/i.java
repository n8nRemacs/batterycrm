package com.avito.android.verification.links.download;

import android.app.DownloadManager;
import dagger.internal.x;
import dagger.internal.y;
import yM0.C50137f;
import yM0.C50139h;

/* compiled from: VerificationDownloadLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C50137f f324216a;

    /* renamed from: b, reason: collision with root package name */
    public final C50139h f324217b;

    public i(C50137f c50137f, C50139h c50139h) {
        this.f324216a = c50137f;
        this.f324217b = c50139h;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((DownloadManager) this.f324217b.get(), (com.avito.android.cookie_provider.e) this.f324216a.get());
    }
}
