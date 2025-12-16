package shark;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReferenceMatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/N2;", "Lshark/g3;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class N2 extends g3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i3 f438164a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f438165b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<L1, Boolean> f438166c;

    /* compiled from: ReferenceMatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/L1;", "it", "", "invoke", "(Lshark/L1;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<L1, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f438167l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(L1 l12) {
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ N2(i3 i3Var, String str, Y41.l lVar, int i12, C42822w c42822w) {
        this(i3Var, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? a.f438167l : lVar);
    }

    @Override // shark.g3
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final i3 getF438164a() {
        return this.f438164a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2)) {
            return false;
        }
        N2 n22 = (N2) obj;
        return kotlin.jvm.internal.L.f(this.f438164a, n22.f438164a) && kotlin.jvm.internal.L.f(this.f438165b, n22.f438165b) && kotlin.jvm.internal.L.f(this.f438166c, n22.f438166c);
    }

    public final int hashCode() {
        i3 i3Var = this.f438164a;
        int iHashCode = (i3Var != null ? i3Var.hashCode() : 0) * 31;
        String str = this.f438165b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Y41.l<L1, Boolean> lVar = this.f438166c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "library leak: " + this.f438164a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N2(@Y61.k i3 i3Var, @Y61.k String str, @Y61.k Y41.l<? super L1, Boolean> lVar) {
        super(null);
        this.f438164a = i3Var;
        this.f438165b = str;
        this.f438166c = lVar;
    }
}
