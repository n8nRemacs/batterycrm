package com.avito.android.lottie;

import Y61.k;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import retrofit2.z;

/* compiled from: LottieRetrofitFetcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lottie/d;", "Lcom/airbnb/lottie/network/e;", "_common_lottie_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.airbnb.lottie.network.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<z> f182975a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f182976b = C42727D.b(LazyThreadSafetyMode.f406614b, new a());

    /* compiled from: LottieRetrofitFetcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lottie/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/lottie/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<e> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final e invoke() {
            return (e) d.this.f182975a.invoke().b(e.class);
        }
    }

    public d(@k Y41.a<z> aVar) {
        this.f182975a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.airbnb.lottie.network.e
    @k
    public final com.airbnb.lottie.network.c a(@k String str) {
        return new f(str, ((e) this.f182976b.getValue()).a(str).execute());
    }
}
