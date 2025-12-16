package com.avito.android.select.sectioned_multiselect;

import com.avito.android.select.i;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.g;

/* compiled from: SectionedMultiselectConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f266690a;

    /* renamed from: b, reason: collision with root package name */
    public final l f266691b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.select.glow_animation.e f266692c;

    /* renamed from: d, reason: collision with root package name */
    public final u f266693d;

    public d(Provider provider, l lVar, com.avito.android.select.glow_animation.e eVar, u uVar) {
        this.f266690a = provider;
        this.f266691b = lVar;
        this.f266692c = eVar;
        this.f266693d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = this.f266690a.get();
        String str = (String) this.f266691b.f393949a;
        this.f266692c.getClass();
        return new c(iVar, str, new com.avito.android.select.glow_animation.d(), (g) this.f266693d.get());
    }
}
