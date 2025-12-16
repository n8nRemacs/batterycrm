package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrimitiveType.kt */
/* loaded from: classes8.dex */
public final class PrimitiveType {

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Set<PrimitiveType> f407159f;

    /* renamed from: g, reason: collision with root package name */
    public static final PrimitiveType f407160g;

    /* renamed from: h, reason: collision with root package name */
    public static final PrimitiveType f407161h;

    /* renamed from: i, reason: collision with root package name */
    public static final PrimitiveType f407162i;

    /* renamed from: j, reason: collision with root package name */
    public static final PrimitiveType f407163j;

    /* renamed from: k, reason: collision with root package name */
    public static final PrimitiveType f407164k;

    /* renamed from: l, reason: collision with root package name */
    public static final PrimitiveType f407165l;

    /* renamed from: m, reason: collision with root package name */
    public static final PrimitiveType f407166m;

    /* renamed from: n, reason: collision with root package name */
    public static final PrimitiveType f407167n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ PrimitiveType[] f407168o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407169p;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f407170b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f407171c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f407172d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f407173e;

    /* compiled from: PrimitiveType.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PrimitiveType.kt */
    public static final class b extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.name.c> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
            return n.f407339l.c(PrimitiveType.this.f407171c);
        }
    }

    /* compiled from: PrimitiveType.kt */
    public static final class c extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.name.c> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
            return n.f407339l.c(PrimitiveType.this.f407170b);
        }
    }

    static {
        PrimitiveType primitiveType = new PrimitiveType("BOOLEAN", 0, "Boolean");
        f407160g = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("CHAR", 1, "Char");
        f407161h = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("BYTE", 2, "Byte");
        f407162i = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("SHORT", 3, "Short");
        f407163j = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("INT", 4, "Int");
        f407164k = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("FLOAT", 5, "Float");
        f407165l = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("LONG", 6, "Long");
        f407166m = primitiveType7;
        PrimitiveType primitiveType8 = new PrimitiveType("DOUBLE", 7, "Double");
        f407167n = primitiveType8;
        PrimitiveType[] primitiveTypeArr = {primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8};
        f407168o = primitiveTypeArr;
        f407169p = kotlin.enums.c.a(primitiveTypeArr);
        new a(null);
        f407159f = C42756l.l0(new PrimitiveType[]{primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8});
    }

    public PrimitiveType(String str, int i12, String str2) {
        this.f407170b = kotlin.reflect.jvm.internal.impl.name.f.e(str2);
        this.f407171c = kotlin.reflect.jvm.internal.impl.name.f.e(str2.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407172d = C42727D.b(lazyThreadSafetyMode, new c());
        this.f407173e = C42727D.b(lazyThreadSafetyMode, new b());
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) f407168o.clone();
    }
}
