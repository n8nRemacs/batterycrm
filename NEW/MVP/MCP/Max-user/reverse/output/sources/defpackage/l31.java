package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class l31 extends dtf implements wm6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ xfh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l31(xfh xfhVar, Continuation continuation, int i) {
        super(4, continuation);
        this.o = i;
        this.s0 = xfhVar;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                l31 l31Var = new l31((w31) this.s0, (Continuation) obj4, 0);
                l31Var.Y = (CallsAudioDeviceInfo) obj;
                l31Var.Z = (vc1) obj2;
                l31Var.X = zBooleanValue;
                qqg qqgVar = qqg.a;
                l31Var.n(qqgVar);
                return qqgVar;
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                l31 l31Var2 = new l31((cc1) this.s0, (Continuation) obj4, 1);
                l31Var2.Y = (n41) obj;
                l31Var2.Z = (mb4) obj2;
                l31Var2.X = zBooleanValue2;
                qqg qqgVar2 = qqg.a;
                l31Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c2 A[LOOP:0: B:5:0x001a->B:128:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[PHI: r16
  0x006c: PHI (r16v3 yb1) = (r16v0 yb1), (r16v1 yb1), (r16v0 yb1) binds: [B:43:0x0076, B:52:0x0087, B:38:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.n(java.lang.Object):java.lang.Object");
    }
}
