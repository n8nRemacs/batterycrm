package Tv0;

import android.content.res.Resources;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import l90.n;

/* compiled from: SupportEmailResourceProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: Tv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15417c implements h<C15416b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f16018a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n> f16019b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f16020c;

    public C15417c(l lVar, Provider provider, Provider provider2) {
        this.f16018a = lVar;
        this.f16019b = provider;
        this.f16020c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C15416b((Resources) this.f16018a.f393949a, this.f16019b.get(), this.f16020c.get());
    }
}
