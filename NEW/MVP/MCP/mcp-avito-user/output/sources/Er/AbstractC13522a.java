package Er;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessServiceAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LEr/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "LEr/a$a;", "LEr/a$b;", "LEr/a$c;", "LEr/a$d;", "LEr/a$e;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Er.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13522a {

    /* compiled from: ContactAccessServiceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEr/a$a;", "LEr/a;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Er.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0261a extends AbstractC13522a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0261a f4345a = new C0261a();

        public C0261a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0261a);
        }

        public final int hashCode() {
            return -1298965086;
        }

        @k
        public final String toString() {
            return "OnBackClicked";
        }
    }

    /* compiled from: ContactAccessServiceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEr/a$b;", "LEr/a;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Er.a$b */
    public static final /* data */ class b extends AbstractC13522a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f4346a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 198483363;
        }

        @k
        public final String toString() {
            return "OnChoosePaymentMethodButtonClicked";
        }
    }

    /* compiled from: ContactAccessServiceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEr/a$c;", "LEr/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Er.a$c */
    public static final class c extends AbstractC13522a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4347a;

        public c(@k DeepLink deepLink) {
            super(null);
            this.f4347a = deepLink;
        }
    }

    /* compiled from: ContactAccessServiceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEr/a$d;", "LEr/a;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Er.a$d */
    public static final /* data */ class d extends AbstractC13522a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f4348a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 548074539;
        }

        @k
        public final String toString() {
            return "OnRetryButtonClicked";
        }
    }

    /* compiled from: ContactAccessServiceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEr/a$e;", "LEr/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Er.a$e */
    public static final /* data */ class e extends AbstractC13522a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4349a;

        public e(@k String str) {
            super(null);
            this.f4349a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f4349a, ((e) obj).f4349a);
        }

        public final int hashCode() {
            return this.f4349a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackBar(msg="), this.f4349a, ')');
        }
    }

    public /* synthetic */ AbstractC13522a(C42822w c42822w) {
        this();
    }

    public AbstractC13522a() {
    }
}
