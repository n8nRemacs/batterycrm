package com.avito.android.retrofit;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallWrapperApiErrorsDispatcher_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/u;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/t;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u implements dagger.internal.h<C34427t> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f255192c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34410b> f255193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f255194b;

    /* compiled from: CallWrapperApiErrorsDispatcher_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/u$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public u(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider) {
        this.f255193a = provider;
        this.f255194b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34410b interfaceC34410b = this.f255193a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f255194b.get();
        f255192c.getClass();
        return new C34427t(interfaceC34410b, interfaceC28373a);
    }
}
