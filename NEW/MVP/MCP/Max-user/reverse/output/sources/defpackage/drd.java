package defpackage;

import android.os.CancellationSignal;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class drd {
    public final OneMeRoomDatabase_Impl a;
    public final ai b;
    public final ai c;
    public final hq9 d;
    public final hq9 e;
    public final crd f;

    public drd(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        this.a = oneMeRoomDatabase_Impl;
        this.b = new ai(oneMeRoomDatabase_Impl, 21);
        this.c = new ai(oneMeRoomDatabase_Impl, 22);
        new am4(oneMeRoomDatabase_Impl, 6);
        this.d = new hq9(oneMeRoomDatabase_Impl, 28);
        this.e = new hq9(oneMeRoomDatabase_Impl, 29);
        new crd(oneMeRoomDatabase_Impl, 0);
        this.f = new crd(oneMeRoomDatabase_Impl, 1);
        new crd(oneMeRoomDatabase_Impl, 2);
        new crd(oneMeRoomDatabase_Impl, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (defpackage.k7j.b(r5.a, new defpackage.ard(r5, 1), r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.drd r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.vqd
            if (r0 == 0) goto L13
            r0 = r6
            vqd r0 = (defpackage.vqd) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vqd r0 = new vqd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r6)
            goto L62
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            drd r5 = r0.d
            defpackage.g8j.b(r6)
            goto L4e
        L38:
            defpackage.g8j.b(r6)
            r0.d = r5
            r0.Y = r3
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r6 = r5.a
            ard r1 = new ard
            r3 = 0
            r1.<init>(r5, r3)
            java.lang.Object r6 = defpackage.k7j.b(r6, r1, r0)
            if (r6 != r4) goto L4e
            goto L61
        L4e:
            r6 = 0
            r0.d = r6
            r0.Y = r2
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r6 = r5.a
            ard r1 = new ard
            r2 = 1
            r1.<init>(r5, r2)
            java.lang.Object r5 = defpackage.k7j.b(r6, r1, r0)
            if (r5 != r4) goto L62
        L61:
            return r4
        L62:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drd.b(drd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (defpackage.k7j.b(r5.a, new defpackage.zqd(r5, r6, 2), r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.drd r5, java.util.List r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.wqd
            if (r0 == 0) goto L13
            r0 = r7
            wqd r0 = (defpackage.wqd) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            wqd r0 = new wqd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r7)
            goto L68
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.util.List r6 = r0.o
            drd r5 = r0.d
            defpackage.g8j.b(r7)
            goto L52
        L3a:
            defpackage.g8j.b(r7)
            r0.d = r5
            r0.o = r6
            r0.Z = r3
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r7 = r5.a
            zqd r1 = new zqd
            r3 = 1
            r1.<init>(r5, r6, r3)
            java.lang.Object r7 = defpackage.k7j.b(r7, r1, r0)
            if (r7 != r4) goto L52
            goto L67
        L52:
            r7 = 0
            r0.d = r7
            r0.o = r7
            r0.Z = r2
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r7 = r5.a
            zqd r1 = new zqd
            r2 = 2
            r1.<init>(r5, r6, r2)
            java.lang.Object r5 = defpackage.k7j.b(r7, r1, r0)
            if (r5 != r4) goto L68
        L67:
            return r4
        L68:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drd.c(drd, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if (defpackage.k7j.b(r1.a, new defpackage.jad(r1, 4, r0), r4) != r5) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [drd, uqd] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(defpackage.drd r21, defpackage.uqd r22, defpackage.n8a r23, boolean r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drd.d(drd, uqd, n8a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(List list, q44 q44Var) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ve3.p();
                throw null;
            }
            linkedHashMap.put((String) it.next(), Long.valueOf(i2));
            i2 = i3;
        }
        if (linkedHashMap.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List listD0 = ue3.d0(linkedHashMap.keySet());
        StringBuilder sb = new StringBuilder("CASE id");
        int size = linkedHashMap.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(" WHEN ? THEN ?");
        }
        sb.append(" END");
        String strD = wmf.d("\n            UPDATE chat_folder\n            SET `order` = " + sb.toString() + "\n            WHERE id IN (" + ue3.N(listD0, ",", null, null, new llc(9), 30) + ")\n        ");
        int size2 = listD0.size() + (linkedHashMap.size() * 2);
        Object[] objArr = new Object[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            objArr[i5] = null;
        }
        int i6 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            int i7 = i6 + 1;
            objArr[i6] = str;
            i6 += 2;
            objArr[i7] = Long.valueOf(jLongValue);
        }
        for (Object obj : listD0) {
            int i8 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            objArr[(linkedHashMap.size() * 2) + i] = (String) obj;
            i = i8;
        }
        Object objA = k7j.a(this.a, new CancellationSignal(), new jad(this, 6, new aqc(strD, objArr, false, 5)), q44Var);
        return objA == g84.a ? objA : qqg.a;
    }
}
