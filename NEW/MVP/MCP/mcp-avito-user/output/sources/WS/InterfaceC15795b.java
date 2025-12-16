package Ws;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmNotesListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LWs/b;", "", "a", "LWs/b$a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ws.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15795b {

    /* compiled from: JobCrmNotesListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWs/b$a;", "LWs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ws.b$a */
    public static final /* data */ class a implements InterfaceC15795b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f18073a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f18074b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f18075c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f18076d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f18077e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f18078f;

        public a(@l String str, @k String str2, @k String str3, @k String str4, @l String str5, @l String str6) {
            this.f18073a = str;
            this.f18074b = str2;
            this.f18075c = str3;
            this.f18076d = str4;
            this.f18077e = str5;
            this.f18078f = str6;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f18073a, aVar.f18073a) && L.f(this.f18074b, aVar.f18074b) && L.f(this.f18075c, aVar.f18075c) && L.f(this.f18076d, aVar.f18076d) && L.f(this.f18077e, aVar.f18077e) && L.f(this.f18078f, aVar.f18078f);
        }

        public final int hashCode() {
            String str = this.f18073a;
            int iD2 = H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f18074b), 31, this.f18075c), 31, this.f18076d);
            String str2 = this.f18077e;
            int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f18078f;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddNewNote(noteText=");
            sb2.append(this.f18073a);
            sb2.append(", candidateName=");
            sb2.append(this.f18074b);
            sb2.append(", applicantId=");
            sb2.append(this.f18075c);
            sb2.append(", applicationId=");
            sb2.append(this.f18076d);
            sb2.append(", vacancyId=");
            sb2.append(this.f18077e);
            sb2.append(", cvId=");
            return C22026a.c(sb2, this.f18078f, ')');
        }
    }
}
