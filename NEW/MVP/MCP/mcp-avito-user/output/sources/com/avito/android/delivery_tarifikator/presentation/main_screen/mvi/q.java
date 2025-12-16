package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.domain.Z;
import com.avito.android.delivery_tarifikator.domain.p0;
import com.avito.android.delivery_tarifikator.domain.x0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorMainActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/q;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<b> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f135703h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e> f135704a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<x0> f135705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<p0> f135706c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<D> f135707d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<Z> f135708e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f135709f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final cv.e f135710g;

    /* compiled from: TarifikatorMainActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/q$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5, @Y61.k dagger.internal.u uVar, @Y61.k cv.e eVar) {
        this.f135704a = provider;
        this.f135705b = provider2;
        this.f135706c = provider3;
        this.f135707d = provider4;
        this.f135708e = provider5;
        this.f135709f = uVar;
        this.f135710g = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e eVar = this.f135704a.get();
        x0 x0Var = this.f135705b.get();
        p0 p0Var = this.f135706c.get();
        D d12 = this.f135707d.get();
        Z z12 = this.f135708e.get();
        com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a aVar = (com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a) this.f135709f.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f135710g.get();
        f135703h.getClass();
        return new b(eVar, x0Var, p0Var, d12, z12, aVar, aVar2);
    }
}
