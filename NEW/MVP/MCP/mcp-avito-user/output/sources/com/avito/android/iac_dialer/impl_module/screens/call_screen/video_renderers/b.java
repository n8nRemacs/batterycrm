package com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers;

import com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacSurfaceViewRendererApi_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f166295a;

    public b(u uVar) {
        this.f166295a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((AvCallsSurfaceViewRendererApi) this.f166295a.get());
    }
}
