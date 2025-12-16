package com.avito.android.travel_file_download_deeplink.mvi;

import android.app.DownloadManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FileDownloadInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f301834a;

    /* renamed from: b, reason: collision with root package name */
    public final m f301835b;

    public r(dagger.internal.u uVar, m mVar) {
        this.f301834a = uVar;
        this.f301835b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((DownloadManager) this.f301834a.get(), (k) this.f301835b.get());
    }
}
