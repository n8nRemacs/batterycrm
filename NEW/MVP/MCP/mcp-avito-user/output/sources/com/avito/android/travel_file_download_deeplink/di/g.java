package com.avito.android.travel_file_download_deeplink.di;

import android.app.DownloadManager;
import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileDownloadModule_ProvideDownloadManagerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<DownloadManager> {

    /* renamed from: a, reason: collision with root package name */
    public final f f301758a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f301759b;

    public g(f fVar, Provider<Context> provider) {
        this.f301758a = fVar;
        this.f301759b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f301759b.get();
        this.f301758a.getClass();
        return (DownloadManager) androidx.core.content.d.getSystemService(context, DownloadManager.class);
    }
}
