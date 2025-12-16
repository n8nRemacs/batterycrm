package Ps;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationsListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LPs/b;", "", "a", "b", "c", "d", "LPs/b$a;", "LPs/b$b;", "LPs/b$c;", "LPs/b$d;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ps.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14834b {

    /* compiled from: JobCrmApplicationsListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPs/b$a;", "LPs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.b$a */
    public static final /* data */ class a implements InterfaceC14834b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13358a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -660997477;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: JobCrmApplicationsListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPs/b$b;", "LPs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0873b implements InterfaceC14834b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0873b f13359a = new C0873b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0873b);
        }

        public final int hashCode() {
            return 624577390;
        }

        @k
        public final String toString() {
            return "RefreshCounter";
        }
    }

    /* compiled from: JobCrmApplicationsListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/b$c;", "LPs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.b$c */
    public static final /* data */ class c implements InterfaceC14834b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f13360a;

        public c(@k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f13360a = jobCrmApplicationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13360a, ((c) obj).f13360a);
        }

        public final int hashCode() {
            return this.f13360a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOptions(item=" + this.f13360a + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPs/b$d;", "LPs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ps.b$d */
    public static final /* data */ class d implements InterfaceC14834b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f13361a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13362b;

        public d(@k JobCrmApplicationItem jobCrmApplicationItem, boolean z12) {
            this.f13361a = jobCrmApplicationItem;
            this.f13362b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f13361a, dVar.f13361a) && this.f13362b == dVar.f13362b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13362b) + (this.f13361a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowResults(item=");
            sb2.append(this.f13361a);
            sb2.append(", isChatBot=");
            return r.x(sb2, this.f13362b, ')');
        }
    }
}
