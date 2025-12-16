package com.avito.android.publish.slots.address_from_profile;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kl0.C42710a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResponseStatus.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/j;", "", "a", "b", "c", "Lcom/avito/android/publish/slots/address_from_profile/j$a;", "Lcom/avito/android/publish/slots/address_from_profile/j$b;", "Lcom/avito/android/publish/slots/address_from_profile/j$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface j {

    /* compiled from: ResponseStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/j$a;", "Lcom/avito/android/publish/slots/address_from_profile/j;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f242840a;

        public a(@Y61.k ApiError apiError) {
            this.f242840a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f242840a, ((a) obj).f242840a);
        }

        public final int hashCode() {
            return this.f242840a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(details="), this.f242840a, ')');
        }
    }

    /* compiled from: ResponseStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/j$b;", "Lcom/avito/android/publish/slots/address_from_profile/j;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f242841a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 460830413;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ResponseStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/j$c;", "Lcom/avito/android/publish/slots/address_from_profile/j;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C42710a f242842a;

        public c(@Y61.k C42710a c42710a) {
            this.f242842a = c42710a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f242842a, ((c) obj).f242842a);
        }

        public final int hashCode() {
            return this.f242842a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Success(response=" + this.f242842a + ')';
        }
    }
}
