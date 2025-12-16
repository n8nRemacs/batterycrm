package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.ts0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.C43047d;
import okio.C44802l;
import okio.C44805o;

@X41.i
/* loaded from: classes8.dex */
public final class l10 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final C44805o f387350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final C44805o f387351b;

    static {
        C44805o.f420139e.getClass();
        f387350a = C44805o.a.c("\"\\");
        f387351b = C44805o.a.c("\t ,=");
    }

    @Y61.k
    public static final ArrayList a(@Y61.k gz gzVar, @Y61.k String str) {
        ArrayList arrayList = new ArrayList();
        int size = gzVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (str.equalsIgnoreCase(gzVar.a(i12))) {
                C44802l c44802l = new C44802l();
                c44802l.O(gzVar.b(i12));
                try {
                    a(c44802l, arrayList);
                } catch (EOFException e12) {
                    int i13 = ts0.f390303c;
                    ts0.a.b().getClass();
                    ts0.a(5, "Unable to parse challenge", e12);
                }
            }
        }
        return arrayList;
    }

    private static final boolean b(C44802l c44802l) {
        boolean z12 = false;
        while (!c44802l.W2()) {
            byte bM2 = c44802l.m(0L);
            if (bM2 == 44) {
                c44802l.readByte();
                z12 = true;
            } else {
                if (bM2 != 32 && bM2 != 9) {
                    break;
                }
                c44802l.readByte();
            }
        }
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0101, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0101, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(okio.C44802l r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.l10.a(okio.l, java.util.ArrayList):void");
    }

    private static final String a(C44802l c44802l) {
        long jO2 = c44802l.o(0L, f387351b);
        if (jO2 == -1) {
            jO2 = c44802l.f420125c;
        }
        if (jO2 != 0) {
            return c44802l.z1(jO2, C43047d.f410589b);
        }
        return null;
    }

    public static final void a(@Y61.k em emVar, @Y61.k s10 s10Var, @Y61.k gz gzVar) {
        if (emVar == em.f385004a) {
            return;
        }
        int i12 = cm.f384334n;
        List<cm> listA = cm.a.a(s10Var, gzVar);
        if (listA.isEmpty()) {
            return;
        }
        emVar.a(s10Var, listA);
    }

    public static final boolean a(@Y61.k iz0 iz0Var) {
        if (kotlin.jvm.internal.L.f(iz0Var.p().f(), "HEAD")) {
            return false;
        }
        int iE2 = iz0Var.e();
        return (((iE2 >= 100 && iE2 < 200) || iE2 == 204 || iE2 == 304) && qc1.a(iz0Var) == -1 && !"chunked".equalsIgnoreCase(iz0.a(iz0Var, "Transfer-Encoding"))) ? false : true;
    }
}
