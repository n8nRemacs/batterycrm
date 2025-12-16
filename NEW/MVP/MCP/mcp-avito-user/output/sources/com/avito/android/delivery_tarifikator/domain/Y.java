package com.avito.android.delivery_tarifikator.domain;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TariffUsageChecker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/Y;", "", "a", "b", "Lcom/avito/android/delivery_tarifikator/domain/Y$a;", "Lcom/avito/android/delivery_tarifikator/domain/Y$b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface Y {

    /* compiled from: TariffUsageChecker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/Y$a;", "Lcom/avito/android/delivery_tarifikator/domain/Y;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements Y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f135265a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1234908509;
        }

        @Y61.k
        public final String toString() {
            return "Unused";
        }
    }

    /* compiled from: TariffUsageChecker.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/Y$b;", "Lcom/avito/android/delivery_tarifikator/domain/Y;", "locations", "", "LOv/d;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Ov.d> f135266a;

        private /* synthetic */ b(List list) {
            this.f135266a = list;
        }

        public static final /* synthetic */ b a(ArrayList arrayList) {
            return new b(arrayList);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return kotlin.jvm.internal.L.f(this.f135266a, ((b) obj).f135266a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f135266a.hashCode();
        }

        public final String toString() {
            return "UsedInCurrentSettings(locations=" + this.f135266a + ')';
        }
    }
}
