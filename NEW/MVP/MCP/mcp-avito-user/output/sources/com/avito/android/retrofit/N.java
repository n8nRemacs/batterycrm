package com.avito.android.retrofit;

import com.avito.android.I1;
import com.avito.android.K1;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ResponseBodyConverterFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/N;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/M;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f255106f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f255107a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f255108b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f255109c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final K1 f255110d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final EE0.b f255111e;

    /* compiled from: ResponseBodyConverterFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/N$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public N(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k com.avito.android.S s5, @Y61.k K1 k12, @Y61.k EE0.b bVar) {
        this.f255107a = provider;
        this.f255108b = provider2;
        this.f255109c = s5;
        this.f255110d = k12;
        this.f255111e = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f255107a.get();
        Gson gson2 = this.f255108b.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f255109c.get();
        I1 i12 = (I1) this.f255110d.get();
        this.f255111e.getClass();
        EE0.a aVar = new EE0.a();
        f255106f.getClass();
        return new M(gson, gson2, p12, i12, aVar);
    }
}
