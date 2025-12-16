package Ps;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationsListAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LPs/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LPs/a$a;", "LPs/a$b;", "LPs/a$c;", "LPs/a$d;", "LPs/a$e;", "LPs/a$f;", "LPs/a$g;", "LPs/a$h;", "LPs/a$i;", "LPs/a$j;", "LPs/a$k;", "LPs/a$l;", "LPs/a$m;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ps.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14833a {

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$a;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0872a implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmBannerItem f13342a;

        public C0872a(@Y61.k JobCrmBannerItem jobCrmBannerItem) {
            this.f13342a = jobCrmBannerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0872a) && L.f(this.f13342a, ((C0872a) obj).f13342a);
        }

        public final int hashCode() {
            return this.f13342a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BannerActionClick(item=" + this.f13342a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$b;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$b */
    public static final /* data */ class b implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13343a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f13344b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f13345c;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f13343a = str;
            this.f13344b = str2;
            this.f13345c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f13343a, bVar.f13343a) && L.f(this.f13344b, bVar.f13344b) && L.f(this.f13345c, bVar.f13345c);
        }

        public final int hashCode() {
            return this.f13345c.hashCode() + H.d(this.f13343a.hashCode() * 31, 31, this.f13344b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeResponseStatus(itemId=");
            sb2.append(this.f13343a);
            sb2.append(", oldStatus=");
            sb2.append(this.f13344b);
            sb2.append(", newStatus=");
            return C22026a.c(sb2, this.f13345c, ')');
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$c;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$c */
    public static final /* data */ class c implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13346a;

        public c(@Y61.k String str) {
            this.f13346a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13346a, ((c) obj).f13346a);
        }

        public final int hashCode() {
            return this.f13346a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadMore(lastHashId="), this.f13346a, ')');
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$d;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$d */
    public static final /* data */ class d implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13347a;

        public d(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13347a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13347a, ((d) obj).f13347a);
        }

        public final int hashCode() {
            return this.f13347a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenChangeStatus(item=" + this.f13347a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$e;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$e */
    public static final /* data */ class e implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13348a;

        public e(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13348a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13348a, ((e) obj).f13348a);
        }

        public final int hashCode() {
            return this.f13348a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenChat(item=" + this.f13348a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$f;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$f */
    public static final /* data */ class f implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13349a;

        public f(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13349a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f13349a, ((f) obj).f13349a);
        }

        public final int hashCode() {
            return this.f13349a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCv(item=" + this.f13349a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$g;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$g */
    public static final /* data */ class g implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13350a;

        public g(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13350a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f13350a, ((g) obj).f13350a);
        }

        public final int hashCode() {
            return this.f13350a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenNotes(item=" + this.f13350a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$h;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$h */
    public static final /* data */ class h implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13351a;

        public h(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13351a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f13351a, ((h) obj).f13351a);
        }

        public final int hashCode() {
            return this.f13351a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenOptions(item=" + this.f13351a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$i;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$i */
    public static final /* data */ class i implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13352a;

        public i(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13352a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f13352a, ((i) obj).f13352a);
        }

        public final int hashCode() {
            return this.f13352a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenPhone(item=" + this.f13352a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$j;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$j */
    public static final /* data */ class j implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13353a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13354b;

        public j(@Y61.k JobCrmApplicationItem jobCrmApplicationItem, boolean z12) {
            this.f13353a = jobCrmApplicationItem;
            this.f13354b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f13353a, jVar.f13353a) && this.f13354b == jVar.f13354b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13354b) + (this.f13353a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenResults(item=");
            sb2.append(this.f13353a);
            sb2.append(", isChatbot=");
            return r.x(sb2, this.f13354b, ')');
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPs/a$k;", "LPs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$k */
    public static final /* data */ class k implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f13355a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1291030629;
        }

        @Y61.k
        public final String toString() {
            return "RefreshList";
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPs/a$l;", "LPs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$l */
    public static final /* data */ class l implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f13356a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1250352149;
        }

        @Y61.k
        public final String toString() {
            return "ReloadList";
        }
    }

    /* compiled from: JobCrmApplicationsListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/a$m;", "LPs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.a$m */
    public static final /* data */ class m implements InterfaceC14833a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobCrmApplicationItem f13357a;

        public m(@Y61.k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13357a = jobCrmApplicationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f13357a, ((m) obj).f13357a);
        }

        public final int hashCode() {
            return this.f13357a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateItemContents(item=" + this.f13357a + ')';
        }
    }
}
