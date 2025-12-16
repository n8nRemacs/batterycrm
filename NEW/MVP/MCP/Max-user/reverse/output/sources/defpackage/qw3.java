package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qw3 extends dtf implements sm6 {
    public final /* synthetic */ s85 X;
    public final /* synthetic */ tw3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw3(tw3 tw3Var, s85 s85Var, Continuation continuation) {
        super(2, continuation);
        this.o = tw3Var;
        this.X = s85Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qw3(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        g8j.b(obj);
        tw3 tw3Var = this.o;
        hwa hwaVar = (hwa) tw3Var.z.getValue();
        s85 s85Var = this.X;
        String str2 = s85Var.c;
        String str3 = s85Var.h;
        String string = str2 != null ? vmf.c0(uog.j(str2)).toString() : null;
        if (string == null) {
            string = "";
        }
        String str4 = s85Var.f;
        String string2 = str4 != null ? vmf.c0(uog.j(str4)).toString() : null;
        s85 s85Var2 = (s85) tw3Var.i.getValue();
        boolean zA = fni.a(s85Var2 != null ? s85Var2.h : null, str3);
        boolean z = str3 == null || vmf.F(str3);
        if (!zA && !z) {
            str = str3;
        } else if (zA || !z) {
            str = null;
        } else {
            str3 = "$REMOVE$";
            str = str3;
        }
        return new Long(hwaVar.C(string, string2, null, null, str, null, 0L, 2));
    }
}
