package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cxe extends dtf implements sm6 {
    public Iterator X;
    public int Y;
    public /* synthetic */ Object Z;
    public ArrayList o;
    public final /* synthetic */ fxe s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxe(fxe fxeVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = fxeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cxe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cxe cxeVar = new cxe(this.s0, continuation);
        cxeVar.Z = obj;
        return cxeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (r11 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:22:0x00ae). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) throws java.lang.NumberFormatException {
        /*
            r10 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r10.Y
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.util.Iterator r1 = r10.X
            java.util.ArrayList r4 = r10.o
            java.lang.Object r5 = r10.Z
            f84 r5 = (defpackage.f84) r5
            defpackage.g8j.b(r11)
            goto Lae
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            java.util.ArrayList r1 = r10.o
            java.lang.Object r4 = r10.Z
            f84 r4 = (defpackage.f84) r4
            defpackage.g8j.b(r11)
            goto L63
        L2c:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.Z
            f84 r11 = (defpackage.f84) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            fxe r5 = r10.s0
            bwf r5 = r5.s0
            java.lang.Object r5 = r5.getValue()
            zwe r5 = (defpackage.zwe) r5
            r1.add(r5)
            fxe r5 = r10.s0
            k18 r5 = r5.c
            java.lang.Object r5 = r5.getValue()
            w63 r5 = (defpackage.w63) r5
            r10.Z = r11
            r10.o = r1
            r10.Y = r4
            ve2 r4 = r5.i()
            java.util.ArrayList r4 = r4.I(r2)
            if (r4 != r0) goto L60
            goto Lad
        L60:
            r9 = r4
            r4 = r11
            r11 = r9
        L63:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            o00 r5 = defpackage.ve2.I
            java.util.List r11 = defpackage.ue3.X(r11, r5)
            defpackage.d7j.e(r4)
            java.util.Iterator r11 = r11.iterator()
            r5 = r4
            r4 = r1
            r1 = r11
        L75:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r1.next()
            pb2 r11 = (defpackage.pb2) r11
            int r6 = r4.size()
            fxe r7 = r10.s0
            android.content.Context r7 = r7.a
            r7.getClass()
            java.lang.Class<android.content.pm.ShortcutManager> r8 = android.content.pm.ShortcutManager.class
            java.lang.Object r7 = r7.getSystemService(r8)
            android.content.pm.ShortcutManager r7 = (android.content.pm.ShortcutManager) r7
            int r7 = r7.getMaxShortcutCountPerActivity()
            if (r6 >= r7) goto Lb6
            defpackage.d7j.e(r5)
            fxe r6 = r10.s0
            r10.Z = r5
            r10.o = r4
            r10.X = r1
            r10.Y = r3
            java.lang.Object r11 = defpackage.fxe.a(r6, r11, r10)
            if (r11 != r0) goto Lae
        Lad:
            return r0
        Lae:
            zwe r11 = (defpackage.zwe) r11
            if (r11 == 0) goto L75
            r4.add(r11)
            goto L75
        Lb6:
            fxe r11 = r10.s0
            java.lang.String r11 = r11.t0
            l6b r0 = defpackage.wqi.a
            if (r0 != 0) goto Lbf
            goto Ld4
        Lbf:
            lg8 r1 = defpackage.lg8.d
            boolean r3 = r0.b(r1)
            if (r3 == 0) goto Ld4
            int r3 = r4.size()
            java.lang.String r5 = "buildShortcuts: result size: "
            java.lang.String r3 = defpackage.ho7.f(r3, r5)
            r0.c(r1, r11, r3, r2)
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxe.n(java.lang.Object):java.lang.Object");
    }
}
