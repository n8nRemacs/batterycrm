package shark;

import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HprofRecordTag.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/HprofRecordTag;", "", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class HprofRecordTag {

    /* renamed from: A, reason: collision with root package name */
    public static final HprofRecordTag f438051A;

    /* renamed from: B, reason: collision with root package name */
    public static final HprofRecordTag f438052B;

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ HprofRecordTag[] f438053C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final EnumSet<HprofRecordTag> f438054D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public static final a f438055E;

    /* renamed from: b, reason: collision with root package name */
    public static final HprofRecordTag f438056b;

    /* renamed from: c, reason: collision with root package name */
    public static final HprofRecordTag f438057c;

    /* renamed from: d, reason: collision with root package name */
    public static final HprofRecordTag f438058d;

    /* renamed from: e, reason: collision with root package name */
    public static final HprofRecordTag f438059e;

    /* renamed from: f, reason: collision with root package name */
    public static final HprofRecordTag f438060f;

    /* renamed from: g, reason: collision with root package name */
    public static final HprofRecordTag f438061g;

    /* renamed from: h, reason: collision with root package name */
    public static final HprofRecordTag f438062h;

    /* renamed from: i, reason: collision with root package name */
    public static final HprofRecordTag f438063i;

    /* renamed from: j, reason: collision with root package name */
    public static final HprofRecordTag f438064j;

    /* renamed from: k, reason: collision with root package name */
    public static final HprofRecordTag f438065k;

    /* renamed from: l, reason: collision with root package name */
    public static final HprofRecordTag f438066l;

    /* renamed from: m, reason: collision with root package name */
    public static final HprofRecordTag f438067m;

    /* renamed from: n, reason: collision with root package name */
    public static final HprofRecordTag f438068n;

    /* renamed from: o, reason: collision with root package name */
    public static final HprofRecordTag f438069o;

    /* renamed from: p, reason: collision with root package name */
    public static final HprofRecordTag f438070p;

    /* renamed from: q, reason: collision with root package name */
    public static final HprofRecordTag f438071q;

    /* renamed from: r, reason: collision with root package name */
    public static final HprofRecordTag f438072r;

    /* renamed from: s, reason: collision with root package name */
    public static final HprofRecordTag f438073s;

    /* renamed from: t, reason: collision with root package name */
    public static final HprofRecordTag f438074t;

    /* renamed from: u, reason: collision with root package name */
    public static final HprofRecordTag f438075u;

    /* renamed from: v, reason: collision with root package name */
    public static final HprofRecordTag f438076v;

    /* renamed from: w, reason: collision with root package name */
    public static final HprofRecordTag f438077w;

    /* renamed from: x, reason: collision with root package name */
    public static final HprofRecordTag f438078x;

    /* renamed from: y, reason: collision with root package name */
    public static final HprofRecordTag f438079y;

    /* renamed from: z, reason: collision with root package name */
    public static final HprofRecordTag f438080z;

    /* compiled from: HprofRecordTag.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/HprofRecordTag$a;", "", "<init>", "()V", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        HprofRecordTag hprofRecordTag = new HprofRecordTag("STRING_IN_UTF8", 0);
        f438056b = hprofRecordTag;
        HprofRecordTag hprofRecordTag2 = new HprofRecordTag("LOAD_CLASS", 1);
        f438057c = hprofRecordTag2;
        HprofRecordTag hprofRecordTag3 = new HprofRecordTag("UNLOAD_CLASS", 2);
        HprofRecordTag hprofRecordTag4 = new HprofRecordTag("STACK_FRAME", 3);
        f438058d = hprofRecordTag4;
        HprofRecordTag hprofRecordTag5 = new HprofRecordTag("STACK_TRACE", 4);
        f438059e = hprofRecordTag5;
        HprofRecordTag hprofRecordTag6 = new HprofRecordTag("ALLOC_SITES", 5);
        HprofRecordTag hprofRecordTag7 = new HprofRecordTag("HEAP_SUMMARY", 6);
        HprofRecordTag hprofRecordTag8 = new HprofRecordTag("START_THREAD", 7);
        HprofRecordTag hprofRecordTag9 = new HprofRecordTag("END_THREAD", 8);
        HprofRecordTag hprofRecordTag10 = new HprofRecordTag("HEAP_DUMP", 9);
        HprofRecordTag hprofRecordTag11 = new HprofRecordTag("HEAP_DUMP_SEGMENT", 10);
        HprofRecordTag hprofRecordTag12 = new HprofRecordTag("HEAP_DUMP_END", 11);
        f438060f = hprofRecordTag12;
        HprofRecordTag hprofRecordTag13 = new HprofRecordTag("CPU_SAMPLES", 12);
        HprofRecordTag hprofRecordTag14 = new HprofRecordTag("CONTROL_SETTINGS", 13);
        HprofRecordTag hprofRecordTag15 = new HprofRecordTag("ROOT_UNKNOWN", 14);
        f438061g = hprofRecordTag15;
        HprofRecordTag hprofRecordTag16 = new HprofRecordTag("ROOT_JNI_GLOBAL", 15);
        f438062h = hprofRecordTag16;
        HprofRecordTag hprofRecordTag17 = new HprofRecordTag("ROOT_JNI_LOCAL", 16);
        f438063i = hprofRecordTag17;
        HprofRecordTag hprofRecordTag18 = new HprofRecordTag("ROOT_JAVA_FRAME", 17);
        f438064j = hprofRecordTag18;
        HprofRecordTag hprofRecordTag19 = new HprofRecordTag("ROOT_NATIVE_STACK", 18);
        f438065k = hprofRecordTag19;
        HprofRecordTag hprofRecordTag20 = new HprofRecordTag("ROOT_STICKY_CLASS", 19);
        f438066l = hprofRecordTag20;
        HprofRecordTag hprofRecordTag21 = new HprofRecordTag("ROOT_THREAD_BLOCK", 20);
        f438067m = hprofRecordTag21;
        HprofRecordTag hprofRecordTag22 = new HprofRecordTag("ROOT_MONITOR_USED", 21);
        f438068n = hprofRecordTag22;
        HprofRecordTag hprofRecordTag23 = new HprofRecordTag("ROOT_THREAD_OBJECT", 22);
        f438069o = hprofRecordTag23;
        HprofRecordTag hprofRecordTag24 = new HprofRecordTag("HEAP_DUMP_INFO", 23);
        f438070p = hprofRecordTag24;
        HprofRecordTag hprofRecordTag25 = new HprofRecordTag("ROOT_INTERNED_STRING", 24);
        f438071q = hprofRecordTag25;
        HprofRecordTag hprofRecordTag26 = new HprofRecordTag("ROOT_FINALIZING", 25);
        f438072r = hprofRecordTag26;
        HprofRecordTag hprofRecordTag27 = new HprofRecordTag("ROOT_DEBUGGER", 26);
        f438073s = hprofRecordTag27;
        HprofRecordTag hprofRecordTag28 = new HprofRecordTag("ROOT_REFERENCE_CLEANUP", 27);
        f438074t = hprofRecordTag28;
        HprofRecordTag hprofRecordTag29 = new HprofRecordTag("ROOT_VM_INTERNAL", 28);
        f438075u = hprofRecordTag29;
        HprofRecordTag hprofRecordTag30 = new HprofRecordTag("ROOT_JNI_MONITOR", 29);
        f438076v = hprofRecordTag30;
        HprofRecordTag hprofRecordTag31 = new HprofRecordTag("ROOT_UNREACHABLE", 30);
        f438077w = hprofRecordTag31;
        HprofRecordTag hprofRecordTag32 = new HprofRecordTag("PRIMITIVE_ARRAY_NODATA", 31);
        f438078x = hprofRecordTag32;
        HprofRecordTag hprofRecordTag33 = new HprofRecordTag("CLASS_DUMP", 32);
        f438079y = hprofRecordTag33;
        HprofRecordTag hprofRecordTag34 = new HprofRecordTag("INSTANCE_DUMP", 33);
        f438080z = hprofRecordTag34;
        HprofRecordTag hprofRecordTag35 = new HprofRecordTag("OBJECT_ARRAY_DUMP", 34);
        f438051A = hprofRecordTag35;
        HprofRecordTag hprofRecordTag36 = new HprofRecordTag("PRIMITIVE_ARRAY_DUMP", 35);
        f438052B = hprofRecordTag36;
        f438053C = new HprofRecordTag[]{hprofRecordTag, hprofRecordTag2, hprofRecordTag3, hprofRecordTag4, hprofRecordTag5, hprofRecordTag6, hprofRecordTag7, hprofRecordTag8, hprofRecordTag9, hprofRecordTag10, hprofRecordTag11, hprofRecordTag12, hprofRecordTag13, hprofRecordTag14, hprofRecordTag15, hprofRecordTag16, hprofRecordTag17, hprofRecordTag18, hprofRecordTag19, hprofRecordTag20, hprofRecordTag21, hprofRecordTag22, hprofRecordTag23, hprofRecordTag24, hprofRecordTag25, hprofRecordTag26, hprofRecordTag27, hprofRecordTag28, hprofRecordTag29, hprofRecordTag30, hprofRecordTag31, hprofRecordTag32, hprofRecordTag33, hprofRecordTag34, hprofRecordTag35, hprofRecordTag36};
        f438055E = new a(null);
        f438054D = EnumSet.of(hprofRecordTag15, hprofRecordTag16, hprofRecordTag17, hprofRecordTag18, hprofRecordTag19, hprofRecordTag20, hprofRecordTag21, hprofRecordTag22, hprofRecordTag23, hprofRecordTag25, hprofRecordTag26, hprofRecordTag27, hprofRecordTag28, hprofRecordTag29, hprofRecordTag30, hprofRecordTag31);
    }

    public static HprofRecordTag valueOf(String str) {
        return (HprofRecordTag) Enum.valueOf(HprofRecordTag.class, str);
    }

    public static HprofRecordTag[] values() {
        return (HprofRecordTag[]) f438053C.clone();
    }
}
