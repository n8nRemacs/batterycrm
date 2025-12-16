package defpackage;

import java.io.IOException;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class hue extends dtf implements sm6 {
    public final /* synthetic */ ShareDataPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hue(Continuation continuation, ShareDataPickerScreen shareDataPickerScreen) {
        super(2, continuation);
        this.X = shareDataPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        hue hueVar = (hue) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hueVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hue hueVar = new hue(continuation, this.X);
        hueVar.o = obj;
        return hueVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        lue lueVar;
        g8j.b(obj);
        aue aueVar = (aue) this.o;
        boolean z = aueVar instanceof vte;
        ShareDataPickerScreen shareDataPickerScreen = this.X;
        if (z) {
            String string = shareDataPickerScreen.getArgs().getString("tag");
            if (string != null) {
                Object objG = shareDataPickerScreen.getRouter().g(string);
                lueVar = objG instanceof lue ? (lue) objG : null;
                if (lueVar != null) {
                    lueVar.g0(((Set) shareDataPickerScreen.I0().Y.a.getValue()).size());
                }
                pte.c.L0();
            } else {
                vte vteVar = (vte) aueVar;
                if (vteVar.a != null) {
                    bsi.a(shareDataPickerScreen);
                    pte pteVar = pte.c;
                    Long l = vteVar.a;
                    l.getClass();
                    ii4 ii4VarP0 = pteVar.p0();
                    hi4 hi4Var = new hi4();
                    hi4Var.a = ":chats";
                    hi4Var.c(l, "id");
                    hi4Var.c("local", "type");
                    ii4VarP0.c(hi4Var.a(), null);
                } else {
                    pte.c.L0();
                }
            }
        } else if (fni.a(aueVar, ute.a)) {
            String string2 = shareDataPickerScreen.getArgs().getString("tag");
            if (string2 != null) {
                Object objG2 = shareDataPickerScreen.getRouter().g(string2);
                lueVar = objG2 instanceof lue ? (lue) objG2 : null;
                if (lueVar != null) {
                    lueVar.K();
                }
            }
            pte.c.L0();
        } else if (fni.a(aueVar, yte.a)) {
            yy7[] yy7VarArr = ShareDataPickerScreen.I0;
            shareDataPickerScreen.L0(true);
        } else if (fni.a(aueVar, xte.a)) {
            yy7[] yy7VarArr2 = ShareDataPickerScreen.I0;
            shareDataPickerScreen.L0(false);
            jxb jxbVarI0 = shareDataPickerScreen.I0();
            jxbVarI0.c.c();
            jxbVarI0.X.m(null, rd5.a);
        } else if (aueVar instanceof wte) {
            xb3.a(shareDataPickerScreen.getContext(), ((wte) aueVar).a);
            if (xb3.b()) {
                int i = fvd.t;
                ccb ccbVar = new ccb(shareDataPickerScreen);
                ccbVar.g(new n5g(i));
                ccbVar.e(new qcb(yud.t));
                ccbVar.i();
            }
            pte.c.L0();
        } else if (aueVar instanceof zte) {
            bcb bcbVar = shareDataPickerScreen.H0;
            if (bcbVar != null) {
                bcbVar.a();
            }
            ccb ccbVar2 = new ccb(shareDataPickerScreen);
            ccbVar2.g(((zte) aueVar).a);
            ccbVar2.e(new qcb(yud.A));
            shareDataPickerScreen.H0 = ccbVar2.i();
        }
        return qqg.a;
    }
}
