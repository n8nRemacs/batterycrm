package com.avito.android.advert.item;

import android.annotation.SuppressLint;
import com.avito.android.advert.item.C28124e0;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: AdvertDetailsPreloadStorage.kt */
@Singleton
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/e0;", "", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28124e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<a> f75290a = new AtomicReference<>();

    /* compiled from: AdvertDetailsPreloadStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/e0$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.e0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PreloadCacheKey f75291a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsWithMeta f75292b;

        public a(@Y61.k PreloadCacheKey preloadCacheKey, @Y61.k AdvertDetailsWithMeta advertDetailsWithMeta) {
            this.f75291a = preloadCacheKey;
            this.f75292b = advertDetailsWithMeta;
        }
    }

    @Inject
    public C28124e0() {
    }

    @Y61.l
    public final AdvertDetailsWithMeta a(@Y61.k PreloadCacheKey preloadCacheKey) {
        AtomicReference<a> atomicReference = this.f75290a;
        a aVar = atomicReference.get();
        if (aVar == null || !preloadCacheKey.equals(aVar.f75291a)) {
            return null;
        }
        while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
        }
        return aVar.f75292b;
    }

    @Y61.k
    @SuppressLint({"CheckResult"})
    public final PreloadCacheKey b(@Y61.k AdvertDetailsWithMeta advertDetailsWithMeta) {
        PreloadCacheKey preloadCacheKey = new PreloadCacheKey(UUID.randomUUID().toString());
        final a aVar = new a(preloadCacheKey, advertDetailsWithMeta);
        this.f75290a.set(aVar);
        AbstractC41768a.y(5L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).v(new InterfaceC43543a() { // from class: com.avito.android.advert.item.d0
            @Override // l41.InterfaceC43543a
            public final void run() {
                C28124e0.a aVar2;
                AtomicReference<C28124e0.a> atomicReference = this.f75089b.f75290a;
                do {
                    aVar2 = aVar;
                    if (atomicReference.compareAndSet(aVar2, null)) {
                        return;
                    }
                } while (atomicReference.get() == aVar2);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401996f);
        return preloadCacheKey;
    }
}
