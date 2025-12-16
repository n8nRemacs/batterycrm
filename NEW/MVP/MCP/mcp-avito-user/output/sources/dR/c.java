package Dr;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessPackageInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LDr/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LDr/c$a;", "LDr/c$b;", "LDr/c$c;", "LDr/c$d;", "LDr/c$e;", "LDr/c$f;", "LDr/c$g;", "LDr/c$h;", "LDr/c$i;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class c {

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDr/c$a;", "LDr/c;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3481a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1377266888;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/c$b;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3482a;

        public b(@k PrintableText printableText) {
            super(null);
            this.f3482a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3482a, ((b) obj).f3482a);
        }

        public final int hashCode() {
            return this.f3482a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ContactAccessPackageFailure(errorMsg="), this.f3482a, ')');
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/c$c;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dr.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0199c extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactAccessPackage f3483a;

        public C0199c(@k ContactAccessPackage contactAccessPackage) {
            super(null);
            this.f3483a = contactAccessPackage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0199c) && L.f(this.f3483a, ((C0199c) obj).f3483a);
        }

        public final int hashCode() {
            return this.f3483a.hashCode();
        }

        @k
        public final String toString() {
            return "ContactAccessPackageLoaded(contactAccessPackage=" + this.f3483a + ')';
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDr/c$d;", "LDr/c;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f3484a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1285265946;
        }

        @k
        public final String toString() {
            return "ContactAccessPackageLoading";
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/c$e;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3485a;

        public e(boolean z12) {
            super(null);
            this.f3485a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f3485a == ((e) obj).f3485a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3485a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PackageApplied(shouldShowToastMsg="), this.f3485a, ')');
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDr/c$f;", "LDr/c;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f3486a = new f();

        public f() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2141736282;
        }

        @k
        public final String toString() {
            return "PackageApplying";
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/c$g;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3487a;

        public g(@k PrintableText printableText) {
            super(null);
            this.f3487a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f3487a, ((g) obj).f3487a);
        }

        public final int hashCode() {
            return this.f3487a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("PackageApplyingFail(msg="), this.f3487a, ')');
        }
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/c$h;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends c {
    }

    /* compiled from: ContactAccessPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/c$i;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3488a;

        public i(@k DeepLink deepLink) {
            super(null);
            this.f3488a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f3488a, ((i) obj).f3488a);
        }

        public final int hashCode() {
            return this.f3488a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SwitchPayment(switchPaymentLink="), this.f3488a, ')');
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
