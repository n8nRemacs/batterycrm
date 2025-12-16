package vQ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sQ.C48095e;

/* compiled from: JobInterviewInvitationActions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LvQ/d;", "", "a", "b", "c", "d", "e", "f", "LvQ/d$a;", "LvQ/d$b;", "LvQ/d$c;", "LvQ/d$d;", "LvQ/d$e;", "LvQ/d$f;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vQ.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49252d {

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/d$a;", "LvQ/d;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.d$a */
    public static final class a implements InterfaceC49252d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440746a = new a();
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/d$b;", "LvQ/d;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.d$b */
    public static final class b implements InterfaceC49252d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440747a = new b();
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/d$c;", "LvQ/d;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.d$c */
    public static final /* data */ class c implements InterfaceC49252d {

        /* renamed from: a, reason: collision with root package name */
        public final int f440748a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.job.interview.domain.a f440749b;

        public c(int i12, @k com.avito.android.job.interview.domain.a aVar) {
            this.f440748a = i12;
            this.f440749b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f440748a == cVar.f440748a && L.f(this.f440749b, cVar.f440749b);
        }

        public final int hashCode() {
            return this.f440749b.hashCode() + (Integer.hashCode(this.f440748a) * 31);
        }

        @k
        public final String toString() {
            return "OpenDatePicker(pos=" + this.f440748a + ", dateEntry=" + this.f440749b + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/d$d;", "LvQ/d;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.d$d, reason: collision with other inner class name */
    public static final /* data */ class C12769d implements InterfaceC49252d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C48095e f440750a;

        public C12769d(@l C48095e c48095e) {
            this.f440750a = c48095e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12769d) && L.f(this.f440750a, ((C12769d) obj).f440750a);
        }

        public final int hashCode() {
            C48095e c48095e = this.f440750a;
            if (c48095e == null) {
                return 0;
            }
            return c48095e.hashCode();
        }

        @k
        public final String toString() {
            return "OpenLocationPicker(location=" + this.f440750a + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ/d$e;", "LvQ/d;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.d$e */
    public static final /* data */ class e implements InterfaceC49252d {

        /* renamed from: a, reason: collision with root package name */
        public final int f440751a;

        public e(int i12) {
            this.f440751a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f440751a == ((e) obj).f440751a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440751a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OpenTimePicker(pos="), this.f440751a, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/d$f;", "LvQ/d;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.d$f */
    public static final class f implements InterfaceC49252d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f440752a = new f();
    }
}
