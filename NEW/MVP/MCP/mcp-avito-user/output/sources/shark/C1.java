package shark;

import java.io.File;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;

/* compiled from: HeapAnalysis.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/C1;", "Lshark/B1;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class C1 extends B1 {
    private static final long serialVersionUID = 8483254400637792414L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final File f438006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f438007c;

    /* renamed from: d, reason: collision with root package name */
    public final long f438008d;

    /* renamed from: e, reason: collision with root package name */
    public final long f438009e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final HeapAnalysisException f438010f;

    /* compiled from: HeapAnalysis.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/C1$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ C1(File file, long j12, long j13, long j14, HeapAnalysisException heapAnalysisException, int i12, C42822w c42822w) {
        this(file, j12, (i12 & 4) != 0 ? -1L : j13, j14, heapAnalysisException);
    }

    public static C1 d(C1 c12, long j12, long j13, int i12) {
        File file = c12.f438006b;
        long j14 = c12.f438007c;
        if ((i12 & 4) != 0) {
            j12 = c12.f438008d;
        }
        HeapAnalysisException heapAnalysisException = c12.f438010f;
        c12.getClass();
        return new C1(file, j14, j12, j13, heapAnalysisException);
    }

    @Override // shark.B1
    /* renamed from: a, reason: from getter */
    public final long getF438009e() {
        return this.f438009e;
    }

    @Override // shark.B1
    /* renamed from: b, reason: from getter */
    public final long getF438008d() {
        return this.f438008d;
    }

    @Override // shark.B1
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final File getF438006b() {
        return this.f438006b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c12 = (C1) obj;
        return kotlin.jvm.internal.L.f(this.f438006b, c12.f438006b) && this.f438007c == c12.f438007c && this.f438008d == c12.f438008d && this.f438009e == c12.f438009e && kotlin.jvm.internal.L.f(this.f438010f, c12.f438010f);
    }

    public final int hashCode() {
        File file = this.f438006b;
        int iHashCode = file != null ? file.hashCode() : 0;
        long j12 = this.f438007c;
        int i12 = ((iHashCode * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f438008d;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f438009e;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        HeapAnalysisException heapAnalysisException = this.f438010f;
        return i14 + (heapAnalysisException != null ? heapAnalysisException.hashCode() : 0);
    }

    @Y61.k
    public final String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        String str2 = "Unknown";
        StringBuilder sb2 = new StringBuilder("====================================\nHEAP ANALYSIS FAILED\n\nYou can report this failure at https://github.com/square/leakcanary/issues\nPlease provide the stacktrace, metadata and the heap dump file.\n====================================\nSTACKTRACE\n\n");
        sb2.append(this.f438010f);
        sb2.append("====================================\nMETADATA\n\nBuild.VERSION.SDK_INT: ");
        try {
            obj3 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").get(null);
        } catch (Exception unused) {
            iIntValue = -1;
        }
        if (obj3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        iIntValue = ((Integer) obj3).intValue();
        sb2.append(iIntValue);
        sb2.append("\nBuild.MANUFACTURER: ");
        try {
            obj2 = Class.forName("android.os.Build").getDeclaredField("MANUFACTURER").get(null);
        } catch (Exception unused2) {
            str = "Unknown";
        }
        if (obj2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        str = (String) obj2;
        sb2.append(str);
        sb2.append("\nLeakCanary version: ");
        try {
            Field declaredField = Class.forName("leakcanary.internal.InternalLeakCanary").getDeclaredField("version");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused3) {
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        str2 = (String) obj;
        sb2.append(str2);
        sb2.append("\nAnalysis duration: ");
        sb2.append(this.f438009e);
        sb2.append(" ms\nHeap dump file path: ");
        sb2.append(this.f438006b.getAbsolutePath());
        sb2.append("\nHeap dump timestamp: ");
        return AK.c.j(this.f438007c, "\n====================================", sb2);
    }

    public C1(@Y61.k File file, long j12, long j13, long j14, @Y61.k HeapAnalysisException heapAnalysisException) {
        super(null);
        this.f438006b = file;
        this.f438007c = j12;
        this.f438008d = j13;
        this.f438009e = j14;
        this.f438010f = heapAnalysisException;
    }
}
