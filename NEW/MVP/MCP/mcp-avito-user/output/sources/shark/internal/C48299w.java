package shark.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.C42823x;
import shark.AbstractC48345t2;
import shark.PrimitiveType;
import shark.internal.X;
import shark.q3;

/* compiled from: ClassFieldsReader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/w;", "", "a", "b", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48299w {

    /* renamed from: c, reason: collision with root package name */
    public static final int f438613c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f438614d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f438615e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f438616f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f438617g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f438618h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f438619i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f438620j;

    /* renamed from: a, reason: collision with root package name */
    public final int f438621a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f438622b;

    /* compiled from: ClassFieldsReader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lshark/internal/w$a;", "", "<init>", "()V", "", "BOOLEAN_TYPE", "I", "BYTE_TYPE", "CHAR_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", "INT_TYPE", "LONG_TYPE", "SHORT_TYPE", "shark-graph"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.internal.w$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: ClassFieldsReader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/w$b;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.internal.w$b */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f438623a;

        public b() {
        }

        public final byte a() {
            byte[] bArr = C48299w.this.f438622b;
            int i12 = this.f438623a;
            this.f438623a = i12 + 1;
            return bArr[i12];
        }

        public final long b() {
            int iA2;
            int i12 = C48299w.this.f438621a;
            if (i12 == 1) {
                iA2 = a();
            } else if (i12 == 2) {
                iA2 = e();
            } else {
                if (i12 != 4) {
                    if (i12 == 8) {
                        return d();
                    }
                    throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
                }
                iA2 = c();
            }
            return iA2;
        }

        public final int c() {
            byte[] bArr = C48299w.this.f438622b;
            int i12 = this.f438623a;
            int i13 = i12 + 1;
            this.f438623a = i13;
            int i14 = (bArr[i12] & 255) << 24;
            int i15 = i12 + 2;
            this.f438623a = i15;
            int i16 = ((bArr[i13] & 255) << 16) | i14;
            int i17 = i12 + 3;
            this.f438623a = i17;
            int i18 = i16 | ((bArr[i15] & 255) << 8);
            this.f438623a = i12 + 4;
            return (bArr[i17] & 255) | i18;
        }

        public final long d() {
            byte[] bArr = C48299w.this.f438622b;
            int i12 = this.f438623a;
            this.f438623a = i12 + 1;
            this.f438623a = i12 + 2;
            this.f438623a = i12 + 3;
            long j12 = ((bArr[i12] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
            this.f438623a = i12 + 4;
            long j13 = j12 | ((bArr[r4] & 255) << 32);
            this.f438623a = i12 + 5;
            long j14 = j13 | ((bArr[r7] & 255) << 24);
            this.f438623a = i12 + 6;
            long j15 = j14 | ((bArr[r4] & 255) << 16);
            this.f438623a = i12 + 7;
            long j16 = j15 | ((bArr[r7] & 255) << 8);
            this.f438623a = i12 + 8;
            return (bArr[r4] & 255) | j16;
        }

        public final short e() {
            byte[] bArr = C48299w.this.f438622b;
            int i12 = this.f438623a;
            int i13 = i12 + 1;
            this.f438623a = i13;
            int i14 = (bArr[i12] & 255) << 8;
            this.f438623a = i12 + 2;
            return (short) ((bArr[i13] & 255) | i14);
        }

        public final void f() {
            int iIntValue;
            int iE2 = e() & 65535;
            for (int i12 = 0; i12 < iE2; i12++) {
                int i13 = this.f438623a;
                C48299w c48299w = C48299w.this;
                this.f438623a = i13 + c48299w.f438621a;
                int iA2 = a() & 255;
                int i14 = this.f438623a;
                if (iA2 == 2) {
                    iIntValue = c48299w.f438621a;
                } else {
                    PrimitiveType.f438195g.getClass();
                    iIntValue = ((Number) P0.d(PrimitiveType.f438193e, Integer.valueOf(iA2))).intValue();
                }
                this.f438623a = i14 + iIntValue;
            }
        }
    }

    /* compiled from: ClassFieldsReader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lshark/internal/w$b;", "Lshark/internal/w;", "Ljava/util/ArrayList;", "Lshark/t2$b$c$a$a;", "Lkotlin/collections/ArrayList;", "invoke", "(Lshark/internal/w$b;)Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.w$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<b, ArrayList<AbstractC48345t2.b.c.a.C12636a>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f438625l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final ArrayList<AbstractC48345t2.b.c.a.C12636a> invoke(b bVar) {
            b bVar2 = bVar;
            bVar2.f();
            int iE2 = bVar2.e() & 65535;
            ArrayList<AbstractC48345t2.b.c.a.C12636a> arrayList = new ArrayList<>(iE2);
            for (int i12 = 0; i12 < iE2; i12++) {
                arrayList.add(new AbstractC48345t2.b.c.a.C12636a(bVar2.b(), bVar2.a() & 255));
            }
            return arrayList;
        }
    }

    /* compiled from: ClassFieldsReader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lshark/internal/w$b;", "Lshark/internal/w;", "Ljava/util/ArrayList;", "Lshark/t2$b$c$a$b;", "Lkotlin/collections/ArrayList;", "invoke", "(Lshark/internal/w$b;)Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.w$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<b, ArrayList<AbstractC48345t2.b.c.a.C12637b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f438626l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final ArrayList<AbstractC48345t2.b.c.a.C12637b> invoke(b bVar) {
            q3 hVar;
            b bVar2 = bVar;
            int iE2 = bVar2.e() & 65535;
            ArrayList<AbstractC48345t2.b.c.a.C12637b> arrayList = new ArrayList<>(iE2);
            for (int i12 = 0; i12 < iE2; i12++) {
                long jB2 = bVar2.b();
                int iA2 = bVar2.a() & 255;
                if (iA2 == 2) {
                    hVar = new q3.i(bVar2.b());
                } else if (iA2 == C48299w.f438613c) {
                    hVar = new q3.a(bVar2.a() != 0);
                } else if (iA2 == C48299w.f438614d) {
                    hVar = new q3.c((char) bVar2.e());
                } else if (iA2 == C48299w.f438615e) {
                    int i13 = kotlin.jvm.internal.A.f406820a;
                    hVar = new q3.f(Float.intBitsToFloat(bVar2.c()));
                } else if (iA2 == C48299w.f438616f) {
                    int i14 = C42823x.f406860a;
                    hVar = new q3.e(Double.longBitsToDouble(bVar2.d()));
                } else if (iA2 == C48299w.f438617g) {
                    hVar = new q3.b(bVar2.a());
                } else if (iA2 == C48299w.f438618h) {
                    hVar = new q3.j(bVar2.e());
                } else if (iA2 == C48299w.f438619i) {
                    hVar = new q3.g(bVar2.c());
                } else {
                    if (iA2 != C48299w.f438620j) {
                        throw new IllegalStateException(AK.c.g(iA2, "Unknown type "));
                    }
                    hVar = new q3.h(bVar2.d());
                }
                arrayList.add(new AbstractC48345t2.b.c.a.C12637b(jB2, iA2, hVar));
            }
            return arrayList;
        }
    }

    static {
        new a(null);
        PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
        f438613c = 4;
        PrimitiveType[] primitiveTypeArr2 = PrimitiveType.f438192d;
        f438614d = 5;
        PrimitiveType[] primitiveTypeArr3 = PrimitiveType.f438192d;
        f438615e = 6;
        PrimitiveType[] primitiveTypeArr4 = PrimitiveType.f438192d;
        f438616f = 7;
        PrimitiveType[] primitiveTypeArr5 = PrimitiveType.f438192d;
        f438617g = 8;
        PrimitiveType[] primitiveTypeArr6 = PrimitiveType.f438192d;
        f438618h = 9;
        PrimitiveType[] primitiveTypeArr7 = PrimitiveType.f438192d;
        f438619i = 10;
        PrimitiveType[] primitiveTypeArr8 = PrimitiveType.f438192d;
        f438620j = 11;
    }

    public C48299w(int i12, @Y61.k byte[] bArr) {
        this.f438621a = i12;
        this.f438622b = bArr;
    }

    @Y61.k
    public final List<AbstractC48345t2.b.c.a.C12636a> a(@Y61.k X.a aVar) {
        c cVar = c.f438625l;
        int i12 = aVar.f438472e;
        b bVar = new b();
        bVar.f438623a = i12;
        return cVar.invoke(bVar);
    }

    @Y61.k
    public final List<AbstractC48345t2.b.c.a.C12637b> b(@Y61.k X.a aVar) {
        d dVar = d.f438626l;
        int i12 = aVar.f438472e;
        b bVar = new b();
        bVar.f438623a = i12;
        return dVar.invoke(bVar);
    }
}
