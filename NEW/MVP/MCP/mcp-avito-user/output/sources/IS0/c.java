package Is0;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingVibration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LIs0/c;", "", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f8578c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f8579d = new c(g.f8584a, g.f8585b);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final long[] f8580a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f8581b;

    /* compiled from: ServiceBookingVibration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIs0/c$a;", "", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k long[] jArr, @k int[] iArr) {
        this.f8580a = jArr;
        this.f8581b = iArr;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8580a.equals(cVar.f8580a) && this.f8581b.equals(cVar.f8581b);
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + ((Arrays.hashCode(this.f8581b) + (Arrays.hashCode(this.f8580a) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ServiceBookingVibrationArgs(timings=" + Arrays.toString(this.f8580a) + ", amplitudes=" + Arrays.toString(this.f8581b) + ", repeat=-1)";
    }
}
