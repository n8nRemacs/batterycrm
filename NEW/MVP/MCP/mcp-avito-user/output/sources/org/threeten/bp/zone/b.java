package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Month;
import org.threeten.bp.chrono.o;
import org.threeten.bp.q;
import org.threeten.bp.zone.f;

/* compiled from: StandardZoneRules.java */
/* loaded from: classes16.dex */
final class b extends f implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f422238b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f422239c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f422240d;

    /* renamed from: e, reason: collision with root package name */
    public final org.threeten.bp.f[] f422241e;

    /* renamed from: f, reason: collision with root package name */
    public final q[] f422242f;

    /* renamed from: g, reason: collision with root package name */
    public final ZoneOffsetTransitionRule[] f422243g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f422244h = new ConcurrentHashMap();

    public b(long[] jArr, q[] qVarArr, long[] jArr2, q[] qVarArr2, ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr) {
        this.f422238b = jArr;
        this.f422239c = qVarArr;
        this.f422240d = jArr2;
        this.f422242f = qVarArr2;
        this.f422243g = zoneOffsetTransitionRuleArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (i12 < jArr2.length) {
            int i13 = i12 + 1;
            e eVar = new e(jArr2[i12], qVarArr2[i12], qVarArr2[i13]);
            boolean zA2 = eVar.a();
            q qVar = eVar.f422253c;
            q qVar2 = eVar.f422254d;
            org.threeten.bp.f fVar = eVar.f422252b;
            if (zA2) {
                arrayList.add(fVar);
                arrayList.add(fVar.L(qVar2.f422109c - qVar.f422109c));
            } else {
                arrayList.add(fVar.L(qVar2.f422109c - qVar.f422109c));
                arrayList.add(fVar);
            }
            i12 = i13;
        }
        this.f422241e = (org.threeten.bp.f[]) arrayList.toArray(new org.threeten.bp.f[arrayList.size()]);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // org.threeten.bp.zone.f
    public final q a(org.threeten.bp.d dVar) {
        long j12 = dVar.f421935b;
        int length = this.f422243g.length;
        q[] qVarArr = this.f422242f;
        long[] jArr = this.f422240d;
        if (length <= 0 || (jArr.length != 0 && j12 <= jArr[jArr.length - 1])) {
            int iBinarySearch = Arrays.binarySearch(jArr, j12);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return qVarArr[iBinarySearch + 1];
        }
        e[] eVarArrH = h(org.threeten.bp.e.P(w81.d.c(qVarArr[qVarArr.length - 1].f422109c + j12, 86400L)).f421941b);
        e eVar = null;
        for (int i12 = 0; i12 < eVarArrH.length; i12++) {
            eVar = eVarArrH[i12];
            org.threeten.bp.f fVar = eVar.f422252b;
            q qVar = eVar.f422253c;
            if (j12 < fVar.s(qVar)) {
                return qVar;
            }
        }
        return eVar.f422254d;
    }

    @Override // org.threeten.bp.zone.f
    public final e b(org.threeten.bp.f fVar) {
        Object objI = i(fVar);
        if (objI instanceof e) {
            return (e) objI;
        }
        return null;
    }

    @Override // org.threeten.bp.zone.f
    public final List<q> c(org.threeten.bp.f fVar) {
        Object objI = i(fVar);
        if (!(objI instanceof e)) {
            return Collections.singletonList((q) objI);
        }
        e eVar = (e) objI;
        return eVar.a() ? Collections.emptyList() : Arrays.asList(eVar.f422253c, eVar.f422254d);
    }

    @Override // org.threeten.bp.zone.f
    public final boolean d(org.threeten.bp.d dVar) {
        int iBinarySearch = Arrays.binarySearch(this.f422238b, dVar.f421935b);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return !this.f422239c[iBinarySearch + 1].equals(a(dVar));
    }

    @Override // org.threeten.bp.zone.f
    public final boolean e() {
        return this.f422240d.length == 0 && this.f422243g.length == 0 && this.f422242f[0].equals(this.f422239c[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f422238b, bVar.f422238b) && Arrays.equals(this.f422239c, bVar.f422239c) && Arrays.equals(this.f422240d, bVar.f422240d) && Arrays.equals(this.f422242f, bVar.f422242f) && Arrays.equals(this.f422243g, bVar.f422243g);
        }
        if (obj instanceof f.a) {
            return e() && a(org.threeten.bp.d.f421934d).equals(((f.a) obj).f422255b);
        }
        return false;
    }

    @Override // org.threeten.bp.zone.f
    public final boolean f(org.threeten.bp.f fVar, q qVar) {
        return c(fVar).contains(qVar);
    }

    public final e[] h(int i12) {
        org.threeten.bp.e eVarO;
        Integer numValueOf = Integer.valueOf(i12);
        ConcurrentHashMap concurrentHashMap = this.f422244h;
        e[] eVarArr = (e[]) concurrentHashMap.get(numValueOf);
        if (eVarArr != null) {
            return eVarArr;
        }
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.f422243g;
        e[] eVarArr2 = new e[zoneOffsetTransitionRuleArr.length];
        for (int i13 = 0; i13 < zoneOffsetTransitionRuleArr.length; i13++) {
            ZoneOffsetTransitionRule zoneOffsetTransitionRule = zoneOffsetTransitionRuleArr[i13];
            DayOfWeek dayOfWeek = zoneOffsetTransitionRule.f422227d;
            Month month = zoneOffsetTransitionRule.f422225b;
            byte b12 = zoneOffsetTransitionRule.f422226c;
            if (b12 < 0) {
                o.f421908d.getClass();
                eVarO = org.threeten.bp.e.O(i12, month, month.o(o.r(i12)) + 1 + b12);
                if (dayOfWeek != null) {
                    eVarO = eVarO.e(org.threeten.bp.temporal.f.d(dayOfWeek));
                }
            } else {
                eVarO = org.threeten.bp.e.O(i12, month, b12);
                if (dayOfWeek != null) {
                    eVarO = eVarO.e(org.threeten.bp.temporal.f.c(dayOfWeek));
                }
            }
            org.threeten.bp.f fVarG = org.threeten.bp.f.G(eVarO.S(zoneOffsetTransitionRule.f422229f), zoneOffsetTransitionRule.f422228e);
            int iOrdinal = zoneOffsetTransitionRule.f422230g.ordinal();
            q qVar = zoneOffsetTransitionRule.f422232i;
            int i14 = qVar.f422109c;
            if (iOrdinal == 0) {
                fVarG = fVarG.L(i14 - q.f422106g.f422109c);
            } else if (iOrdinal == 2) {
                fVarG = fVarG.L(i14 - zoneOffsetTransitionRule.f422231h.f422109c);
            }
            eVarArr2[i13] = new e(fVarG, qVar, zoneOffsetTransitionRule.f422233j);
        }
        if (i12 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, eVarArr2);
        }
        return eVarArr2;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f422238b) ^ Arrays.hashCode(this.f422239c)) ^ Arrays.hashCode(this.f422240d)) ^ Arrays.hashCode(this.f422242f)) ^ Arrays.hashCode(this.f422243g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(org.threeten.bp.f r10) {
        /*
            r9 = this;
            org.threeten.bp.zone.ZoneOffsetTransitionRule[] r0 = r9.f422243g
            int r0 = r0.length
            r1 = 0
            org.threeten.bp.f[] r2 = r9.f422241e
            if (r0 <= 0) goto L74
            int r0 = r2.length
            if (r0 == 0) goto L16
            int r0 = r2.length
            int r0 = r0 + (-1)
            r0 = r2[r0]
            boolean r0 = r10.C(r0)
            if (r0 == 0) goto L74
        L16:
            org.threeten.bp.e r0 = r10.f421948b
            int r0 = r0.f421941b
            org.threeten.bp.zone.e[] r0 = r9.h(r0)
            int r2 = r0.length
            r3 = 0
        L20:
            if (r1 >= r2) goto L73
            r3 = r0[r1]
            org.threeten.bp.f r4 = r3.f422252b
            boolean r5 = r3.a()
            org.threeten.bp.f r6 = r3.f422252b
            org.threeten.bp.q r7 = r3.f422254d
            org.threeten.bp.q r8 = r3.f422253c
            if (r5 == 0) goto L4d
            boolean r4 = r10.E(r4)
            if (r4 == 0) goto L3a
        L38:
            r3 = r8
            goto L65
        L3a:
            int r4 = r7.f422109c
            int r5 = r8.f422109c
            int r4 = r4 - r5
            long r4 = (long) r4
            org.threeten.bp.f r4 = r6.L(r4)
            boolean r4 = r10.E(r4)
            if (r4 == 0) goto L4b
            goto L65
        L4b:
            r3 = r7
            goto L65
        L4d:
            boolean r4 = r10.E(r4)
            if (r4 != 0) goto L54
            goto L4b
        L54:
            int r4 = r7.f422109c
            int r5 = r8.f422109c
            int r4 = r4 - r5
            long r4 = (long) r4
            org.threeten.bp.f r4 = r6.L(r4)
            boolean r4 = r10.E(r4)
            if (r4 == 0) goto L65
            goto L38
        L65:
            boolean r4 = r3 instanceof org.threeten.bp.zone.e
            if (r4 != 0) goto L73
            boolean r4 = r3.equals(r8)
            if (r4 == 0) goto L70
            goto L73
        L70:
            int r1 = r1 + 1
            goto L20
        L73:
            return r3
        L74:
            int r10 = java.util.Arrays.binarySearch(r2, r10)
            r0 = -1
            org.threeten.bp.q[] r3 = r9.f422242f
            if (r10 != r0) goto L80
            r10 = r3[r1]
            return r10
        L80:
            if (r10 >= 0) goto L86
            int r10 = -r10
            int r10 = r10 + (-2)
            goto L98
        L86:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r10 >= r0) goto L98
            r0 = r2[r10]
            int r1 = r10 + 1
            r4 = r2[r1]
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L98
            r10 = r1
        L98:
            r0 = r10 & 1
            if (r0 != 0) goto Lbc
            r0 = r2[r10]
            int r1 = r10 + 1
            r1 = r2[r1]
            int r10 = r10 / 2
            r2 = r3[r10]
            int r10 = r10 + 1
            r10 = r3[r10]
            int r3 = r10.f422109c
            int r4 = r2.f422109c
            if (r3 <= r4) goto Lb6
            org.threeten.bp.zone.e r1 = new org.threeten.bp.zone.e
            r1.<init>(r0, r2, r10)
            return r1
        Lb6:
            org.threeten.bp.zone.e r0 = new org.threeten.bp.zone.e
            r0.<init>(r1, r2, r10)
            return r0
        Lbc:
            int r10 = r10 / 2
            int r10 = r10 + 1
            r10 = r3[r10]
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.zone.b.i(org.threeten.bp.f):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        sb2.append(this.f422239c[r1.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }
}
