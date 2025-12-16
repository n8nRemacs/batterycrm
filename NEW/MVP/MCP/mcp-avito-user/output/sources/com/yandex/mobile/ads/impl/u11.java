package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class u11 extends i81 {

    /* renamed from: b, reason: collision with root package name */
    private long f390419b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f390420c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f390421d;

    public u11() {
        super(new yr());
        this.f390419b = -9223372036854775807L;
        this.f390420c = new long[0];
        this.f390421d = new long[0];
    }

    public final long a() {
        return this.f390419b;
    }

    public final long[] b() {
        return this.f390421d;
    }

    public final long[] c() {
        return this.f390420c;
    }

    public final boolean a(long j12, pr0 pr0Var) {
        if (pr0Var.t() != 2) {
            return false;
        }
        int iZ2 = pr0Var.z();
        int iD2 = pr0Var.d();
        pr0Var.f(iZ2);
        if (!"onMetaData".equals(new String(pr0Var.c(), iD2, iZ2)) || pr0Var.a() == 0 || pr0Var.t() != 8) {
            return false;
        }
        HashMap<String, Object> mapA = a(pr0Var);
        Object obj = mapA.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f390419b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapA.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f390420c = new long[size];
                this.f390421d = new long[size];
                for (int i12 = 0; i12 < size; i12++) {
                    Object obj5 = list.get(i12);
                    Object obj6 = list2.get(i12);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f390420c = new long[0];
                        this.f390421d = new long[0];
                        break;
                    }
                    this.f390420c[i12] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f390421d[i12] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    @j.P
    private static Serializable a(int i12, pr0 pr0Var) {
        if (i12 == 8) {
            return a(pr0Var);
        }
        if (i12 == 10) {
            int iX2 = pr0Var.x();
            ArrayList arrayList = new ArrayList(iX2);
            for (int i13 = 0; i13 < iX2; i13++) {
                Serializable serializableA = a(pr0Var.t(), pr0Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        if (i12 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(pr0Var.p()));
            pr0Var.f(2);
            return date;
        }
        if (i12 == 0) {
            return Double.valueOf(Double.longBitsToDouble(pr0Var.p()));
        }
        if (i12 == 1) {
            return Boolean.valueOf(pr0Var.t() == 1);
        }
        if (i12 == 2) {
            int iZ2 = pr0Var.z();
            int iD2 = pr0Var.d();
            pr0Var.f(iZ2);
            return new String(pr0Var.c(), iD2, iZ2);
        }
        if (i12 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iZ3 = pr0Var.z();
            int iD3 = pr0Var.d();
            pr0Var.f(iZ3);
            String str = new String(pr0Var.c(), iD3, iZ3);
            int iT2 = pr0Var.t();
            if (iT2 == 9) {
                return map;
            }
            Serializable serializableA2 = a(iT2, pr0Var);
            if (serializableA2 != null) {
                map.put(str, serializableA2);
            }
        }
    }

    private static HashMap<String, Object> a(pr0 pr0Var) {
        int iX2 = pr0Var.x();
        HashMap<String, Object> map = new HashMap<>(iX2);
        for (int i12 = 0; i12 < iX2; i12++) {
            int iZ2 = pr0Var.z();
            int iD2 = pr0Var.d();
            pr0Var.f(iZ2);
            String str = new String(pr0Var.c(), iD2, iZ2);
            Serializable serializableA = a(pr0Var.t(), pr0Var);
            if (serializableA != null) {
                map.put(str, serializableA);
            }
        }
        return map;
    }
}
