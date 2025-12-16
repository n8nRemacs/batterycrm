package et;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvListEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Let/a;", "", "a", "b", "c", "d", "e", "f", "Let/a$a;", "Let/a$b;", "Let/a$c;", "Let/a$d;", "Let/a$e;", "Let/a$f;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: et.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40155a {

    /* compiled from: CvListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let/a$a;", "Let/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11109a implements InterfaceC40155a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final FilterItem f395408a;

        public C11109a(@k FilterItem filterItem) {
            this.f395408a = filterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11109a) && L.f(this.f395408a, ((C11109a) obj).f395408a);
        }

        public final int hashCode() {
            return this.f395408a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFilter(filter=" + this.f395408a + ')';
        }
    }

    /* compiled from: CvListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let/a$b;", "Let/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et.a$b */
    public static final /* data */ class b implements InterfaceC40155a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<FilterItem> f395409a;

        public b(@k List<FilterItem> list) {
            this.f395409a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395409a, ((b) obj).f395409a);
        }

        public final int hashCode() {
            return this.f395409a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowAllFilters(filters="), this.f395409a, ')');
        }
    }

    /* compiled from: CvListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let/a$c;", "Let/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et.a$c */
    public static final /* data */ class c implements InterfaceC40155a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395410a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.toggle_comparison_state.a f395411b;

        public c(boolean z12, @k com.avito.android.toggle_comparison_state.a aVar) {
            this.f395410a = z12;
            this.f395411b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f395410a == cVar.f395410a && L.f(this.f395411b, cVar.f395411b);
        }

        public final int hashCode() {
            return this.f395411b.hashCode() + (Boolean.hashCode(this.f395410a) * 31);
        }

        @k
        public final String toString() {
            return "ShowComparisonResult(isCompared=" + this.f395410a + ", message=" + this.f395411b + ')';
        }
    }

    /* compiled from: CvListEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Let/a$d;", "Let/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et.a$d */
    public static final /* data */ class d implements InterfaceC40155a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395412a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -86348613;
        }

        @k
        public final String toString() {
            return "ShowError";
        }
    }

    /* compiled from: CvListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let/a$e;", "Let/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et.a$e */
    public static final /* data */ class e implements InterfaceC40155a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CvItem f395413a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f395414b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CvStatus f395415c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f395416d;

        public e(@k CvItem cvItem, boolean z12, @k CvStatus cvStatus, @k String str) {
            this.f395413a = cvItem;
            this.f395414b = z12;
            this.f395415c = cvStatus;
            this.f395416d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f395413a, eVar.f395413a) && this.f395414b == eVar.f395414b && L.f(this.f395415c, eVar.f395415c) && L.f(this.f395416d, eVar.f395416d);
        }

        public final int hashCode() {
            return this.f395416d.hashCode() + ((this.f395415c.hashCode() + r.i(this.f395413a.hashCode() * 31, 31, this.f395414b)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowNote(item=");
            sb2.append(this.f395413a);
            sb2.append(", isFavorite=");
            sb2.append(this.f395414b);
            sb2.append(", status=");
            sb2.append(this.f395415c);
            sb2.append(", noteText=");
            return C22026a.c(sb2, this.f395416d, ')');
        }
    }

    /* compiled from: CvListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let/a$f;", "Let/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et.a$f */
    public static final /* data */ class f implements InterfaceC40155a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CvItem f395417a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvStatus f395418b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<CvStatus> f395419c;

        public f(@k CvItem cvItem, @k CvStatus cvStatus, @k List<CvStatus> list) {
            this.f395417a = cvItem;
            this.f395418b = cvStatus;
            this.f395419c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f395417a, fVar.f395417a) && L.f(this.f395418b, fVar.f395418b) && L.f(this.f395419c, fVar.f395419c);
        }

        public final int hashCode() {
            return this.f395419c.hashCode() + ((this.f395418b.hashCode() + (this.f395417a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowStatus(item=");
            sb2.append(this.f395417a);
            sb2.append(", status=");
            sb2.append(this.f395418b);
            sb2.append(", statusList=");
            return H.p(sb2, this.f395419c, ')');
        }
    }
}
