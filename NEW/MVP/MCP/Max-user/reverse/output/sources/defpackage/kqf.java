package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kqf extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ mqf Y;
    public final /* synthetic */ String Z;
    public xpf o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ pf2 t0;
    public final /* synthetic */ a93 u0;
    public final /* synthetic */ sa9 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqf(mqf mqfVar, String str, int i, pf2 pf2Var, a93 a93Var, sa9 sa9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = mqfVar;
        this.Z = str;
        this.s0 = i;
        this.t0 = pf2Var;
        this.u0 = a93Var;
        this.v0 = sa9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kqf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kqf(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        xpf xpfVar;
        pb2 pb2Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        mqf mqfVar = this.Y;
        mcf mcfVar = mqfVar.b;
        tcf tcfVar = mqfVar.B0;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            String str = mqfVar.A0.a;
            String str2 = this.Z;
            if (!fni.a(str, str2)) {
                mqfVar.A0 = zqf.g;
            }
            pb2 pb2Var2 = (pb2) mcfVar.getValue();
            boolean z = false;
            if (pb2Var2 != null && pb2Var2.K()) {
                z = true;
            }
            Pattern pattern = spf.b;
            xpf xpfVarA = io5.a(str2, this.s0, this.t0);
            if (xpfVarA == xpf.o) {
                do {
                    value3 = tcfVar.getValue();
                } while (!tcfVar.c(value3, null));
            } else if (z && (xpfVarA == xpf.a || xpfVarA == xpf.b)) {
                do {
                    value2 = tcfVar.getValue();
                } while (!tcfVar.c(value2, null));
            } else if (xpfVarA != xpf.c || ((pb2Var = (pb2) mcfVar.getValue()) != null && pb2Var.s0())) {
                zqf zqfVar = mqfVar.A0;
                this.o = xpfVarA;
                this.X = 1;
                a93 a93Var = this.u0;
                Object objI = svi.i(((q2b) ((lzf) a93Var.b)).a(), new vpf(zqfVar, this.Z, this.s0, a93Var, null), this);
                g84 g84Var = g84.a;
                if (objI == g84Var) {
                    return g84Var;
                }
                xpfVar = xpfVarA;
                obj = objI;
            } else {
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, null));
            }
            return qqg.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xpfVar = this.o;
        g8j.b(obj);
        zqf zqfVar2 = (zqf) obj;
        mqfVar.A0 = zqfVar2;
        ArrayList arrayListC = this.v0.C(zqfVar2.d);
        do {
            value4 = tcfVar.getValue();
        } while (!tcfVar.c(value4, new ypf(xpfVar, arrayListC)));
        return qqg.a;
    }
}
