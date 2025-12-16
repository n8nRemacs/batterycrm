package Bt0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItemDetailsAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LBt0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LBt0/a$a;", "LBt0/a$b;", "LBt0/a$c;", "LBt0/a$d;", "LBt0/a$e;", "LBt0/a$f;", "LBt0/a$g;", "LBt0/a$h;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13184a {

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBt0/a$a;", "LBt0/a;", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$a, reason: collision with other inner class name */
    public static final class C0074a implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0074a f1753a = new C0074a();
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBt0/a$b;", "LBt0/a;", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$b */
    public static final class b implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f1754a = new b();
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/a$c;", "LBt0/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$c */
    public static final /* data */ class c implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.service_booking_common.blueprints.contact.c f1755a;

        public c(@k com.avito.android.service_booking_common.blueprints.contact.c cVar) {
            this.f1755a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f1755a, ((c) obj).f1755a);
        }

        public final int hashCode() {
            return this.f1755a.hashCode();
        }

        @k
        public final String toString() {
            return "OnContactBlockClicked(item=" + this.f1755a + ')';
        }
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/a$d;", "LBt0/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$d */
    public static final /* data */ class d implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f1756a;

        public d(@k DeepLink deepLink) {
            this.f1756a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f1756a, ((d) obj).f1756a);
        }

        public final int hashCode() {
            return this.f1756a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deepLink="), this.f1756a, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/a$e;", "LBt0/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$e */
    public static final /* data */ class e implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f1757a;

        public e(@l String str) {
            this.f1757a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f1757a, ((e) obj).f1757a);
        }

        public final int hashCode() {
            String str = this.f1757a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnFailureActionResult(text="), this.f1757a, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/a$f;", "LBt0/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$f */
    public static final /* data */ class f implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f1758a;

        public f(@l String str) {
            this.f1758a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f1758a, ((f) obj).f1758a);
        }

        public final int hashCode() {
            String str = this.f1758a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSuccessActionResult(message="), this.f1758a, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBt0/a$g;", "LBt0/a;", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$g */
    public static final class g implements InterfaceC13184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f1759a = new g();
    }

    /* compiled from: ServiceBookingItemDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/a$h;", "LBt0/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.a$h */
    public static final /* data */ class h implements InterfaceC13184a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(-1);
        }

        @k
        public final String toString() {
            return "SetActivityResult(result=-1)";
        }
    }
}
