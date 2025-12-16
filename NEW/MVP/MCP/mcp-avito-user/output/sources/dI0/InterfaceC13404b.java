package Di0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDi0/b;", "", "a", "b", "LDi0/b$a;", "LDi0/b$b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Di0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13404b {

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDi0/b$a;", "LDi0/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Di0.b$a */
    public static final /* data */ class a implements InterfaceC13404b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f3397a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f3398b;

        public a(@l String str, @l Long l12) {
            this.f3397a = str;
            this.f3398b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3397a, aVar.f3397a) && L.f(this.f3398b, aVar.f3398b);
        }

        public final int hashCode() {
            String str = this.f3397a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l12 = this.f3398b;
            return iHashCode + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishScreen(successMessage=");
            sb2.append(this.f3397a);
            sb2.append(", requestId=");
            return m.m(sb2, this.f3398b, ')');
        }
    }

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDi0/b$b;", "LDi0/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Di0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0187b implements InterfaceC13404b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3399a;

        public C0187b(@k String str) {
            this.f3399a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0187b) && L.f(this.f3399a, ((C0187b) obj).f3399a);
        }

        public final int hashCode() {
            return this.f3399a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(errorMessage="), this.f3399a, ')');
        }
    }
}
