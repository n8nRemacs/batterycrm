package Ns;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmAddNoteOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LNs/b;", "", "a", "b", "c", "LNs/b$a;", "LNs/b$b;", "LNs/b$c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ns.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14607b {

    /* compiled from: JobCrmAddNoteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNs/b$a;", "LNs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ns.b$a */
    public static final /* data */ class a implements InterfaceC14607b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11776a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11777b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f11778c;

        public a(@k String str, @k String str2, @k String str3) {
            this.f11776a = str;
            this.f11777b = str2;
            this.f11778c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f11776a, aVar.f11776a) && L.f(this.f11777b, aVar.f11777b) && L.f(this.f11778c, aVar.f11778c);
        }

        public final int hashCode() {
            return this.f11778c.hashCode() + H.d(this.f11776a.hashCode() * 31, 31, this.f11777b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetData(candidateName=");
            sb2.append(this.f11776a);
            sb2.append(", buttonName=");
            sb2.append(this.f11777b);
            sb2.append(", noteText=");
            return C22026a.c(sb2, this.f11778c, ')');
        }
    }

    /* compiled from: JobCrmAddNoteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNs/b$b;", "LNs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ns.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0767b implements InterfaceC14607b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0767b f11779a = new C0767b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0767b);
        }

        public final int hashCode() {
            return 1234188202;
        }

        @k
        public final String toString() {
            return "ShowError";
        }
    }

    /* compiled from: JobCrmAddNoteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNs/b$c;", "LNs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ns.b$c */
    public static final /* data */ class c implements InterfaceC14607b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f11780a;

        public c(@k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f11780a = jobCrmApplicationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f11780a, ((c) obj).f11780a);
        }

        public final int hashCode() {
            return this.f11780a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateResponseAndClose(item=" + this.f11780a + ')';
        }
    }
}
