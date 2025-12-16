package J90;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveConfirmAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LJ90/a;", "", "a", "LJ90/a$a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ProfileRemoveConfirmAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ90/a$a;", "LJ90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J90.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0510a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8811a;

        public C0510a(@k String str) {
            this.f8811a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0510a) && L.f(this.f8811a, ((C0510a) obj).f8811a);
        }

        public final int hashCode() {
            return this.f8811a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoveAccount(password="), this.f8811a, ')');
        }
    }
}
