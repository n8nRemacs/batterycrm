package cO0;

import X41.g;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: TimerTime.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LcO0/d;", "", "a", "b", "LcO0/d$a;", "LcO0/d$b;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cO0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC27080d {

    /* compiled from: TimerTime.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LcO0/d$a;", "LcO0/d;", "value", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cO0.d$a */
    public static final class a implements InterfaceC27080d {

        /* renamed from: a, reason: collision with root package name */
        public final long f57851a;

        private /* synthetic */ a(long j12) {
            this.f57851a = j12;
        }

        public static final /* synthetic */ a a(long j12) {
            return new a(j12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f57851a == ((a) obj).f57851a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f57851a);
        }

        public final String toString() {
            return r.u(new StringBuilder("Millis(value="), this.f57851a, ')');
        }
    }

    /* compiled from: TimerTime.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LcO0/d$b;", "LcO0/d;", "value", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cO0.d$b */
    public static final class b implements InterfaceC27080d {

        /* renamed from: a, reason: collision with root package name */
        public final float f57852a;

        private /* synthetic */ b(float f12) {
            this.f57852a = f12;
        }

        public static final /* synthetic */ b a(float f12) {
            return new b(f12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Float.compare(this.f57852a, ((b) obj).f57852a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f57852a);
        }

        public final String toString() {
            return "Seconds(value=" + this.f57852a + ')';
        }
    }
}
