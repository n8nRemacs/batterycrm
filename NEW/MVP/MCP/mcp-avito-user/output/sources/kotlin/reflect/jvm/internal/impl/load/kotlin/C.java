package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.runtime.C22026a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import m51.d;

/* compiled from: MemberSignature.kt */
/* loaded from: classes8.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f408430b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f408431a;

    /* compiled from: MemberSignature.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static C a(@Y61.k String str, @Y61.k String str2) {
            return new C(androidx.compose.foundation.H.i('#', str, str2), null);
        }

        @X41.n
        @Y61.k
        public static C b(@Y61.k m51.d dVar) {
            if (dVar instanceof d.b) {
                d.b bVar = (d.b) dVar;
                return new C(bVar.f414317a.concat(bVar.f414318b), null);
            }
            if (!(dVar instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVar = (d.a) dVar;
            return a(aVar.f414315a, aVar.f414316b);
        }

        @X41.n
        @Y61.k
        public static C c(@Y61.k C c12, int i12) {
            return new C(c12.f408431a + '@' + i12, null);
        }

        public a() {
        }
    }

    public C(String str, C42822w c42822w) {
        this.f408431a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && kotlin.jvm.internal.L.f(this.f408431a, ((C) obj).f408431a);
    }

    public final int hashCode() {
        return this.f408431a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("MemberSignature(signature="), this.f408431a, ')');
    }
}
