package io.ktor.client.plugins.cache;

import com.huawei.hms.framework.common.ContainerUtils;
import io.ktor.client.request.c0;
import io.ktor.client.request.d0;
import io.ktor.http.C41517e0;
import io.ktor.http.C41519f0;
import io.ktor.http.I0;
import io.ktor.http.O;
import io.ktor.http.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HttpCacheEntry.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(boolean r4, @Y61.k io.ktor.client.statement.d r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.n
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.n r0 = (io.ktor.client.plugins.cache.n) r0
            int r1 = r0.f399175t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399175t = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.n r0 = new io.ktor.client.plugins.cache.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f399174s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399175t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r4 = r0.f399172q
            io.ktor.client.statement.d r5 = r0.f399173r
            kotlin.C42729a0.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            io.ktor.utils.io.W0 r6 = r5.getF399778h()
            r0.f399173r = r5
            r0.f399172q = r4
            r0.f399175t = r3
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r6 = r6.I(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            io.ktor.utils.io.core.n r6 = (io.ktor.utils.io.core.C41641n) r6
            byte[] r6 = io.ktor.utils.io.core.S.b(r6)
            io.ktor.client.statement.h.b(r5)
            io.ktor.client.plugins.cache.m r0 = new io.ktor.client.plugins.cache.m
            Q31.b r4 = b(r5, r4)
            java.util.Map r1 = d(r5)
            r0.<init>(r4, r1, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.p.a(boolean, io.ktor.client.statement.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q31.b b(io.ktor.client.statement.d r6, boolean r7) {
        /*
            io.ktor.client.plugins.cache.o r0 = io.ktor.client.plugins.cache.o.f399176l
            java.util.List r1 = io.ktor.http.C41529k0.a(r6)
            r2 = 0
            if (r7 == 0) goto L35
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L1a
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1a
            goto L35
        L1a:
            java.util.Iterator r7 = r7.iterator()
        L1e:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r7.next()
            io.ktor.http.O r3 = (io.ktor.http.O) r3
            java.lang.String r3 = r3.f399881a
            java.lang.String r4 = "s-maxage"
            boolean r3 = kotlin.text.C43066x.h0(r3, r4, r2)
            if (r3 == 0) goto L1e
            goto L37
        L35:
            java.lang.String r4 = "max-age"
        L37:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
        L3d:
            boolean r1 = r7.hasNext()
            r3 = 0
            if (r1 == 0) goto L54
            java.lang.Object r1 = r7.next()
            r5 = r1
            io.ktor.http.O r5 = (io.ktor.http.O) r5
            java.lang.String r5 = r5.f399881a
            boolean r5 = kotlin.text.C43066x.h0(r5, r4, r2)
            if (r5 == 0) goto L3d
            goto L55
        L54:
            r1 = r3
        L55:
            io.ktor.http.O r1 = (io.ktor.http.O) r1
            if (r1 == 0) goto L7a
            java.lang.String r7 = r1.f399881a
            if (r7 == 0) goto L7a
            java.lang.String r1 = "="
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r4 = 6
            java.util.List r7 = kotlin.text.C43066x.f0(r7, r1, r2, r4)
            r1 = 1
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L7a
            int r7 = java.lang.Integer.parseInt(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L7b
        L7a:
            r7 = r3
        L7b:
            if (r7 == 0) goto L95
            Q31.b r6 = r6.getF399776f()
            int r7 = r7.intValue()
            long r0 = (long) r7
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r6 = r6.f13457j
            long r6 = r6 + r0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            Q31.b r6 = io.ktor.util.date.a.b(r6)
            goto Ld1
        L95:
            io.ktor.http.T r6 = r6.getF399779i()
            io.ktor.http.f0 r7 = io.ktor.http.C41519f0.f400005a
            r7.getClass()
            java.lang.String r7 = io.ktor.http.C41519f0.f400018n
            java.lang.String r6 = r6.get(r7)
            if (r6 == 0) goto Lca
            java.lang.String r7 = "0"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto Lc2
            boolean r7 = kotlin.text.C43066x.K(r6)
            if (r7 == 0) goto Lb5
            goto Lc2
        Lb5:
            Q31.b r6 = io.ktor.http.I.a(r6)     // Catch: java.lang.Throwable -> Lba
            goto Ld1
        Lba:
            r0.getClass()
            Q31.b r6 = io.ktor.util.date.a.b(r3)
            goto Ld1
        Lc2:
            r0.getClass()
            Q31.b r6 = io.ktor.util.date.a.b(r3)
            goto Ld1
        Lca:
            r0.getClass()
            Q31.b r6 = io.ktor.util.date.a.b(r3)
        Ld1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.p.b(io.ktor.client.statement.d, boolean):Q31.b");
    }

    @Y61.k
    public static final ValidateStatus c(@Y61.k Q31.b bVar, @Y61.k T t12, @Y61.k d0 d0Var) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String str;
        Integer numY0;
        String str2;
        String str3;
        C41519f0.f400005a.getClass();
        String str4 = C41519f0.f400009e;
        List<String> listA = t12.a(str4);
        Object obj = null;
        List<O> listA2 = C41517e0.a(listA != null ? C42745f0.O(listA, ",", null, null, null, 62) : null);
        List<String> listA3 = d0Var.f399709c.a(str4);
        List<O> listA4 = C41517e0.a(listA3 != null ? C42745f0.O(listA3, ",", null, null, null, 62) : null);
        C41444a.f399120a.getClass();
        boolean zContains = listA4.contains(C41444a.f399122c);
        ValidateStatus validateStatus = ValidateStatus.f399116b;
        I0 i02 = d0Var.f399707a;
        if (zContains) {
            r.f399180a.e("\"no-cache\" is set for " + i02 + ", should validate cached response");
            return validateStatus;
        }
        List<O> list = listA4;
        Iterator<T> it = list.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C43066x.h0(((O) next).f399881a, "max-age=", false)) {
                break;
            }
        }
        O o12 = (O) next;
        if (o12 == null || (str2 = o12.f399881a) == null || (str3 = (String) C43066x.f0(str2, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6).get(1)) == null) {
            numValueOf = null;
        } else {
            Integer numY02 = C43066x.y0(str3);
            numValueOf = Integer.valueOf(numY02 != null ? numY02.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            r.f399180a.e("\"max-age\" is not set for " + i02 + ", should validate cached response");
            return validateStatus;
        }
        C41444a.f399120a.getClass();
        if (listA2.contains(C41444a.f399122c)) {
            r.f399180a.e("\"no-cache\" is set for " + i02 + ", should validate cached response");
            return validateStatus;
        }
        long jCurrentTimeMillis = bVar.f13457j - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            r.f399180a.e("Cached response is valid for " + i02 + ", should not validate");
            return ValidateStatus.f399117c;
        }
        if (listA2.contains(C41444a.f399125f)) {
            r.f399180a.e("\"must-revalidate\" is set for " + i02 + ", should validate cached response");
            return validateStatus;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (C43066x.h0(((O) next2).f399881a, "max-stale=", false)) {
                obj = next2;
                break;
            }
        }
        O o13 = (O) obj;
        if (o13 != null && (str = o13.f399881a) != null && (numY0 = C43066x.y0(str.substring(10))) != null) {
            iIntValue = numY0.intValue();
        }
        if ((iIntValue * 1000) + jCurrentTimeMillis > 0) {
            r.f399180a.e("Cached response is stale for " + i02 + " but less than max-stale, should warn");
            return ValidateStatus.f399118d;
        }
        r.f399180a.e("Cached response is stale for " + i02 + ", should validate cached response");
        return validateStatus;
    }

    @Y61.k
    public static final Map<String, String> d(@Y61.k io.ktor.client.statement.d dVar) {
        ArrayList<String> arrayList;
        T f399779i = dVar.getF399779i();
        C41519f0.f400005a.getClass();
        List<String> listA = f399779i.a(C41519f0.f400002B);
        if (listA != null) {
            arrayList = new ArrayList();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                List listF0 = C43066x.f0((String) it.next(), new String[]{","}, 0, 6);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listF0, 10));
                Iterator it2 = listF0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C43066x.A0((String) it2.next()).toString());
                }
                C42745f0.h(arrayList2, arrayList);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c0 c0Var = dVar.getF399772b().f398805c;
        T f399779i2 = (c0Var != null ? c0Var : null).getF399779i();
        for (String str : arrayList) {
            String str2 = f399779i2.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
