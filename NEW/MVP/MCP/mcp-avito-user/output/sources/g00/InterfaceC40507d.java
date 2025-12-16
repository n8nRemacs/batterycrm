package g00;

import X41.g;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: TimerTime.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lg00/d;", "", "a", "b", "Lg00/d$a;", "Lg00/d$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g00.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40507d {

    /* compiled from: TimerTime.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lg00/d$a;", "Lg00/d;", "value", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g00.d$a */
    public static final class a implements InterfaceC40507d {

        /* renamed from: a, reason: collision with root package name */
        public final long f396214a;

        private /* synthetic */ a(long j12) {
            this.f396214a = j12;
        }

        public static final /* synthetic */ a a(long j12) {
            return new a(j12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f396214a == ((a) obj).f396214a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f396214a);
        }

        public final String toString() {
            return r.u(new StringBuilder("Millis(value="), this.f396214a, ')');
        }
    }

    /* compiled from: TimerTime.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lg00/d$b;", "Lg00/d;", "value", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g00.d$b */
    public static final class b implements InterfaceC40507d {

        /* renamed from: a, reason: collision with root package name */
        public final float f396215a;

        private /* synthetic */ b(float f12) {
            this.f396215a = f12;
        }

        public static final /* synthetic */ b a(float f12) {
            return new b(f12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Float.compare(this.f396215a, ((b) obj).f396215a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f396215a);
        }

        public final String toString() {
            return "Seconds(value=" + this.f396215a + ')';
        }
    }
}
