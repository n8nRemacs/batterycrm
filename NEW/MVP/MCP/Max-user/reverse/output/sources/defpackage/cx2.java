package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cx2 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ zx2 Z;
    public int o;
    public final /* synthetic */ Long s0;
    public final /* synthetic */ on9 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(String str, pb2 pb2Var, zx2 zx2Var, Long l, on9 on9Var, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = pb2Var;
        this.Z = zx2Var;
        this.s0 = l;
        this.t0 = on9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cx2(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            pb2 pb2Var = this.Y;
            Pattern pattern = pb2Var.Q() ? m6g.c : m6g.e;
            Pattern pattern2 = bpb.a;
            String strReplace = this.X;
            Matcher matcher = pattern.matcher(strReplace);
            loop0: while (true) {
                str = strReplace;
                while (matcher.find()) {
                    Matcher matcher2 = pattern2.matcher(str);
                    boolean z = false;
                    while (matcher2.find() && matcher2.start() <= matcher.end()) {
                        if (matcher2.group().contains(matcher.group())) {
                            z = true;
                        }
                    }
                    if (!z && matcher.group().contains("/\ufeff")) {
                        break;
                    }
                }
                strReplace = str.replace(matcher.group(), matcher.group().replace("/\ufeff", String.valueOf('/')));
            }
            dy9 dy9Var = this.Z.u0;
            long j = pb2Var.a;
            on9 on9Var = this.t0;
            vf6 vf6VarA = on9Var != null ? on9Var.a() : null;
            this.o = 1;
            Object objB = dy9.b(dy9Var, j, str, this.s0, vf6VarA, this, 16);
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
