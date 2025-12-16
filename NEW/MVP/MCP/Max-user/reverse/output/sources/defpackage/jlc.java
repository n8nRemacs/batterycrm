package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jlc extends dtf implements sm6 {
    public final /* synthetic */ ku3 X;
    public final /* synthetic */ klc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlc(ku3 ku3Var, klc klcVar, Continuation continuation) {
        super(2, continuation);
        this.X = ku3Var;
        this.Y = klcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jlc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jlc(this.X, this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [hd5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objSingletonList;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ku3 ku3Var = this.X;
            int[] iArr = ku3Var.a.b.v;
            int length = iArr.length;
            if (length != 0) {
                if (length != 1) {
                    objSingletonList = new ArrayList(iArr.length);
                    for (int i2 : iArr) {
                        objSingletonList.add(Integer.valueOf(i2));
                    }
                } else {
                    objSingletonList = Collections.singletonList(Integer.valueOf(iArr[0]));
                }
            } else {
                objSingletonList = hd5.a;
            }
            ghc ghcVar = new ghc(0L, ku3Var.p(), new py0(id5.a, 29, objSingletonList));
            jdc jdcVar = this.Y.a;
            this.o = 1;
            Object objB = k7j.b((lrd) jdcVar.b, new ci(jdcVar, 27, ghcVar), this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
