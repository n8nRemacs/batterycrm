package Rs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: FiltersAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LRs/a;", "", "a", "b", "c", "d", "e", "f", "g", "LRs/a$a;", "LRs/a$b;", "LRs/a$c;", "LRs/a$d;", "LRs/a$e;", "LRs/a$f;", "LRs/a$g;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15076a {

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRs/a$a;", "LRs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0987a implements InterfaceC15076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0987a f14699a = new C0987a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0987a);
        }

        public final int hashCode() {
            return -179036911;
        }

        @k
        public final String toString() {
            return "ApplyFilters";
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/a$b;", "LRs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$b */
    public static final /* data */ class b implements InterfaceC15076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14700a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmListFilterItem f14701b;

        public b(@k String str, @k JobCrmListFilterItem jobCrmListFilterItem) {
            this.f14700a = str;
            this.f14701b = jobCrmListFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f14700a, bVar.f14700a) && L.f(this.f14701b, bVar.f14701b);
        }

        public final int hashCode() {
            return this.f14701b.hashCode() + (this.f14700a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ChipsClicked(filterId=" + this.f14700a + ", clickedOption=" + this.f14701b + ')';
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRs/a$c;", "LRs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$c */
    public static final /* data */ class c implements InterfaceC15076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14702a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -535717592;
        }

        @k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/a$d;", "LRs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$d */
    public static final /* data */ class d implements InterfaceC15076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14703a;

        public d(@k String str) {
            this.f14703a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f14703a, ((d) obj).f14703a);
        }

        public final int hashCode() {
            return this.f14703a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DropSelectFilterOptions(filterId="), this.f14703a, ')');
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/a$e;", "LRs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$e */
    public static final /* data */ class e implements InterfaceC15076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14704a;

        public e(@k String str) {
            this.f14704a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f14704a, ((e) obj).f14704a);
        }

        public final int hashCode() {
            return this.f14704a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OptionsSelected(filterId="), this.f14704a, ')');
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/a$f;", "LRs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$f */
    public static final /* data */ class f implements InterfaceC15076a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14705a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Q<Long, Long> f14706b;

        public f(@k String str, @k Q<Long, Long> q12) {
            this.f14705a = str;
            this.f14706b = q12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f14705a, fVar.f14705a) && L.f(this.f14706b, fVar.f14706b);
        }

        public final int hashCode() {
            return this.f14706b.hashCode() + (this.f14705a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RangeChanged(filterId=");
            sb2.append(this.f14705a);
            sb2.append(", range=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(sb2, this.f14706b, ')');
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRs/a$g;", "LRs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs.a$g */
    public static final /* data */ class g implements InterfaceC15076a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowFilters(filters=null)";
        }
    }
}
