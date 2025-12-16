package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.location.map.pick.PickLocationScreen;

/* loaded from: classes2.dex */
public final class vvb extends dtf implements sm6 {
    public final /* synthetic */ PickLocationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvb(Continuation continuation, PickLocationScreen pickLocationScreen) {
        super(2, continuation);
        this.X = pickLocationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException, IOException {
        vvb vvbVar = (vvb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vvb vvbVar = new vvb(continuation, this.X);
        vvbVar.o = obj;
        return vvbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r5 = this;
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.o
            yvb r6 = (defpackage.yvb) r6
            java.lang.String r0 = r6.f
            boolean r1 = r6.g
            r2 = 0
            one.me.location.map.pick.PickLocationScreen r3 = r5.X
            if (r0 == 0) goto L1f
            boolean r4 = defpackage.vmf.F(r0)
            if (r4 != 0) goto L19
            if (r1 != 0) goto L19
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r2 = r0
            goto L2b
        L1f:
            android.content.res.Resources r0 = r3.getResources()
            if (r0 == 0) goto L2b
            int r2 = defpackage.s3d.oneme_location_map_send_unknown_address
            java.lang.String r2 = r0.getString(r2)
        L2b:
            yy7[] r0 = one.me.location.map.pick.PickLocationScreen.v0
            one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton r0 = r3.y0()
            s5g r6 = r6.e
            android.content.Context r4 = r3.getContext()
            java.lang.CharSequence r6 = r6.b(r4)
            r0.b(r6, r2)
            one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton r6 = r3.y0()
            r6.setProgressEnabled(r1)
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvb.n(java.lang.Object):java.lang.Object");
    }
}
