package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class pw extends dtf implements wm6 {
    public /* synthetic */ long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.o = i;
        this.Z = obj;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.o) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                pw pwVar = new pw((xw) this.Z, (Continuation) obj4, 0);
                pwVar.Y = (List) obj;
                pwVar.X = jLongValue;
                return pwVar.n(qqg.a);
            case 1:
                long jLongValue2 = ((Number) obj3).longValue();
                pw pwVar2 = new pw((wm2) this.Z, (Continuation) obj4, 1);
                pwVar2.Y = (Throwable) obj2;
                pwVar2.X = jLongValue2;
                return pwVar2.n(qqg.a);
            default:
                long jLongValue3 = ((Number) obj3).longValue();
                pw pwVar3 = new pw((s3h) this.Z, (Continuation) obj4, 2);
                pwVar3.Y = (Throwable) obj2;
                pwVar3.X = jLongValue3;
                return pwVar3.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object next;
        boolean z;
        boolean z2;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                List list = (List) this.Y;
                long j = this.X;
                xw xwVar = (xw) this.Z;
                List listJ = xwVar.h().j();
                Iterator it = listJ.iterator();
                Object next2 = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long jA = ((d93) next).a();
                        do {
                            Object next3 = it.next();
                            long jA2 = ((d93) next3).a();
                            if (jA > jA2) {
                                next = next3;
                                jA = jA2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                d93 d93Var = (d93) next;
                long jA3 = d93Var != null ? d93Var.a() : 0L;
                Iterator it2 = listJ.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        long jC = ((d93) next2).c();
                        do {
                            Object next4 = it2.next();
                            long jC2 = ((d93) next4).c();
                            if (jC < jC2) {
                                next2 = next4;
                                jC = jC2;
                            }
                        } while (it2.hasNext());
                    }
                }
                d93 d93Var2 = (d93) next2;
                long jC3 = d93Var2 != null ? d93Var2.c() : BuildConfig.MAX_TIME_TO_UPLOAD;
                List listI = xwVar.i(n7j.e(j, Math.min(jA3, jC3), Math.max(jA3, jC3)), false);
                List listJ2 = xwVar.h().j();
                d93 d93VarD = k4j.d(j, listJ2);
                d93 d93VarF = xwVar.h().f(j);
                d93 d93VarD2 = xwVar.h().d(j);
                long jG = xwVar.h().g();
                long jH = xwVar.h().h();
                iv6 iv6Var = xwVar.c;
                int size = listI.size();
                int size2 = list.size();
                int size3 = listJ2.size();
                StringBuilder sbK = wy1.k("getHistoryItems return ", size, " out of total ", size2, " around ");
                sbK.append(j);
                sbK.append(". Around chunk ");
                sbK.append(d93VarD);
                sbK.append(". Before ");
                sbK.append(d93VarF);
                sbK.append(". After ");
                sbK.append(d93VarD2);
                az1.r(jG, ". First ", ". Last ", sbK);
                sbK.append(jH);
                sbK.append(". Chunks count = ");
                sbK.append(size3);
                iv6Var.u(sbK.toString());
                return listI;
            case 1:
                String str = (String) ((wm2) this.Z).e;
                g8j.b(obj);
                Throwable th = (Throwable) this.Y;
                long j2 = this.X;
                if ((th instanceof TamErrorException) && qaj.c(((TamErrorException) th).a.b) && j2 <= 2) {
                    wqi.e(str, "request failed with " + th + ". Retrying", null);
                    z = true;
                } else {
                    wqi.e(str, "request failed with " + th + ". Couldn't recover", null);
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                String str2 = ((s3h) this.Z).f;
                g8j.b(obj);
                Throwable th2 = (Throwable) this.Y;
                long j3 = this.X;
                if ((th2 instanceof TamErrorException) && qaj.c(((TamErrorException) th2).a.b) && j3 <= 2) {
                    wqi.e(str2, "Fetch video. Request failed with " + th2 + ". Retrying", null);
                    z2 = true;
                } else {
                    wqi.e(str2, "Fetch video. Request failed with " + th2 + ". Couldn't recover", null);
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
