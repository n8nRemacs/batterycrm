package Er;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ContactAccessService;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessServiceInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LEr/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "LEr/b$a;", "LEr/b$b;", "LEr/b$c;", "LEr/b$d;", "LEr/b$e;", "LEr/b$f;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class b {

    /* compiled from: ContactAccessServiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEr/b$a;", "LEr/b;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f4350a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -733551095;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ContactAccessServiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEr/b$b;", "LEr/b;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Er.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0262b extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f4351a;

        public C0262b(@k Throwable th2) {
            super(null);
            this.f4351a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0262b) && L.f(this.f4351a, ((C0262b) obj).f4351a);
        }

        public final int hashCode() {
            return this.f4351a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadFailure(t="), this.f4351a, ')');
        }
    }

    /* compiled from: ContactAccessServiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEr/b$c;", "LEr/b;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactAccessService f4352a;

        public c(@k ContactAccessService contactAccessService) {
            super(null);
            this.f4352a = contactAccessService;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4352a, ((c) obj).f4352a);
        }

        public final int hashCode() {
            return this.f4352a.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(content=" + this.f4352a + ')';
        }
    }

    /* compiled from: ContactAccessServiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEr/b$d;", "LEr/b;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f4353a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 256890074;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ContactAccessServiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEr/b$e;", "LEr/b;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f4354a = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1932303089;
        }

        @k
        public final String toString() {
            return "ProfileIsIncomplete";
        }
    }

    /* compiled from: ContactAccessServiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEr/b$f;", "LEr/b;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4355a;

        public f(@k String str) {
            super(null);
            this.f4355a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f4355a, ((f) obj).f4355a);
        }

        public final int hashCode() {
            return this.f4355a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackbar(msg="), this.f4355a, ')');
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
