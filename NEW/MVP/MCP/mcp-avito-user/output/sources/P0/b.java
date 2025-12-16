package p0;

import X41.g;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HapticFeedbackType.kt */
@g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lp0/b;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f422385b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f422386a;

    /* compiled from: HapticFeedbackType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp0/b$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a() {
            d.f422388a.getClass();
        }

        public static int b() {
            d.f422388a.getClass();
            return d.f422396i;
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f422386a == ((b) obj).f422386a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f422386a);
    }

    @k
    public final String toString() {
        f422385b.getClass();
        d dVar = d.f422388a;
        dVar.getClass();
        int i12 = d.f422389b;
        int i13 = this.f422386a;
        if (a(i13, i12)) {
            return "Confirm";
        }
        dVar.getClass();
        if (a(i13, d.f422390c)) {
            return "ContextClick";
        }
        dVar.getClass();
        if (a(i13, d.f422391d)) {
            return "GestureEnd";
        }
        dVar.getClass();
        if (a(i13, d.f422392e)) {
            return "GestureThresholdActivate";
        }
        a.a();
        if (a(i13, 0)) {
            return "LongPress";
        }
        dVar.getClass();
        if (a(i13, d.f422393f)) {
            return "Reject";
        }
        dVar.getClass();
        if (a(i13, d.f422394g)) {
            return "SegmentFrequentTick";
        }
        dVar.getClass();
        if (a(i13, d.f422395h)) {
            return "SegmentTick";
        }
        if (a(i13, a.b())) {
            return "TextHandleMove";
        }
        dVar.getClass();
        if (a(i13, d.f422397j)) {
            return "ToggleOff";
        }
        dVar.getClass();
        if (a(i13, d.f422398k)) {
            return "ToggleOn";
        }
        dVar.getClass();
        return a(i13, d.f422399l) ? "VirtualKey" : "Invalid";
    }
}
