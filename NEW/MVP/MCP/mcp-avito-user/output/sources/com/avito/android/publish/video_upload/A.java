package com.avito.android.publish.video_upload;

import androidx.view.InterfaceC23487e;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.C33774n1;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VideoUploadViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f245524a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<S0> f245525b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f245526c;

    /* renamed from: d, reason: collision with root package name */
    public final C33774n1 f245527d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f245528e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f245529f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f245530g;

    /* renamed from: h, reason: collision with root package name */
    public final Ff0.c f245531h;

    public A(Provider provider, Provider provider2, dagger.internal.u uVar, C33774n1 c33774n1, dagger.internal.u uVar2, Provider provider3, dagger.internal.u uVar3, Ff0.c cVar) {
        this.f245524a = provider;
        this.f245525b = provider2;
        this.f245526c = uVar;
        this.f245527d = c33774n1;
        this.f245528e = uVar2;
        this.f245529f = provider3;
        this.f245530g = uVar3;
        this.f245531h = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f245524a.get(), this.f245525b.get(), (InterfaceC34148c) this.f245526c.get(), (C33771m1) this.f245527d.get(), (InterfaceC33535v) this.f245528e.get(), this.f245529f.get(), (InterfaceC35745a5) this.f245530g.get(), (Ff0.b) this.f245531h.get());
    }
}
