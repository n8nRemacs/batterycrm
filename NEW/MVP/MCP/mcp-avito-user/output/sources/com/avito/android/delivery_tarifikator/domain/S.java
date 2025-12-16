package com.avito.android.delivery_tarifikator.domain;

import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffEditorResultParserImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/S;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/P;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class S implements dagger.internal.h<P> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f135257e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f135258a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<h0> f135259b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<d0> f135260c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<Mv.i> f135261d;

    /* compiled from: TariffEditorResultParserImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/S$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public S(@Y61.k Provider<Gson> provider, @Y61.k Provider<h0> provider2, @Y61.k Provider<d0> provider3, @Y61.k Provider<Mv.i> provider4) {
        this.f135258a = provider;
        this.f135259b = provider2;
        this.f135260c = provider3;
        this.f135261d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f135258a.get();
        h0 h0Var = this.f135259b.get();
        d0 d0Var = this.f135260c.get();
        Mv.i iVar = this.f135261d.get();
        f135257e.getClass();
        return new P(gson, h0Var, d0Var, iVar);
    }
}
