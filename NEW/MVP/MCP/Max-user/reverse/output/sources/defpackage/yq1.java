package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class yq1 extends sm implements j1g {
    public final /* synthetic */ int d;
    public final String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq1(long j, String str, int i) {
        super(j);
        this.d = i;
        this.o = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    @Override // defpackage.j1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.l0g r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.d
            switch(r1) {
                case 0: goto L82;
                default: goto L7;
            }
        L7:
            r1 = r18
            vh2 r1 = (defpackage.vh2) r1
            ve2 r2 = r0.l()
            qb2 r3 = r1.c
            java.util.List r3 = java.util.Collections.singletonList(r3)
            n8a r2 = r2.m0(r3)
            tw0 r3 = r0.k()
            n73 r4 = new n73
            r4.<init>(r2)
            r3.c(r4)
            tw0 r3 = r0.k()
            long[] r4 = r2.b
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7a
            r6 = 0
            r7 = r6
        L34:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L75
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L4e:
            if (r12 >= r10) goto L73
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6f
            int r2 = r7 << 3
            int r2 = r2 + r12
            r9 = r4[r2]
            qb2 r1 = r1.c
            int r6 = r1.W0
            wh2 r5 = new wh2
            long r7 = r0.a
            java.lang.String r11 = r0.o
            r5.<init>(r6, r7, r9, r11)
            r3.c(r5)
            return
        L6f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L4e
        L73:
            if (r10 != r11) goto L7a
        L75:
            if (r7 == r5) goto L7a
            int r7 = r7 + 1
            goto L34
        L7a:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "The LongSet is empty"
            r1.<init>(r2)
            throw r1
        L82:
            r1 = r18
            zq1 r1 = (defpackage.zq1) r1
            tw0 r2 = r0.k()
            r51 r3 = new r51
            java.lang.String r8 = r1.c
            long r6 = r1.d
            java.lang.String r9 = r1.X
            long r4 = r0.a
            r3.<init>(r4, r6, r8, r9)
            r2.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.d(l0g):void");
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        switch (this.d) {
            case 0:
                k().c(new rj0(this.a, pzfVar));
                break;
            default:
                boolean zEquals = "error.user.restricted.join".equals(pzfVar.b);
                long j = this.a;
                if (!zEquals) {
                    k().c(new rj0(j, pzfVar));
                    break;
                } else {
                    k().c(new ai2(j, pzfVar));
                    break;
                }
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        switch (this.d) {
            case 0:
                wua wuaVar = new wua((xhb) null, 23);
                wuaVar.i("withJoinLink", true);
                wuaVar.x(ApiProtocol.PARAM_CONVERSATION_ID, this.o);
                wuaVar.x("type", "AUDIO");
                return wuaVar;
            default:
                return new fh2(this.o);
        }
    }
}
