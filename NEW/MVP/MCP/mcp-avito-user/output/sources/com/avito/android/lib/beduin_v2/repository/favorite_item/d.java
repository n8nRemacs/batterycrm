package com.avito.android.lib.beduin_v2.repository.favorite_item;

import Y61.k;
import com.avito.android.favorite.m;
import com.avito.android.favorite.v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteItemRepositoryClientImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/favorite_item/d;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/favorite_item/a;", "a", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements h<com.avito.android.lib.beduin_v2.repository.favorite_item.a> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f176607f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f176608a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<v> f176609b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f176610c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f176611d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<R0> f176612e;

    /* compiled from: FavoriteItemRepositoryClientImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/favorite_item/d$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_favorite-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k m mVar, @k Provider provider, @k Provider provider2, @k u uVar, @k Provider provider3) {
        this.f176608a = mVar;
        this.f176609b = provider;
        this.f176610c = provider2;
        this.f176611d = uVar;
        this.f176612e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite.h hVar = (com.avito.android.favorite.h) this.f176608a.get();
        v vVar = this.f176609b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f176610c.get();
        com.avito.android.advert_collection_toast.c cVar = (com.avito.android.advert_collection_toast.c) this.f176611d.get();
        R0 r02 = this.f176612e.get();
        f176607f.getClass();
        return new com.avito.android.lib.beduin_v2.repository.favorite_item.a(hVar, vVar, interfaceC35745a5, cVar, r02);
    }
}
