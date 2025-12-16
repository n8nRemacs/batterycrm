package com.yandex.div.core.view2.divs.gallery;

import com.yandex.div.core.downloader.k;
import com.yandex.div.core.view2.P;
import com.yandex.div.core.view2.divs.C38006w;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.u;

/* compiled from: DivGalleryBinder_Factory.java */
@e
/* loaded from: classes7.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f368446a;

    /* renamed from: b, reason: collision with root package name */
    public final u f368447b;

    /* renamed from: c, reason: collision with root package name */
    public final f f368448c;

    /* renamed from: d, reason: collision with root package name */
    public final u f368449d;

    public b(f fVar, u uVar, u uVar2, u uVar3) {
        this.f368446a = uVar;
        this.f368447b = uVar2;
        this.f368448c = fVar;
        this.f368449d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((C38006w) this.f368446a.get(), (P) this.f368447b.get(), this.f368448c, (k) this.f368449d.get());
    }
}
