package J90;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveConfirmOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LJ90/c;", "", "a", "b", "c", "LJ90/c$a;", "LJ90/c$b;", "LJ90/c$c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: ProfileRemoveConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ90/c$a;", "LJ90/c;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f8817a = new a();
    }

    /* compiled from: ProfileRemoveConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ90/c$b;", "LJ90/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8818a;

        public b(@k String str) {
            this.f8818a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f8818a, ((b) obj).f8818a);
        }

        public final int hashCode() {
            return this.f8818a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnRemoveFailure(message="), this.f8818a, ')');
        }
    }

    /* compiled from: ProfileRemoveConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ90/c$c;", "LJ90/c;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J90.c$c, reason: collision with other inner class name */
    public static final class C0512c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0512c f8819a = new C0512c();
    }
}
