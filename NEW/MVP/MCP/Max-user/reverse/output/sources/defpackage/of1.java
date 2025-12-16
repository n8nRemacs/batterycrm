package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes.dex */
public final class of1 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ pf1 Y;
    public pf1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(pf1 pf1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pf1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((of1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new of1(this.Y, continuation);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objI;
        pf1 pf1Var;
        Object value;
        mc0 mc0VarD;
        n5g n5gVar;
        SpannableStringBuilder spannableStringBuilder;
        g84 g84Var = g84.a;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            pf1 pf1Var2 = this.Y;
            zw1 zw1Var = pf1Var2.d;
            this.o = pf1Var2;
            this.X = 1;
            objI = svi.i(((q2b) ((lzf) zw1Var.b.getValue())).b(), new xw1(zw1Var, null), this);
            if (objI == g84Var) {
                return g84Var;
            }
            pf1Var = pf1Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pf1Var = this.o;
            g8j.b(obj);
            objI = obj;
        }
        pf1Var.Z = (Long) objI;
        pf1 pf1Var3 = this.Y;
        py0 py0Var = pf1Var3.c;
        tcf tcfVar = pf1Var3.s0;
        do {
            value = tcfVar.getValue();
            mc0VarD = py0Var.d(null, Long.MIN_VALUE);
            n5gVar = new n5g(b0b.g);
            spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new FitFontImageSpan((mc8) py0Var.c.getValue(), null, false, false, 14, null), 0, 1, 17);
        } while (!tcfVar.c(value, cf1.a((cf1) value, mc0VarD, null, null, new ze1(new r5g(spannableStringBuilder)), n5gVar, hd5.a, null, false, null, null, 1805)));
        return qqg.a;
    }
}
