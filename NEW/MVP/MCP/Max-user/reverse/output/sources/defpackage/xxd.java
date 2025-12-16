package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class xxd extends dtf implements sm6 {
    public final /* synthetic */ yxd X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ boolean u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxd(yxd yxdVar, long j, long j2, String str, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = yxdVar;
        this.Y = j;
        this.Z = j2;
        this.s0 = str;
        this.t0 = j3;
        this.u0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xxd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xxd(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lg8 lg8Var = lg8.d;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        String str = this.X.a;
        long j = this.Z;
        String str2 = this.s0;
        long j2 = this.t0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            StringBuilder sbN = ho7.n("Save new position:", j, " for video:", str2);
            sbN.append(" in msg:");
            sbN.append(j2);
            l6bVar.c(lg8Var, str, sbN.toString(), null);
        }
        long j3 = this.Y;
        long j4 = 0;
        if (j3 != 0) {
            long j5 = this.Z;
            if (j5 >= j3) {
                String str3 = this.X.a;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str3, ho7.k(az1.l(j5, "Can't save this startTime:", " because it's more or equals with duration:"), j3, ". Reset initPos."), null);
                }
            } else {
                j4 = j5;
            }
            g2h g2hVarA = ((i2h) this.X.c.getValue()).a(this.s0);
            if (g2hVarA != null) {
                wqi.c(this.X.a, "Save new position. VideoContent in cache exist", new Object[0]);
                i2h i2hVar = (i2h) this.X.c.getValue();
                String str4 = this.s0;
                g2h g2hVarE = g2hVarA.e(j4);
                i2hVar.getClass();
                i2h.b.put(str4, new h2h(g2hVarE, System.currentTimeMillis()));
            }
            gx9 gx9Var = (gx9) this.X.b.getValue();
            long j6 = this.t0;
            String str5 = this.s0;
            final long j7 = this.Y;
            final boolean z = this.u0;
            final long j8 = j4;
            em6 em6Var = new em6() { // from class: wxd
                @Override // defpackage.em6
                public final Object invoke(Object obj2) {
                    f10 f10VarB;
                    w10 w10Var;
                    x00 x00Var = (x00) obj2;
                    boolean z2 = (x00Var == null || x00Var.a != s10.t0 || (f10VarB = x00Var.b()) == null || (w10Var = f10VarB.d) == null || !w10Var.h()) ? false : true;
                    if ((x00Var.d != null || z2) && !z) {
                        long j9 = j7;
                        if (j9 != 0) {
                            long j10 = j8;
                            long j11 = j9 - j10 > CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS ? j10 : 0L;
                            if (z2) {
                                t10 t10VarA = x00Var.b().d.d.a();
                                t10VarA.k = j11;
                                t10VarA.b = (int) j9;
                                t10VarA.f = false;
                                v10 v10Var = new v10(t10VarA);
                                x00 x00VarI = x00Var.b().d.i();
                                x00VarI.d = v10Var;
                                w10 w10VarA = x00VarI.a();
                                e10 e10VarA = x00Var.b().a();
                                e10VarA.e = w10VarA;
                                x00Var.r = new f10(e10VarA);
                            } else {
                                t10 t10VarA2 = x00Var.c().a();
                                t10VarA2.k = j11;
                                t10VarA2.b = (int) j9;
                                t10VarA2.f = false;
                                x00Var.d = new v10(t10VarA2);
                            }
                        }
                    }
                    return qqg.a;
                }
            };
            this.o = 1;
            gx9Var.a.s(j6, new dq4(str5, 29, em6Var));
            if (qqgVar == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
