package com.avito.android.advert_details_items.photogallery;

import com.avito.android.C29640d;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f85032a;

    /* renamed from: b, reason: collision with root package name */
    public final u f85033b;

    /* renamed from: c, reason: collision with root package name */
    public final u f85034c;

    public b(u uVar, u uVar2, u uVar3) {
        this.f85032a = uVar;
        this.f85033b = uVar2;
        this.f85034c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f85032a.get(), (InterfaceC35845m2) this.f85033b.get(), (C29640d) this.f85034c.get());
    }
}
