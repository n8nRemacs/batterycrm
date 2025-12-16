package com.avito.android.service_booking.mvi.step.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$a;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$b;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$c;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$d;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$e;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$f;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$g;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$a;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking.mvi.step.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8153a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ServiceBookingFlowIntentFactory.Result f274737a;

        public C8153a(@k ServiceBookingFlowIntentFactory.Result result) {
            this.f274737a = result;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8153a) && L.f(this.f274737a, ((C8153a) obj).f274737a);
        }

        public final int hashCode() {
            return this.f274737a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f274737a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$b;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ServiceBookingMviStepState.ServiceBookingAnimationUrl f274738a;

        public b(@l ServiceBookingMviStepState.ServiceBookingAnimationUrl serviceBookingAnimationUrl) {
            this.f274738a = serviceBookingAnimationUrl;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f274738a, ((b) obj).f274738a);
        }

        public final int hashCode() {
            ServiceBookingMviStepState.ServiceBookingAnimationUrl serviceBookingAnimationUrl = this.f274738a;
            if (serviceBookingAnimationUrl == null) {
                return 0;
            }
            return serviceBookingAnimationUrl.hashCode();
        }

        @k
        public final String toString() {
            return "OnShowAnimationOverlay(animationUrl=" + this.f274738a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$c;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f274739a;

        public c(@k String str) {
            this.f274739a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f274739a, ((c) obj).f274739a);
        }

        public final int hashCode() {
            return this.f274739a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenBackStep(currentStepId="), this.f274739a, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$d;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f274740a;

        public d(@l DeepLink deepLink) {
            this.f274740a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f274740a, ((d) obj).f274740a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f274740a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f274740a, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$e;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f274741a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Set<Object>> f274742b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@k String str, @k Map<String, ? extends Set<? extends Object>> map) {
            this.f274741a = str;
            this.f274742b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f274741a, eVar.f274741a) && L.f(this.f274742b, eVar.f274742b);
        }

        public final int hashCode() {
            return this.f274742b.hashCode() + (this.f274741a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenNextStep(nextStepId=");
            sb2.append(this.f274741a);
            sb2.append(", selectedValues=");
            return r.w(sb2, this.f274742b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$f;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f274743a;

        public f(@k String str) {
            this.f274743a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f274743a, ((f) obj).f274743a);
        }

        public final int hashCode() {
            return this.f274743a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ProcessJsonView(bduiContent="), this.f274743a, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/a$g;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f274744a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f274745b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ServiceBookingError f274746c;

        public g(@k PrintableText printableText, boolean z12, @l ServiceBookingError serviceBookingError) {
            this.f274744a = printableText;
            this.f274745b = z12;
            this.f274746c = serviceBookingError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f274744a, gVar.f274744a) && this.f274745b == gVar.f274745b && L.f(this.f274746c, gVar.f274746c);
        }

        public final int hashCode() {
            int i12 = r.i(this.f274744a.hashCode() * 31, 31, this.f274745b);
            ServiceBookingError serviceBookingError = this.f274746c;
            return i12 + (serviceBookingError == null ? 0 : serviceBookingError.hashCode());
        }

        @k
        public final String toString() {
            return "ShowToastError(message=" + this.f274744a + ", popBack=" + this.f274745b + ", customError=" + this.f274746c + ')';
        }
    }
}
