package Vs;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmListFilterInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LVs/b;", "", "a", "b", "c", "d", "e", "LVs/b$a;", "LVs/b$b;", "LVs/b$c;", "LVs/b$d;", "LVs/b$e;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15713b {

    /* compiled from: JobCrmListFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVs/b$a;", "LVs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.b$a */
    public static final /* data */ class a implements InterfaceC15713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17454a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1489991908;
        }

        @k
        public final String toString() {
            return "ClearSelectionsInternal";
        }
    }

    /* compiled from: JobCrmListFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVs/b$b;", "LVs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1209b implements InterfaceC15713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1209b f17455a = new C1209b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1209b);
        }

        public final int hashCode() {
            return -1774461176;
        }

        @k
        public final String toString() {
            return "SaveChoiceInternal";
        }
    }

    /* compiled from: JobCrmListFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVs/b$c;", "LVs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.b$c */
    public static final /* data */ class c implements InterfaceC15713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17456a;

        public c(@k String str) {
            this.f17456a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17456a, ((c) obj).f17456a);
        }

        public final int hashCode() {
            return this.f17456a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchByQueryInternal(query="), this.f17456a, ')');
        }
    }

    /* compiled from: JobCrmListFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVs/b$d;", "LVs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.b$d */
    public static final /* data */ class d implements InterfaceC15713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmListFilterItem f17457a;

        public d(@k JobCrmListFilterItem jobCrmListFilterItem) {
            this.f17457a = jobCrmListFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f17457a, ((d) obj).f17457a);
        }

        public final int hashCode() {
            return this.f17457a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectListItemInternal(item=" + this.f17457a + ')';
        }
    }

    /* compiled from: JobCrmListFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVs/b$e;", "LVs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vs.b$e */
    public static final /* data */ class e implements InterfaceC15713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17458a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<JobCrmListFilterItem> f17459b;

        public e(@k String str, @k List<JobCrmListFilterItem> list) {
            this.f17458a = str;
            this.f17459b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f17458a, eVar.f17458a) && L.f(this.f17459b, eVar.f17459b);
        }

        public final int hashCode() {
            return this.f17459b.hashCode() + (this.f17458a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowInitialListInternal(listId=");
            sb2.append(this.f17458a);
            sb2.append(", list=");
            return H.p(sb2, this.f17459b, ')');
        }
    }
}
