package com.avito.android.user_advert.advert.items.gallery;

import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyAdvertGalleryItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f309423a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309424b;

    /* renamed from: c, reason: collision with root package name */
    public final u f309425c;

    /* renamed from: d, reason: collision with root package name */
    public final u f309426d;

    /* renamed from: e, reason: collision with root package name */
    public final u f309427e;

    public f(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f309423a = provider;
        this.f309424b = uVar;
        this.f309425c = uVar2;
        this.f309426d = uVar3;
        this.f309427e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = this.f309423a.get();
        r rVar = (r) this.f309424b.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f309425c.get();
        return new e(hVar, rVar, interfaceC35845m2, (R0) this.f309427e.get());
    }
}
