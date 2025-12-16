package dr0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SendEsiaDataOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ldr0/c;", "", "<init>", "()V", "a", "b", "Ldr0/c$a;", "Ldr0/c$b;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dr0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC39791c {

    /* compiled from: SendEsiaDataOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr0/c$a;", "Ldr0/c;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.c$a */
    public static final /* data */ class a extends AbstractC39791c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394158a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -554529741;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SendEsiaDataOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/c$b;", "Ldr0/c;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.c$b */
    public static final /* data */ class b extends AbstractC39791c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f394159a;

        public b(@k DeepLink deepLink) {
            super(null);
            this.f394159a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f394159a, ((b) obj).f394159a);
        }

        public final int hashCode() {
            return this.f394159a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(resultDeepLink="), this.f394159a, ')');
        }
    }

    public /* synthetic */ AbstractC39791c(C42822w c42822w) {
        this();
    }

    public AbstractC39791c() {
    }
}
