package shark.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.AbstractC48345t2;
import shark.PrimitiveType;

/* compiled from: FieldValuesReader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/J;", "", "a", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    public static final int f438371d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f438372e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f438373f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f438374g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f438375h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f438376i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f438377j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f438378k;

    /* renamed from: a, reason: collision with root package name */
    public int f438379a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC48345t2.b.c.C12638b f438380b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438381c;

    /* compiled from: FieldValuesReader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lshark/internal/J$a;", "", "<init>", "()V", "", "BOOLEAN_TYPE", "I", "BYTE_TYPE", "CHAR_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", "INT_TYPE", "LONG_TYPE", "SHORT_TYPE", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
        PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
        f438371d = 4;
        PrimitiveType[] primitiveTypeArr2 = PrimitiveType.f438192d;
        f438372e = 5;
        PrimitiveType[] primitiveTypeArr3 = PrimitiveType.f438192d;
        f438373f = 6;
        PrimitiveType[] primitiveTypeArr4 = PrimitiveType.f438192d;
        f438374g = 7;
        PrimitiveType[] primitiveTypeArr5 = PrimitiveType.f438192d;
        f438375h = 8;
        PrimitiveType[] primitiveTypeArr6 = PrimitiveType.f438192d;
        f438376i = 9;
        PrimitiveType[] primitiveTypeArr7 = PrimitiveType.f438192d;
        f438377j = 10;
        PrimitiveType[] primitiveTypeArr8 = PrimitiveType.f438192d;
        f438378k = 11;
    }

    public J(@Y61.k AbstractC48345t2.b.c.C12638b c12638b, int i12) {
        this.f438380b = c12638b;
        this.f438381c = i12;
    }

    public final int a() {
        int iA2 = C48297u.a(this.f438379a, this.f438380b.f438728d);
        this.f438379a += 4;
        return iA2;
    }

    public final long b() {
        long jB2 = C48297u.b(this.f438379a, this.f438380b.f438728d);
        this.f438379a += 8;
        return jB2;
    }

    public final short c() {
        byte[] bArr = this.f438380b.f438728d;
        int i12 = this.f438379a;
        short s5 = (short) ((bArr[i12 + 1] & 255) | ((bArr[i12] & 255) << 8));
        this.f438379a = i12 + 2;
        return s5;
    }
}
