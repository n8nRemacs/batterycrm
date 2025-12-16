package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42766q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BinaryVersion.kt */
@s0
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final int[] f409091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409092b;

    /* renamed from: c, reason: collision with root package name */
    public final int f409093c;

    /* renamed from: d, reason: collision with root package name */
    public final int f409094d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Integer> f409095e;

    /* compiled from: BinaryVersion.kt */
    @s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a, reason: collision with other inner class name */
    public static final class C11674a {
        public /* synthetic */ C11674a(C42822w c42822w) {
            this();
        }

        public C11674a() {
        }
    }

    static {
        new C11674a(null);
    }

    public a(@k int... iArr) {
        List<Integer> listM0;
        this.f409091a = iArr;
        Integer numE = C42756l.E(0, iArr);
        this.f409092b = numE != null ? numE.intValue() : -1;
        Integer numE2 = C42756l.E(1, iArr);
        this.f409093c = numE2 != null ? numE2.intValue() : -1;
        Integer numE3 = C42756l.E(2, iArr);
        this.f409094d = numE3 != null ? numE3.intValue() : -1;
        if (iArr.length <= 3) {
            listM0 = C42784z0.f406748b;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(r.t(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listM0 = C42745f0.M0(new C42766q(iArr).subList(3, iArr.length));
        }
        this.f409095e = listM0;
    }

    public final boolean a(int i12, int i13, int i14) {
        int i15 = this.f409092b;
        if (i15 > i12) {
            return true;
        }
        if (i15 < i12) {
            return false;
        }
        int i16 = this.f409093c;
        if (i16 > i13) {
            return true;
        }
        return i16 >= i13 && this.f409094d >= i14;
    }

    public final boolean equals(@l Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (this.f409092b == aVar.f409092b && this.f409093c == aVar.f409093c && this.f409094d == aVar.f409094d && L.f(this.f409095e, aVar.f409095e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f409092b;
        int i13 = (i12 * 31) + this.f409093c + i12;
        int i14 = (i13 * 31) + this.f409094d + i13;
        return this.f409095e.hashCode() + (i14 * 31) + i14;
    }

    @k
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i12 : this.f409091a) {
            if (i12 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i12));
        }
        return arrayList.isEmpty() ? "unknown" : C42745f0.O(arrayList, ".", null, null, null, 62);
    }
}
