package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class wna {
    public final lrd a;
    public final ai b;
    public final am4 c;
    public final hq9 d;
    public final hq9 e;
    public final hq9 f;

    public wna(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 13);
        this.c = new am4(oneMeRoomDatabase, 3);
        new hq9(oneMeRoomDatabase, 14);
        new hq9(oneMeRoomDatabase, 15);
        this.d = new hq9(oneMeRoomDatabase, 16);
        this.e = new hq9(oneMeRoomDatabase, 17);
        this.f = new hq9(oneMeRoomDatabase, 18);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.wna r6, java.util.List r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.tna
            if (r0 == 0) goto L13
            r0 = r9
            tna r0 = (defpackage.tna) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            tna r0 = new tna
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            defpackage.g8j.b(r9)
            return r2
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.util.List r8 = r0.o
            wna r6 = r0.d
            defpackage.g8j.b(r9)
            goto L5a
        L3c:
            defpackage.g8j.b(r9)
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L5a
            r0.d = r6
            r0.o = r8
            r0.Z = r4
            lrd r9 = r6.a
            una r1 = new una
            r4 = 1
            r1.<init>(r6, r7, r4)
            java.lang.Object r7 = defpackage.k7j.b(r9, r1, r0)
            if (r7 != r5) goto L5a
            goto L75
        L5a:
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L76
            r7 = 0
            r0.d = r7
            r0.o = r7
            r0.Z = r3
            lrd r7 = r6.a
            una r9 = new una
            r1 = 0
            r9.<init>(r6, r8, r1)
            java.lang.Object r6 = defpackage.k7j.b(r7, r9, r0)
            if (r6 != r5) goto L76
        L75:
            return r5
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wna.a(wna, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
