package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import Y61.k;
import Y61.l;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: KotlinClassHeader.kt */
@s0
/* loaded from: classes8.dex */
public final class KotlinClassHeader {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Kind f408489a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m51.e f408490b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String[] f408491c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String[] f408492d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String[] f408493e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f408494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f408495g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KotlinClassHeader.kt */
    @s0
    public static final class Kind {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f408496c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final LinkedHashMap f408497d;

        /* renamed from: e, reason: collision with root package name */
        public static final Kind f408498e;

        /* renamed from: f, reason: collision with root package name */
        public static final Kind f408499f;

        /* renamed from: g, reason: collision with root package name */
        public static final Kind f408500g;

        /* renamed from: h, reason: collision with root package name */
        public static final Kind f408501h;

        /* renamed from: i, reason: collision with root package name */
        public static final Kind f408502i;

        /* renamed from: j, reason: collision with root package name */
        public static final Kind f408503j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f408504k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f408505l;

        /* renamed from: b, reason: collision with root package name */
        public final int f408506b;

        /* compiled from: KotlinClassHeader.kt */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Kind kind = new Kind(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            f408498e = kind;
            Kind kind2 = new Kind("CLASS", 1, 1);
            f408499f = kind2;
            Kind kind3 = new Kind("FILE_FACADE", 2, 2);
            f408500g = kind3;
            Kind kind4 = new Kind("SYNTHETIC_CLASS", 3, 3);
            f408501h = kind4;
            Kind kind5 = new Kind("MULTIFILE_CLASS", 4, 4);
            f408502i = kind5;
            Kind kind6 = new Kind("MULTIFILE_CLASS_PART", 5, 5);
            f408503j = kind6;
            Kind[] kindArr = {kind, kind2, kind3, kind4, kind5, kind6};
            f408504k = kindArr;
            f408505l = kotlin.enums.c.a(kindArr);
            f408496c = new a(null);
            Kind[] kindArrValues = values();
            int iF2 = P0.f(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
            for (Kind kind7 : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind7.f408506b), kind7);
            }
            f408497d = linkedHashMap;
        }

        public Kind(String str, int i12, int i13) {
            this.f408506b = i13;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f408504k.clone();
        }
    }

    public KotlinClassHeader(@k Kind kind, @k m51.e eVar, @l String[] strArr, @l String[] strArr2, @l String[] strArr3, @l String str, int i12) {
        this.f408489a = kind;
        this.f408490b = eVar;
        this.f408491c = strArr;
        this.f408492d = strArr2;
        this.f408493e = strArr3;
        this.f408494f = str;
        this.f408495g = i12;
    }

    @k
    public final String toString() {
        return this.f408489a + " version=" + this.f408490b;
    }
}
