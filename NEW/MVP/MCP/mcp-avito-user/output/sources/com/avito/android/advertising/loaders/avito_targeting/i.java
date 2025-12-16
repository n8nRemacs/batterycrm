package com.avito.android.advertising.loaders.avito_targeting;

import Hq0.C14020b;
import com.avito.android.advertising.loaders.x;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.CreativeNetworkBannerItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import qb.InterfaceC47368a;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/i;", "Lcom/avito/android/advertising/loaders/avito_targeting/g;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47368a> f88035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.buzzoola.a f88036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.avito_targeting.a f88037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q f88038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f88039e;

    /* compiled from: AvitoTargetingBannerLoader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "gaid", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.f88036b.c((String) obj);
        }
    }

    /* compiled from: AvitoTargetingBannerLoader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f88041b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public i(@Y61.k h31.e<InterfaceC47368a> eVar, @Y61.k com.avito.android.advertising.loaders.buzzoola.a aVar, @Y61.k com.avito.android.advertising.loaders.avito_targeting.a aVar2, @Y61.k q qVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k x xVar) {
        this.f88035a = eVar;
        this.f88036b = aVar;
        this.f88037c = aVar2;
        this.f88038d = qVar;
        this.f88039e = interfaceC35745a5;
        xVar.b().x(new a(), b.f88041b);
    }

    @Override // com.avito.android.advertising.loaders.avito_targeting.g
    @Y61.k
    public final W a(final int i12, final int i13) {
        return new C42007e(new l41.s() { // from class: com.avito.android.advertising.loaders.avito_targeting.h
            @Override // l41.s
            public final Object get() {
                return this.f88032b.f88035a.get().c(i12, i13);
            }
        }).r(j.f88042b).z(this.f88039e.a());
    }

    @Override // com.avito.android.advertising.loaders.avito_targeting.g
    @Y61.k
    public final C42019q b(@Y61.k AvitoNetworkBannerItem avitoNetworkBannerItem, boolean z12) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new C42007e(new com.avito.android.advert.item.sellersubscription.l(this, avitoNetworkBannerItem, this.f88036b.getF88312a(), z12, 1)).r(new m(this, jCurrentTimeMillis)).r(new n(this, avitoNetworkBannerItem)).i(new o(jCurrentTimeMillis));
    }

    @Override // com.avito.android.advertising.loaders.avito_targeting.g
    @Y61.k
    public final O c(@Y61.k CreativeNetworkBannerItem creativeNetworkBannerItem) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new F(new C14020b(3, this, creativeNetworkBannerItem)).d0(new k(this, jCurrentTimeMillis)).I(new l(jCurrentTimeMillis));
    }
}
