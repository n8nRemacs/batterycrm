package defpackage;

import android.media.MediaPlayer;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w1f extends dtf implements sm6 {
    public final /* synthetic */ Integer A0;
    public final /* synthetic */ int B0;
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ g99 D0;
    public z1f X;
    public g99 Y;
    public String Z;
    public MediaPlayer o;
    public Integer s0;
    public String t0;
    public z1f u0;
    public int v0;
    public boolean w0;
    public int x0;
    public final /* synthetic */ z1f y0;
    public final /* synthetic */ String z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1f(z1f z1fVar, String str, Integer num, int i, boolean z, g99 g99Var, Continuation continuation) {
        super(2, continuation);
        this.y0 = z1fVar;
        this.z0 = str;
        this.A0 = num;
        this.B0 = i;
        this.C0 = z;
        this.D0 = g99Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w1f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new w1f(this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (defpackage.z1f.f(r4, r18) == r3) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e A[Catch: CancellationException -> 0x004f, all -> 0x01bc, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x004f, blocks: (B:12:0x003e, B:53:0x011d, B:55:0x0125, B:68:0x0163, B:74:0x018a, B:71:0x016c, B:73:0x0172, B:58:0x012e, B:61:0x0136, B:63:0x0140, B:49:0x00ed), top: B:91:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f7  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1f.n(java.lang.Object):java.lang.Object");
    }
}
