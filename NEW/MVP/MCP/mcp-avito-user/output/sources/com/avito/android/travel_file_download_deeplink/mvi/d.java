package com.avito.android.travel_file_download_deeplink.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FileDownloadActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final r f301775a;

    public d(r rVar) {
        this.f301775a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((p) this.f301775a.get());
    }
}
