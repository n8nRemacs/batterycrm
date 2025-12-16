package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class wj {
    public static final /* synthetic */ yy7[] p = {new z8a(wj.class, "warmupJob", "getWarmupJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, wj.class, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;"), new z8a(wj.class, "animojiSetsUpdateJob", "getAnimojiSetsUpdateJob()Lkotlinx/coroutines/Job;")};
    public final hwa a;
    public final q9b b;
    public final pb3 c;
    public final lzf d;
    public final gk e;
    public final bwf g;
    public final bwf h;
    public final bwf i;
    public final ContextScope j;
    public final String f = wj.class.getName();
    public final t9f k = c7j.c();
    public final t9f l = c7j.c();
    public final t9f m = c7j.c();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();

    public wj(hwa hwaVar, q9b q9bVar, pb3 pb3Var, lzf lzfVar, gk gkVar, a84 a84Var) {
        this.a = hwaVar;
        this.b = q9bVar;
        this.c = pb3Var;
        this.d = lzfVar;
        this.e = gkVar;
        final int i = 0;
        this.g = new bwf(new cm6(this) { // from class: gj
            public final /* synthetic */ wj b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.b.l()).s();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.b.l()).t();
                    default:
                        return ((OneMeRoomDatabase) this.b.b.l()).L();
                }
            }
        });
        final int i2 = 1;
        this.h = new bwf(new cm6(this) { // from class: gj
            public final /* synthetic */ wj b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.b.l()).s();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.b.l()).t();
                    default:
                        return ((OneMeRoomDatabase) this.b.b.l()).L();
                }
            }
        });
        final int i3 = 2;
        this.i = new bwf(new cm6(this) { // from class: gj
            public final /* synthetic */ wj b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.b.l()).s();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.b.l()).t();
                    default:
                        return ((OneMeRoomDatabase) this.b.b.l()).L();
                }
            }
        });
        this.j = d7j.a(((q2b) lzfVar).b().plus(a84Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.wj r11, java.util.Map r12, defpackage.q44 r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.a(wj, java.util.Map, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.wj r10, defpackage.tu r11, defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.b(wj, tu, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a5, code lost:
    
        if (r8.f(r0, r2) == r7) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0304, code lost:
    
        if (r4.m(r0, r3, r2) == r7) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[PHI: r0 r1 r3 r8
  0x007a: PHI (r0v10 uid) = (r0v8 uid), (r0v12 uid) binds: [B:55:0x0162, B:21:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:55:0x0162, B:21:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r3v21 java.util.Map) = (r3v18 java.util.Map), (r3v26 java.util.Map) binds: [B:55:0x0162, B:21:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r8v17 wj) = (r8v14 wj), (r8v19 wj) binds: [B:55:0x0162, B:21:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.wj r19, java.util.List r20, java.util.Map r21, defpackage.q44 r22) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.c(wj, java.util.List, java.util.Map, q44):java.lang.Object");
    }

    public static vh l(si siVar) {
        return new vh(siVar.a, siVar.c, siVar.d, siVar.e, siVar.g);
    }

    public final void d() {
        ((w4e) this.c).C(0L);
        ei eiVarH = h();
        lrd lrdVar = eiVarH.a;
        lrdVar.b();
        bi biVar = eiVarH.c;
        vk6 vk6VarA = biVar.a();
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
                biVar.r(vk6VarA);
                ek ekVar = (ek) this.h.getValue();
                lrd lrdVar2 = ekVar.a;
                lrdVar2.b();
                bi biVar2 = ekVar.c;
                vk6 vk6VarA2 = biVar2.a();
                try {
                    lrdVar2.c();
                    try {
                        vk6VarA2.w();
                        lrdVar2.q();
                        biVar2.r(vk6VarA2);
                        kad kadVar = (kad) this.i.getValue();
                        lrd lrdVar3 = kadVar.a;
                        lrdVar3.b();
                        hq9 hq9Var = kadVar.c;
                        vk6 vk6VarA3 = hq9Var.a();
                        try {
                            lrdVar3.c();
                            try {
                                vk6VarA3.w();
                                lrdVar3.q();
                            } finally {
                                lrdVar3.k();
                            }
                        } finally {
                            hq9Var.r(vk6VarA3);
                        }
                    } finally {
                        lrdVar2.k();
                    }
                } catch (Throwable th) {
                    biVar2.r(vk6VarA2);
                    throw th;
                }
            } finally {
                lrdVar.k();
            }
        } catch (Throwable th2) {
            biVar.r(vk6VarA);
            throw th2;
        }
    }

    public final Object e(n8a n8aVar, Continuation continuation) {
        Object objI;
        return (!n8aVar.i() && (objI = svi.i(((q2b) this.d).a(), new mj(this, n8aVar, null), continuation)) == g84.a) ? objI : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.iad r12, defpackage.q44 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.nj
            if (r0 == 0) goto L13
            r0 = r13
            nj r0 = (defpackage.nj) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            nj r0 = new nj
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            defpackage.g8j.b(r13)
            return r2
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            iad r12 = r0.o
            wj r1 = r0.d
            defpackage.g8j.b(r13)
            goto L58
        L3c:
            defpackage.g8j.b(r13)
            java.util.concurrent.CopyOnWriteArrayList r13 = r11.o
            r13.clear()
            ei r13 = r11.h()
            java.util.List r1 = r12.c
            r0.d = r11
            r0.o = r12
            r0.Z = r4
            java.lang.Object r13 = r13.a(r1, r0)
            if (r13 != r5) goto L57
            goto L78
        L57:
            r1 = r11
        L58:
            java.util.List r13 = (java.util.List) r13
            boolean r4 = r13.isEmpty()
            r6 = 0
            if (r4 == 0) goto L79
            java.util.List r12 = r12.c
            java.util.concurrent.CopyOnWriteArrayList r13 = r1.o
            r13.addAll(r12)
            n8a r12 = defpackage.dsi.i(r12)
            r0.d = r6
            r0.o = r6
            r0.Z = r3
            java.lang.Object r12 = r1.e(r12, r0)
            if (r12 != r5) goto Lbf
        L78:
            return r5
        L79:
            java.util.List r0 = r12.c
            int r0 = r0.size()
            r3 = 0
        L80:
            if (r3 >= r0) goto Lbf
            java.util.List r4 = r12.c
            java.lang.Object r4 = r4.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            java.util.concurrent.CopyOnWriteArrayList r7 = r1.o
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r4)
            r7.add(r8)
            java.util.Iterator r7 = r13.iterator()
        L9c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r7.next()
            r9 = r8
            si r9 = (defpackage.si) r9
            long r9 = r9.a
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L9c
            goto Lb1
        Lb0:
            r8 = r6
        Lb1:
            si r8 = (defpackage.si) r8
            if (r8 == 0) goto Lbc
            vh r4 = l(r8)
            r1.j(r4)
        Lbc:
            int r3 = r3 + 1
            goto L80
        Lbf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.f(iad, q44):java.lang.Object");
    }

    public final vh g(String str) {
        Object next;
        if (str.length() == 0) {
            return null;
        }
        Iterator it = this.n.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            vh vhVar = (vh) ((f9a) next).getValue();
            if (fni.a(vhVar != null ? vhVar.b : null, str)) {
                break;
            }
        }
        f9a f9aVar = (f9a) next;
        if (f9aVar != null) {
            return (vh) f9aVar.getValue();
        }
        return null;
    }

    public final ei h() {
        return (ei) this.g.getValue();
    }

    public final f9a i(long j) {
        return (f9a) this.n.computeIfAbsent(Long.valueOf(j), new ni(1, new n8(9)));
    }

    public final void j(vh vhVar) {
        Object value;
        f9a f9aVarI = i(vhVar.a);
        do {
            value = f9aVarI.getValue();
        } while (!f9aVarI.c(value, vhVar));
    }

    public final void k() {
        if (this.e.a()) {
            x9f x9fVarE = svi.e(this.j, null, i84.b, new rj(this, null), 1);
            this.m.O(this, p[2], x9fVarE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (defpackage.k7j.b(r4.a, new defpackage.ci(r4, 0, r1), r2) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        if (r8.f(r4, r2) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0150, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.List r20, defpackage.iad r21, defpackage.q44 r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.m(java.util.List, iad, q44):java.lang.Object");
    }
}
