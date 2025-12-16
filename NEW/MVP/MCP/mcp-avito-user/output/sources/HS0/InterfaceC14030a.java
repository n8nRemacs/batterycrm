package Hs0;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_common.blueprints.SbInputItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qt0.C47438b;
import qt0.C47439c;
import qt0.C47440d;

/* compiled from: ServiceBookingMviStepAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"LHs0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "LHs0/a$a;", "LHs0/a$b;", "LHs0/a$c;", "LHs0/a$d;", "LHs0/a$e;", "LHs0/a$f;", "LHs0/a$g;", "LHs0/a$h;", "LHs0/a$i;", "LHs0/a$j;", "LHs0/a$k;", "LHs0/a$l;", "LHs0/a$m;", "LHs0/a$n;", "LHs0/a$o;", "LHs0/a$p;", "LHs0/a$q;", "LHs0/a$r;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14030a {

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$a;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0442a implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47438b f7778a;

        public C0442a(@Y61.k C47438b c47438b) {
            this.f7778a = c47438b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0442a) && L.f(this.f7778a, ((C0442a) obj).f7778a);
        }

        public final int hashCode() {
            return this.f7778a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnAnySpecialistClicked(specialist=" + this.f7778a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHs0/a$b;", "LHs0/a;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$b */
    public static final /* data */ class b implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f7779a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1416047980;
        }

        @Y61.k
        public final String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHs0/a$c;", "LHs0/a;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$c */
    public static final /* data */ class c implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f7780a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1810969921;
        }

        @Y61.k
        public final String toString() {
            return "OnCloseButtonClicked";
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$d;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$d */
    public static final /* data */ class d implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.service_booking_common.blueprints.comment.c f7781a;

        public d(@Y61.k com.avito.android.service_booking_common.blueprints.comment.c cVar) {
            this.f7781a = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f7781a, ((d) obj).f7781a);
        }

        public final int hashCode() {
            return this.f7781a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnCommentEdited(comment=" + this.f7781a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$e;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$e */
    public static final /* data */ class e implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47440d f7782a;

        public e(@Y61.k C47440d c47440d) {
            this.f7782a = c47440d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f7782a, ((e) obj).f7782a);
        }

        public final int hashCode() {
            return this.f7782a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnDayScrolled(scrollDay=" + this.f7782a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$f;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$f */
    public static final /* data */ class f implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47440d.a f7783a;

        public f(@Y61.k C47440d.a aVar) {
            this.f7783a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f7783a, ((f) obj).f7783a);
        }

        public final int hashCode() {
            return this.f7783a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnDaySelected(day=" + this.f7783a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$g;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$g */
    public static final /* data */ class g implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f7784a;

        public g(@Y61.k DeepLink deepLink) {
            this.f7784a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f7784a, ((g) obj).f7784a);
        }

        public final int hashCode() {
            return this.f7784a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deepLink="), this.f7784a, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$h;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$h */
    public static final /* data */ class h implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SbInputItem f7785a;

        public h(@Y61.k SbInputItem sbInputItem) {
            this.f7785a = sbInputItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f7785a, ((h) obj).f7785a);
        }

        public final int hashCode() {
            return this.f7785a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnInputChanged(input=" + this.f7785a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$i;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$i */
    public static final /* data */ class i implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SbInputItem f7786a;

        public i(@Y61.k SbInputItem sbInputItem) {
            this.f7786a = sbInputItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f7786a, ((i) obj).f7786a);
        }

        public final int hashCode() {
            return this.f7786a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnInputFocused(input=" + this.f7786a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHs0/a$j;", "LHs0/a;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$j */
    public static final /* data */ class j implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f7787a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 415650292;
        }

        @Y61.k
        public final String toString() {
            return "OnNextStepButtonClicked";
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$k;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$k */
    public static final /* data */ class k implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f7788a;

        public k(@Y61.k LinkedHashMap linkedHashMap) {
            this.f7788a = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f7788a.equals(((k) obj).f7788a);
        }

        public final int hashCode() {
            return this.f7788a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.e(new StringBuilder("OnNextStepButtonClickedFromBeduin(params="), this.f7788a, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHs0/a$l;", "LHs0/a;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$l */
    public static final /* data */ class l implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f7789a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 2014115276;
        }

        @Y61.k
        public final String toString() {
            return "OnReloadClicked";
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$m;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$m */
    public static final /* data */ class m implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47439c.a f7790a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f7791b;

        public m(@Y61.k C47439c.a aVar, @Y61.k String str) {
            this.f7790a = aVar;
            this.f7791b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f7790a, mVar.f7790a) && L.f(this.f7791b, mVar.f7791b);
        }

        public final int hashCode() {
            return this.f7791b.hashCode() + (this.f7790a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnServiceClicked(value=");
            sb2.append(this.f7790a);
            sb2.append(", paramId=");
            return C22026a.c(sb2, this.f7791b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$n;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$n */
    public static final /* data */ class n implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47439c f7792a;

        public n(@Y61.k C47439c c47439c) {
            this.f7792a = c47439c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f7792a, ((n) obj).f7792a);
        }

        public final int hashCode() {
            return this.f7792a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnServiceGroupClicked(priceGroup=" + this.f7792a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$o;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$o */
    public static final /* data */ class o implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47439c.a f7793a;

        public o(@Y61.k C47439c.a aVar) {
            this.f7793a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f7793a, ((o) obj).f7793a);
        }

        public final int hashCode() {
            return this.f7793a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnServiceInfoClicked(info=" + this.f7793a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$p;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$p */
    public static final /* data */ class p implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47440d.a f7794a;

        public p(@Y61.k C47440d.a aVar) {
            this.f7794a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f7794a, ((p) obj).f7794a);
        }

        public final int hashCode() {
            return this.f7794a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSlotSelected(slot=" + this.f7794a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$q;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$q */
    public static final /* data */ class q implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final qt0.j f7795a;

        public q(@Y61.k qt0.j jVar) {
            this.f7795a = jVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f7795a, ((q) obj).f7795a);
        }

        public final int hashCode() {
            return this.f7795a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSpecialistClicked(specialist=" + this.f7795a + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/a$r;", "LHs0/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs0.a$r */
    public static final /* data */ class r implements InterfaceC14030a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47440d.a f7796a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, String> f7797b;

        public r(@Y61.k C47440d.a aVar, @Y61.k Map<String, String> map) {
            this.f7796a = aVar;
            this.f7797b = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f7796a, rVar.f7796a) && L.f(this.f7797b, rVar.f7797b);
        }

        public final int hashCode() {
            return this.f7797b.hashCode() + (this.f7796a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTimeSlotRequest(day=");
            sb2.append(this.f7796a);
            sb2.append(", optionsMap=");
            return androidx.appcompat.app.r.w(sb2, this.f7797b, ')');
        }
    }
}
