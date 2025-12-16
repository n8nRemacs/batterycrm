package com.avito.android.iac_avcalls.impl_module.platform.avcalls;

import Y61.k;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: AvCallsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/j;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/c;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<c> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f164401g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f164402a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FJ.e f164403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f164404c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dagger.internal.f f164405d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<F> f164406e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f164407f;

    /* compiled from: AvCallsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/j$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@k C30102l3 c30102l3, @k FJ.e eVar, @k dagger.internal.f fVar, @k dagger.internal.f fVar2, @k Provider provider, @k Provider provider2) {
        this.f164402a = c30102l3;
        this.f164403b = eVar;
        this.f164404c = fVar;
        this.f164405d = fVar2;
        this.f164406e = provider;
        this.f164407f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f164402a.get();
        FJ.a aVar = (FJ.a) this.f164403b.get();
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f164404c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164405d.get();
        F f12 = this.f164406e.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f164407f.get();
        f164401g.getClass();
        return new c(context, aVar, interfaceC47842z, interfaceC28373a, f12, interfaceC35745a5);
    }
}
