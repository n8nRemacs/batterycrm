package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f8c implements ui8 {
    public final k18 a;
    public final k18 b;
    public final bwf c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final x9f o;

    public f8c(k18 k18Var, k18 k18Var2, bwf bwfVar, lzf lzfVar, a84 a84Var) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = bwfVar;
        this.o = svi.e(d7j.a(((q2b) lzfVar).a().limitedParallelism(1, "presences").plus(a84Var)), null, null, new e8c(this, null), 3);
    }

    public final b8c a(long j) {
        f9a f9aVar;
        b8c b8cVar;
        return (!((qv3) this.b.getValue()).g(j) || (f9aVar = (f9a) this.d.get(Long.valueOf(j))) == null || (b8cVar = (b8c) f9aVar.getValue()) == null) ? b8c.c : b8cVar;
    }

    public final f9a b(long j) {
        return (f9a) this.d.computeIfAbsent(Long.valueOf(j), new ni(25, new dga(25)));
    }

    @Override // defpackage.ui8
    public final void c() {
        this.o.cancel((CancellationException) null);
    }

    public final us d() {
        ConcurrentHashMap concurrentHashMap = this.d;
        us usVar = new us(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            b8c b8cVar = (b8c) ((f9a) entry.getValue()).getValue();
            if (b8cVar != null) {
                usVar.put(Long.valueOf(jLongValue), b8cVar);
            }
        }
        return usVar;
    }

    public final boolean e(long j) {
        b8c b8cVar;
        if (!((qv3) this.b.getValue()).g(j)) {
            return false;
        }
        f9a f9aVar = (f9a) this.d.get(Long.valueOf(j));
        if (f9aVar == null || (b8cVar = (b8c) f9aVar.getValue()) == null) {
            b8cVar = b8c.c;
        }
        return b8cVar.a == 40;
    }

    public final void f(long j, b8c b8cVar) {
        Object value;
        Object value2;
        b8c b8cVar2 = (b8c) b(j).getValue();
        if (b8cVar2 == null || b8cVar2.b <= b8cVar.b) {
            f9a f9aVarB = b(j);
            do {
                value = f9aVarB.getValue();
            } while (!f9aVarB.c(value, b8cVar));
        } else {
            f9a f9aVarB2 = b(j);
            do {
                value2 = f9aVarB2.getValue();
            } while (!f9aVarB2.c(value2, new b8c(b8cVar.a, b8cVar2.b)));
        }
        if (((qv3) this.b.getValue()).d) {
            ku3 ku3VarI = ((qv3) this.b.getValue()).i(j, false);
            if (ku3VarI == null) {
                wqi.o("ContactController", null, "updatePresence failure! contact not found", Arrays.copyOf(new Object[0], 0));
            } else {
                ku3VarI.a.c = b8cVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.n8a r15) {
        /*
            r14 = this;
            ek8 r0 = new ek8
            int r1 = r15.d
            r0.<init>(r1)
            long[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4e
            r3 = 0
            r4 = r3
        L12:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L47
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L43
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            b8c r12 = r14.a(r10)
            r0.e(r10, r12)
        L43:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L47:
            if (r7 != r8) goto L4e
        L49:
            if (r4 == r2) goto L4e
            int r4 = r4 + 1
            goto L12
        L4e:
            k18 r15 = r14.a
            java.lang.Object r15 = r15.getValue()
            ie4 r15 = (defpackage.ie4) r15
            te8 r15 = r15.d
            java.lang.Object r1 = r15.a
            q9b r1 = (defpackage.q9b) r1
            lrd r1 = r1.l()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r1 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r1
            d8c r2 = new d8c
            r3 = 19
            r2.<init>(r0, r3, r15)
            r1.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.g(n8a):void");
    }
}
