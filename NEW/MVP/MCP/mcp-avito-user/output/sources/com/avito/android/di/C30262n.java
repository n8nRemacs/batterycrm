package com.avito.android.di;

import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteSellersCoreModule_ProvideFavoritesCounterInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/n;", "Ldagger/internal/h;", "Lcom/avito/android/common/a;", "a", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30262n implements dagger.internal.h<com.avito.android.common.a> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f144744f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f144745a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.common.j> f144746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.account.E> f144747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I30.b f144748d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144749e;

    /* compiled from: FavoriteSellersCoreModule_ProvideFavoritesCounterInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/n$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.n$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30262n(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k I30.b bVar, @Y61.k dagger.internal.u uVar) {
        this.f144745a = provider;
        this.f144746b = provider2;
        this.f144747c = provider3;
        this.f144748d = bVar;
        this.f144749e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f144745a.get();
        com.avito.android.common.j jVar = this.f144746b.get();
        com.avito.android.account.E e12 = this.f144747c.get();
        I30.d dVar = (I30.d) this.f144748d.get();
        InterfaceC41196a interfaceC41196a = (InterfaceC41196a) this.f144749e.get();
        f144744f.getClass();
        int i12 = C29976m.f143808a;
        return new com.avito.android.common.b(interfaceC35745a5, jVar, e12, dVar, interfaceC41196a);
    }
}
