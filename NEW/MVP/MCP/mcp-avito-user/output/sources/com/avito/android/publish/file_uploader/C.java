package com.avito.android.publish.file_uploader;

import androidx.view.InterfaceC23487e;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: FileUploaderViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f235657a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f235658b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.file_uploader.d> f235659c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.cpa_ddu_upload.e> f235660d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.file_uploader_redesign.e> f235661e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<S0> f235662f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC33853a> f235663g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<o> f235664h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f235665i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f235666j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.u f235667k;

    public C(Provider provider, dagger.internal.u uVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f235657a = provider;
        this.f235658b = uVar;
        this.f235659c = provider2;
        this.f235660d = provider3;
        this.f235661e = provider4;
        this.f235662f = provider5;
        this.f235663g = provider6;
        this.f235664h = provider7;
        this.f235665i = provider8;
        this.f235666j = uVar2;
        this.f235667k = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f235657a.get(), (InterfaceC33535v) this.f235658b.get(), this.f235659c.get(), this.f235660d.get(), this.f235661e.get(), this.f235662f.get(), this.f235663g.get(), this.f235664h.get(), this.f235665i.get(), (InterfaceC35745a5) this.f235666j.get(), (R0) this.f235667k.get());
    }
}
