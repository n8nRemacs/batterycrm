package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.avcalls.android.a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/A;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/y;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<y> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f164528g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f164529a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<a.e> f164530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<t> f164531c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<a.f> f164532d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<a.d> f164533e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f164534f;

    /* compiled from: AvCallsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/A$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A(@Y61.k C30102l3 c30102l3, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k dagger.internal.u uVar) {
        this.f164529a = c30102l3;
        this.f164530b = provider;
        this.f164531c = provider2;
        this.f164532d = provider3;
        this.f164533e = provider4;
        this.f164534f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f164529a.get();
        a.e eVar = this.f164530b.get();
        t tVar = this.f164531c.get();
        a.f fVar = this.f164532d.get();
        a.d dVar = this.f164533e.get();
        a.InterfaceC10304a interfaceC10304a = (a.InterfaceC10304a) this.f164534f.get();
        f164528g.getClass();
        return new y(context, eVar, tVar, fVar, dVar, interfaceC10304a);
    }
}
