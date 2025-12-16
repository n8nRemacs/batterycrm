package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public final class iu4 extends ugc {
    public final c9a E0;

    public iu4(Context context) {
        gu4 gu4Var = new gu4(context);
        super(gu4Var);
        long[] jArr = fzd.a;
        this.E0 = new c9a();
        gu4Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gu4Var.s0.setOnEditorActionListener(new hu4(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // defpackage.d2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            r17 = this;
            r0 = r17
            c9a r1 = r0.E0
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L4f
            r6 = 0
            r7 = r6
        L11:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2b:
            if (r12 >= r10) goto L48
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L44
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            eu4 r13 = (defpackage.eu4) r13
            java.lang.String r14 = (java.lang.String) r14
            r13.a()
        L44:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2b
        L48:
            if (r10 != r11) goto L4f
        L4a:
            if (r7 == r5) goto L4f
            int r7 = r7 + 1
            goto L11
        L4f:
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu4.E():void");
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        du4 du4Var = (du4) t98Var;
        gu4 gu4Var = (gu4) this.a;
        gu4Var.setMaxCount(du4Var.c);
        gu4Var.setText(du4Var.a);
        gu4Var.setHint(du4Var.b);
    }
}
