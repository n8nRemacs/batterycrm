package com.avito.android.delivery_tarifikator.presentation.main_screen.domain;

import Y61.k;
import com.avito.android.delivery_tarifikator.domain.J;
import com.avito.android.delivery_tarifikator.domain.O;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffEditorHandlerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/c;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f135576d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final cv.e f135577a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<J> f135578b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f135579c;

    /* compiled from: TariffEditorHandlerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k cv.e eVar, @k Provider provider, @k u uVar) {
        this.f135577a = eVar;
        this.f135578b = provider;
        this.f135579c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f135577a.get();
        J j12 = this.f135578b.get();
        O o12 = (O) this.f135579c.get();
        f135576d.getClass();
        return new b(aVar, j12, o12);
    }
}
