package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: AvCallsExternalSignalingTransportImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/o;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/j;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<j> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f164564f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f164565a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f164566b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<F> f164567c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f164568d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FJ.e f164569e;

    /* compiled from: AvCallsExternalSignalingTransportImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/o$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.f fVar2, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k FJ.e eVar) {
        this.f164565a = fVar;
        this.f164566b = fVar2;
        this.f164567c = provider;
        this.f164568d = provider2;
        this.f164569e = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f164565a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164566b.get();
        F f12 = this.f164567c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f164568d.get();
        this.f164569e.get();
        f164564f.getClass();
        return new j(interfaceC47842z, interfaceC28373a, f12, interfaceC35745a5);
    }
}
