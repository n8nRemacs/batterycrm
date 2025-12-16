package Fs0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingNavigationInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LFs0/b;", "", "a", "b", "c", "d", "LFs0/b$a;", "LFs0/b$b;", "LFs0/b$c;", "LFs0/b$d;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ServiceBookingNavigationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/b$a;", "LFs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f5999a;

        public a(@k String str) {
            this.f5999a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f5999a, ((a) obj).f5999a);
        }

        public final int hashCode() {
            return this.f5999a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CreateStep(stepId="), this.f5999a, ')');
        }
    }

    /* compiled from: ServiceBookingNavigationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/b$c;", "LFs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ServiceBookingError f6002a;

        public c(@l ServiceBookingError serviceBookingError) {
            this.f6002a = serviceBookingError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f6002a, ((c) obj).f6002a);
        }

        public final int hashCode() {
            ServiceBookingError serviceBookingError = this.f6002a;
            if (serviceBookingError == null) {
                return 0;
            }
            return serviceBookingError.hashCode();
        }

        @k
        public final String toString() {
            return "SetCustomErrorStep(error=" + this.f6002a + ')';
        }
    }

    /* compiled from: ServiceBookingNavigationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/b$d;", "LFs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6003a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Set<Object>> f6004b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k String str, @k Map<String, ? extends Set<? extends Object>> map) {
            this.f6003a = str;
            this.f6004b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f6003a, dVar.f6003a) && L.f(this.f6004b, dVar.f6004b);
        }

        public final int hashCode() {
            return this.f6004b.hashCode() + (this.f6003a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateSelectedValuesInStep(stepId=");
            sb2.append(this.f6003a);
            sb2.append(", selectedValues=");
            return r.w(sb2, this.f6004b, ')');
        }
    }

    /* compiled from: ServiceBookingNavigationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/b$b;", "LFs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fs0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0306b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6000a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceBookingError f6001b;

        public C0306b(@k String str, @l ServiceBookingError serviceBookingError) {
            this.f6000a = str;
            this.f6001b = serviceBookingError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0306b)) {
                return false;
            }
            C0306b c0306b = (C0306b) obj;
            return L.f(this.f6000a, c0306b.f6000a) && L.f(this.f6001b, c0306b.f6001b);
        }

        public final int hashCode() {
            int iHashCode = this.f6000a.hashCode() * 31;
            ServiceBookingError serviceBookingError = this.f6001b;
            return iHashCode + (serviceBookingError == null ? 0 : serviceBookingError.hashCode());
        }

        @k
        public final String toString() {
            return "NavigateToPreviousStep(stepId=" + this.f6000a + ", error=" + this.f6001b + ')';
        }

        public /* synthetic */ C0306b(String str, ServiceBookingError serviceBookingError, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : serviceBookingError);
        }
    }
}
