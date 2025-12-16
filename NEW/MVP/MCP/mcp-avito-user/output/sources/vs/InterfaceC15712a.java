package Vs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmListFilterAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LVs/a;", "", "a", "b", "c", "d", "e", "LVs/a$a;", "LVs/a$b;", "LVs/a$c;", "LVs/a$d;", "LVs/a$e;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15712a {

    /* compiled from: JobCrmListFilterAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVs/a$a;", "LVs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1208a implements InterfaceC15712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1208a f17449a = new C1208a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1208a);
        }

        public final int hashCode() {
            return 1505639402;
        }

        @k
        public final String toString() {
            return "ClearSelections";
        }
    }

    /* compiled from: JobCrmListFilterAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVs/a$b;", "LVs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.a$b */
    public static final /* data */ class b implements InterfaceC15712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17450a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 426972776;
        }

        @k
        public final String toString() {
            return "SaveChoice";
        }
    }

    /* compiled from: JobCrmListFilterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVs/a$c;", "LVs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.a$c */
    public static final /* data */ class c implements InterfaceC15712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17451a;

        public c(@k String str) {
            this.f17451a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17451a, ((c) obj).f17451a);
        }

        public final int hashCode() {
            return this.f17451a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchByQuery(query="), this.f17451a, ')');
        }
    }

    /* compiled from: JobCrmListFilterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVs/a$d;", "LVs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.a$d */
    public static final /* data */ class d implements InterfaceC15712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmListFilterItem f17452a;

        public d(@k JobCrmListFilterItem jobCrmListFilterItem) {
            this.f17452a = jobCrmListFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f17452a, ((d) obj).f17452a);
        }

        public final int hashCode() {
            return this.f17452a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectListItem(item=" + this.f17452a + ')';
        }
    }

    /* compiled from: JobCrmListFilterAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVs/a$e;", "LVs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.a$e */
    public static final /* data */ class e implements InterfaceC15712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17453a;

        public e(@k String str) {
            this.f17453a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f17453a, ((e) obj).f17453a);
        }

        public final int hashCode() {
            return this.f17453a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowList(listId="), this.f17453a, ')');
        }
    }
}
