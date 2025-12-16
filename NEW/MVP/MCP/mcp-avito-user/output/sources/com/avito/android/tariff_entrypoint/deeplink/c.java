package com.avito.android.tariff_entrypoint.deeplink;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffEntryPointDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/c;", "Ldagger/internal/h;", "Lcom/avito/android/tariff_entrypoint/deeplink/b;", "a", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f298714f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<NC0.a> f298715a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f298716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f298717c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dv.b f298718d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<R0> f298719e;

    /* compiled from: TariffEntryPointDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/c$a;", "", "<init>", "()V", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar, @k dv.b bVar, @k dv.b bVar2, @k Provider provider, @k Provider provider2) {
        this.f298715a = provider;
        this.f298716b = fVar;
        this.f298717c = bVar;
        this.f298718d = bVar2;
        this.f298719e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        NC0.a aVar = this.f298715a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f298716b.get();
        a.g gVar = (a.g) this.f298717c.get();
        a.i iVar = (a.i) this.f298718d.get();
        R0 r02 = this.f298719e.get();
        f298714f.getClass();
        return new b(aVar, aVar2, gVar, iVar, r02);
    }
}
