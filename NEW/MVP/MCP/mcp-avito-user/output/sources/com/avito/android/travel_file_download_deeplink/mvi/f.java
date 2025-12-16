package com.avito.android.travel_file_download_deeplink.mvi;

import com.avito.android.travel_file_download_deeplink.FileDownloadOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FileDownloadBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f301787a;

    /* renamed from: b, reason: collision with root package name */
    public final r f301788b;

    public f(dagger.internal.l lVar, r rVar) {
        this.f301787a = lVar;
        this.f301788b = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((FileDownloadOpenParams) this.f301787a.f393949a, (p) this.f301788b.get());
    }
}
