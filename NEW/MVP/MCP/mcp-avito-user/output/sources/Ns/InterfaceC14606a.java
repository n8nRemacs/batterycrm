package Ns;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmAddNoteAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LNs/a;", "", "a", "b", "c", "LNs/a$a;", "LNs/a$b;", "LNs/a$c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ns.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14606a {

    /* compiled from: JobCrmAddNoteAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNs/a$a;", "LNs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ns.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0766a implements InterfaceC14606a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0766a f11773a = new C0766a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0766a);
        }

        public final int hashCode() {
            return 1665092463;
        }

        @k
        public final String toString() {
            return "DeleteNote";
        }
    }

    /* compiled from: JobCrmAddNoteAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNs/a$b;", "LNs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ns.a$b */
    public static final /* data */ class b implements InterfaceC14606a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11774a;

        public b(@k String str) {
            this.f11774a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f11774a, ((b) obj).f11774a);
        }

        public final int hashCode() {
            return this.f11774a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NoteInputChange(text="), this.f11774a, ')');
        }
    }

    /* compiled from: JobCrmAddNoteAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNs/a$c;", "LNs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ns.a$c */
    public static final /* data */ class c implements InterfaceC14606a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11775a;

        public c(@k String str) {
            this.f11775a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f11775a, ((c) obj).f11775a);
        }

        public final int hashCode() {
            return this.f11775a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveChanges(text="), this.f11775a, ')');
        }
    }
}
