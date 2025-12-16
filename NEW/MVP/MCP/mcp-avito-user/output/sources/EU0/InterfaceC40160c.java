package eu0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import du0.C39805a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Leu0/c;", "", "a", "b", "c", "d", "e", "f", "g", "Leu0/c$a;", "Leu0/c$b;", "Leu0/c$c;", "Leu0/c$d;", "Leu0/c$e;", "Leu0/c$f;", "Leu0/c$g;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eu0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40160c {

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/c$a;", "Leu0/c;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$a */
    public static final /* data */ class a implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ApiError f395436a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f395437b;

        public a(@l ApiError apiError, @l Throwable th2) {
            this.f395436a = apiError;
            this.f395437b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f395436a, aVar.f395436a) && L.f(this.f395437b, aVar.f395437b);
        }

        public final int hashCode() {
            ApiError apiError = this.f395436a;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f395437b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorActiveState(apiError=");
            sb2.append(this.f395436a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f395437b, ')');
        }
    }

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/c$b;", "Leu0/c;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$b */
    public static final /* data */ class b implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C39805a f395438a;

        public b(@l C39805a c39805a) {
            this.f395438a = c39805a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395438a, ((b) obj).f395438a);
        }

        public final int hashCode() {
            C39805a c39805a = this.f395438a;
            if (c39805a == null) {
                return 0;
            }
            return c39805a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadedActiveState(blockData=" + this.f395438a + ')';
        }
    }

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/c$c;", "Leu0/c;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11113c implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ServiceBookingBlockParams f395439a;

        public C11113c(@k ServiceBookingBlockParams serviceBookingBlockParams) {
            this.f395439a = serviceBookingBlockParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11113c) && L.f(this.f395439a, ((C11113c) obj).f395439a);
        }

        public final int hashCode() {
            return this.f395439a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadedInactiveState(params=" + this.f395439a + ')';
        }
    }

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/c$d;", "Leu0/c;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$d */
    public static final /* data */ class d implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ServiceBookingBlockParams f395440a;

        public d(@k ServiceBookingBlockParams serviceBookingBlockParams) {
            this.f395440a = serviceBookingBlockParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f395440a, ((d) obj).f395440a);
        }

        public final int hashCode() {
            return this.f395440a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingActiveState(params=" + this.f395440a + ')';
        }
    }

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leu0/c$e;", "Leu0/c;", "<init>", "()V", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$e */
    public static final /* data */ class e implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f395441a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1254423541;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/c$f;", "Leu0/c;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$f */
    public static final /* data */ class f implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395442a;

        public f(@k DeepLink deepLink) {
            this.f395442a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f395442a, ((f) obj).f395442a);
        }

        public final int hashCode() {
            return this.f395442a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f395442a, ')');
        }
    }

    /* compiled from: ServiceBookingBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leu0/c$g;", "Leu0/c;", "<init>", "()V", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.c$g */
    public static final /* data */ class g implements InterfaceC40160c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f395443a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 21073067;
        }

        @k
        public final String toString() {
            return "Reset";
        }
    }
}
