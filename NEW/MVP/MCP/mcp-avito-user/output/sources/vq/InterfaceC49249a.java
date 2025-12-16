package vQ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sQ.C48095e;

/* compiled from: JobInterviewInvitationActions.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LvQ/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LvQ/a$a;", "LvQ/a$b;", "LvQ/a$c;", "LvQ/a$d;", "LvQ/a$e;", "LvQ/a$f;", "LvQ/a$g;", "LvQ/a$h;", "LvQ/a$i;", "LvQ/a$j;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vQ.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49249a {

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$a;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12768a implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440727a;

        public C12768a(@k String str) {
            this.f440727a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12768a) && L.f(this.f440727a, ((C12768a) obj).f440727a);
        }

        public final int hashCode() {
            return this.f440727a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangePhone(phone="), this.f440727a, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/a$b;", "LvQ/a;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$b */
    public static final class b implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440728a = new b();
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$c;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$c */
    public static final /* data */ class c implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        public final int f440729a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f440730b;

        /* renamed from: c, reason: collision with root package name */
        public final int f440731c;

        /* renamed from: d, reason: collision with root package name */
        public final int f440732d;

        public c(int i12, int i13, @k String str, int i14) {
            this.f440729a = i12;
            this.f440730b = str;
            this.f440731c = i13;
            this.f440732d = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f440729a == cVar.f440729a && L.f(this.f440730b, cVar.f440730b) && this.f440731c == cVar.f440731c && this.f440732d == cVar.f440732d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440732d) + r.e(this.f440731c, H.d(Integer.hashCode(this.f440729a) * 31, 31, this.f440730b), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DatePicked(pos=");
            sb2.append(this.f440729a);
            sb2.append(", title=");
            sb2.append(this.f440730b);
            sb2.append(", day=");
            sb2.append(this.f440731c);
            sb2.append(", month=");
            return r.t(sb2, this.f440732d, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/a$d;", "LvQ/a;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$d */
    public static final class d implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f440733a = new d();
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$e;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$e */
    public static final /* data */ class e implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressParameter.Value f440734a;

        public e(@k AddressParameter.Value value) {
            this.f440734a = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f440734a, ((e) obj).f440734a);
        }

        public final int hashCode() {
            return this.f440734a.hashCode();
        }

        @k
        public final String toString() {
            return "LocationPicked(result=" + this.f440734a + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$f;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$f */
    public static final /* data */ class f implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        public final int f440735a;

        public f(int i12) {
            this.f440735a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f440735a == ((f) obj).f440735a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440735a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PickDate(pos="), this.f440735a, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$g;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$g */
    public static final /* data */ class g implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C48095e f440736a;

        public g(@l C48095e c48095e) {
            this.f440736a = c48095e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f440736a, ((g) obj).f440736a);
        }

        public final int hashCode() {
            C48095e c48095e = this.f440736a;
            if (c48095e == null) {
                return 0;
            }
            return c48095e.hashCode();
        }

        @k
        public final String toString() {
            return "PickLocation(location=" + this.f440736a + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$h;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$h */
    public static final /* data */ class h implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        public final int f440737a;

        public h(int i12) {
            this.f440737a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f440737a == ((h) obj).f440737a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440737a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PickTime(pos="), this.f440737a, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/a$i;", "LvQ/a;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$i */
    public static final class i implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f440738a = new i();
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/a$j;", "LvQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.a$j */
    public static final /* data */ class j implements InterfaceC49249a {

        /* renamed from: a, reason: collision with root package name */
        public final int f440739a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.job.interview.pickers.k f440740b;

        public j(int i12, @k com.avito.android.job.interview.pickers.k kVar) {
            this.f440739a = i12;
            this.f440740b = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f440739a == jVar.f440739a && L.f(this.f440740b, jVar.f440740b);
        }

        public final int hashCode() {
            return this.f440740b.hashCode() + (Integer.hashCode(this.f440739a) * 31);
        }

        @k
        public final String toString() {
            return "TimePicked(pos=" + this.f440739a + ", result=" + this.f440740b + ')';
        }
    }
}
