package com.avito.android.publish.video_upload;

import com.avito.android.Q1;
import javax.inject.Provider;

/* compiled from: VideoUploadModule_ProvideVideoUploadItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<com.avito.android.publish.items.video_upload.b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f245562a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.video_upload.d> f245563b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f245564c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f245565d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f245566e;

    public n(k kVar, Provider provider, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f245562a = kVar;
        this.f245563b = provider;
        this.f245564c = uVar;
        this.f245565d = uVar2;
        this.f245566e = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.items.video_upload.d dVar = this.f245563b.get();
        com.avito.android.player_holder.a aVar = (com.avito.android.player_holder.a) this.f245564c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f245565d.get();
        Q1 q12 = (Q1) this.f245566e.get();
        this.f245562a.getClass();
        return new com.avito.android.publish.items.video_upload.b(dVar, aVar, aVar2, q12);
    }
}
