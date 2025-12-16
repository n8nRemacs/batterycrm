package androidx.compose.runtime.changelist;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.K0;
import androidx.compose.runtime.O2;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.A;
import kotlin.collections.B;
import kotlin.collections.C;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Operations.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/changelist/g;", "Landroidx/compose/runtime/changelist/h;", "<init>", "()V", "a", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public int f38246b;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public int f38248d;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    public int f38250f;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public d[] f38245a = new d[16];

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @k
    public int[] f38247c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @k
    public Object[] f38249e = new Object[16];

    /* compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/g$a;", "Landroidx/compose/runtime/changelist/e;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public int f38251a;

        /* renamed from: b, reason: collision with root package name */
        public int f38252b;

        /* renamed from: c, reason: collision with root package name */
        public int f38253c;

        public a() {
        }

        public final int a(int i12) {
            return g.this.f38247c[this.f38252b + i12];
        }

        public final <T> T b(int i12) {
            return (T) g.this.f38249e[this.f38253c + i12];
        }

        public final boolean c() {
            int i12 = this.f38251a;
            g gVar = g.this;
            int i13 = gVar.f38246b;
            if (i12 >= i13) {
                return false;
            }
            d dVar = gVar.f38245a[i12];
            this.f38252b += dVar.f38205a;
            this.f38253c += dVar.f38206b;
            int i14 = i12 + 1;
            this.f38251a = i14;
            return i14 < i13;
        }
    }

    /* compiled from: Operations.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/g$b;", "", "stack", "Landroidx/compose/runtime/changelist/g;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final g f38255a;

        public static final <T> void a(g gVar, int i12, T t12) {
            gVar.f38249e[(gVar.f38250f - gVar.f38245a[gVar.f38246b - 1].f38206b) + i12] = t12;
        }

        public static final <T, U> void b(g gVar, int i12, T t12, int i13, U u12) {
            int i14 = gVar.f38250f - gVar.f38245a[gVar.f38246b - 1].f38206b;
            Object[] objArr = gVar.f38249e;
            objArr[i12 + i14] = t12;
            objArr[i14 + i13] = u12;
        }

        public static final void c(g gVar, Object obj, Object obj2, Object obj3) {
            int i12 = gVar.f38250f - gVar.f38245a[gVar.f38246b - 1].f38206b;
            Object[] objArr = gVar.f38249e;
            objArr[i12] = obj;
            objArr[i12 + 1] = obj2;
            objArr[i12 + 2] = obj3;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return L.f(this.f38255a, ((b) obj).f38255a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f38255a.hashCode();
        }

        public final String toString() {
            return "WriteScope(stack=" + this.f38255a + ')';
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> extends N implements l<T, CharSequence> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f38257m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f38257m = str;
        }

        @Override // Y41.l
        public final CharSequence invoke(Object obj) {
            return g.this.d(obj, this.f38257m);
        }
    }

    @Override // androidx.compose.runtime.changelist.h
    @k
    public final String a(@k String str) {
        String string;
        StringBuilder sb2 = new StringBuilder();
        if (f()) {
            a aVar = new a();
            int i12 = 0;
            while (true) {
                sb2.append(str);
                int i13 = i12 + 1;
                sb2.append(i12);
                sb2.append(". ");
                d dVar = g.this.f38245a[aVar.f38251a];
                int i14 = dVar.f38205a;
                int i15 = dVar.f38206b;
                if (i14 == 0 && i15 == 0) {
                    string = dVar.b();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(dVar.b());
                    sb3.append('(');
                    String str2 = str + "    ";
                    boolean z12 = true;
                    for (int i16 = 0; i16 < dVar.f38205a; i16++) {
                        String strC = dVar.c(i16);
                        if (z12) {
                            z12 = false;
                        } else {
                            sb3.append(", ");
                        }
                        sb3.append('\n');
                        sb3.append(str2);
                        sb3.append(strC);
                        sb3.append(" = ");
                        sb3.append(aVar.a(i16));
                    }
                    for (int i17 = 0; i17 < i15; i17++) {
                        String strD = dVar.d(i17);
                        if (z12) {
                            z12 = false;
                        } else {
                            sb3.append(", ");
                        }
                        sb3.append('\n');
                        sb3.append(str2);
                        sb3.append(strD);
                        sb3.append(" = ");
                        sb3.append(d(aVar.b(i17), str2));
                    }
                    sb3.append('\n');
                    sb3.append(str);
                    sb3.append(")");
                    string = sb3.toString();
                }
                sb2.append(string);
                sb2.append('\n');
                if (!aVar.c()) {
                    break;
                }
                i12 = i13;
            }
        }
        return sb2.toString();
    }

    public final void b() {
        this.f38246b = 0;
        this.f38248d = 0;
        Arrays.fill(this.f38249e, 0, this.f38250f, (Object) null);
        this.f38250f = 0;
    }

    public final void c(@k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
        if (f()) {
            a aVar = new a();
            do {
                g.this.f38245a[aVar.f38251a].a(aVar, interfaceC22078i, o22, l12);
            } while (aVar.c());
        }
        b();
    }

    public final String d(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return h(C42756l.e((Object[]) obj), str);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            return h(iArr.length == 0 ? C42784z0.f406748b : new A(iArr), str);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            return h(jArr.length == 0 ? C42784z0.f406748b : new B(jArr), str);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            return h(fArr.length == 0 ? C42784z0.f406748b : new C(fArr), str);
        }
        if (!(obj instanceof double[])) {
            return obj instanceof Iterable ? h((Iterable) obj, str) : obj instanceof h ? ((h) obj).a(str) : obj.toString();
        }
        double[] dArr = (double[]) obj;
        return h(dArr.length == 0 ? C42784z0.f406748b : new D(dArr), str);
    }

    public final boolean e() {
        return this.f38246b == 0;
    }

    public final boolean f() {
        return this.f38246b != 0;
    }

    @K0
    public final void g(@k d dVar) {
        int i12 = this.f38246b;
        d[] dVarArr = this.f38245a;
        if (i12 == dVarArr.length) {
            d[] dVarArr2 = new d[(i12 > 1024 ? 1024 : i12) + i12];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, i12);
            this.f38245a = dVarArr2;
        }
        int i13 = this.f38248d + dVar.f38205a;
        int[] iArr = this.f38247c;
        int length = iArr.length;
        if (i13 > length) {
            int i14 = (length > 1024 ? 1024 : length) + length;
            if (i14 >= i13) {
                i13 = i14;
            }
            int[] iArr2 = new int[i13];
            C42756l.k(0, 0, length, iArr, iArr2);
            this.f38247c = iArr2;
        }
        int i15 = this.f38250f;
        int i16 = dVar.f38206b;
        int i17 = i15 + i16;
        Object[] objArr = this.f38249e;
        int length2 = objArr.length;
        if (i17 > length2) {
            int i18 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i18 >= i17) {
                i17 = i18;
            }
            Object[] objArr2 = new Object[i17];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f38249e = objArr2;
        }
        d[] dVarArr3 = this.f38245a;
        int i19 = this.f38246b;
        this.f38246b = i19 + 1;
        dVarArr3[i19] = dVar;
        this.f38248d += dVar.f38205a;
        this.f38250f += i16;
    }

    public final <T> String h(Iterable<? extends T> iterable, String str) {
        return C42745f0.O(iterable, ", ", "[", "]", new c(str), 24);
    }
}
