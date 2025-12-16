package kotlin.reflect;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: KTypeProjection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/t;", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final /* data */ class t {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f410463c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final t f410464d = new t(null, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final KVariance f410465a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final r f410466b;

    /* compiled from: KTypeProjection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/t$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static t a(@Y61.k r rVar) {
            return new t(KVariance.f406947b, rVar);
        }

        public a() {
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f410467a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f406947b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f406947b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f406947b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f410467a = iArr;
        }
    }

    public t(@Y61.l KVariance kVariance, @Y61.l r rVar) {
        String str;
        this.f410465a = kVariance;
        this.f410466b = rVar;
        if ((kVariance == null) == (rVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f410465a == tVar.f410465a && L.f(this.f410466b, tVar.f410466b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f410465a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        r rVar = this.f410466b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        KVariance kVariance = this.f410465a;
        int i12 = kVariance == null ? -1 : b.f410467a[kVariance.ordinal()];
        if (i12 == -1) {
            return "*";
        }
        r rVar = this.f410466b;
        if (i12 == 1) {
            return String.valueOf(rVar);
        }
        if (i12 == 2) {
            return "in " + rVar;
        }
        if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + rVar;
    }
}
