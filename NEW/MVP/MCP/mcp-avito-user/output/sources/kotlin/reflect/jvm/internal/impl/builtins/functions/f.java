package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;

/* compiled from: FunctionTypeKindExtractor.kt */
@s0
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f407219c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final f f407220d = new f(C42745f0.U(e.a.f407215c, e.d.f407218c, e.b.f407216c, e.c.f407217c));

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<e> f407221a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f407222b;

    /* compiled from: FunctionTypeKindExtractor.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FunctionTypeKindExtractor.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final e f407223a;

        /* renamed from: b, reason: collision with root package name */
        public final int f407224b;

        public b(@k e eVar, int i12) {
            this.f407223a = eVar;
            this.f407224b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f407223a, bVar.f407223a) && this.f407224b == bVar.f407224b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f407224b) + (this.f407223a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
            sb2.append(this.f407223a);
            sb2.append(", arity=");
            return r.t(sb2, this.f407224b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k List<? extends e> list) {
        this.f407221a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            kotlin.reflect.jvm.internal.impl.name.c cVar = ((e) obj).f407213a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f407222b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0010 A[SYNTHETIC] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.f.b a(@Y61.k java.lang.String r9, @Y61.k kotlin.reflect.jvm.internal.impl.name.c r10) {
        /*
            r8 = this;
            java.util.LinkedHashMap r0 = r8.f407222b
            java.lang.Object r10 = r0.get(r10)
            java.util.List r10 = (java.util.List) r10
            r0 = 0
            if (r10 != 0) goto Lc
            return r0
        Lc:
            java.util.Iterator r10 = r10.iterator()
        L10:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r10.next()
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.e) r1
            java.lang.String r2 = r1.f407214b
            r3 = 0
            boolean r2 = kotlin.text.C43066x.h0(r9, r2, r3)
            if (r2 == 0) goto L10
            java.lang.String r2 = r1.f407214b
            int r2 = r2.length()
            java.lang.String r2 = r9.substring(r2)
            int r4 = r2.length()
            if (r4 != 0) goto L37
        L35:
            r2 = r0
            goto L54
        L37:
            int r4 = r2.length()
            r5 = r3
        L3c:
            if (r3 >= r4) goto L50
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L35
            r7 = 10
            if (r6 >= r7) goto L35
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L3c
        L50:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L54:
            if (r2 == 0) goto L10
            int r9 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$b r10 = new kotlin.reflect.jvm.internal.impl.builtins.functions.f$b
            r10.<init>(r1, r9)
            return r10
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.f.a(java.lang.String, kotlin.reflect.jvm.internal.impl.name.c):kotlin.reflect.jvm.internal.impl.builtins.functions.f$b");
    }
}
