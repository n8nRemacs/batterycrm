package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class iv3 extends i82 {
    public final k18 j;
    public final bwf k;
    public final k18 l;
    public final x26 m;
    public final jve n;
    public final gbd o;
    public final AtomicLong p;

    public iv3(long j, ContextScope contextScope) {
        yec yecVar = yec.a;
        k18 k18VarC = yecVar.c();
        bwf bwfVarD = yecVar.getAccessor().d(123);
        bwf bwfVar = new bwf(new ps3(1));
        k18 k18VarA = yecVar.a();
        bwf bwfVar2 = new bwf(new ps3(2));
        bwf bwfVarD2 = yecVar.getAccessor().d(44);
        super(j, contextScope);
        this.j = k18VarC;
        this.k = bwfVar;
        this.l = k18VarA;
        bwf bwfVar3 = (bwf) k18VarC;
        this.m = gw0.u(new z41(new d53(this.c, 12), this.d, dv3.Z, 3), ((q2b) ((lzf) bwfVar3.getValue())).a());
        jve jveVarB = kve.b(0, 0, 7);
        this.n = jveVarB;
        this.o = new gbd(jveVarB);
        this.p = new AtomicLong();
        gw0.w(gw0.u(new g56(this.i, new wu3(this, null), 1), ((q2b) ((lzf) bwfVar3.getValue())).a()), contextScope);
        gw0.w(gw0.u(new g56(new y83(new mwd(new cv3(new d53(((l24) bwfVarD.getValue()).c(j), 12), null, this)), 1, this), new zr0(2, this, iv3.class, "emitState", "emitState(Lone/me/profileedit/screens/changelink/ChangeLink$State;)V", 4, 14), 1), ((q2b) ((lzf) bwfVar3.getValue())).b()), contextScope);
        int i = 2;
        gw0.w(new g56(new y83(((ui0) bwfVarD2.getValue()).b, i, this), new rw(i, this, iv3.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 1), contextScope);
        gw0.w(new g56(new gbd(((pfc) bwfVar2.getValue()).a), new xu3(this, null), 1), contextScope);
    }

    public static final y82 m(iv3 iv3Var, ku3 ku3Var) {
        Uri uri;
        String str = ku3Var.a.b.p;
        return new y82(u8b.O1, (str == null || (uri = Uri.parse(str)) == null) ? null : uri.getLastPathSegment(), null, null, false);
    }

    @Override // defpackage.i82
    public final void b() {
    }

    @Override // defpackage.i82
    public final x26 f() {
        return this.m;
    }

    @Override // defpackage.i82
    public final Object j(t82 t82Var) throws Throwable {
        y82 y82Var = (y82) this.i.getValue();
        if (y82Var != null) {
            String str = y82Var.b;
            boolean z = y82Var.e;
            g84 g84Var = g84.a;
            if (z) {
                Object objA = this.f.a(new cdc(y82Var.c, null, 14), t82Var);
                if (objA == g84Var) {
                    return objA;
                }
            } else {
                String string = str != null ? vmf.c0(str).toString() : null;
                if (string == null || string.length() == 0) {
                    str = "$REMOVE$";
                }
                Object objI = svi.i(((q2b) ((lzf) this.j.getValue())).b(), new ev3(this, str, null), t82Var);
                if (objI == g84Var) {
                    return objI;
                }
            }
        }
        return qqg.a;
    }

    @Override // defpackage.i82
    public final void k(String str) {
        svi.e(this.b, ((q2b) ((lzf) this.j.getValue())).c().getImmediate(), null, new hv3(this, str, null), 2);
    }

    public final Object n(n82 n82Var, Continuation continuation) throws Throwable {
        boolean zA = fni.a(n82Var, k82.a);
        g84 g84Var = g84.a;
        jve jveVar = this.f;
        if (zA) {
            Object objA = jveVar.a(new cdc(new n5g(u8b.R1), new n5g(u8b.P1), true, new Integer(yud.J)), continuation);
            if (objA == g84Var) {
                return objA;
            }
        } else if (fni.a(n82Var, l82.a)) {
            Object objA2 = jveVar.a(new cdc(new n5g(u8b.S1), new n5g(u8b.Q1), true, new Integer(yud.J)), continuation);
            if (objA2 == g84Var) {
                return objA2;
            }
        } else if (n82Var instanceof j82) {
            Object objA3 = jveVar.a(new cdc(((j82) n82Var).a, null, 14), continuation);
            if (objA3 == g84Var) {
                return objA3;
            }
        } else {
            if (!(n82Var instanceof m82)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objA4 = jveVar.a(new cdc(((m82) n82Var).a, null, 14), continuation);
            if (objA4 == g84Var) {
                return objA4;
            }
        }
        return qqg.a;
    }
}
