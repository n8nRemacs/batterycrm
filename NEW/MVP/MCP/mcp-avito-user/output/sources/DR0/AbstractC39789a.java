package dr0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SendEsiaDataAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ldr0/a;", "", "<init>", "()V", "a", "b", "c", "d", "Ldr0/a$a;", "Ldr0/a$b;", "Ldr0/a$c;", "Ldr0/a$d;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC39789a {

    /* compiled from: SendEsiaDataAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr0/a$a;", "Ldr0/a;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11041a extends AbstractC39789a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11041a f394149a = new C11041a();

        public C11041a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11041a);
        }

        public final int hashCode() {
            return 450504866;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SendEsiaDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/a$b;", "Ldr0/a;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.a$b */
    public static final /* data */ class b extends AbstractC39789a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394150a;

        public b(@k String str) {
            super(null);
            this.f394150a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f394150a, ((b) obj).f394150a);
        }

        public final int hashCode() {
            return this.f394150a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Retry(retryEsiaLink="), this.f394150a, ')');
        }
    }

    /* compiled from: SendEsiaDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/a$c;", "Ldr0/a;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.a$c */
    public static final /* data */ class c extends AbstractC39789a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394151a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f394152b;

        public c(@k String str, @k String str2) {
            super(null);
            this.f394151a = str;
            this.f394152b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f394151a, cVar.f394151a) && L.f(this.f394152b, cVar.f394152b);
        }

        public final int hashCode() {
            return this.f394152b.hashCode() + (this.f394151a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendEsiaData(authCode=");
            sb2.append(this.f394151a);
            sb2.append(", authState=");
            return C22026a.c(sb2, this.f394152b, ')');
        }
    }

    /* compiled from: SendEsiaDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/a$d;", "Ldr0/a;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.a$d */
    public static final /* data */ class d extends AbstractC39789a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f394153a;

        public d(@k DeepLink deepLink) {
            super(null);
            this.f394153a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f394153a, ((d) obj).f394153a);
        }

        public final int hashCode() {
            return this.f394153a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(resultDeepLink="), this.f394153a, ')');
        }
    }

    public /* synthetic */ AbstractC39789a(C42822w c42822w) {
        this();
    }

    public AbstractC39789a() {
    }
}
