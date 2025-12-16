package com.avito.android.delivery_tarifikator.domain;

import kotlin.Metadata;

/* compiled from: LoadTarifikatorUseCase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/j;", "", "a", "b", "Lcom/avito/android/delivery_tarifikator/domain/j$a;", "Lcom/avito/android/delivery_tarifikator/domain/j$b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29814j {

    /* compiled from: LoadTarifikatorUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/j$a;", "Lcom/avito/android/delivery_tarifikator/domain/j;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.j$a */
    public static final /* data */ class a implements InterfaceC29814j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f135293a;

        public a(@Y61.k Throwable th2) {
            this.f135293a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f135293a, ((a) obj).f135293a);
        }

        public final int hashCode() {
            return this.f135293a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failed(error="), this.f135293a, ')');
        }
    }

    /* compiled from: LoadTarifikatorUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/j$b;", "Lcom/avito/android/delivery_tarifikator/domain/j;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.j$b */
    public static final /* data */ class b implements InterfaceC29814j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f135294a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1557477904;
        }

        @Y61.k
        public final String toString() {
            return "Success";
        }
    }
}
