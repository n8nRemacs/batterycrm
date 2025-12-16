package com.avito.android.delivery_tarifikator.domain;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.ApiException;
import kotlin.Metadata;

/* compiled from: CustomTariffsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/i;", "", "a", "b", "Lcom/avito/android/delivery_tarifikator/domain/i$a;", "Lcom/avito/android/delivery_tarifikator/domain/i$b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29813i {

    /* compiled from: CustomTariffsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/i$a;", "Lcom/avito/android/delivery_tarifikator/domain/i;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.i$a */
    public static final /* data */ class a implements InterfaceC29813i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiException f135286a;

        public a(@Y61.k ApiException apiException) {
            this.f135286a = apiException;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f135286a.equals(((a) obj).f135286a);
        }

        public final int hashCode() {
            return this.f135286a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.q(new StringBuilder("Failure(error="), this.f135286a, ')');
        }
    }

    /* compiled from: CustomTariffsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/i$b;", "Lcom/avito/android/delivery_tarifikator/domain/i;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.i$b */
    public static final /* data */ class b implements InterfaceC29813i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f135287a;

        public b(@Y61.l String str) {
            this.f135287a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f135287a, ((b) obj).f135287a);
        }

        public final int hashCode() {
            String str = this.f135287a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Success(message="), this.f135287a, ')');
        }
    }
}
