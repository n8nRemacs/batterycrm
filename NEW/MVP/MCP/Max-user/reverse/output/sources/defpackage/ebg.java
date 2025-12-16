package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class ebg {
    public final int a;
    public volatile boolean b;
    public final n9a c;
    public final bwf d;
    public final k18 e;
    public final String f;
    public yag g;
    public AsynchronousSocketChannel h;
    public final bwf i;

    public ebg(bwf bwfVar, k18 k18Var, int i) {
        this.a = i;
        Symbol symbol = o9a.a;
        this.c = new n9a();
        this.d = bwfVar;
        this.e = k18Var;
        this.f = ebg.class.getName();
        this.i = new bwf(new sue(k18Var, 7, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q44 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cbg
            if (r0 == 0) goto L13
            r0 = r5
            cbg r0 = (defpackage.cbg) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cbg r0 = new cbg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ebg r0 = r0.d
            defpackage.g8j.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r5 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.g8j.b(r5)
            yag r5 = r4.g     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L48
            r0.d = r4     // Catch: java.lang.Throwable -> L45
            r0.Y = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r5.e(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L48
            return r1
        L45:
            r5 = move-exception
            r0 = r4
            goto L5e
        L48:
            r0 = r4
        L49:
            r5 = 0
            r0.b = r5     // Catch: java.lang.Throwable -> L29
            k18 r5 = r0.e
            java.lang.Object r5 = r5.getValue()
            su0 r5 = (defpackage.su0) r5
            java.nio.ByteBuffer r0 = r0.c()
            r5.b(r0)
            qqg r5 = defpackage.qqg.a
            return r5
        L5e:
            k18 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            su0 r1 = (defpackage.su0) r1
            java.nio.ByteBuffer r0 = r0.c()
            r1.b(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebg.a(q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        if (r0.e(r3) == r4) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #6 {all -> 0x016d, blocks: (B:44:0x00ec, B:46:0x00f4, B:75:0x016f, B:76:0x0174), top: B:101:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f A[Catch: all -> 0x013e, Exception -> 0x0141, TRY_LEAVE, TryCatch #8 {Exception -> 0x0141, blocks: (B:53:0x0123, B:55:0x012f, B:62:0x0144, B:63:0x0149), top: B:102:0x0123, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144 A[Catch: all -> 0x013e, Exception -> 0x0141, TRY_ENTER, TryCatch #8 {Exception -> 0x0141, blocks: (B:53:0x0123, B:55:0x012f, B:62:0x0144, B:63:0x0149), top: B:102:0x0123, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f A[Catch: all -> 0x016d, TRY_ENTER, TryCatch #6 {all -> 0x016d, blocks: (B:44:0x00ec, B:46:0x00f4, B:75:0x016f, B:76:0x0174), top: B:101:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184 A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #2 {all -> 0x0187, blocks: (B:81:0x0180, B:83:0x0184), top: B:94:0x0180 }] */
    /* JADX WARN: Type inference failed for: r0v26, types: [yag] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, n9a] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [dbg, kotlin.coroutines.Continuation, q44] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, defpackage.q44 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebg.b(java.lang.String, q44):java.lang.Object");
    }

    public final ByteBuffer c() {
        return (ByteBuffer) this.i.getValue();
    }

    public final Object d(ByteBuffer byteBuffer, q44 q44Var) {
        yag yagVar = this.g;
        if (yagVar != null) {
            return yagVar.n(new fua(byteBuffer), q44Var);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
