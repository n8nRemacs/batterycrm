package com.avito.android;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteSellersRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/u0;", "Ldagger/internal/h;", "Lcom/avito/android/t0;", "a", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.u0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C35288u0 implements dagger.internal.h<C35202t0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f304527b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.common.a> f304528a;

    /* compiled from: FavoriteSellersRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/u0$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.u0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C35288u0(@Y61.k Provider<com.avito.android.common.a> provider) {
        this.f304528a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.common.a aVar = this.f304528a.get();
        f304527b.getClass();
        return new C35202t0(aVar);
    }
}
