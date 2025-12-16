package Ko;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: TimerInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LKo/a;", "", "a", "b", "LKo/a$a;", "LKo/a$b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ko.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14335a {

    /* compiled from: TimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKo/a$a;", "LKo/a;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ko.a$a, reason: collision with other inner class name */
    public static final class C0596a implements InterfaceC14335a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0596a f9653a = new C0596a();
    }

    /* compiled from: TimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKo/a$b;", "LKo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ko.a$b */
    public static final /* data */ class b implements InterfaceC14335a {

        /* renamed from: a, reason: collision with root package name */
        public final long f9654a;

        public b(long j12) {
            this.f9654a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f9654a == ((b) obj).f9654a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f9654a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("Update(secondsLeft="), this.f9654a, ')');
        }
    }
}
