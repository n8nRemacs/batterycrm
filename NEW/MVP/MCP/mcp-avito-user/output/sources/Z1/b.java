package Z1;

import X41.n;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SimpleSQLiteQuery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZ1/b;", "LZ1/g;", "a", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements g {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f19814d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19815b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Object[] f19816c;

    /* compiled from: SimpleSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/b$a;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        public static void a(@k f fVar, @l Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i12 = 0;
            while (i12 < length) {
                Object obj = objArr[i12];
                i12++;
                if (obj == null) {
                    fVar.B4(i12);
                } else if (obj instanceof byte[]) {
                    fVar.u4(i12, (byte[]) obj);
                } else if (obj instanceof Float) {
                    fVar.f3(((Number) obj).floatValue(), i12);
                } else if (obj instanceof Double) {
                    fVar.f3(((Number) obj).doubleValue(), i12);
                } else if (obj instanceof Long) {
                    fVar.g1(i12, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    fVar.g1(i12, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    fVar.g1(i12, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    fVar.g1(i12, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    fVar.h4(i12, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i12 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    fVar.g1(i12, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }

        public a() {
        }
    }

    public b(@k String str, @l Object[] objArr) {
        this.f19815b = str;
        this.f19816c = objArr;
    }

    @Override // Z1.g
    @k
    /* renamed from: a, reason: from getter */
    public final String getF19815b() {
        return this.f19815b;
    }

    @Override // Z1.g
    public final void b(@k f fVar) {
        f19814d.getClass();
        a.a(fVar, this.f19816c);
    }
}
