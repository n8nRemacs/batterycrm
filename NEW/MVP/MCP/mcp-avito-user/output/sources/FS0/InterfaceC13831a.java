package Fs0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingNavigationAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LFs0/a;", "", "a", "b", "c", "LFs0/a$a;", "LFs0/a$b;", "LFs0/a$c;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13831a {

    /* compiled from: ServiceBookingNavigationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/a$a;", "LFs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fs0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0305a implements InterfaceC13831a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f5993a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f5994b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Set<Object>> f5995c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0305a(@k String str, @k String str2, @k Map<String, ? extends Set<? extends Object>> map) {
            this.f5993a = str;
            this.f5994b = str2;
            this.f5995c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0305a)) {
                return false;
            }
            C0305a c0305a = (C0305a) obj;
            return L.f(this.f5993a, c0305a.f5993a) && L.f(this.f5994b, c0305a.f5994b) && L.f(this.f5995c, c0305a.f5995c);
        }

        public final int hashCode() {
            return this.f5995c.hashCode() + H.d(this.f5993a.hashCode() * 31, 31, this.f5994b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToNextStep(nextStepId=");
            sb2.append(this.f5993a);
            sb2.append(", currentStepId=");
            sb2.append(this.f5994b);
            sb2.append(", selectedValuesOnCurrentStep=");
            return r.w(sb2, this.f5995c, ')');
        }
    }

    /* compiled from: ServiceBookingNavigationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/a$c;", "LFs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fs0.a$c */
    public static final /* data */ class c implements InterfaceC13831a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ServiceBookingError f5998a;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f5998a, ((c) obj).f5998a);
        }

        public final int hashCode() {
            ServiceBookingError serviceBookingError = this.f5998a;
            if (serviceBookingError == null) {
                return 0;
            }
            return serviceBookingError.hashCode();
        }

        @k
        public final String toString() {
            return "SetCustomErrorStep(error=" + this.f5998a + ')';
        }

        public c(@l ServiceBookingError serviceBookingError) {
            this.f5998a = serviceBookingError;
        }

        public /* synthetic */ c(ServiceBookingError serviceBookingError, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : serviceBookingError);
        }
    }

    /* compiled from: ServiceBookingNavigationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/a$b;", "LFs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fs0.a$b */
    public static final /* data */ class b implements InterfaceC13831a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f5996a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceBookingError f5997b;

        public b(@k String str, @l ServiceBookingError serviceBookingError) {
            this.f5996a = str;
            this.f5997b = serviceBookingError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f5996a, bVar.f5996a) && L.f(this.f5997b, bVar.f5997b);
        }

        public final int hashCode() {
            int iHashCode = this.f5996a.hashCode() * 31;
            ServiceBookingError serviceBookingError = this.f5997b;
            return iHashCode + (serviceBookingError == null ? 0 : serviceBookingError.hashCode());
        }

        @k
        public final String toString() {
            return "NavigateToPreviousStep(currentStepId=" + this.f5996a + ", error=" + this.f5997b + ')';
        }

        public /* synthetic */ b(String str, ServiceBookingError serviceBookingError, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : serviceBookingError);
        }
    }
}
