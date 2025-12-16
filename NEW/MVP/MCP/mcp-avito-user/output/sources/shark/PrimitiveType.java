package shark;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrimitiveType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/PrimitiveType;", "", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public enum PrimitiveType {
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(4, 1),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(5, 2),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(6, 4),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(7, 8),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE(8, 1),
    /* JADX INFO: Fake field, exist only in values array */
    SHORT(9, 2),
    /* JADX INFO: Fake field, exist only in values array */
    INT(10, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(11, 8);


    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f438193e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f438194f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f438195g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f438196b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438197c;

    /* compiled from: PrimitiveType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/PrimitiveType$a;", "", "<init>", "()V", "", "REFERENCE_HPROF_TYPE", "I", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        PrimitiveType[] primitiveTypeArrValues = values();
        int iF2 = kotlin.collections.P0.f(primitiveTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
        for (PrimitiveType primitiveType : primitiveTypeArrValues) {
            linkedHashMap.put(Integer.valueOf(primitiveType.f438196b), Integer.valueOf(primitiveType.f438197c));
        }
        f438193e = linkedHashMap;
        PrimitiveType[] primitiveTypeArrValues2 = values();
        int iF3 = kotlin.collections.P0.f(primitiveTypeArrValues2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF3 >= 16 ? iF3 : 16);
        for (PrimitiveType primitiveType2 : primitiveTypeArrValues2) {
            linkedHashMap2.put(Integer.valueOf(primitiveType2.f438196b), primitiveType2);
        }
        f438194f = linkedHashMap2;
    }

    PrimitiveType(int i12, int i13) {
        this.f438196b = i12;
        this.f438197c = i13;
    }
}
