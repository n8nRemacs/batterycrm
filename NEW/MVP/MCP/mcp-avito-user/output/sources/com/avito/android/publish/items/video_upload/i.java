package com.avito.android.publish.items.video_upload;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.video_upload.C;
import com.avito.android.publish.video_upload.InterfaceC34147b;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VideoUploadItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34147b> f237300a;

    /* renamed from: b, reason: collision with root package name */
    public final u f237301b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f237302c;

    /* renamed from: d, reason: collision with root package name */
    public final u f237303d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f237304e;

    /* renamed from: f, reason: collision with root package name */
    public final u f237305f;

    /* renamed from: g, reason: collision with root package name */
    public final u f237306g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C> f237307h;

    /* renamed from: i, reason: collision with root package name */
    public final u f237308i;

    public i(Provider provider, u uVar, Provider provider2, u uVar2, Provider provider3, u uVar3, u uVar4, Provider provider4, u uVar5) {
        this.f237300a = provider;
        this.f237301b = uVar;
        this.f237302c = provider2;
        this.f237303d = uVar2;
        this.f237304e = provider3;
        this.f237305f = uVar3;
        this.f237306g = uVar4;
        this.f237307h = provider4;
        this.f237308i = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f237300a.get(), (Q1) this.f237301b.get(), this.f237302c.get(), (C0) this.f237303d.get(), this.f237304e.get(), (InterfaceC28373a) this.f237305f.get(), (a) this.f237306g.get(), this.f237307h.get(), (com.avito.android.deep_linking.x) this.f237308i.get());
    }
}
