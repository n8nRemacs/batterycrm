package com.avito.android.serp.adapter.mini_menu;

import Oi0.InterfaceC14698b;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MiniMenuBlockBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f270324a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f270325b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14698b> f270326c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f270327d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C> f270328e;

    public c(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f270324a = provider;
        this.f270325b = provider2;
        this.f270326c = provider3;
        this.f270327d = uVar;
        this.f270328e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f270324a.get(), this.f270325b.get(), this.f270326c.get(), (RecyclerView.l) this.f270327d.get(), this.f270328e.get());
    }
}
