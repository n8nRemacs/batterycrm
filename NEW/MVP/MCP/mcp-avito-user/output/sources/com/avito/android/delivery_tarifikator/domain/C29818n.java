package com.avito.android.delivery_tarifikator.domain;

import aw.InterfaceC24182a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadTarifikatorUseCaseImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/n;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/m;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29818n implements dagger.internal.h<C29817m> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f135311j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC24182a> f135312a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f135314c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<h0> f135315d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<p0> f135316e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<x0> f135317f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f135318g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC29809e> f135319h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Provider<Mv.e> f135320i;

    /* compiled from: LoadTarifikatorUseCaseImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/n$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.n$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29818n(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5, @Y61.k Provider provider6, @Y61.k Provider provider7) {
        this.f135312a = provider;
        this.f135313b = lVar;
        this.f135314c = provider2;
        this.f135315d = provider3;
        this.f135316e = provider4;
        this.f135317f = provider5;
        this.f135318g = uVar;
        this.f135319h = provider6;
        this.f135320i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC24182a interfaceC24182a = this.f135312a.get();
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) this.f135313b.f393949a;
        R0 r02 = this.f135314c.get();
        h0 h0Var = this.f135315d.get();
        p0 p0Var = this.f135316e.get();
        x0 x0Var = this.f135317f.get();
        J j12 = (J) this.f135318g.get();
        InterfaceC29809e interfaceC29809e = this.f135319h.get();
        Mv.e eVar = this.f135320i.get();
        f135311j.getClass();
        return new C29817m(interfaceC24182a, deliveryTarifikatorParams, r02, h0Var, p0Var, x0Var, j12, interfaceC29809e, eVar);
    }
}
