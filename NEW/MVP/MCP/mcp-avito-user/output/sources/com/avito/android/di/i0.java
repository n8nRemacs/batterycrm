package com.avito.android.di;

import com.avito.android.advert.viewed.persistance.ViewedAdvertsDb;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedAdvertsStorageModule_ProvideViewedAdvertDaoFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/i0;", "Ldagger/internal/h;", "Lcom/avito/android/advert/viewed/persistance/b;", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i0 implements dagger.internal.h<com.avito.android.advert.viewed.persistance.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143793b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143794a;

    /* compiled from: ViewedAdvertsStorageModule_ProvideViewedAdvertDaoFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/i0$a;", "", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i0(@Y61.k h0 h0Var, @Y61.k dagger.internal.u uVar) {
        this.f143794a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ViewedAdvertsDb viewedAdvertsDb = (ViewedAdvertsDb) this.f143794a.get();
        f143793b.getClass();
        com.avito.android.advert.viewed.persistance.b bVarU = viewedAdvertsDb.u();
        dagger.internal.t.b(bVarU, "Cannot return null from a non-@Nullable @Provides method");
        return bVarU;
    }
}
