package Dr;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LDr/a;", "", "<init>", "()V", "a", "b", "c", "d", "LDr/a$a;", "LDr/a$b;", "LDr/a$c;", "LDr/a$d;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13434a {

    /* compiled from: ContactAccessOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/a$a;", "LDr/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dr.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0197a extends AbstractC13434a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3473a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f3474b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0197a() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0197a)) {
                return false;
            }
            C0197a c0197a = (C0197a) obj;
            return this.f3473a == c0197a.f3473a && L.f(this.f3474b, c0197a.f3474b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f3473a) * 31;
            DeepLink deepLink = this.f3474b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseDialog(needToUpdate=");
            sb2.append(this.f3473a);
            sb2.append(", switchPaymentLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f3474b, ')');
        }

        public /* synthetic */ C0197a(boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : deepLink, (i12 & 1) != 0 ? false : z12);
        }

        public C0197a(@l DeepLink deepLink, boolean z12) {
            super(null);
            this.f3473a = z12;
            this.f3474b = deepLink;
        }
    }

    /* compiled from: ContactAccessOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/a$b;", "LDr/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dr.a$b */
    public static final /* data */ class b extends AbstractC13434a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<AbstractC13434a> f3475a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k List<? extends AbstractC13434a> list) {
            super(null);
            this.f3475a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3475a, ((b) obj).f3475a);
        }

        public final int hashCode() {
            return this.f3475a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ListOfEvents(events="), this.f3475a, ')');
        }
    }

    /* compiled from: ContactAccessOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDr/a$c;", "LDr/a;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dr.a$c */
    public static final /* data */ class c extends AbstractC13434a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3476a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1996668861;
        }

        @k
        public final String toString() {
            return "ShowSuccessToast";
        }
    }

    /* compiled from: ContactAccessOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDr/a$d;", "LDr/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dr.a$d */
    public static final class d extends AbstractC13434a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3477a;

        public d(@k PrintableText printableText) {
            super(null);
            this.f3477a = printableText;
        }
    }

    public /* synthetic */ AbstractC13434a(C42822w c42822w) {
        this();
    }

    public AbstractC13434a() {
    }
}
