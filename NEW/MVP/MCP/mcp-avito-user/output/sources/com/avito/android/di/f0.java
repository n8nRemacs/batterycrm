package com.avito.android.di;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedAdvertsModule_ProvideViewedAdvertsPresenterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/f0;", "Ldagger/internal/h;", "Lcom/avito/android/advert/viewed/f;", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f0 implements dagger.internal.h<com.avito.android.advert.viewed.f> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f143786e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143787a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.advert.viewed.d> f143788b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143789c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143790d;

    /* compiled from: ViewedAdvertsModule_ProvideViewedAdvertsPresenterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/f0$a;", "", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f0(@Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2, @Y61.k dagger.internal.u uVar3, @Y61.k Provider provider) {
        this.f143787a = uVar;
        this.f143788b = provider;
        this.f143789c = uVar2;
        this.f143790d = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.viewed.a aVar = (com.avito.android.advert.viewed.a) this.f143787a.get();
        com.avito.android.advert.viewed.d dVar = this.f143788b.get();
        R0 r02 = (R0) this.f143789c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f143790d.get();
        f143786e.getClass();
        int i12 = d0.f143781a;
        return new com.avito.android.advert.viewed.g(aVar, dVar, r02, interfaceC35745a5);
    }
}
