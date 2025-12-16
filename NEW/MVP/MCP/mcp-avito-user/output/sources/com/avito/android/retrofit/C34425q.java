package com.avito.android.retrofit;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallWrapperAnalyticsDispatcher_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/q;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/o;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34425q implements dagger.internal.h<C34423o> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f255163d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f255164a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.e f255165b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f255166c;

    /* compiled from: CallWrapperAnalyticsDispatcher_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/q$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.q$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34425q(@Y61.k dagger.internal.u uVar, @Y61.k com.avito.android.remote.error.e eVar, @Y61.k dagger.internal.f fVar) {
        this.f255164a = uVar;
        this.f255165b = eVar;
        this.f255166c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.analytics.B b12 = (com.avito.android.remote.analytics.B) this.f255164a.get();
        com.avito.android.remote.error.a aVar = (com.avito.android.remote.error.a) this.f255165b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f255166c.get();
        f255163d.getClass();
        return new C34423o(b12, aVar, interfaceC28373a);
    }
}
