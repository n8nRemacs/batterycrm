package eu0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Leu0/a;", "", "a", "b", "c", "d", "Leu0/a$a;", "Leu0/a$b;", "Leu0/a$c;", "Leu0/a$d;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40158a {

    /* compiled from: ServiceBookingBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/a$a;", "Leu0/a;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11111a implements InterfaceC40158a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395427a;

        public C11111a(@k DeepLink deepLink) {
            this.f395427a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11111a) && L.f(this.f395427a, ((C11111a) obj).f395427a);
        }

        public final int hashCode() {
            return this.f395427a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f395427a, ')');
        }
    }

    /* compiled from: ServiceBookingBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/a$b;", "Leu0/a;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.a$b */
    public static final /* data */ class b implements InterfaceC40158a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ServiceBookingBlockParams f395428a;

        public b(@l ServiceBookingBlockParams serviceBookingBlockParams) {
            this.f395428a = serviceBookingBlockParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395428a, ((b) obj).f395428a);
        }

        public final int hashCode() {
            ServiceBookingBlockParams serviceBookingBlockParams = this.f395428a;
            if (serviceBookingBlockParams == null) {
                return 0;
            }
            return serviceBookingBlockParams.hashCode();
        }

        @k
        public final String toString() {
            return "ParamsChanged(params=" + this.f395428a + ')';
        }
    }

    /* compiled from: ServiceBookingBlockAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leu0/a$c;", "Leu0/a;", "<init>", "()V", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.a$c */
    public static final /* data */ class c implements InterfaceC40158a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f395429a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1963191686;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: ServiceBookingBlockAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leu0/a$d;", "Leu0/a;", "<init>", "()V", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.a$d */
    public static final /* data */ class d implements InterfaceC40158a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395430a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1322150990;
        }

        @k
        public final String toString() {
            return "Reset";
        }
    }
}
