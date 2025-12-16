package defpackage;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fi7 extends dtf implements sm6 {
    public final /* synthetic */ oo6 X;
    public final /* synthetic */ bj7 Y;
    public final /* synthetic */ x1g Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ ConcurrentHashMap s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi7(oo6 oo6Var, bj7 bj7Var, x1g x1gVar, ConcurrentHashMap concurrentHashMap, Continuation continuation) {
        super(2, continuation);
        this.X = oo6Var;
        this.Y = bj7Var;
        this.Z = x1gVar;
        this.s0 = concurrentHashMap;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        fi7 fi7Var = (fi7) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fi7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fi7 fi7Var = new fi7(this.X, this.Y, this.Z, this.s0, continuation);
        fi7Var.o = obj;
        return fi7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:5:0x002f, B:8:0x003c, B:11:0x0048, B:14:0x0054, B:17:0x0060, B:20:0x006c, B:24:0x0084, B:26:0x008a, B:33:0x00a7, B:35:0x00ad, B:37:0x00b3, B:39:0x00c8, B:42:0x00d3, B:44:0x00d9, B:47:0x00e9, B:54:0x0100, B:55:0x010a, B:57:0x0110, B:61:0x0122, B:63:0x0126, B:64:0x0128, B:73:0x013f, B:75:0x0149, B:77:0x016c, B:82:0x0177, B:83:0x0192, B:85:0x01a7, B:92:0x01c8, B:94:0x01d5, B:68:0x0133, B:69:0x0136, B:70:0x0139, B:50:0x00f2), top: B:104:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi7.n(java.lang.Object):java.lang.Object");
    }
}
