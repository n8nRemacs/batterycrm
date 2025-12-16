package com.avito.android.publish.video_upload;

import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: VideoUploadModule_ProvideVideoUploadInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<InterfaceC34148c> {

    /* renamed from: a, reason: collision with root package name */
    public final k f245555a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f245556b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f245557c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f245558d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f245559e;

    public m(k kVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f245555a = kVar;
        this.f245556b = uVar;
        this.f245557c = uVar2;
        this.f245558d = uVar3;
        this.f245559e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        H0 h02 = (H0) this.f245556b.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f245557c.get();
        Application application = (Application) this.f245558d.get();
        Q1 q12 = (Q1) this.f245559e.get();
        this.f245555a.getClass();
        return new e(h02, interfaceC35745a5, application.getContentResolver(), q12);
    }
}
