package com.avito.android.retrofit;

import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallWrapperApiErrorConverter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/s;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/r;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34426s implements dagger.internal.h<r> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f255177f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.error.k> f255178a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.e f255179b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f255180c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f255181d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f255182e;

    /* compiled from: CallWrapperApiErrorConverter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/s$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.s$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34426s(@Y61.k Provider provider, @Y61.k com.avito.android.remote.error.e eVar, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k com.avito.android.S s5) {
        this.f255178a = provider;
        this.f255179b = eVar;
        this.f255180c = provider2;
        this.f255181d = provider3;
        this.f255182e = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.error.k kVar = this.f255178a.get();
        com.avito.android.remote.error.a aVar = (com.avito.android.remote.error.a) this.f255179b.get();
        Gson gson = this.f255180c.get();
        Gson gson2 = this.f255181d.get();
        this.f255182e.get();
        f255177f.getClass();
        return new r(kVar, aVar, gson, gson2);
    }
}
