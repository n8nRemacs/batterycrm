package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes.dex */
public final class cq1 extends dtf implements sm6 {
    public dq1 X;
    public ShareData Y;
    public zp1 Z;
    public f9a o;
    public Object s0;
    public aq1 t0;
    public int u0;
    public final /* synthetic */ dq1 v0;
    public final /* synthetic */ ShareData w0;
    public final /* synthetic */ zp1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq1(dq1 dq1Var, ShareData shareData, zp1 zp1Var, Continuation continuation) {
        super(2, continuation);
        this.v0 = dq1Var;
        this.w0 = shareData;
        this.x0 = zp1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cq1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cq1(this.v0, this.w0, this.x0, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:31:0x008a). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.u0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            if (r0 != r1) goto L19
            aq1 r0 = r11.t0
            java.lang.Object r3 = r11.s0
            zp1 r4 = r11.Z
            ru.ok.tamtam.android.util.share.ShareData r5 = r11.Y
            dq1 r6 = r11.X
            f9a r7 = r11.o
            defpackage.g8j.b(r12)
            goto L8a
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            defpackage.g8j.b(r12)
            dq1 r12 = r11.v0
            tcf r0 = r12.f
            ru.ok.tamtam.android.util.share.ShareData r3 = r11.w0
            zp1 r4 = r11.x0
            r6 = r12
            r7 = r0
            r5 = r3
        L2f:
            java.lang.Object r3 = r7.getValue()
            r0 = r3
            aq1 r0 = (defpackage.aq1) r0
            tha r12 = r6.a
            r11.o = r7
            r11.X = r6
            r11.Y = r5
            r11.Z = r4
            r11.s0 = r3
            r11.t0 = r0
            r11.u0 = r1
            if (r5 != 0) goto L4a
            r12 = r2
            goto L85
        L4a:
            java.lang.String r12 = r5.text
            if (r12 == 0) goto L57
            boolean r12 = defpackage.vmf.F(r12)
            if (r12 == 0) goto L55
            goto L57
        L55:
            r12 = 0
            goto L58
        L57:
            r12 = r1
        L58:
            int r8 = defpackage.mvd.S1
            n5g r9 = new n5g
            r9.<init>(r8)
            if (r12 != 0) goto L78
            mp1 r12 = new mp1
            java.lang.String r8 = r5.text
            if (r8 == 0) goto L70
            r5g r10 = new r5g
            r10.<init>(r8)
            r12.<init>(r10)
            goto L7d
        L70:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r12.<init>(r0)
            throw r12
        L78:
            mp1 r12 = new mp1
            r12.<init>(r2)
        L7d:
            vp1 r8 = new vp1
            s5g r12 = r12.a
            r8.<init>(r9, r12)
            r12 = r8
        L85:
            g84 r8 = defpackage.g84.a
            if (r12 != r8) goto L8a
            return r8
        L8a:
            vp1 r12 = (defpackage.vp1) r12
            aq1 r12 = defpackage.aq1.a(r0, r2, r12, r4, r1)
            boolean r12 = r7.c(r3, r12)
            if (r12 == 0) goto L2f
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq1.n(java.lang.Object):java.lang.Object");
    }
}
