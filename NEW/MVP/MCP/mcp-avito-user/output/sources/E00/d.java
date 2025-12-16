package E00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormPrivateAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LE00/d;", "LE00/a;", "a", "LE00/d$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d extends E00.a {

    /* compiled from: PersonFormPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/d$a;", "LE00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final F00.a f3667b;

        public a(@k F00.a aVar) {
            this.f3667b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f3667b, ((a) obj).f3667b);
        }

        public final int hashCode() {
            return this.f3667b.hashCode();
        }

        @k
        public final String toString() {
            return "NewContentState(contentState=" + this.f3667b + ')';
        }
    }
}
