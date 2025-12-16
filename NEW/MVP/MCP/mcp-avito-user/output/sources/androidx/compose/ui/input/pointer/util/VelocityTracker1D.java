package androidx.compose.ui.input.pointer.util;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import r0.C47470a;
import r0.d;
import s0.C47949a;

/* compiled from: VelocityTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "Strategy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VelocityTracker1D {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40291a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Strategy f40292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40293c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C47470a[] f40294d;

    /* renamed from: e, reason: collision with root package name */
    public int f40295e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final float[] f40296f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final float[] f40297g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final float[] f40298h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VelocityTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Strategy {

        /* renamed from: b, reason: collision with root package name */
        public static final Strategy f40299b;

        /* renamed from: c, reason: collision with root package name */
        public static final Strategy f40300c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f40301d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40302e;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            f40299b = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            f40300c = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            f40301d = strategyArr;
            f40302e = c.a(strategyArr);
        }

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f40301d.clone();
        }
    }

    /* compiled from: VelocityTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Strategy strategy = Strategy.f40299b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final void a(long j12, float f12) {
        int i12 = (this.f40295e + 1) % 20;
        this.f40295e = i12;
        C47470a[] c47470aArr = this.f40294d;
        C47470a c47470a = c47470aArr[i12];
        if (c47470a != null) {
            c47470a.f429558a = j12;
            c47470a.f429559b = f12;
        } else {
            C47470a c47470a2 = new C47470a();
            c47470a2.f429558a = j12;
            c47470a2.f429559b = f12;
            c47470aArr[i12] = c47470a2;
        }
    }

    public final float b(float f12) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        boolean z12;
        float f13;
        float fSignum;
        float f14 = 0.0f;
        if (f12 <= 0.0f) {
            C47949a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i12 = this.f40295e;
        C47470a[] c47470aArr = this.f40294d;
        C47470a c47470a = c47470aArr[i12];
        if (c47470a == null) {
            f13 = 0.0f;
        } else {
            int i13 = 0;
            C47470a c47470a2 = c47470a;
            while (true) {
                C47470a c47470a3 = c47470aArr[i12];
                boolean z13 = this.f40291a;
                strategy = this.f40292b;
                fArr = this.f40296f;
                fArr2 = this.f40297g;
                if (c47470a3 == null) {
                    z12 = z13;
                    break;
                }
                long j12 = c47470a.f429558a;
                int i14 = i12;
                long j13 = c47470a3.f429558a;
                float f15 = j12 - j13;
                z12 = z13;
                float fAbs = Math.abs(j13 - c47470a2.f429558a);
                c47470a2 = (strategy == Strategy.f40299b || z12) ? c47470a3 : c47470a;
                if (f15 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i13] = c47470a3.f429559b;
                fArr2[i13] = -f15;
                i12 = (i14 == 0 ? 20 : i14) - 1;
                i13++;
                if (i13 >= 20) {
                    break;
                }
            }
            if (i13 >= this.f40293c) {
                int iOrdinal = strategy.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f40298h;
                        d.c(fArr2, fArr, i13, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = 0.0f;
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i15 = i13 - 1;
                    float f16 = fArr2[i15];
                    int i16 = i15;
                    float fAbs2 = 0.0f;
                    while (i16 > 0) {
                        int i17 = i16 - 1;
                        float f17 = fArr2[i17];
                        if (f16 != f17) {
                            float f18 = (z12 ? -fArr[i17] : fArr[i16] - fArr[i17]) / (f16 - f17);
                            fAbs2 += Math.abs(f18) * (f18 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i16 == i15) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i16--;
                        f16 = f17;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f14 = fSignum * 1000;
            } else {
                f14 = 0.0f;
            }
            f13 = 0.0f;
        }
        return (f14 == f13 || Float.isNaN(f14)) ? f13 : f14 > f13 ? s.c(f14, f12) : s.a(f14, -f12);
    }

    public VelocityTracker1D(boolean z12, @k Strategy strategy) {
        int i12;
        this.f40291a = z12;
        this.f40292b = strategy;
        if (z12 && strategy.equals(Strategy.f40299b)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            i12 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 2;
        }
        this.f40293c = i12;
        this.f40294d = new C47470a[20];
        this.f40296f = new float[20];
        this.f40297g = new float[20];
        this.f40298h = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z12, Strategy strategy, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? Strategy.f40299b : strategy);
    }

    public VelocityTracker1D(int i12) {
        this(true, Strategy.f40300c);
    }
}
