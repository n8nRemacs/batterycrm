package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeMappingMode.kt */
/* loaded from: classes8.dex */
public final class K {

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final K f408436k;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f408437a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f408438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f408440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f408441e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final K f408442f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f408443g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final K f408444h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final K f408445i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f408446j;

    /* compiled from: TypeMappingMode.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TypeMappingMode.kt */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Variance variance = Variance.f410069d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a(null);
        K k12 = new K(false, false, false, false, false, null, false, null, null, false, 1023, null);
        K k13 = new K(false, false, false, false, false, null, false, null, null, true, 511, null);
        new K(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f408436k = new K(false, false, false, false, false, k12, false, null, null, false, 988, null);
        new K(false, false, false, false, false, k13, false, null, null, true, 476, null);
        new K(false, true, false, false, false, k12, false, null, null, false, 988, null);
        new K(false, false, false, true, false, k12, false, null, null, false, 983, null);
        new K(false, false, false, true, false, k12, false, null, null, false, 919, null);
        new K(false, false, true, false, false, k12, false, null, null, false, 984, null);
    }

    public K() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public K(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, K k12, boolean z17, K k13, K k14, boolean z18, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? true : z12;
        z13 = (i12 & 2) != 0 ? true : z13;
        z14 = (i12 & 4) != 0 ? false : z14;
        z15 = (i12 & 8) != 0 ? false : z15;
        z16 = (i12 & 16) != 0 ? false : z16;
        k12 = (i12 & 32) != 0 ? null : k12;
        z17 = (i12 & 64) != 0 ? true : z17;
        k13 = (i12 & 128) != 0 ? k12 : k13;
        k14 = (i12 & 256) != 0 ? k12 : k14;
        z18 = (i12 & 512) != 0 ? false : z18;
        this.f408437a = z12;
        this.f408438b = z13;
        this.f408439c = z14;
        this.f408440d = z15;
        this.f408441e = z16;
        this.f408442f = k12;
        this.f408443g = z17;
        this.f408444h = k13;
        this.f408445i = k14;
        this.f408446j = z18;
    }
}
