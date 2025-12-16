package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qtf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ytf Y;
    public final /* synthetic */ ttg Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtf(ytf ytfVar, ttg ttgVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ytfVar;
        this.Z = ttgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qtf) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qtf qtfVar = new qtf(this.Y, this.Z, continuation);
        qtfVar.X = obj;
        return qtfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.o
            r1 = 1
            if (r0 == 0) goto L14
            if (r0 != r1) goto Lc
            defpackage.g8j.b(r15)
            goto Lbd
        Lc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L14:
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r14.X
            z26 r15 = (defpackage.z26) r15
            ytf r0 = r14.Y
            k18 r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            ugg r0 = (defpackage.ugg) r0
            ttg r2 = r14.Z
            java.lang.String r4 = r2.d
            bug r3 = r2.a
            java.lang.String r5 = r2.b
            wvg r6 = r3.c
            int r7 = r6.ordinal()
            r8 = 3
            switch(r7) {
                case 1: goto L54;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L50;
                case 5: goto L4e;
                case 6: goto L52;
                case 7: goto L4b;
                case 8: goto L54;
                default: goto L37;
            }
        L37:
            one.me.sdk.transfer.domain.UploadException r15 = new one.me.sdk.transfer.domain.UploadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unknown http type for upload type="
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L4b:
            r6 = 5
        L4c:
            r11 = r6
            goto L55
        L4e:
            r6 = 2
            goto L4c
        L50:
            r6 = 4
            goto L4c
        L52:
            r11 = r1
            goto L55
        L54:
            r11 = r8
        L55:
            java.lang.String r2 = r2.c
            wvg r6 = r3.c
            r6.getClass()
            wvg r7 = defpackage.wvg.X
            if (r6 != r7) goto L61
            goto L69
        L61:
            wvg r3 = r3.c
            boolean r3 = r3.c()
            if (r3 == 0) goto L6b
        L69:
            r7 = r2
            goto L6d
        L6b:
            r2 = 0
            goto L69
        L6d:
            k18 r2 = r0.g
            java.lang.Object r2 = r2.getValue()
            rt5 r2 = (defpackage.rt5) r2
            gu5 r2 = (defpackage.gu5) r2
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f119onevideouploader
            r6 = 0
            boolean r2 = r2.j(r3, r6)
            if (r2 == 0) goto L96
            if (r11 != r8) goto L96
            bwf r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            r6 = r2
            java.util.concurrent.ExecutorService r6 = (java.util.concurrent.ExecutorService) r6
            phb r3 = new phb
            tgg r8 = r0.a
            r3.<init>(r4, r5, r6, r7, r8)
            goto Lae
        L96:
            w5 r2 = r0.b
            r3 = 451(0x1c3, float:6.32E-43)
            bwf r10 = r2.d(r3)
            ty5 r3 = new ty5
            k18 r6 = r0.c
            r12 = r7
            bwf r7 = r0.d
            k18 r8 = r0.e
            k18 r9 = r0.f
            tgg r13 = r0.a
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        Lae:
            n46 r0 = r3.a()
            r14.o = r1
            java.lang.Object r15 = defpackage.gw0.n(r14, r0, r15)
            g84 r0 = defpackage.g84.a
            if (r15 != r0) goto Lbd
            return r0
        Lbd:
            qqg r15 = defpackage.qqg.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtf.n(java.lang.Object):java.lang.Object");
    }
}
