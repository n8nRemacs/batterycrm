package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hvh extends dtf implements sm6 {
    public final /* synthetic */ uvh o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvh(uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.o = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hvh hvhVar = (hvh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hvhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hvh(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        g8j.b(obj);
        uvh uvhVar = this.o;
        zvh zvhVar = (zvh) uvhVar.X0.a.getValue();
        qqg qqgVar = qqg.a;
        if (zvhVar != null && (str = zvhVar.d) != null) {
            uvhVar.z(str, true);
            xfh.r(uvhVar.Z0, luh.a);
            blh blhVar = (blh) uvhVar.w0.getValue();
            clh clhVar = uvhVar.G0;
            if (clhVar != null) {
                blhVar.a(3, clhVar.a, clhVar.b, clhVar.c, clhVar.d);
            }
        }
        return qqgVar;
    }
}
