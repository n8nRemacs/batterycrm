package com.avito.android.delivery_tarifikator.domain;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.ApiException;
import kotlin.Metadata;

/* compiled from: SaveSettingsUseCase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/x;", "", "a", "b", "Lcom/avito/android/delivery_tarifikator/domain/x$a;", "Lcom/avito/android/delivery_tarifikator/domain/x$b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29827x {

    /* compiled from: SaveSettingsUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/x$a;", "Lcom/avito/android/delivery_tarifikator/domain/x;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.x$a */
    public static final /* data */ class a implements InterfaceC29827x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiException f135347a;

        public a(@Y61.k ApiException apiException) {
            this.f135347a = apiException;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f135347a.equals(((a) obj).f135347a);
        }

        public final int hashCode() {
            return this.f135347a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.q(new StringBuilder("Failed(error="), this.f135347a, ')');
        }
    }

    /* compiled from: SaveSettingsUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/x$b;", "Lcom/avito/android/delivery_tarifikator/domain/x;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.x$b */
    public static final /* data */ class b implements InterfaceC29827x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f135348a;

        public b(@Y61.l String str) {
            this.f135348a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f135348a, ((b) obj).f135348a);
        }

        public final int hashCode() {
            String str = this.f135348a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Success(message="), this.f135348a, ')');
        }
    }
}
