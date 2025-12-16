package wy;

import com.avito.android.edit_seller_type.mvi.entity.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditSellerTypeResponseConverterImpl_Factory.java */
@e
@y
@x
/* renamed from: wy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49703c implements h<C49702b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f441893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f441894b;

    public C49703c(l lVar, Provider provider) {
        this.f441893a = lVar;
        this.f441894b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49702b((c.f) this.f441893a.f393949a, this.f441894b.get());
    }
}
