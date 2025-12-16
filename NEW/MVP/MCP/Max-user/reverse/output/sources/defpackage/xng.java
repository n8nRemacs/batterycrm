package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* loaded from: classes2.dex */
public final class xng extends dtf implements sm6 {
    public final /* synthetic */ TwoFAStartRestoreScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng(Continuation continuation, TwoFAStartRestoreScreen twoFAStartRestoreScreen) {
        super(2, continuation);
        this.X = twoFAStartRestoreScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xng xngVar = (xng) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xngVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xng xngVar = new xng(continuation, this.X);
        xngVar.o = obj;
        return xngVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.o
            java.lang.String r10 = (java.lang.String) r10
            one.me.settings.twofa.restore.TwoFAStartRestoreScreen r0 = r9.X
            bbd r1 = r0.Y
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L1a
            yy7[] r4 = one.me.settings.twofa.restore.TwoFAStartRestoreScreen.s0
            int r4 = r10.length()
            if (r4 != 0) goto L18
            goto L1a
        L18:
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            bbd r5 = r0.Z
            yy7[] r6 = one.me.settings.twofa.restore.TwoFAStartRestoreScreen.s0
            r7 = 2
            r7 = r6[r7]
            java.lang.Object r5 = r5.D(r0, r7)
            one.me.sdk.uikit.common.button.OneMeButton r5 = (one.me.sdk.uikit.common.button.OneMeButton) r5
            r7 = 8
            if (r4 == 0) goto L2e
            r8 = r3
            goto L2f
        L2e:
            r8 = r7
        L2f:
            r5.setVisibility(r8)
            r5 = r6[r2]
            java.lang.Object r5 = r1.D(r0, r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r3 = r7
        L3e:
            r5.setVisibility(r3)
            if (r4 != 0) goto L5c
            r2 = r6[r2]
            java.lang.Object r1 = r1.D(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r0.getContext()
            int r2 = defpackage.r4d.oneme_settings_twofa_creation_email_verify_resend_code_timer
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r10 = r0.getString(r2, r10)
            r1.setText(r10)
        L5c:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xng.n(java.lang.Object):java.lang.Object");
    }
}
