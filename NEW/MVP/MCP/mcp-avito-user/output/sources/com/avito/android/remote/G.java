package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliveryCheckoutApi_Module_ProvideDeliveryCheckoutApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/G;", "Ldagger/internal/h;", "Lcom/avito/android/remote/E;", "a", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class G implements dagger.internal.h<E> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253023b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253024a;

    /* compiled from: DeliveryCheckoutApi_Module_ProvideDeliveryCheckoutApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/G$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public G(@Y61.k dagger.internal.f fVar) {
        this.f253024a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253024a.get();
        f253023b.getClass();
        F.f253020a.getClass();
        E e12 = (E) r02.create(E.class);
        dagger.internal.t.b(e12, "Cannot return null from a non-@Nullable @Provides method");
        return e12;
    }
}
