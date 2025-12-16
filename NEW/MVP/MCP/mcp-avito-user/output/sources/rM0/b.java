package Rm0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRm0/b;", "", "a", "b", "LRm0/b$a;", "LRm0/b$b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: ReputationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRm0/b$a;", "LRm0/b;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f14609a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -290374504;
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent";
        }
    }

    /* compiled from: ReputationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRm0/b$b;", "LRm0/b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rm0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0976b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14610a;

        public C0976b(@k String str) {
            this.f14610a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0976b) && L.f(this.f14610a, ((C0976b) obj).f14610a);
        }

        public final int hashCode() {
            return this.f14610a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleBeduinState(content="), this.f14610a, ')');
        }
    }
}
