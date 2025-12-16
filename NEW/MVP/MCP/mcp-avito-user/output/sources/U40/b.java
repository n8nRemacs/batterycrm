package U40;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LU40/b;", "", "a", "b", "c", "d", "LU40/b$c;", "LU40/b$d;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: OrderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU40/b$a;", "LU40/b$d;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f16168a;

        public a(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f16168a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f16168a, ((a) obj).f16168a);
        }

        public final int hashCode() {
            return this.f16168a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f16168a + ')';
        }
    }

    /* compiled from: OrderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU40/b$b;", "LU40/b$c;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: U40.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1097b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16169a;

        public C1097b(@k String str) {
            this.f16169a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1097b) && L.f(this.f16169a, ((C1097b) obj).f16169a);
        }

        public final int hashCode() {
            return this.f16169a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleBeduinState(content="), this.f16169a, ')');
        }
    }

    /* compiled from: OrderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"LU40/b$c;", "LU40/b;", "LU40/b$b;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends b {
    }

    /* compiled from: OrderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"LU40/b$d;", "LU40/b;", "LU40/b$a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends b {
    }
}
