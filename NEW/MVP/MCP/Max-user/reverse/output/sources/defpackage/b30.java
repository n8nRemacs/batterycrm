package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class b30 extends dtf implements sm6 {
    public final /* synthetic */ e30 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(e30 e30Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = e30Var;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b30) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b30(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        jdc jdcVar;
        w10 w10VarR;
        w00 w00Var;
        int i = this.o;
        e30 e30Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            z74 z74VarB = ((q2b) ((lzf) e30Var.g.getValue())).b();
            a30 a30Var = new a30(e30Var, this.Z, null);
            this.o = 1;
            obj = svi.i(z74VarB, a30Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        si9 si9Var = (si9) obj;
        qqg qqgVar = qqg.a;
        if (si9Var != null && si9Var.A() && (jdcVar = si9Var.x0) != null && (w10VarR = jdcVar.r(s10.o)) != null && (w00Var = w10VarR.e) != null) {
            final qi9 qi9Var = (qi9) e30Var.f.getValue();
            final long j = w00Var.c;
            qi9Var.getClass();
            String str = w10VarR.r;
            final long j2 = this.Y;
            qi9Var.p(si9Var, str, new gu3() { // from class: pi9
                @Override // defpackage.gu3
                public final void accept(Object obj2) {
                    x00 x00Var = (x00) obj2;
                    z7c z7cVar = qi9Var.c;
                    if (x00Var.e != null) {
                        long j3 = j;
                        if (j3 == 0) {
                            return;
                        }
                        z7cVar.b.getClass();
                        if (j3 < ((int) r0.m(PmsKey.f96mindurationsaveaudiostarttime, 20))) {
                            return;
                        }
                        long j4 = j2;
                        long j5 = j3 - j4 > CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS ? j4 : 0L;
                        w00 w00Var2 = x00Var.e;
                        if (w00Var2 == null) {
                            w00Var2 = w00.j;
                        }
                        v00 v00VarA = w00Var2.a();
                        v00VarA.g = j5;
                        v00VarA.c = j3;
                        v00VarA.h = System.currentTimeMillis();
                        x00Var.e = new w00(v00VarA);
                    }
                }
            });
        }
        return qqgVar;
    }
}
