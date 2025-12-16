package kotlin.jvm.internal;

import java.util.List;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.reflect.KVariance;

/* compiled from: TypeReference.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/x0;", "Lkotlin/reflect/r;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class x0 implements kotlin.reflect.r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f406861f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.g f406862b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<kotlin.reflect.t> f406863c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.r f406864d;

    /* renamed from: e, reason: collision with root package name */
    public final int f406865e;

    /* compiled from: TypeReference.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/jvm/internal/x0$a;", "", "<init>", "()V", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TypeReference.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance = KVariance.f406947b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance2 = KVariance.f406947b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeReference.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/t;", "it", "", "invoke", "(Lkotlin/reflect/t;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<kotlin.reflect.t, CharSequence> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(kotlin.reflect.t tVar) {
            String strValueOf;
            kotlin.reflect.t tVar2 = tVar;
            int i12 = x0.f406861f;
            x0.this.getClass();
            KVariance kVariance = tVar2.f410465a;
            if (kVariance == null) {
                return "*";
            }
            kotlin.reflect.r rVar = tVar2.f410466b;
            x0 x0Var = rVar instanceof x0 ? (x0) rVar : null;
            if (x0Var == null || (strValueOf = x0Var.f(true)) == null) {
                strValueOf = String.valueOf(rVar);
            }
            int iOrdinal = kVariance.ordinal();
            if (iOrdinal == 0) {
                return strValueOf;
            }
            if (iOrdinal == 1) {
                return "in ".concat(strValueOf);
            }
            if (iOrdinal == 2) {
                return "out ".concat(strValueOf);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        new a(null);
    }

    public x0() {
        throw null;
    }

    @InterfaceC42733c0
    public x0(@Y61.k kotlin.reflect.g gVar, @Y61.k List<kotlin.reflect.t> list, @Y61.l kotlin.reflect.r rVar, int i12) {
        this.f406862b = gVar;
        this.f406863c = list;
        this.f406864d = rVar;
        this.f406865e = i12;
    }

    @Override // kotlin.reflect.r
    @Y61.k
    public final List<kotlin.reflect.t> D() {
        return this.f406863c;
    }

    @Override // kotlin.reflect.r
    @Y61.k
    /* renamed from: K, reason: from getter */
    public final kotlin.reflect.g getF406862b() {
        return this.f406862b;
    }

    @Override // kotlin.reflect.r
    public final boolean d() {
        return (this.f406865e & 1) != 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (L.f(this.f406862b, x0Var.f406862b) && L.f(this.f406863c, x0Var.f406863c) && L.f(this.f406864d, x0Var.f406864d) && this.f406865e == x0Var.f406865e) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z12) {
        kotlin.reflect.g gVar = this.f406862b;
        kotlin.reflect.d dVar = gVar instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVar : null;
        Class<?> clsF = dVar != null ? ((InterfaceC42819t) dVar).f() : null;
        String string = clsF == null ? gVar.toString() : clsF.isArray() ? clsF.equals(boolean[].class) ? "kotlin.BooleanArray" : clsF.equals(char[].class) ? "kotlin.CharArray" : clsF.equals(byte[].class) ? "kotlin.ByteArray" : clsF.equals(short[].class) ? "kotlin.ShortArray" : clsF.equals(int[].class) ? "kotlin.IntArray" : clsF.equals(float[].class) ? "kotlin.FloatArray" : clsF.equals(long[].class) ? "kotlin.LongArray" : clsF.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z12 && clsF.isPrimitive()) ? X41.b.b((kotlin.reflect.d) gVar).getName() : clsF.getName();
        List<kotlin.reflect.t> list = this.f406863c;
        String strR = androidx.appcompat.app.r.r(string, list.isEmpty() ? "" : C42745f0.O(list, ", ", "<", ">", new c(), 24), d() ? "?" : "");
        kotlin.reflect.r rVar = this.f406864d;
        if (!(rVar instanceof x0)) {
            return strR;
        }
        String strF = ((x0) rVar).f(true);
        if (L.f(strF, strR)) {
            return strR;
        }
        if (L.f(strF, strR + '?')) {
            return strR + '!';
        }
        return "(" + strR + ".." + strF + ')';
    }

    public final int hashCode() {
        return Integer.hashCode(this.f406865e) + androidx.compose.foundation.H.e(this.f406862b.hashCode() * 31, 31, this.f406863c);
    }

    @Y61.k
    public final String toString() {
        return f(false) + " (Kotlin reflection is not available)";
    }
}
