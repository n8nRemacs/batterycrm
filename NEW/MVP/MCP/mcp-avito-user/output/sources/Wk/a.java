package WK;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedFeedbackScreenAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LWK/a;", "", "a", "b", "c", "LWK/a$a;", "LWK/a$b;", "LWK/a$c;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: IacFinishedFeedbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWK/a$a;", "LWK/a;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WK.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1262a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17855a;

        public C1262a(@k String str) {
            this.f17855a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1262a) && L.f(this.f17855a, ((C1262a) obj).f17855a);
        }

        public final int hashCode() {
            return this.f17855a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnBottomSheetClosed(comment="), this.f17855a, ')');
        }
    }

    /* compiled from: IacFinishedFeedbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWK/a$b;", "LWK/a;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17856a;

        public b(int i12) {
            this.f17856a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f17856a == ((b) obj).f17856a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f17856a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnProblemClicked(problem="), this.f17856a, ')');
        }
    }

    /* compiled from: IacFinishedFeedbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWK/a$c;", "LWK/a;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17857a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17858b;

        public c(int i12, boolean z12) {
            this.f17857a = i12;
            this.f17858b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f17857a == cVar.f17857a && this.f17858b == cVar.f17858b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17858b) + (Integer.hashCode(this.f17857a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnRatingClicked(rating=");
            sb2.append(this.f17857a);
            sb2.append(", isFromBottomSheet=");
            return r.x(sb2, this.f17858b, ')');
        }
    }
}
