package com.avito.android.delivery_tarifikator.domain;

import java.util.List;
import kotlin.Metadata;

/* compiled from: TarifikatorSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/I;", "", "a", "b", "Lcom/avito/android/delivery_tarifikator/domain/I$a;", "Lcom/avito/android/delivery_tarifikator/domain/I$b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface I {

    /* compiled from: TarifikatorSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/I$a;", "Lcom/avito/android/delivery_tarifikator/domain/I;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f135243a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -870752917;
        }

        @Y61.k
        public final String toString() {
            return "Failure";
        }
    }

    /* compiled from: TarifikatorSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/I$b;", "Lcom/avito/android/delivery_tarifikator/domain/I;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Ov.g> f135244a;

        public b(@Y61.k List<Ov.g> list) {
            this.f135244a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f135244a, ((b) obj).f135244a);
        }

        public final int hashCode() {
            return this.f135244a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.p(new StringBuilder("Success(changes="), this.f135244a, ')');
        }
    }
}
